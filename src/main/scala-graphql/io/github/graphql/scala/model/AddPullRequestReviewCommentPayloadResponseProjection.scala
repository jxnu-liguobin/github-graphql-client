package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddPullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AddPullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddPullRequestReviewCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddPullRequestReviewCommentPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) + 1)
            this.comment(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) + 1)
            this.commentEdge(new PullRequestReviewCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddPullRequestReviewCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddPullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def comment(subProjection: PullRequestReviewCommentResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = {
        comment(null.asInstanceOf[String], subProjection)
    }

    def comment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("comment").alias(alias).projection(subProjection))
        this
    }

    def commentEdge(subProjection: PullRequestReviewCommentEdgeResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = {
        commentEdge(null.asInstanceOf[String], subProjection)
    }

    def commentEdge(alias: String, subProjection: PullRequestReviewCommentEdgeResponseProjection): AddPullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("commentEdge").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddPullRequestReviewCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddPullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddPullRequestReviewCommentPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
