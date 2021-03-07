package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Reactable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ReactableResolver {

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(ReactableTO reactableTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

}
