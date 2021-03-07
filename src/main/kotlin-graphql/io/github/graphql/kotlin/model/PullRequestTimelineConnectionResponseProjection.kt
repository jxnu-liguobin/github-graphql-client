package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestTimelineConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestTimelineConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestTimelineItemEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestTimelineItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestTimelineItemEdgeResponseProjection): PullRequestTimelineConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestTimelineItemEdgeResponseProjection): PullRequestTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestTimelineConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestTimelineConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestTimelineConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineConnectionResponseProjection {
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
        val that = other as PullRequestTimelineConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
