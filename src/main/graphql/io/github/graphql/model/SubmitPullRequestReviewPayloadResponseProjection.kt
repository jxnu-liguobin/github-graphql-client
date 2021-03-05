package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SubmitPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SubmitPullRequestReviewPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SubmitPullRequestReviewPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SubmitPullRequestReviewPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): SubmitPullRequestReviewPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): SubmitPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): SubmitPullRequestReviewPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): SubmitPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SubmitPullRequestReviewPayloadResponseProjection = typename(null)

    fun typename(alias: String?): SubmitPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
