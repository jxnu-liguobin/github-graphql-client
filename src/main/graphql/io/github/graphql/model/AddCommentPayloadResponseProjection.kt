package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddCommentPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge"] = projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) + 1
            this.commentEdge(IssueCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["AddCommentPayloadResponseProjection.NodeResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) + 1
            this.subject(NodeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge"] = projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) + 1
            this.timelineEdge(IssueTimelineItemEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun commentEdge(subProjection: IssueCommentEdgeResponseProjection): AddCommentPayloadResponseProjection = commentEdge(null, subProjection)

    fun commentEdge(alias: String?, subProjection: IssueCommentEdgeResponseProjection): AddCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("commentEdge").alias(alias).projection(subProjection))
        return this
    }

    fun subject(subProjection: NodeResponseProjection): AddCommentPayloadResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: NodeResponseProjection): AddCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun timelineEdge(subProjection: IssueTimelineItemEdgeResponseProjection): AddCommentPayloadResponseProjection = timelineEdge(null, subProjection)

    fun timelineEdge(alias: String?, subProjection: IssueTimelineItemEdgeResponseProjection): AddCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("timelineEdge").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
