package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UpdateIssueCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UpdateIssueCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateIssueCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateIssueCommentPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) + 1)
            this.issueComment(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateIssueCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateIssueCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def issueComment(subProjection: IssueCommentResponseProjection): UpdateIssueCommentPayloadResponseProjection = {
        issueComment(null.asInstanceOf[String], subProjection)
    }

    def issueComment(alias: String, subProjection: IssueCommentResponseProjection): UpdateIssueCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("issueComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateIssueCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateIssueCommentPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[UpdateIssueCommentPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
