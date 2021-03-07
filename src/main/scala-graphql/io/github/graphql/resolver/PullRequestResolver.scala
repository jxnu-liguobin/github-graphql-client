package io.github.graphql.resolver

import io.github.graphql.model._
import Seq[ProjectCardArchivedStateTO]._
import ReactionContentTO._
import Seq[PullRequestReviewStateTO]._
import Seq[PullRequestTimelineItemsItemTypeTO]._

/**
 * Resolver for PullRequest
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait PullRequestResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def assignees(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def comments(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): IssueCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def commits(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): PullRequestCommitConnectionTO

    @throws[Exception]
    def files(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): PullRequestChangedFileConnectionTO

    @throws[Exception]
    def labels(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): LabelConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def participants(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projectCards(pullRequestTO: PullRequestTO, after: String, archivedStates: Seq[ProjectCardArchivedStateTO], before: String, first: Option[Int], last: Option[Int]): ProjectCardConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reactions(pullRequestTO: PullRequestTO, after: String, before: String, content: ReactionContentTO, first: Option[Int], last: Option[Int], orderBy: ReactionOrderTO): ReactionConnectionTO

    @throws[Exception]
    def reviewRequests(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): ReviewRequestConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reviewThreads(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): PullRequestReviewThreadConnectionTO

    @throws[Exception]
    def reviews(pullRequestTO: PullRequestTO, after: String, author: String, before: String, first: Option[Int], last: Option[Int], states: Seq[PullRequestReviewStateTO]): PullRequestReviewConnectionTO

    @deprecated(message = "`timeline` will be removed Use PullRequest.timelineItems instead. Removal on 2019-10-01 UTC.")
    @javax.validation.constraints.NotNull
    @throws[Exception]
    def timeline(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int], since: String): PullRequestTimelineConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def timelineItems(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], itemTypes: Seq[PullRequestTimelineItemsItemTypeTO], last: Option[Int], since: String, skip: Option[Int]): PullRequestTimelineItemsConnectionTO

    @throws[Exception]
    def userContentEdits(pullRequestTO: PullRequestTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
