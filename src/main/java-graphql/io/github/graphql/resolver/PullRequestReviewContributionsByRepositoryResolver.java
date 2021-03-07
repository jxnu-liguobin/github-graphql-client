package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface PullRequestReviewContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    CreatedPullRequestReviewContributionConnectionTO contributions(PullRequestReviewContributionsByRepositoryTO pullRequestReviewContributionsByRepositoryTO, String after, String before, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

}
