package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestTimelineItemsEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineItemsEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineItemsEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) + 1
            this.node(PullRequestTimelineItemsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestTimelineItemsEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestTimelineItemsEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
