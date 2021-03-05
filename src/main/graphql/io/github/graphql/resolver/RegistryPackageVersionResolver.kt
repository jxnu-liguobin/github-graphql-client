package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RegistryPackageVersionResolver {

    @Throws(Exception::class)
    fun dependencies(registryPackageVersionTO: RegistryPackageVersionTO, after: String?, before: String?, first: Int?, last: Int?, type: RegistryPackageDependencyTypeTO?): RegistryPackageDependencyConnectionTO

    @Throws(Exception::class)
    fun fileByName(registryPackageVersionTO: RegistryPackageVersionTO, filename: String): RegistryPackageFileTO?

    @Throws(Exception::class)
    fun files(registryPackageVersionTO: RegistryPackageVersionTO, after: String?, before: String?, first: Int?, last: Int?): RegistryPackageFileConnectionTO

}
