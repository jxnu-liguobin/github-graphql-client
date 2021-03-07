package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseAssetConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReleaseAssetConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseAssetConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseAssetConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) + 1
            this.edges(ReleaseAssetEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) + 1
            this.nodes(ReleaseAssetResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ReleaseAssetEdgeResponseProjection): ReleaseAssetConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReleaseAssetEdgeResponseProjection): ReleaseAssetConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ReleaseAssetResponseProjection): ReleaseAssetConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ReleaseAssetResponseProjection): ReleaseAssetConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReleaseAssetConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReleaseAssetConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReleaseAssetConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReleaseAssetConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ReleaseAssetConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseAssetConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
