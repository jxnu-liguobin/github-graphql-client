package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RegistryPackageSearchResolver {

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackagesForQuery(RegistryPackageSearchTO registryPackageSearchTO, String after, String before, Integer first, Integer last, RegistryPackageTypeTO packageType, String query) throws Exception;

}
