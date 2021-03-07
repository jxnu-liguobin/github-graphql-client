package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageOwnerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageOwnerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageOwnerResponseProjection {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages"] = projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1
            this.registryPackages(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        this.typename()
        return this
    }

    fun id(): RegistryPackageOwnerResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun registryPackages(subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = registryPackages(null, subProjection)

    fun registryPackages(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackages(input: RegistryPackageOwnerRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = registryPackages(null, input, subProjection)

    fun registryPackages(alias: String?, input: RegistryPackageOwnerRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): RegistryPackageOwnerResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): RegistryPackageOwnerResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): RegistryPackageOwnerResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageOwnerResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageOwnerResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
