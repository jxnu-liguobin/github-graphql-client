package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for GitActor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface GitActorResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(GitActorTO gitActorTO, Integer size) throws Exception;

}
