package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloseIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CloseIssuePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CloseIssuePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CloseIssuePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["CloseIssuePayloadResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CloseIssuePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CloseIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): CloseIssuePayloadResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): CloseIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CloseIssuePayloadResponseProjection = typename(null)

    fun typename(alias: String?): CloseIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
