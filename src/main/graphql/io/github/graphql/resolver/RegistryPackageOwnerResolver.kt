package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RegistryPackageOwnerResolver {

    @Throws(Exception::class)
    fun registryPackages(registryPackageOwnerTO: RegistryPackageOwnerTO, after: String?, before: String?, first: Int?, last: Int?, name: String?, names: List<String?>?, packageType: RegistryPackageTypeTO?, publicOnly: Boolean?, registryPackageType: String?, repositoryId: String?): RegistryPackageConnectionTO

}
