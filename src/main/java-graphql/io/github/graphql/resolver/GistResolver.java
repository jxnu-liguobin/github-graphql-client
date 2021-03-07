package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Gist
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface GistResolver {

    @javax.validation.constraints.NotNull
    GistCommentConnectionTO comments(GistTO gistTO, String after, String before, Integer first, Integer last) throws Exception;

    java.util.List<GistFileTO> files(GistTO gistTO, Integer limit, String oid) throws Exception;

    @javax.validation.constraints.NotNull
    GistConnectionTO forks(GistTO gistTO, String after, String before, Integer first, Integer last, GistOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    StargazerConnectionTO stargazers(GistTO gistTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy) throws Exception;

}
