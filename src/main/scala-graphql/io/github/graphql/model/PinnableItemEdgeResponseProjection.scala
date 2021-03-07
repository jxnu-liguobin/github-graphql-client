package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnableItemEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PinnableItemEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PinnableItemEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PinnableItemEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) + 1)
            this.node(new PinnableItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PinnableItemEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PinnableItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PinnableItemResponseProjection): PinnableItemEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PinnableItemResponseProjection): PinnableItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PinnableItemEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PinnableItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
