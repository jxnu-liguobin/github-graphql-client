package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for GitActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface GitActorResolver {

    @Throws(Exception::class)
    fun avatarUrl(gitActorTO: GitActorTO, size: Int?): String

}
