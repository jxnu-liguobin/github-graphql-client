package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UpdateIssueCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdateIssueCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateIssueCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateIssueCommentPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment"] = projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) + 1
            this.issueComment(IssueCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateIssueCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateIssueCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun issueComment(subProjection: IssueCommentResponseProjection): UpdateIssueCommentPayloadResponseProjection = issueComment(null, subProjection)

    fun issueComment(alias: String?, subProjection: IssueCommentResponseProjection): UpdateIssueCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("issueComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateIssueCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateIssueCommentPayloadResponseProjection {
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
        val that = other as UpdateIssueCommentPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
