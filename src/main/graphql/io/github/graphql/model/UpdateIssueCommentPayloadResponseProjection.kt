package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateIssueCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
