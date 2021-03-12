package io.github.graphql

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import okhttp3._

import java.util
import java.util.concurrent.TimeUnit

object OkHttp {

  private val `application/json` = "application/json; charset=utf-8"
  private val json: MediaType = MediaType.parse(`application/json`)
  private lazy val defaultTimeout: Long = TimeUnit.MINUTES.toMillis(1)
  private lazy val client: OkHttpClient = buildClient(defaultTimeout, defaultTimeout, defaultTimeout)

  private def buildClient(readTimeout: Long, writeTimeout: Long, connectTimeout: Long): OkHttpClient = {
    new OkHttpClient.Builder()
      .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
      .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
      .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
      .protocols(util.Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))
      .build()
  }

  private def buildRequest(config: ServerConfig, request: GraphQLRequest): Request.Builder = {
    val httpRequestBody = request.toHttpJsonBody
    println(s"config: $config, graphql request body: $httpRequestBody")
    val rb = new Request.Builder().url(config.serverHost).addHeader("Accept", `application/json`).
      post(RequestBody.create(httpRequestBody, json))
    config.headers.foreach(kv => {
      rb.addHeader(kv._1, kv._2)
    })
    rb
  }

  def syncRunQuery(config: ServerConfig, request: GraphQLRequest, entityClass: Class[_])
    (fun: (Response, GraphQLRequest, Class[_]) => Any): Any = {
    val rb = buildRequest(config, request)
    val response = OkHttp.client.newCall(rb.build()).execute()
    fun(response, request, entityClass)
  }

  def syncRunQuery(config: ServerConfig, isCollection: Boolean, request: GraphQLRequest)
    (fun: (Response, Boolean, GraphQLRequest) => Any): Any = {
    val rb = buildRequest(config, request)
    val response = OkHttp.client.newCall(rb.build()).execute()
    fun(response, isCollection, request)
  }

}
