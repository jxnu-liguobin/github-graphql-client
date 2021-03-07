package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface RegistryPackageOwnerResolver {

    @Throws(Exception::class)
    fun registryPackages(registryPackageOwnerTO: RegistryPackageOwnerTO, after: String?, before: String?, first: Int?, last: Int?, name: String?, names: List<String?>?, packageType: RegistryPackageTypeTO?, publicOnly: Boolean?, registryPackageType: String?, repositoryId: String?): RegistryPackageConnectionTO

}
