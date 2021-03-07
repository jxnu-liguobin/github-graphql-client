package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class GistEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistEdgeResponseProjection.GistResponseProjection.node", projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) + 1)
            this.node(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): GistEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): GistEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: GistResponseProjection): GistEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: GistResponseProjection): GistEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): GistEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
