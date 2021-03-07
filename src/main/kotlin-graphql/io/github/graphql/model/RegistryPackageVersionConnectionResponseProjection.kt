package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageVersionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageVersionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageVersionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) + 1
            this.edges(RegistryPackageVersionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) + 1
            this.nodes(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RegistryPackageVersionEdgeResponseProjection): RegistryPackageVersionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RegistryPackageVersionEdgeResponseProjection): RegistryPackageVersionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageVersionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RegistryPackageVersionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RegistryPackageVersionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RegistryPackageVersionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageVersionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageVersionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
