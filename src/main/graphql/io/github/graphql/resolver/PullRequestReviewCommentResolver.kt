package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReviewComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface PullRequestReviewCommentResolver {

    @Throws(Exception::class)
    fun reactions(pullRequestReviewCommentTO: PullRequestReviewCommentTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(pullRequestReviewCommentTO: PullRequestReviewCommentTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
