package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddProjectCardPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class AddProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddProjectCardPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddProjectCardPayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1)
            this.cardEdge(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)))
        }
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1)
            this.projectColumn(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)))
        }
        this.typename()
        this
    }

    def cardEdge(subProjection: ProjectCardEdgeResponseProjection): AddProjectCardPayloadResponseProjection = {
        cardEdge(null.asInstanceOf[String], subProjection)
    }

    def cardEdge(alias: String, subProjection: ProjectCardEdgeResponseProjection): AddProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("cardEdge").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): AddProjectCardPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def projectColumn(subProjection: ProjectColumnResponseProjection): AddProjectCardPayloadResponseProjection = {
        projectColumn(null.asInstanceOf[String], subProjection)
    }

    def projectColumn(alias: String, subProjection: ProjectColumnResponseProjection): AddProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("projectColumn").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddProjectCardPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
