package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface RegistryPackageSearchResolver {

    @Throws(Exception::class)
    fun registryPackagesForQuery(registryPackageSearchTO: RegistryPackageSearchTO, after: String?, before: String?, first: Int?, last: Int?, packageType: RegistryPackageTypeTO?, query: String?): RegistryPackageConnectionTO

}
