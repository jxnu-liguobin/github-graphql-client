package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for IssueComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface IssueCommentResolver {

    @Throws(Exception::class)
    fun reactions(issueCommentTO: IssueCommentTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(issueCommentTO: IssueCommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
