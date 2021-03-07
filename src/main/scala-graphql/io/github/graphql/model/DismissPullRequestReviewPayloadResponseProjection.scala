package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DismissPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DismissPullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DismissPullRequestReviewPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DismissPullRequestReviewPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DismissPullRequestReviewPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DismissPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): DismissPullRequestReviewPayloadResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): DismissPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def typename(): DismissPullRequestReviewPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DismissPullRequestReviewPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
