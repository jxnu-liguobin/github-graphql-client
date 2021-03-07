package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionEdgeResponseProjection.ReactionResponseProjection.node", projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) + 1)
            this.node(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ReactionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReactionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ReactionResponseProjection): ReactionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ReactionResponseProjection): ReactionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReactionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
