package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItemEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestTimelineItemEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineItemEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineItemEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) + 1
            this.node(PullRequestTimelineItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestTimelineItemEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineItemEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestTimelineItemEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
