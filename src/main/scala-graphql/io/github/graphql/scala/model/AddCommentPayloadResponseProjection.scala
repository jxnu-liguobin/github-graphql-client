package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AddCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddCommentPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) + 1)
            this.commentEdge(new IssueCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) + 1)
            this.subject(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) + 1)
            this.timelineEdge(new IssueTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def commentEdge(subProjection: IssueCommentEdgeResponseProjection): AddCommentPayloadResponseProjection = {
        commentEdge(null.asInstanceOf[String], subProjection)
    }

    def commentEdge(alias: String, subProjection: IssueCommentEdgeResponseProjection): AddCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("commentEdge").alias(alias).projection(subProjection))
        this
    }

    def subject(subProjection: NodeResponseProjection): AddCommentPayloadResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: NodeResponseProjection): AddCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def timelineEdge(subProjection: IssueTimelineItemEdgeResponseProjection): AddCommentPayloadResponseProjection = {
        timelineEdge(null.asInstanceOf[String], subProjection)
    }

    def timelineEdge(alias: String, subProjection: IssueTimelineItemEdgeResponseProjection): AddCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("timelineEdge").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddCommentPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[AddCommentPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
