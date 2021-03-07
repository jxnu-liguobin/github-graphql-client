package io.github.graphql.resolver

import io.github.graphql.model._
import Seq[PullRequestStateTO]._

/**
 * Resolver for Ref
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait RefResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def associatedPullRequests(refTO: RefTO, after: String, baseRefName: String, before: String, first: Option[Int], headRefName: String, labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[PullRequestStateTO]): PullRequestConnectionTO

}
