package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ConvertProjectCardNoteToIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ConvertProjectCardNoteToIssuePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ConvertProjectCardNoteToIssuePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ConvertProjectCardNoteToIssuePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields["ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard"] = projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1
            this.projectCard(ProjectCardResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ConvertProjectCardNoteToIssuePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ConvertProjectCardNoteToIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun projectCard(subProjection: ProjectCardResponseProjection): ConvertProjectCardNoteToIssuePayloadResponseProjection = projectCard(null, subProjection)

    fun projectCard(alias: String?, subProjection: ProjectCardResponseProjection): ConvertProjectCardNoteToIssuePayloadResponseProjection {
        fields.add(GraphQLResponseField("projectCard").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ConvertProjectCardNoteToIssuePayloadResponseProjection = typename(null)

    fun typename(alias: String?): ConvertProjectCardNoteToIssuePayloadResponseProjection {
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
        val that = other as ConvertProjectCardNoteToIssuePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
