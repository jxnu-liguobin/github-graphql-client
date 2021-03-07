package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GistCommentConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GistCommentConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistCommentConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistCommentConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) + 1)
            this.edges(new GistCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) + 1)
            this.nodes(new GistCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: GistCommentEdgeResponseProjection): GistCommentConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: GistCommentEdgeResponseProjection): GistCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: GistCommentResponseProjection): GistCommentConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: GistCommentResponseProjection): GistCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): GistCommentConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): GistCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): GistCommentConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): GistCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): GistCommentConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GistCommentConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
