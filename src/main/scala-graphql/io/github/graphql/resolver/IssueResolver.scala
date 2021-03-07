package io.github.graphql.resolver

import io.github.graphql.model._
import Seq[ProjectCardArchivedStateTO]._
import ReactionContentTO._
import Seq[IssueTimelineItemsItemTypeTO]._

/**
 * Resolver for Issue
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait IssueResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def assignees(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def comments(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int]): IssueCommentConnectionTO

    @throws[Exception]
    def labels(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int]): LabelConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def participants(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projectCards(issueTO: IssueTO, after: String, archivedStates: Seq[ProjectCardArchivedStateTO], before: String, first: Option[Int], last: Option[Int]): ProjectCardConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reactions(issueTO: IssueTO, after: String, before: String, content: ReactionContentTO, first: Option[Int], last: Option[Int], orderBy: ReactionOrderTO): ReactionConnectionTO

    @deprecated(message = "`timeline` will be removed Use Issue.timelineItems instead. Removal on 2019-10-01 UTC.")
    @javax.validation.constraints.NotNull
    @throws[Exception]
    def timeline(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int], since: String): IssueTimelineConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def timelineItems(issueTO: IssueTO, after: String, before: String, first: Option[Int], itemTypes: Seq[IssueTimelineItemsItemTypeTO], last: Option[Int], since: String, skip: Option[Int]): IssueTimelineItemsConnectionTO

    @throws[Exception]
    def userContentEdits(issueTO: IssueTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
