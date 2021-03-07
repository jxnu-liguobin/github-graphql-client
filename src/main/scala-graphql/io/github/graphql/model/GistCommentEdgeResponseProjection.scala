package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistCommentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class GistCommentEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistCommentEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistCommentEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) + 1)
            this.node(new GistCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): GistCommentEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): GistCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: GistCommentResponseProjection): GistCommentEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: GistCommentResponseProjection): GistCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): GistCommentEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
