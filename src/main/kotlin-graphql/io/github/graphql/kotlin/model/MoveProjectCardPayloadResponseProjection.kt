package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MoveProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MoveProjectCardPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MoveProjectCardPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MoveProjectCardPayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields["MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge"] = projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1
            this.cardEdge(ProjectCardEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)))
        }
        this.clientMutationId()
        this.typename()
        return this
    }

    fun cardEdge(subProjection: ProjectCardEdgeResponseProjection): MoveProjectCardPayloadResponseProjection = cardEdge(null, subProjection)

    fun cardEdge(alias: String?, subProjection: ProjectCardEdgeResponseProjection): MoveProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("cardEdge").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): MoveProjectCardPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): MoveProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): MoveProjectCardPayloadResponseProjection = typename(null)

    fun typename(alias: String?): MoveProjectCardPayloadResponseProjection {
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
        val that = other as MoveProjectCardPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
