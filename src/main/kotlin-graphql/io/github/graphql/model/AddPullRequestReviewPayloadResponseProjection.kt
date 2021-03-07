package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddPullRequestReviewPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddPullRequestReviewPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddPullRequestReviewPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge"] = projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) + 1
            this.reviewEdge(PullRequestReviewEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddPullRequestReviewPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): AddPullRequestReviewPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): AddPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun reviewEdge(subProjection: PullRequestReviewEdgeResponseProjection): AddPullRequestReviewPayloadResponseProjection = reviewEdge(null, subProjection)

    fun reviewEdge(alias: String?, subProjection: PullRequestReviewEdgeResponseProjection): AddPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("reviewEdge").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddPullRequestReviewPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
