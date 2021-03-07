package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for CommitCommentThread
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface CommitCommentThreadResolver {

    @javax.validation.constraints.NotNull
    CommitCommentConnectionTO comments(CommitCommentThreadTO commitCommentThreadTO, String after, String before, Integer first, Integer last) throws Exception;

}
