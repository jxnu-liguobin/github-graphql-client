package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeletePullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeletePullRequestReviewPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeletePullRequestReviewPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeletePullRequestReviewPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DeletePullRequestReviewPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeletePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): DeletePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeletePullRequestReviewPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeletePullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
