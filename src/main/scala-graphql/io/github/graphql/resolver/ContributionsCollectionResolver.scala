package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for ContributionsCollection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait ContributionsCollectionResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def commitContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, maxRepositories: Option[Int]): Seq[CommitContributionsByRepositoryTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issueContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String, before: String, excludeFirst: Option[Boolean], excludePopular: Option[Boolean], first: Option[Int], last: Option[Int], orderBy: ContributionOrderTO): CreatedIssueContributionConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issueContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean], maxRepositories: Option[Int]): Seq[IssueContributionsByRepositoryTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequestContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String, before: String, excludeFirst: Option[Boolean], excludePopular: Option[Boolean], first: Option[Int], last: Option[Int], orderBy: ContributionOrderTO): CreatedPullRequestContributionConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequestContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean], maxRepositories: Option[Int]): Seq[PullRequestContributionsByRepositoryTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequestReviewContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ContributionOrderTO): CreatedPullRequestReviewContributionConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequestReviewContributionsByRepository(contributionsCollectionTO: ContributionsCollectionTO, maxRepositories: Option[Int]): Seq[PullRequestReviewContributionsByRepositoryTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositoryContributions(contributionsCollectionTO: ContributionsCollectionTO, after: String, before: String, excludeFirst: Option[Boolean], first: Option[Int], last: Option[Int], orderBy: ContributionOrderTO): CreatedRepositoryContributionConnectionTO

    @throws[Exception]
    def totalIssueContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean]): Int

    @throws[Exception]
    def totalPullRequestContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean]): Int

    @throws[Exception]
    def totalRepositoriesWithContributedIssues(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean]): Int

    @throws[Exception]
    def totalRepositoriesWithContributedPullRequests(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean], excludePopular: Option[Boolean]): Int

    @throws[Exception]
    def totalRepositoryContributions(contributionsCollectionTO: ContributionsCollectionTO, excludeFirst: Option[Boolean]): Int

}
