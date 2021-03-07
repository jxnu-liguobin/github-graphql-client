package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Mannequin
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface MannequinResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(MannequinTO mannequinTO, Integer size) throws Exception;

}
