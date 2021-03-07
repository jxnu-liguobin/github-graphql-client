package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for RepositoryInfo
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface RepositoryInfoResolver {

    @Throws(Exception::class)
    fun shortDescriptionHTML(repositoryInfoTO: RepositoryInfoTO, limit: Int?): String

}
