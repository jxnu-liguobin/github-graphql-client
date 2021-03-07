package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddProjectCardPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddProjectCardPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddProjectCardPayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields["AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge"] = projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1
            this.cardEdge(ProjectCardEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)))
        }
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn"] = projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1
            this.projectColumn(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)))
        }
        this.typename()
        return this
    }

    fun cardEdge(subProjection: ProjectCardEdgeResponseProjection): AddProjectCardPayloadResponseProjection = cardEdge(null, subProjection)

    fun cardEdge(alias: String?, subProjection: ProjectCardEdgeResponseProjection): AddProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("cardEdge").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): AddProjectCardPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun projectColumn(subProjection: ProjectColumnResponseProjection): AddProjectCardPayloadResponseProjection = projectColumn(null, subProjection)

    fun projectColumn(alias: String?, subProjection: ProjectColumnResponseProjection): AddProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("projectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddProjectCardPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddProjectCardPayloadResponseProjection {
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
        val that = other as AddProjectCardPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
