package io.github.graphql.resolver

import io.github.graphql.model._
import ReactionContentTO._

/**
 * Resolver for PullRequestReview
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait PullRequestReviewResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def comments(pullRequestReviewTO: PullRequestReviewTO, after: String, before: String, first: Option[Int], last: Option[Int]): PullRequestReviewCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def onBehalfOf(pullRequestReviewTO: PullRequestReviewTO, after: String, before: String, first: Option[Int], last: Option[Int]): TeamConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reactions(pullRequestReviewTO: PullRequestReviewTO, after: String, before: String, content: ReactionContentTO, first: Option[Int], last: Option[Int], orderBy: ReactionOrderTO): ReactionConnectionTO

    @throws[Exception]
    def userContentEdits(pullRequestReviewTO: PullRequestReviewTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
