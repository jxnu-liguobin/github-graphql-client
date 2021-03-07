package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RegistryPackageResolver {

    RegistryPackageFileTO packageFileByGuid(RegistryPackageTO registryPackageTO, String guid) throws Exception;

    RegistryPackageFileTO packageFileBySha256(RegistryPackageTO registryPackageTO, String sha256) throws Exception;

    RegistryPackageVersionConnectionTO preReleaseVersions(RegistryPackageTO registryPackageTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageTagConnectionTO tags(RegistryPackageTO registryPackageTO, String after, String before, Integer first, Integer last) throws Exception;

    TopicConnectionTO topics(RegistryPackageTO registryPackageTO, String after, String before, Integer first, Integer last) throws Exception;

    RegistryPackageVersionTO version(RegistryPackageTO registryPackageTO, String version) throws Exception;

    RegistryPackageVersionTO versionByPlatform(RegistryPackageTO registryPackageTO, String platform, String version) throws Exception;

    RegistryPackageVersionTO versionBySha256(RegistryPackageTO registryPackageTO, String sha256) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageVersionConnectionTO versions(RegistryPackageTO registryPackageTO, String after, String before, Integer first, Integer last) throws Exception;

    RegistryPackageVersionConnectionTO versionsByMetadatum(RegistryPackageTO registryPackageTO, String after, String before, Integer first, Integer last, RegistryPackageMetadatumTO metadatum) throws Exception;

}
