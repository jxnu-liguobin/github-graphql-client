package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface ActorResolver {

    @Throws(Exception::class)
    fun avatarUrl(actorTO: ActorTO, size: Int?): String

}
