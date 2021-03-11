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
        val parameters = method.parameters.toList()
        fun <K, V> listToMap(keys: List<K>, values: List<V>): Map<K, V> {
            return keys.zip(values).toMap()
        }

        fun getFieldsValue(p: GraphQLResponseProjection): List<GraphQLResponseField> {
            return p.javaClass.superclass.getDeclaredField("fields").let {
                it.isAccessible = true
                return@let it.get(p) as List<GraphQLResponseField>
            }
        }
        if (args != null && args.isNotEmpty() && parameters.isNotEmpty()) {
            val parameterNames = parameters.map { obj: Parameter -> obj.name }
            requestInstance.input.putAll(listToMap<String, Any>(parameterNames, args.toList()))
        }

        if (projection != null) {
            val fields = getFieldsValue(projection)
            if (fields.isEmpty()) {
                throw ExecuteExceptionAdapter("projection verification failed: ", "fields of projection cannot be empty", null)
            }
        }
        val graphQLRequest = GraphQLRequest(requestInstance, projection)
        return OkHttpAdapter.syncRunQuery(config, graphQLRequest)
    }
}