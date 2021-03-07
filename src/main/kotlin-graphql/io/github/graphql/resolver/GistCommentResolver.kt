package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for GistComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface GistCommentResolver {

    @Throws(Exception::class)
    fun userContentEdits(gistCommentTO: GistCommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
