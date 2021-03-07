package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UpdatePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdatePullRequestReviewCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdatePullRequestReviewCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdatePullRequestReviewCommentPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields["UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment"] = projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) + 1
            this.pullRequestReviewComment(PullRequestReviewCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdatePullRequestReviewCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdatePullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatePullRequestReviewCommentPayloadResponseProjection = pullRequestReviewComment(null, subProjection)

    fun pullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): UpdatePullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdatePullRequestReviewCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdatePullRequestReviewCommentPayloadResponseProjection {
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
        val that = other as UpdatePullRequestReviewCommentPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
