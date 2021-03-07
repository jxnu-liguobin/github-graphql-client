package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddPullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddPullRequestReviewCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddPullRequestReviewCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddPullRequestReviewCommentPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) <= maxDepth) {
            projectionDepthOnFields["AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment"] = projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) + 1
            this.comment(PullRequestReviewCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge"] = projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) + 1
            this.commentEdge(PullRequestReviewCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddPullRequestReviewCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddPullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun comment(subProjection: PullRequestReviewCommentResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = comment(null, subProjection)

    fun comment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("comment").alias(alias).projection(subProjection))
        return this
    }

    fun commentEdge(subProjection: PullRequestReviewCommentEdgeResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = commentEdge(null, subProjection)

    fun commentEdge(alias: String?, subProjection: PullRequestReviewCommentEdgeResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("commentEdge").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddPullRequestReviewCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddPullRequestReviewCommentPayloadResponseProjection {
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
        val that = other as AddPullRequestReviewCommentPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
