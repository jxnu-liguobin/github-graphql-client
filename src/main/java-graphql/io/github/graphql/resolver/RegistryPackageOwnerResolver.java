package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RegistryPackageOwnerResolver {

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackages(RegistryPackageOwnerTO registryPackageOwnerTO, String after, String before, Integer first, Integer last, String name, java.util.List<String> names, RegistryPackageTypeTO packageType, Boolean publicOnly, String registryPackageType, String repositoryId) throws Exception;

}
