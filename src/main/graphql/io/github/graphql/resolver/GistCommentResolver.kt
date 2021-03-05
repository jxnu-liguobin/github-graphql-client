package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for GistComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface GistCommentResolver {

    @Throws(Exception::class)
    fun userContentEdits(gistCommentTO: GistCommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
