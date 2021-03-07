package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface PullRequestReviewContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(pullRequestReviewContributionsByRepositoryTO: PullRequestReviewContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestReviewContributionConnectionTO

}
