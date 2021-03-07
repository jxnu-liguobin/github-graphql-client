package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for CommitComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface CommitCommentResolver {

    @Throws(Exception::class)
    fun reactions(commitCommentTO: CommitCommentTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(commitCommentTO: CommitCommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
