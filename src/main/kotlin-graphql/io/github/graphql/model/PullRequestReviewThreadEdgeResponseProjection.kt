package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewThreadEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestReviewThreadEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewThreadEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewThreadEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) + 1
            this.node(PullRequestReviewThreadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestReviewThreadEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestReviewThreadEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestReviewThreadEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewThreadEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
