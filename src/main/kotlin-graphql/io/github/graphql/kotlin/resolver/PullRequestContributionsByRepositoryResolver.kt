package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for PullRequestContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface PullRequestContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(pullRequestContributionsByRepositoryTO: PullRequestContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestContributionConnectionTO

}
