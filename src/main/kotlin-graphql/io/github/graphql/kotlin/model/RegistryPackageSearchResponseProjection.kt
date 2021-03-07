package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageSearchResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
