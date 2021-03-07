package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface PullRequestReviewContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(pullRequestReviewContributionsByRepositoryTO: PullRequestReviewContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestReviewContributionConnectionTO

}
