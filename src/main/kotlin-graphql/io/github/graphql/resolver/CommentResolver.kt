package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Comment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface CommentResolver {

    @Throws(Exception::class)
    fun userContentEdits(commentTO: CommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
