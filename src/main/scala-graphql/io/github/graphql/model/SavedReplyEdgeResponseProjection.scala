package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SavedReplyEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SavedReplyEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): SavedReplyEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): SavedReplyEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) + 1)
            this.node(new SavedReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): SavedReplyEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): SavedReplyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: SavedReplyResponseProjection): SavedReplyEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: SavedReplyResponseProjection): SavedReplyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): SavedReplyEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SavedReplyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
