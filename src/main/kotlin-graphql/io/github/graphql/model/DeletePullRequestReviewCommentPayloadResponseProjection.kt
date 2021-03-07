package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeletePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeletePullRequestReviewCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeletePullRequestReviewCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeletePullRequestReviewCommentPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DeletePullRequestReviewCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeletePullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewCommentPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeletePullRequestReviewCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeletePullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
