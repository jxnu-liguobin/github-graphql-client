package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface PullRequestReviewContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(pullRequestReviewContributionsByRepositoryTO: PullRequestReviewContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestReviewContributionConnectionTO

}
