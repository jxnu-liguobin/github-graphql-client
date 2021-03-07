package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageSearchResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageSearchResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageSearchResponseProjection = {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1)
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        this.typename()
        this
    }

    def id(): RegistryPackageSearchResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], subProjection)
    }

    def registryPackagesForQuery(alias: String, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        this
    }

    def registryPackagesForQuery(input: RegistryPackageSearchRegistryPackagesForQueryParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackagesForQuery(alias: String, input: RegistryPackageSearchRegistryPackagesForQueryParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): RegistryPackageSearchResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): RegistryPackageSearchResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageSearchResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageSearchResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
