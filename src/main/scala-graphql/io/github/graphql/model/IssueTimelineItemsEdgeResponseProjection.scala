package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class IssueTimelineItemsEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineItemsEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineItemsEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) + 1)
            this.node(new IssueTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): IssueTimelineItemsEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): IssueTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueTimelineItemsEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineItemsEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
