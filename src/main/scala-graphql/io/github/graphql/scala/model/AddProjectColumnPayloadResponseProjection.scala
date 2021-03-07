package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddProjectColumnPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AddProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddProjectColumnPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddProjectColumnPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1)
            this.columnEdge(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddProjectColumnPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def columnEdge(subProjection: ProjectColumnEdgeResponseProjection): AddProjectColumnPayloadResponseProjection = {
        columnEdge(null.asInstanceOf[String], subProjection)
    }

    def columnEdge(alias: String, subProjection: ProjectColumnEdgeResponseProjection): AddProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("columnEdge").alias(alias).projection(subProjection))
        this
    }

    def project(subProjection: ProjectResponseProjection): AddProjectColumnPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): AddProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddProjectColumnPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddProjectColumnPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
