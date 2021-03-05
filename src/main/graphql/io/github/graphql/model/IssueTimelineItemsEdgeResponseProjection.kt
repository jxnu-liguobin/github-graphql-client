package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueTimelineItemsEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineItemsEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineItemsEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node"] = projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) + 1
            this.node(IssueTimelineItemsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): IssueTimelineItemsEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): IssueTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueTimelineItemsEdgeResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineItemsEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
