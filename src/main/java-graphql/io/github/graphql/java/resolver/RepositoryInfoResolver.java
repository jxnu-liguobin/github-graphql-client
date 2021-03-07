package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for RepositoryInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface RepositoryInfoResolver {

    @javax.validation.constraints.NotNull
    String shortDescriptionHTML(RepositoryInfoTO repositoryInfoTO, Integer limit) throws Exception;

}
