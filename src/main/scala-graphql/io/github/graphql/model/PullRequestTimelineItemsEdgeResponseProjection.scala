package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestTimelineItemsEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineItemsEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineItemsEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) + 1)
            this.node(new PullRequestTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestTimelineItemsEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestTimelineItemsEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
