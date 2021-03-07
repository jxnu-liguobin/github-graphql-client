package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueTimelineItemsConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineItemsConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineItemsConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) + 1
            this.edges(IssueTimelineItemsEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0)))
        }
        this.filteredCount()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) + 1
            this.nodes(IssueTimelineItemsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0)))
        }
        this.pageCount()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.updatedAt()
        this.typename()
        return this
    }

    fun edges(subProjection: IssueTimelineItemsEdgeResponseProjection): IssueTimelineItemsConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: IssueTimelineItemsEdgeResponseProjection): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun filteredCount(): IssueTimelineItemsConnectionResponseProjection = filteredCount(null)

    fun filteredCount(alias: String?): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("filteredCount").alias(alias))
        return this
    }

    fun nodes(subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageCount(): IssueTimelineItemsConnectionResponseProjection = pageCount(null)

    fun pageCount(alias: String?): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageCount").alias(alias))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): IssueTimelineItemsConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): IssueTimelineItemsConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun updatedAt(): IssueTimelineItemsConnectionResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): IssueTimelineItemsConnectionResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineItemsConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
