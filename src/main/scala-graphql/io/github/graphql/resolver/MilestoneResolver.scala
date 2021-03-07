package io.github.graphql.resolver

import io.github.graphql.model._
import Seq[IssueStateTO]._
import Seq[PullRequestStateTO]._

/**
 * Resolver for Milestone
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait MilestoneResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issues(milestoneTO: MilestoneTO, after: String, before: String, filterBy: IssueFiltersTO, first: Option[Int], labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[IssueStateTO]): IssueConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequests(milestoneTO: MilestoneTO, after: String, baseRefName: String, before: String, first: Option[Int], headRefName: String, labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[PullRequestStateTO]): PullRequestConnectionTO

}
