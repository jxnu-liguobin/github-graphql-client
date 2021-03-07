package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class GistConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) + 1)
            this.edges(new GistEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.GistResponseProjection.nodes", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) + 1)
            this.nodes(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: GistEdgeResponseProjection): GistConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: GistEdgeResponseProjection): GistConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: GistResponseProjection): GistConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: GistResponseProjection): GistConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): GistConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): GistConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): GistConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): GistConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): GistConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
