package io.github.graphql

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jsonMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.util.concurrent.TimeUnit


// Kotlin cannot call scala directly.
// Pseudo adaptation, avoiding the interdependence of three languages, using independent implementation.
object OkHttpAdapter {

    private const val ApplicationJson = "application/json; charset=utf-8"
    private val json: MediaType? = ApplicationJson.toMediaTypeOrNull()
    private val defaultTimeout: Long = TimeUnit.MINUTES.toMillis(1)
    private val client: OkHttpClient = buildClient()

    private fun buildClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(defaultTimeout, TimeUnit.MILLISECONDS)
            .writeTimeout(defaultTimeout, TimeUnit.MILLISECONDS)
            .connectTimeout(defaultTimeout, TimeUnit.MILLISECONDS)
            .protocols(listOf(Protocol.HTTP_1_1, Protocol.HTTP_2))
            .build()
    }

    private fun buildRequest(config: ServerConfigAdapter, request: GraphQLRequest): Request.Builder {
        val httpRequestBody = request.toHttpJsonBody()
        println("config: $config, graphql request body: $httpRequestBody")
        val rb = Request.Builder().url(config.serverHost).addHeader("Accept", ApplicationJson)
            .post(httpRequestBody.toRequestBody(json))
        config.headers.forEach {
            run {
                rb.addHeader(it.key, it.value)
            }
        }
        return rb
    }

    fun syncRunQuery(
        config: ServerConfigAdapter,
        request: GraphQLRequest,
        entityClassName: String,
    ): Any? {
        val rb = buildRequest(config, request)
        val response = client.newCall(rb.build()).execute()
        if (response.isSuccessful) {
            val jsonObject = JSONObject(response.body?.string())
            val dataJSON = jsonObject.getJSONObject("data")
            if (!dataJSON.isNull("errors")) {
                throw ExecuteExceptionAdapter(
                    "found errors in response: ",
                    dataJSON.getJSONObject("errors").toString(),
                    null
                )
            } else {
                val data = dataJSON.get(request.request.operationName)
                return deserialized(data, entityClassName)
            }
        } else {
            throw ExecuteExceptionAdapter("response is fail", response.body?.string(), null)
        }
    }

    fun isPrimitive(entityClazzName: String?): Boolean {
        val primitiveTypes = listOf("Int", "Boolean", "String", "Short", "Byte", "Long", "Char", "Float")
        val optPrimitiveTypes = primitiveTypes.map { "$it?" }
        return primitiveTypes.contains(entityClazzName) || optPrimitiveTypes.contains(entityClazzName)
    }

}

inline fun <reified Out> OkHttpAdapter.deserialized(
    data: Any?,
    entityClazzName: String,
): Out? {
    if (data == null) return null
    if (isPrimitive(entityClazzName)) return data as Out
    return JacksonAdapter.objectMapper.readValue<Out>(data.toString())
}


// Pseudo adaptation, avoiding the interdependence of three languages, using independent implementation.
object JacksonAdapter {

    val objectMapper = jsonMapper {
        serializationInclusion(JsonInclude.Include.NON_NULL)
        serializationInclusion(JsonInclude.Include.NON_ABSENT)
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        addModule(ParameterNamesModule())
        addModule(Jdk8Module())
        addModule(JavaTimeModule())
        addModule(kotlinModule())
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    }
}