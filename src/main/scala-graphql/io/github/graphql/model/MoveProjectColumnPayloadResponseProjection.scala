package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MoveProjectColumnPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MoveProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): MoveProjectColumnPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): MoveProjectColumnPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1)
            this.columnEdge(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): MoveProjectColumnPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): MoveProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def columnEdge(subProjection: ProjectColumnEdgeResponseProjection): MoveProjectColumnPayloadResponseProjection = {
        columnEdge(null.asInstanceOf[String], subProjection)
    }

    def columnEdge(alias: String, subProjection: ProjectColumnEdgeResponseProjection): MoveProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("columnEdge").alias(alias).projection(subProjection))
        this
    }

    def typename(): MoveProjectColumnPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MoveProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
