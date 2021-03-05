package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestTimelineItemsConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineItemsConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineItemsConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestTimelineItemsEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0)))
        }
        this.filteredCount()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestTimelineItemsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0)))
        }
        this.pageCount()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.updatedAt()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestTimelineItemsEdgeResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestTimelineItemsEdgeResponseProjection): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun filteredCount(): PullRequestTimelineItemsConnectionResponseProjection = filteredCount(null)

    fun filteredCount(alias: String?): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("filteredCount").alias(alias))
        return this
    }

    fun nodes(subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestTimelineItemsResponseProjection): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageCount(): PullRequestTimelineItemsConnectionResponseProjection = pageCount(null)

    fun pageCount(alias: String?): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageCount").alias(alias))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestTimelineItemsConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestTimelineItemsConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun updatedAt(): PullRequestTimelineItemsConnectionResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): PullRequestTimelineItemsConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
