package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ConvertProjectCardNoteToIssuePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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


}
