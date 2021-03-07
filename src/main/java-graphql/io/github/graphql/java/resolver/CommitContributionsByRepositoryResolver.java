package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface CommitContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    CreatedCommitContributionConnectionTO contributions(CommitContributionsByRepositoryTO commitContributionsByRepositoryTO, String after, String before, Integer first, Integer last, CommitContributionOrderTO orderBy) throws Exception;

}
