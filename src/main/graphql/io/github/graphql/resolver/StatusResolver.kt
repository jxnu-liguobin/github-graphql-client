package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Status
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface StatusResolver {

    @Throws(Exception::class)
    fun context(statusTO: StatusTO, name: String): StatusContextTO?

}
