package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageFileConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageFileConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageFileConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageFileConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) + 1
            this.edges(RegistryPackageFileEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) + 1
            this.nodes(RegistryPackageFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RegistryPackageFileEdgeResponseProjection): RegistryPackageFileConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RegistryPackageFileEdgeResponseProjection): RegistryPackageFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageFileConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RegistryPackageFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RegistryPackageFileConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RegistryPackageFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageFileConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
