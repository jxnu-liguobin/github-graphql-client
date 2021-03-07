package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class IssueTimelineConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) + 1)
            this.edges(new IssueTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) + 1)
            this.nodes(new IssueTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: IssueTimelineItemEdgeResponseProjection): IssueTimelineConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: IssueTimelineItemEdgeResponseProjection): IssueTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: IssueTimelineItemResponseProjection): IssueTimelineConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: IssueTimelineItemResponseProjection): IssueTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): IssueTimelineConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): IssueTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): IssueTimelineConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): IssueTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): IssueTimelineConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
