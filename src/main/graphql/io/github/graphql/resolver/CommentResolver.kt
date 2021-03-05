package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Comment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface CommentResolver {

    @Throws(Exception::class)
    fun userContentEdits(commentTO: CommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
