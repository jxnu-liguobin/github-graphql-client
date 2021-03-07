package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ActorResolver {

    @Throws(Exception::class)
    fun avatarUrl(actorTO: ActorTO, size: Int?): String

}
