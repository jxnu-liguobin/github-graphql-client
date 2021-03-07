package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface RegistryPackageSearchResolver {

    @Throws(Exception::class)
    fun registryPackagesForQuery(registryPackageSearchTO: RegistryPackageSearchTO, after: String?, before: String?, first: Int?, last: Int?, packageType: RegistryPackageTypeTO?, query: String?): RegistryPackageConnectionTO

}
