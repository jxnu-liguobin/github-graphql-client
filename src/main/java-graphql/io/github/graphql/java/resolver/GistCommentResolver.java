package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for GistComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface GistCommentResolver {

    UserContentEditConnectionTO userContentEdits(GistCommentTO gistCommentTO, String after, String before, Integer first, Integer last) throws Exception;

}
