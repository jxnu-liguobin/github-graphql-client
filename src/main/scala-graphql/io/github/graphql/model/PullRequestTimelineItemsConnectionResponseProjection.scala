package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestTimelineItemsConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineItemsConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineItemsConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestTimelineItemsEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0)))
        }
        this.filteredCount()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0)))
        }
        this.pageCount()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.updatedAt()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestTimelineItemsEdgeResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestTimelineItemsEdgeResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def filteredCount(): PullRequestTimelineItemsConnectionResponseProjection = {
        filteredCount(null.asInstanceOf[String])
    }

    def filteredCount(alias: String): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("filteredCount").alias(alias))
        this
    }

    def nodes(subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageCount(): PullRequestTimelineItemsConnectionResponseProjection = {
        pageCount(null.asInstanceOf[String])
    }

    def pageCount(alias: String): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageCount").alias(alias))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestTimelineItemsConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def updatedAt(): PullRequestTimelineItemsConnectionResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): PullRequestTimelineItemsConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
