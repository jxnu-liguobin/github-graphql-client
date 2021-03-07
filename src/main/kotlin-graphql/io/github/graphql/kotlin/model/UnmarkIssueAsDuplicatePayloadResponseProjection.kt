package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnmarkIssueAsDuplicatePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UnmarkIssueAsDuplicatePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnmarkIssueAsDuplicatePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnmarkIssueAsDuplicatePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) <= maxDepth) {
            projectionDepthOnFields["UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate"] = projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) + 1
            this.duplicate(IssueOrPullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UnmarkIssueAsDuplicatePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UnmarkIssueAsDuplicatePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun duplicate(subProjection: IssueOrPullRequestResponseProjection): UnmarkIssueAsDuplicatePayloadResponseProjection = duplicate(null, subProjection)

    fun duplicate(alias: String?, subProjection: IssueOrPullRequestResponseProjection): UnmarkIssueAsDuplicatePayloadResponseProjection {
        fields.add(GraphQLResponseField("duplicate").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnmarkIssueAsDuplicatePayloadResponseProjection = typename(null)

    fun typename(alias: String?): UnmarkIssueAsDuplicatePayloadResponseProjection {
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
        val that = other as UnmarkIssueAsDuplicatePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
