package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageSearchResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageSearchResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageSearchResponseProjection {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery"] = projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1
            this.registryPackagesForQuery(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        this.typename()
        return this
    }

    fun id(): RegistryPackageSearchResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = registryPackagesForQuery(null, subProjection)

    fun registryPackagesForQuery(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackagesForQuery(input: RegistryPackageSearchRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection = registryPackagesForQuery(null, input, subProjection)

    fun registryPackagesForQuery(alias: String?, input: RegistryPackageSearchRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): RegistryPackageSearchResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): RegistryPackageSearchResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageSearchResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageSearchResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
