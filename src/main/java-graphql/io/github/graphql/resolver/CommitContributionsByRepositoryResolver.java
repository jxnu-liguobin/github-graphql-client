package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface CommitContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    CreatedCommitContributionConnectionTO contributions(CommitContributionsByRepositoryTO commitContributionsByRepositoryTO, String after, String before, Integer first, Integer last, CommitContributionOrderTO orderBy) throws Exception;

}
