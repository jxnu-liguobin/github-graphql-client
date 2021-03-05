package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReview
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface PullRequestReviewResolver {

    @Throws(Exception::class)
    fun comments(pullRequestReviewTO: PullRequestReviewTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestReviewCommentConnectionTO

    @Throws(Exception::class)
    fun onBehalfOf(pullRequestReviewTO: PullRequestReviewTO, after: String?, before: String?, first: Int?, last: Int?): TeamConnectionTO

    @Throws(Exception::class)
    fun reactions(pullRequestReviewTO: PullRequestReviewTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(pullRequestReviewTO: PullRequestReviewTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
