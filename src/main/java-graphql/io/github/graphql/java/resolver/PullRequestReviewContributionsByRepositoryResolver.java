package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface PullRequestReviewContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    CreatedPullRequestReviewContributionConnectionTO contributions(PullRequestReviewContributionsByRepositoryTO pullRequestReviewContributionsByRepositoryTO, String after, String before, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

}
