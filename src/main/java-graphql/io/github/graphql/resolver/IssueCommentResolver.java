package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for IssueComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface IssueCommentResolver {

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(IssueCommentTO issueCommentTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

    UserContentEditConnectionTO userContentEdits(IssueCommentTO issueCommentTO, String after, String before, Integer first, Integer last) throws Exception;

}
