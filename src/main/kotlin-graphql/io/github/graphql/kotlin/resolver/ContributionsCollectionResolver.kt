package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface ContributionsCollectionResolver {

    @Throws(Exception::class)
    fun commitContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, maxRepositories: Int?): List<CommitContributionsByRepositoryTO>

    @Throws(Exception::class)
    fun issueContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String?, before: String?, excludeFirst: Boolean?, excludePopular: Boolean?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedIssueContributionConnectionTO

    @Throws(Exception::class)
    fun issueContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?, maxRepositories: Int?): List<IssueContributionsByRepositoryTO>

    @Throws(Exception::class)
    fun pullRequestContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String?, before: String?, excludeFirst: Boolean?, excludePopular: Boolean?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestContributionConnectionTO

    @Throws(Exception::class)
    fun pullRequestContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?, maxRepositories: Int?): List<PullRequestContributionsByRepositoryTO>

    @Throws(Exception::class)
    fun pullRequestReviewContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedPullRequestReviewContributionConnectionTO

    @Throws(Exception::class)
    fun pullRequestReviewContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, maxRepositories: Int?): List<PullRequestReviewContributionsByRepositoryTO>

    @Throws(Exception::class)
    fun repositoryContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String?, before: String?, excludeFirst: Boolean?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedRepositoryContributionConnectionTO

    @Throws(Exception::class)
    fun totalIssueContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?): Int

    @Throws(Exception::class)
    fun totalPullRequestContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?): Int

    @Throws(Exception::class)
    fun totalRepositoriesWithContributedIssues(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?): Int

    @Throws(Exception::class)
    fun totalRepositoriesWithContributedPullRequests(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?, excludePopular: Boolean?): Int

    @Throws(Exception::class)
    fun totalRepositoryContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Boolean?): Int

}
