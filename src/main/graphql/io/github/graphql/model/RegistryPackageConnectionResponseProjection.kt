package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) + 1
            this.edges(RegistryPackageEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) + 1
            this.nodes(RegistryPackageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RegistryPackageEdgeResponseProjection): RegistryPackageConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RegistryPackageEdgeResponseProjection): RegistryPackageConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RegistryPackageResponseProjection): RegistryPackageConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RegistryPackageResponseProjection): RegistryPackageConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RegistryPackageConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RegistryPackageConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RegistryPackageConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
