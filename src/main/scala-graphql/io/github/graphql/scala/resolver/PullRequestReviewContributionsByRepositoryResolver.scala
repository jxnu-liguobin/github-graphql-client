package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait PullRequestReviewContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def contributions(pullRequestReviewContributionsByRepositoryTO: PullRequestReviewContributionsByRepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ContributionOrderTO): CreatedPullRequestReviewContributionConnectionTO

}
