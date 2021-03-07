package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloseIssuePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloseIssuePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CloseIssuePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CloseIssuePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CloseIssuePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CloseIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): CloseIssuePayloadResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): CloseIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): CloseIssuePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CloseIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
