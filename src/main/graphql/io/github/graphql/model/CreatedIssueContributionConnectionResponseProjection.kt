package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueContributionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedIssueContributionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedIssueContributionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedIssueContributionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) + 1
            this.edges(CreatedIssueContributionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) + 1
            this.nodes(CreatedIssueContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CreatedIssueContributionEdgeResponseProjection): CreatedIssueContributionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CreatedIssueContributionEdgeResponseProjection): CreatedIssueContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CreatedIssueContributionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CreatedIssueContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CreatedIssueContributionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CreatedIssueContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CreatedIssueContributionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedIssueContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
