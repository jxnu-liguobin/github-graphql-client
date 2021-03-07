package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateIssuePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateIssuePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateIssuePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateIssuePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateIssuePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): UpdateIssuePayloadResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): UpdateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateIssuePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
