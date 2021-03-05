package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RegistryPackage
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RegistryPackageResolver {

    @Throws(Exception::class)
    fun packageFileByGuid(registryPackageTO: RegistryPackageTO, guid: String): RegistryPackageFileTO?

    @Throws(Exception::class)
    fun packageFileBySha256(registryPackageTO: RegistryPackageTO, sha256: String): RegistryPackageFileTO?

    @Throws(Exception::class)
    fun preReleaseVersions(registryPackageTO: RegistryPackageTO, after: String?, before: String?, first: Int?, last: Int?): RegistryPackageVersionConnectionTO?

    @Throws(Exception::class)
    fun tags(registryPackageTO: RegistryPackageTO, after: String?, before: String?, first: Int?, last: Int?): RegistryPackageTagConnectionTO

    @Throws(Exception::class)
    fun topics(registryPackageTO: RegistryPackageTO, after: String?, before: String?, first: Int?, last: Int?): TopicConnectionTO?

    @Throws(Exception::class)
    fun version(registryPackageTO: RegistryPackageTO, version: String): RegistryPackageVersionTO?

    @Throws(Exception::class)
    fun versionByPlatform(registryPackageTO: RegistryPackageTO, platform: String, version: String): RegistryPackageVersionTO?

    @Throws(Exception::class)
    fun versionBySha256(registryPackageTO: RegistryPackageTO, sha256: String): RegistryPackageVersionTO?

    @Throws(Exception::class)
    fun versions(registryPackageTO: RegistryPackageTO, after: String?, before: String?, first: Int?, last: Int?): RegistryPackageVersionConnectionTO

    @Throws(Exception::class)
    fun versionsByMetadatum(registryPackageTO: RegistryPackageTO, after: String?, before: String?, first: Int?, last: Int?, metadatum: RegistryPackageMetadatumTO): RegistryPackageVersionConnectionTO?

}
