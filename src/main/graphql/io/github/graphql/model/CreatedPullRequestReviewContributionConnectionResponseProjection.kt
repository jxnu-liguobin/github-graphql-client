package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestReviewContributionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedPullRequestReviewContributionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestReviewContributionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestReviewContributionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) + 1
            this.edges(CreatedPullRequestReviewContributionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) + 1
            this.nodes(CreatedPullRequestReviewContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CreatedPullRequestReviewContributionEdgeResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CreatedPullRequestReviewContributionEdgeResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CreatedPullRequestReviewContributionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CreatedPullRequestReviewContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CreatedPullRequestReviewContributionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestReviewContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
