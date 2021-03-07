package io.github.graphql.resolver

import io.github.graphql.model._
import RegistryPackageTypeTO._

/**
 * Resolver for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait RegistryPackageOwnerResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackages(registryPackageOwnerTO: RegistryPackageOwnerTO, after: String, before: String, first: Option[Int], last: Option[Int], name: String, names: Seq[String], packageType: RegistryPackageTypeTO, publicOnly: Option[Boolean], registryPackageType: String, repositoryId: String): RegistryPackageConnectionTO

}
