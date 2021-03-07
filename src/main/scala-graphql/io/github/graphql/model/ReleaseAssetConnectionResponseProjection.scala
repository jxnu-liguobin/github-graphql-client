package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseAssetConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReleaseAssetConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseAssetConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseAssetConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReleaseAssetEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) + 1)
            this.nodes(new ReleaseAssetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ReleaseAssetEdgeResponseProjection): ReleaseAssetConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReleaseAssetEdgeResponseProjection): ReleaseAssetConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ReleaseAssetResponseProjection): ReleaseAssetConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ReleaseAssetResponseProjection): ReleaseAssetConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReleaseAssetConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReleaseAssetConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReleaseAssetConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReleaseAssetConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ReleaseAssetConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseAssetConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}