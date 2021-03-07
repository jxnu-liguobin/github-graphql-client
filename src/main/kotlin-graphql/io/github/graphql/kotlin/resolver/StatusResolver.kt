package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Status
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface StatusResolver {

    @Throws(Exception::class)
    fun context(statusTO: StatusTO, name: String): StatusContextTO?

}
