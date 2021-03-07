package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddProjectColumnPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddProjectColumnPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddProjectColumnPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddProjectColumnPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge"] = projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1
            this.columnEdge(ProjectColumnEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddProjectColumnPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun columnEdge(subProjection: ProjectColumnEdgeResponseProjection): AddProjectColumnPayloadResponseProjection = columnEdge(null, subProjection)

    fun columnEdge(alias: String?, subProjection: ProjectColumnEdgeResponseProjection): AddProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("columnEdge").alias(alias).projection(subProjection))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): AddProjectColumnPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): AddProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddProjectColumnPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddProjectColumnPayloadResponseProjection {
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
        val that = other as AddProjectColumnPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
