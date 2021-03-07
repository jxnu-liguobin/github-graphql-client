package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface ActorResolver {

    @Throws(Exception::class)
    fun avatarUrl(actorTO: ActorTO, size: Int?): String

}
