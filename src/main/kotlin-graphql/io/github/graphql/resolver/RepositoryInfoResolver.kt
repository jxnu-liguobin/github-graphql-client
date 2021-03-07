package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RepositoryInfo
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface RepositoryInfoResolver {

    @Throws(Exception::class)
    fun shortDescriptionHTML(repositoryInfoTO: RepositoryInfoTO, limit: Int?): String

}
