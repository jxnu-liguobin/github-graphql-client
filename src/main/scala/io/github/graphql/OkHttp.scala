package io.github.graphql

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import okhttp3._
import org.json.{ JSONArray, JSONObject }

import java.io.IOException
import java.util
import java.util.concurrent.TimeUnit
import scala.concurrent.{ Future, Promise }

/**
 *
 * @author 梦境迷离
 * @since 2021/3/8
 * @version 1.0
 */
object OkHttp {

  private val json: MediaType = MediaType.parse("application/json; charset=utf-8")
  private lazy val defaultTimeout: Long = TimeUnit.MINUTES.toMillis(1)
  lazy val client: OkHttpClient = buildClient(defaultTimeout, defaultTimeout, defaultTimeout)

  def buildClient(readTimeout: Long, writeTimeout: Long, connectTimeout: Long): OkHttpClient = {
    new OkHttpClient.Builder()
      .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
      .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
      .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
      .protocols(util.Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))
      .build()
  }

  def buildRequest(config: ServerConfig, request: GraphQLRequest): Request.Builder = {
    val httpRequestBody = request.toHttpJsonBody
    println(s"config: $config, graphql request body: $httpRequestBody")
    val rb = new Request.Builder().url(config.serverHost).addHeader("Accept", "application/json; charset=utf-8").
      post(RequestBody.create(httpRequestBody, json))
    config.headers.foreach(kv => {
      rb.addHeader(kv._1, kv._2)
    })
    rb
  }

  def runQuery(config: ServerConfig, isCollection: Boolean, request: GraphQLRequest, entityClassName: String): Future[Any] = {
    val promise = Promise[Any]()
    val rb = buildRequest(config, request)
    OkHttp.client.newCall(rb.build()).enqueue(new Callback {

      override def onFailure(call: Call, e: IOException): Unit = {
        promise.failure(e)
      }

      override def onResponse(call: Call, response: Response): Unit = {
        promise.success(extractData(response, isCollection, request, entityClassName))
      }
    })
    promise.future
  }

  private def extractData(response: Response, isCollection: Boolean, request: GraphQLRequest, entityClassName: String): Any = {
    if (response.isSuccessful) {
      val jsonObject = new JSONObject(response.body().string())
      val dataJSON = jsonObject.getJSONObject("data")
      if (!dataJSON.isNull("errors")) {
        throw ExecuteException("found errors in response: ", dataJSON.getJSONObject("errors").toString)
      } else {
        val data = dataJSON.get(request.getRequest.getOperationName)
        deserialize(isCollection, data, entityClassName)
      }
    } else {
      null
    }

  }

  def syncRunQuery(config: ServerConfig, isCollection: Boolean, request: GraphQLRequest, entityClassName: String): Any = {
    val rb = buildRequest(config, request)
    val response = OkHttp.client.newCall(rb.build()).execute()
    extractData(response, isCollection, request, entityClassName)
  }

  private def deserialize(isCollection: Boolean, data: AnyRef, entityClazzName: String): Any = {
    if (isPrimitive(entityClazzName)) return data
    val result = new java.util.ArrayList[Any]()
    val targetClass = Class.forName(entityClazzName)
    try {
      data match {
        case array: JSONArray if isCollection =>
          for (i <- 0 until array.length()) {
            val e = Jackson.objectMapper.readValue(array.get(i).asInstanceOf[JSONObject].toString, targetClass)
            result.add(e)
          }
          result
        case _ =>
          Jackson.objectMapper.readValue(data.asInstanceOf[JSONObject].toString, targetClass)
      }
    } catch {
      case e: Exception =>
        throw ExecuteException("deserialize data failed: ", e.getLocalizedMessage, e)

    }
  }

  private def isPrimitive(entityClazzName: String): Boolean = {
    val primitiveTypes = Seq("Int", "Boolean", "String", "Short", "Byte", "Long", "Char", "Float")
    primitiveTypes.contains(entityClazzName)
  }
}
