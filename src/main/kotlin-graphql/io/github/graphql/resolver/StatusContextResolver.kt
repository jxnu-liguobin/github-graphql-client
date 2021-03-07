package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for StatusContext
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface StatusContextResolver {

    @Throws(Exception::class)
    fun avatarUrl(statusContextTO: StatusContextTO, size: Int?): String?

}
