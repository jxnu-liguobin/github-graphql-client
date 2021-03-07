package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface RegistryPackageVersionResolver {

    @Throws(Exception::class)
    fun dependencies(registryPackageVersionTO: RegistryPackageVersionTO, after: String?, before: String?, first: Int?, last: Int?, type: RegistryPackageDependencyTypeTO?): RegistryPackageDependencyConnectionTO

    @Throws(Exception::class)
    fun fileByName(registryPackageVersionTO: RegistryPackageVersionTO, filename: String): RegistryPackageFileTO?

    @Throws(Exception::class)
    fun files(registryPackageVersionTO: RegistryPackageVersionTO, after: String?, before: String?, first: Int?, last: Int?): RegistryPackageFileConnectionTO

}
