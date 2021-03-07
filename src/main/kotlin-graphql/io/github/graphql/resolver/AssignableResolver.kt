package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Assignable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface AssignableResolver {

    @Throws(Exception::class)
    fun assignees(assignableTO: AssignableTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

}
