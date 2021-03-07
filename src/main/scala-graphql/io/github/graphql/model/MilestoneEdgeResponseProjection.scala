package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MilestoneEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MilestoneEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): MilestoneEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): MilestoneEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) + 1)
            this.node(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): MilestoneEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): MilestoneEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: MilestoneResponseProjection): MilestoneEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: MilestoneResponseProjection): MilestoneEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): MilestoneEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MilestoneEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
