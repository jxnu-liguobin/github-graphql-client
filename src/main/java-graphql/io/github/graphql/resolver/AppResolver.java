package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for App
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface AppResolver {

    @javax.validation.constraints.NotNull
    String logoUrl(AppTO appTO, Integer size) throws Exception;

}
