package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MoveProjectCardPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MoveProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): MoveProjectCardPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): MoveProjectCardPayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1)
            this.cardEdge(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)))
        }
        this.clientMutationId()
        this.typename()
        this
    }

    def cardEdge(subProjection: ProjectCardEdgeResponseProjection): MoveProjectCardPayloadResponseProjection = {
        cardEdge(null.asInstanceOf[String], subProjection)
    }

    def cardEdge(alias: String, subProjection: ProjectCardEdgeResponseProjection): MoveProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("cardEdge").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): MoveProjectCardPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): MoveProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): MoveProjectCardPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MoveProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}