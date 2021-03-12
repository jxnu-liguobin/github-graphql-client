package io.github.graphql.example

import io.github.graphql.ServerConfigAdapter
import io.github.graphql.client.GithubKotlinClient
import io.github.graphql.k.model.*
import io.github.graphql.k.resolver.QueryResolver

object KotlinClientExample {

    @JvmStatic
    fun main(args: Array<String>) {
        // Since Kotlin has a mandatory non-null for fields, a field-less interface test is used here
        val rateLimitResponseProjection = RateLimitResponseProjection().`all$`(1)
        val queryResolver = GithubKotlinClient.newBuilder()
            .setConfig(
                ServerConfigAdapter(
                    "https://api.github.com/graphql",
                    mapOf(Pair("Authorization", "Bearer 6c6e6f4c7b507b2cf6a9612762e9e35eb4195762"))
                )
            )
            .setProjection(rateLimitResponseProjection).build<QueryResolver, RateLimitQueryRequest>()

        val rateLimit = queryResolver.rateLimit(true)
        println(rateLimit.toString())
    }
}