package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import Seq[IssueStateTO]._
import Seq[PullRequestStateTO]._

/**
 * Resolver for Label
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait LabelResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issues(labelTO: LabelTO, after: String, before: String, filterBy: IssueFiltersTO, first: Option[Int], labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[IssueStateTO]): IssueConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequests(labelTO: LabelTO, after: String, baseRefName: String, before: String, first: Option[Int], headRefName: String, labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[PullRequestStateTO]): PullRequestConnectionTO

}
