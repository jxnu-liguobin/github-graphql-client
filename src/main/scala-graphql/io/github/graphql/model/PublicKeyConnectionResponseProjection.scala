package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PublicKeyConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PublicKeyConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PublicKeyConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PublicKeyConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PublicKeyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) + 1)
            this.nodes(new PublicKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PublicKeyEdgeResponseProjection): PublicKeyConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PublicKeyEdgeResponseProjection): PublicKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PublicKeyResponseProjection): PublicKeyConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PublicKeyResponseProjection): PublicKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PublicKeyConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PublicKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PublicKeyConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PublicKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PublicKeyConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PublicKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
