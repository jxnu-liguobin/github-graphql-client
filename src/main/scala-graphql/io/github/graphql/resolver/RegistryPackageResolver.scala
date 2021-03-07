package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait RegistryPackageResolver {

    @throws[Exception]
    def packageFileByGuid(registryPackageTO: RegistryPackageTO, guid: String): RegistryPackageFileTO

    @throws[Exception]
    def packageFileBySha256(registryPackageTO: RegistryPackageTO, sha256: String): RegistryPackageFileTO

    @throws[Exception]
    def preReleaseVersions(registryPackageTO: RegistryPackageTO, after: String, before: String, first: Option[Int], last: Option[Int]): RegistryPackageVersionConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def tags(registryPackageTO: RegistryPackageTO, after: String, before: String, first: Option[Int], last: Option[Int]): RegistryPackageTagConnectionTO

    @throws[Exception]
    def topics(registryPackageTO: RegistryPackageTO, after: String, before: String, first: Option[Int], last: Option[Int]): TopicConnectionTO

    @throws[Exception]
    def version(registryPackageTO: RegistryPackageTO, version: String): RegistryPackageVersionTO

    @throws[Exception]
    def versionByPlatform(registryPackageTO: RegistryPackageTO, platform: String, version: String): RegistryPackageVersionTO

    @throws[Exception]
    def versionBySha256(registryPackageTO: RegistryPackageTO, sha256: String): RegistryPackageVersionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def versions(registryPackageTO: RegistryPackageTO, after: String, before: String, first: Option[Int], last: Option[Int]): RegistryPackageVersionConnectionTO

    @throws[Exception]
    def versionsByMetadatum(registryPackageTO: RegistryPackageTO, after: String, before: String, first: Option[Int], last: Option[Int], metadatum: RegistryPackageMetadatumTO): RegistryPackageVersionConnectionTO

}
