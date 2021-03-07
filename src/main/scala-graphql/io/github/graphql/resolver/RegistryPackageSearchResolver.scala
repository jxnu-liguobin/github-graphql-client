package io.github.graphql.resolver

import io.github.graphql.model._
import RegistryPackageTypeTO._

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait RegistryPackageSearchResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackagesForQuery(registryPackageSearchTO: RegistryPackageSearchTO, after: String, before: String, first: Option[Int], last: Option[Int], packageType: RegistryPackageTypeTO, query: String): RegistryPackageConnectionTO

}
