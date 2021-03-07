package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Starrable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface StarrableResolver {

    @javax.validation.constraints.NotNull
    StargazerConnectionTO stargazers(StarrableTO starrableTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy) throws Exception;

}
