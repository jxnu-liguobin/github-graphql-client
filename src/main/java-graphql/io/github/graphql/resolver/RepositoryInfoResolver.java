package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for RepositoryInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RepositoryInfoResolver {

    @javax.validation.constraints.NotNull
    String shortDescriptionHTML(RepositoryInfoTO repositoryInfoTO, Integer limit) throws Exception;

}
