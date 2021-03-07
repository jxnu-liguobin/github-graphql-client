package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestTimelineConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestTimelineItemEdgeResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestTimelineItemEdgeResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestTimelineConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestTimelineConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
