package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as IssueTimelineItemsEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
