package io.github.graphql.client

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import io.github.graphql.proxy.KotlinResolverProxy
import io.github.graphql.ServerConfigAdapter
import java.lang.reflect.Proxy

class GithubKotlinClient constructor(
    private val projection: GraphQLResponseProjection,
    private val config: ServerConfigAdapter,
    private val resolver: Class<*>,
    private val request: Class<out GraphQLOperationRequest>
) {

    fun getResolver(): Any? {
        val invocationHandler = KotlinResolverProxy(projection, config, request)
        return Proxy.newProxyInstance(resolver.classLoader, arrayOf(resolver), invocationHandler)
    }

    companion object {
        fun newBuilder(): GitHubKotlinClientBuilder = GitHubKotlinClientBuilder()

        class GitHubKotlinClientBuilder {

            lateinit var projection: GraphQLResponseProjection
            lateinit var config: ServerConfigAdapter

            fun setConfig(config: ServerConfigAdapter): GitHubKotlinClientBuilder {
                this.config = config
                return this
            }

            fun setProjection(projection: GraphQLResponseProjection): GitHubKotlinClientBuilder {
                this.projection = projection
                return this
            }

            inline fun <reified Resolver, reified Request : GraphQLOperationRequest> build(): Resolver {
                val invoke = GithubKotlinClient(this.projection, this.config, Resolver::class.java, Request::class.java)
                val resolver = invoke.getResolver()
                assert(resolver != null)
                return resolver as Resolver
            }
        }
    }
}