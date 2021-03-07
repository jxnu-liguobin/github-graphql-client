package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatePullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdatePullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdatePullRequestReviewPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdatePullRequestReviewPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdatePullRequestReviewPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdatePullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatePullRequestReviewPayloadResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): UpdatePullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdatePullRequestReviewPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdatePullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
