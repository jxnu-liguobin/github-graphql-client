package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UpdateIssuePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateIssuePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateIssuePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateIssuePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): UpdateIssuePayloadResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): UpdateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateIssuePayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
