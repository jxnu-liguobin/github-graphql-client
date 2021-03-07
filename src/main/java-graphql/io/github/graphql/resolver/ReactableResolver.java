package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Reactable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ReactableResolver {

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(ReactableTO reactableTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

}
