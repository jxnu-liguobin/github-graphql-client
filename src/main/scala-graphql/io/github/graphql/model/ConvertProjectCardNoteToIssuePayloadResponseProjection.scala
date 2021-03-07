package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ConvertProjectCardNoteToIssuePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ConvertProjectCardNoteToIssuePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): ConvertProjectCardNoteToIssuePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1)
            this.projectCard(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def projectCard(subProjection: ProjectCardResponseProjection): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        projectCard(null.asInstanceOf[String], subProjection)
    }

    def projectCard(alias: String, subProjection: ProjectCardResponseProjection): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("projectCard").alias(alias).projection(subProjection))
        this
    }

    def typename(): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ConvertProjectCardNoteToIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
