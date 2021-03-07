package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for GitActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface GitActorResolver {

    @Throws(Exception::class)
    fun avatarUrl(gitActorTO: GitActorTO, size: Int?): String

}
