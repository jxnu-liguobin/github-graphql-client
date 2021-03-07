package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import RegistryPackageDependencyTypeTO._

/**
 * Resolver for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait RegistryPackageVersionResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def dependencies(registryPackageVersionTO: RegistryPackageVersionTO, after: String, before: String, first: Option[Int], last: Option[Int], `type`: RegistryPackageDependencyTypeTO): RegistryPackageDependencyConnectionTO

    @throws[Exception]
    def fileByName(registryPackageVersionTO: RegistryPackageVersionTO, filename: String): RegistryPackageFileTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def files(registryPackageVersionTO: RegistryPackageVersionTO, after: String, before: String, first: Option[Int], last: Option[Int]): RegistryPackageFileConnectionTO

}
