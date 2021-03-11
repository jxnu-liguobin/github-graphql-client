package io.github.graphql.proxy

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import io.github.graphql.*
import java.lang.reflect.*
import java.util.*

internal class KotlinResolverProxy(
    private val projection: GraphQLResponseProjection?,
    private val config: ServerConfigAdapter,
    request: Class<out GraphQLOperationRequest>,
) : InvocationHandler {

    private val requestInstance = request.newInstance()
    override fun invoke(proxy: Any, method: Method, args: Array<out Any>?): Any? {
        return if (proxy.javaClass != method.declaringClass) {
            proxyInvoke(method, args)
        } else method.invoke(this, *args.orEmpty())
    }

    private fun proxyInvoke(method: Method, args: Array<out Any>?): Any? {
        val type = method.genericReturnType
        val entityClassName = if (type is ParameterizedType) {
            val parameterizedType = type.actualTypeArguments
            parameterizedType[0].typeName
        } else {
            type.typeName
        }
        val parameters = method.parameters.toList()

        fun <K, V> listToMap(keys: List<K>, values: List<V>): Map<K, V> {
            return keys.zip(values).toMap()
        }

        if (args != null && args.isNotEmpty() && parameters.isNotEmpty()) {
            val parameterNames = parameters.map { obj: Parameter -> obj.name }
            requestInstance.input.putAll(listToMap<String, Any>(parameterNames, args.toList()))
        }
        val fields = projection?.getFieldsValue()

        if (projection != null && (fields?.isEmpty() == true)) {
            throw ExecuteExceptionAdapter("projection verification failed: ", "fields of projection cannot be empty", null)
        }
        val graphQLRequest = GraphQLRequest(requestInstance, projection)
        return OkHttpAdapter.syncRunQuery(config, graphQLRequest, entityClassName)
    }


    private fun GraphQLResponseProjection.getFieldsValue(): List<GraphQLResponseField> {
        return javaClass.getDeclaredField("fields").let {
            it.isAccessible = true
            return@let it.get(this) as List<GraphQLResponseField>;
        }
    }

}