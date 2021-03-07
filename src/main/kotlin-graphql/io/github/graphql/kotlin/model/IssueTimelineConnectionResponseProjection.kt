package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueTimelineConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class IssueTimelineConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) + 1
            this.edges(IssueTimelineItemEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) + 1
            this.nodes(IssueTimelineItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: IssueTimelineItemEdgeResponseProjection): IssueTimelineConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: IssueTimelineItemEdgeResponseProjection): IssueTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: IssueTimelineItemResponseProjection): IssueTimelineConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: IssueTimelineItemResponseProjection): IssueTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): IssueTimelineConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): IssueTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): IssueTimelineConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): IssueTimelineConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): IssueTimelineConnectionResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineConnectionResponseProjection {
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
        val that = other as IssueTimelineConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
