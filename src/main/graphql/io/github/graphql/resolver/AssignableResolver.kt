package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Assignable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface AssignableResolver {

    @Throws(Exception::class)
    fun assignees(assignableTO: AssignableTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

}
