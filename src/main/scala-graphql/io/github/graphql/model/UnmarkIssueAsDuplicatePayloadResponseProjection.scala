package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnmarkIssueAsDuplicatePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UnmarkIssueAsDuplicatePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnmarkIssueAsDuplicatePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) + 1)
            this.duplicate(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def duplicate(subProjection: IssueOrPullRequestResponseProjection): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        duplicate(null.asInstanceOf[String], subProjection)
    }

    def duplicate(alias: String, subProjection: IssueOrPullRequestResponseProjection): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("duplicate").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnmarkIssueAsDuplicatePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
