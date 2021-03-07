package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Commit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface CommitResolver {

    PullRequestConnectionTO associatedPullRequests(CommitTO commitTO, String after, String before, Integer first, Integer last, PullRequestOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    BlameTO blame(CommitTO commitTO, String path) throws Exception;

    @javax.validation.constraints.NotNull
    CommitCommentConnectionTO comments(CommitTO commitTO, String after, String before, Integer first, Integer last) throws Exception;

    DeploymentConnectionTO deployments(CommitTO commitTO, String after, String before, java.util.List<String> environments, Integer first, Integer last, DeploymentOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    CommitHistoryConnectionTO history(CommitTO commitTO, String after, CommitAuthorTO author, String before, Integer first, Integer last, String path, String since, String until) throws Exception;

    @javax.validation.constraints.NotNull
    CommitConnectionTO parents(CommitTO commitTO, String after, String before, Integer first, Integer last) throws Exception;

}
