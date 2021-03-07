package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddPullRequestReviewPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddPullRequestReviewPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) + 1)
            this.reviewEdge(new PullRequestReviewEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddPullRequestReviewPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): AddPullRequestReviewPayloadResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): AddPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def reviewEdge(subProjection: PullRequestReviewEdgeResponseProjection): AddPullRequestReviewPayloadResponseProjection = {
        reviewEdge(null.asInstanceOf[String], subProjection)
    }

    def reviewEdge(alias: String, subProjection: PullRequestReviewEdgeResponseProjection): AddPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("reviewEdge").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddPullRequestReviewPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
