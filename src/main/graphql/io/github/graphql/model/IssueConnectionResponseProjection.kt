package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) + 1
            this.edges(IssueEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["IssueConnectionResponseProjection.IssueResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) + 1
            this.nodes(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: IssueEdgeResponseProjection): IssueConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: IssueEdgeResponseProjection): IssueConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: IssueResponseProjection): IssueConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: IssueResponseProjection): IssueConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): IssueConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): IssueConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): IssueConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): IssueConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): IssueConnectionResponseProjection = typename(null)

    fun typename(alias: String?): IssueConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
