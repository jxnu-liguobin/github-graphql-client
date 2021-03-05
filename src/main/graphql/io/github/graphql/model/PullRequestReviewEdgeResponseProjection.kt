package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestReviewEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) + 1
            this.node(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestReviewEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestReviewEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestReviewResponseProjection): PullRequestReviewEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestReviewResponseProjection): PullRequestReviewEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestReviewEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
