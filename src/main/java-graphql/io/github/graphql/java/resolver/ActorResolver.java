package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ActorResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(ActorTO actorTO, Integer size) throws Exception;

}
