package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ContributionsCollectionResolver {

    @javax.validation.constraints.NotNull
    java.util.List<CommitContributionsByRepositoryTO> commitContributionsByRepository(ContributionsCollectionTO contributionsCollectionTO, Integer maxRepositories) throws Exception;

    @javax.validation.constraints.NotNull
    CreatedIssueContributionConnectionTO issueContributions(ContributionsCollectionTO contributionsCollectionTO, String after, String before, Boolean excludeFirst, Boolean excludePopular, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<IssueContributionsByRepositoryTO> issueContributionsByRepository(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular, Integer maxRepositories) throws Exception;

    @javax.validation.constraints.NotNull
    CreatedPullRequestContributionConnectionTO pullRequestContributions(ContributionsCollectionTO contributionsCollectionTO, String after, String before, Boolean excludeFirst, Boolean excludePopular, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<PullRequestContributionsByRepositoryTO> pullRequestContributionsByRepository(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular, Integer maxRepositories) throws Exception;

    @javax.validation.constraints.NotNull
    CreatedPullRequestReviewContributionConnectionTO pullRequestReviewContributions(ContributionsCollectionTO contributionsCollectionTO, String after, String before, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<PullRequestReviewContributionsByRepositoryTO> pullRequestReviewContributionsByRepository(ContributionsCollectionTO contributionsCollectionTO, Integer maxRepositories) throws Exception;

    @javax.validation.constraints.NotNull
    CreatedRepositoryContributionConnectionTO repositoryContributions(ContributionsCollectionTO contributionsCollectionTO, String after, String before, Boolean excludeFirst, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

    int totalIssueContributions(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular) throws Exception;

    int totalPullRequestContributions(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular) throws Exception;

    int totalRepositoriesWithContributedIssues(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular) throws Exception;

    int totalRepositoriesWithContributedPullRequests(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst, Boolean excludePopular) throws Exception;

    int totalRepositoryContributions(ContributionsCollectionTO contributionsCollectionTO, Boolean excludeFirst) throws Exception;

}
