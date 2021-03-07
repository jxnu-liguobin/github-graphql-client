package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for PullRequestReview
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface PullRequestReviewResolver {

    @javax.validation.constraints.NotNull
    PullRequestReviewCommentConnectionTO comments(PullRequestReviewTO pullRequestReviewTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    TeamConnectionTO onBehalfOf(PullRequestReviewTO pullRequestReviewTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(PullRequestReviewTO pullRequestReviewTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

    UserContentEditConnectionTO userContentEdits(PullRequestReviewTO pullRequestReviewTO, String after, String before, Integer first, Integer last) throws Exception;

}
