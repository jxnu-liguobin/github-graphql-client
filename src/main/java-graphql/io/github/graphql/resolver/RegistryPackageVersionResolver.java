package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RegistryPackageVersionResolver {

    @javax.validation.constraints.NotNull
    RegistryPackageDependencyConnectionTO dependencies(RegistryPackageVersionTO registryPackageVersionTO, String after, String before, Integer first, Integer last, RegistryPackageDependencyTypeTO type) throws Exception;

    RegistryPackageFileTO fileByName(RegistryPackageVersionTO registryPackageVersionTO, String filename) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageFileConnectionTO files(RegistryPackageVersionTO registryPackageVersionTO, String after, String before, Integer first, Integer last) throws Exception;

}
