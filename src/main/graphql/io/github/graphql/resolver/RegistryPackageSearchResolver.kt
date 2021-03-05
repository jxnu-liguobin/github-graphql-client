package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RegistryPackageSearchResolver {

    @Throws(Exception::class)
    fun registryPackagesForQuery(registryPackageSearchTO: RegistryPackageSearchTO, after: String?, before: String?, first: Int?, last: Int?, packageType: RegistryPackageTypeTO?, query: String?): RegistryPackageConnectionTO

}
