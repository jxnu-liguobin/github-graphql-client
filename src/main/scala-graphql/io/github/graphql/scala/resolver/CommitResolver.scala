package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Commit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait CommitResolver {

    @throws[Exception]
    def associatedPullRequests(commitTO: CommitTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: PullRequestOrderTO): PullRequestConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def blame(commitTO: CommitTO, path: String): BlameTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def comments(commitTO: CommitTO, after: String, before: String, first: Option[Int], last: Option[Int]): CommitCommentConnectionTO

    @throws[Exception]
    def deployments(commitTO: CommitTO, after: String, before: String, environments: Seq[String], first: Option[Int], last: Option[Int], orderBy: DeploymentOrderTO): DeploymentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def history(commitTO: CommitTO, after: String, author: CommitAuthorTO, before: String, first: Option[Int], last: Option[Int], path: String, since: String, until: String): CommitHistoryConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def parents(commitTO: CommitTO, after: String, before: String, first: Option[Int], last: Option[Int]): CommitConnectionTO

}
