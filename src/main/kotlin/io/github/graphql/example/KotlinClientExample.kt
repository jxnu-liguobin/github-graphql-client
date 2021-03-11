package io.github.graphql.example

import io.github.graphql.ServerConfigAdapter
import io.github.graphql.client.GithubKotlinClient
import io.github.graphql.k.model.UserQueryRequest
import io.github.graphql.k.model.UserResponseProjection
import io.github.graphql.k.model.UserTO
import io.github.graphql.k.resolver.QueryResolver

object KotlinClientExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val userResponseProjection = UserResponseProjection().id().avatarUrl().login().resourcePath()
        val queryResolver = GithubKotlinClient.newBuilder()
                .setConfig(
                        ServerConfigAdapter(
                                "https://api.github.com/graphql",
                                mapOf(Pair("Authorization", "Bearer 5b64d19cff5d7eec10d99a9e4a3bf1bb0dc7491b"))
                        )
                )
                .setProjection(userResponseProjection).build<QueryResolver, UserQueryRequest>()

        val userTO: UserTO? = queryResolver.user("jxnu-liguobin")
        println(userTO.toString())
    }
}