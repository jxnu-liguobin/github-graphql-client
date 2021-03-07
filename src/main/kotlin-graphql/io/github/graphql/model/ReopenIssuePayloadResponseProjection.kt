package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReopenIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReopenIssuePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReopenIssuePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReopenIssuePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ReopenIssuePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ReopenIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): ReopenIssuePayloadResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): ReopenIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReopenIssuePayloadResponseProjection = typename(null)

    fun typename(alias: String?): ReopenIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
