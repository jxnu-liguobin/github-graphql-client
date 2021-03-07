package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CreateIssuePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreateIssuePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreateIssuePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["CreateIssuePayloadResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CreateIssuePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): CreateIssuePayloadResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): CreateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreateIssuePayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
