package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface PullRequestCommitCommentThreadResolver {

    @javax.validation.constraints.NotNull
    CommitCommentConnectionTO comments(PullRequestCommitCommentThreadTO pullRequestCommitCommentThreadTO, String after, String before, Integer first, Integer last) throws Exception;

}
