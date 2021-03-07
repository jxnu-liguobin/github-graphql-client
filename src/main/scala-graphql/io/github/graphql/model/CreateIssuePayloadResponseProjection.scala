package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateIssuePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CreateIssuePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreateIssuePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreateIssuePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CreateIssuePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CreateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): CreateIssuePayloadResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): CreateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreateIssuePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreateIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
