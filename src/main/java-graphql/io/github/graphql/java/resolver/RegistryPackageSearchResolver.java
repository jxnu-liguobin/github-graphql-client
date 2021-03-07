package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface RegistryPackageSearchResolver {

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackagesForQuery(RegistryPackageSearchTO registryPackageSearchTO, String after, String before, Integer first, Integer last, RegistryPackageTypeTO packageType, String query) throws Exception;

}
