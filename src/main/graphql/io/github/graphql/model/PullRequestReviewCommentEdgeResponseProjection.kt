package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewCommentEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestReviewCommentEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewCommentEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewCommentEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) + 1
            this.node(PullRequestReviewCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestReviewCommentEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestReviewCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestReviewCommentEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
