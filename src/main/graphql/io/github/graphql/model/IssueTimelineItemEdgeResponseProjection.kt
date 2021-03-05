package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItemEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueTimelineItemEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineItemEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineItemEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node"] = projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) + 1
            this.node(IssueTimelineItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): IssueTimelineItemEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): IssueTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: IssueTimelineItemResponseProjection): IssueTimelineItemEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: IssueTimelineItemResponseProjection): IssueTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueTimelineItemEdgeResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
