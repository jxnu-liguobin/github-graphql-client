package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatePullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdatePullRequestReviewPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdatePullRequestReviewPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdatePullRequestReviewPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdatePullRequestReviewPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdatePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatePullRequestReviewPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): UpdatePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdatePullRequestReviewPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdatePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
