package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeletePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeletePullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeletePullRequestReviewCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeletePullRequestReviewCommentPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeletePullRequestReviewCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeletePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewCommentPayloadResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeletePullRequestReviewCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeletePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
