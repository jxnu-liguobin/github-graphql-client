package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddPullRequestReviewPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
