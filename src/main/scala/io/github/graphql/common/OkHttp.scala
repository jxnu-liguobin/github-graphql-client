package io.github.graphql.common

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import okhttp3._
import org.json.JSONObject

import java.io.IOException
import java.util
import java.util.concurrent.TimeUnit
import scala.concurrent.{ Future, Promise }

object OkHttp extends ResponseDeserializer {

  private val url = "http://localhost:8080/graphql"
  private val defaultCharset = "utf8"
  private val json = MediaType.parse("application/json; charset=utf-8")
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

  def buildRequest[T](request: GraphQLRequest): (Request.Builder, Promise[T]) = {
    val httpRequestBody = request.toHttpJsonBody
    println(s"graphql request body: $httpRequestBody")
    val rb = new Request.Builder().url(url).addHeader("Accept", "application/json; charset=utf-8").
      post(RequestBody.create(httpRequestBody, json))
    val promise = Promise[T]
    rb -> promise
  }

  def runQuery(request: GraphQLRequest, entityClazzName: String): Future[Any] = {
    val (rb, promise) = buildRequest[Any](request)
    OkHttp.client.newCall(rb.build()).enqueue(new Callback {

      override def onFailure(call: Call, e: IOException): Unit = {
        promise.failure(e)
      }

      override def onResponse(call: Call, response: Response): Unit = {
        if (response.isSuccessful) {
          val bytes = response.body().bytes()
          val jsonStr = new String(bytes, defaultCharset)
          val jsonObject = new JSONObject(jsonStr)
          val data = jsonObject.getJSONObject("data").get(request.getRequest.getOperationName)
          promise.success(deserialize(data, entityClazzName))

        } else {
          Future.successful(null)
        }

      }
    })
    promise.future
  }
}