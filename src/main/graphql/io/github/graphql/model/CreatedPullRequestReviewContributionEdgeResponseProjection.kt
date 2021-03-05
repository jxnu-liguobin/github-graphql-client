package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestReviewContributionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedPullRequestReviewContributionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestReviewContributionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestReviewContributionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) + 1
            this.node(CreatedPullRequestReviewContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CreatedPullRequestReviewContributionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CreatedPullRequestReviewContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedPullRequestReviewContributionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestReviewContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
