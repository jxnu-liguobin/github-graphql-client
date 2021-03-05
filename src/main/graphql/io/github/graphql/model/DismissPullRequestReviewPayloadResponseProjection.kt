package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DismissPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DismissPullRequestReviewPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DismissPullRequestReviewPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DismissPullRequestReviewPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DismissPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DismissPullRequestReviewPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DismissPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): DismissPullRequestReviewPayloadResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): DismissPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DismissPullRequestReviewPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DismissPullRequestReviewPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
