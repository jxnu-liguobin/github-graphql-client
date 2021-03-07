package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for PullRequestContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface PullRequestContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    CreatedPullRequestContributionConnectionTO contributions(PullRequestContributionsByRepositoryTO pullRequestContributionsByRepositoryTO, String after, String before, Integer first, Integer last, ContributionOrderTO orderBy) throws Exception;

}
