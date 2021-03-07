package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Comment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface CommentResolver {

    @Throws(Exception::class)
    fun userContentEdits(commentTO: CommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
