package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Starrable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface StarrableResolver {

    @javax.validation.constraints.NotNull
    StargazerConnectionTO stargazers(StarrableTO starrableTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy) throws Exception;

}
