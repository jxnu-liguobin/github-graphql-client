package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageOwnerResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageOwnerResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageOwnerResponseProjection = {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1)
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        this.typename()
        this
    }

    def id(): RegistryPackageOwnerResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def registryPackages(subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = {
        registryPackages(null.asInstanceOf[String], subProjection)
    }

    def registryPackages(alias: String, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        this
    }

    def registryPackages(input: RegistryPackageOwnerRegistryPackagesParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = {
        registryPackages(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackages(alias: String, input: RegistryPackageOwnerRegistryPackagesParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): RegistryPackageOwnerResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): RegistryPackageOwnerResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): RegistryPackageOwnerResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageOwnerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
