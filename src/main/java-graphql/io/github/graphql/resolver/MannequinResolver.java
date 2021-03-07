package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Mannequin
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface MannequinResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(MannequinTO mannequinTO, Integer size) throws Exception;

}
