package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MoveProjectColumnPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MoveProjectColumnPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MoveProjectColumnPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MoveProjectColumnPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields["MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge"] = projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1
            this.columnEdge(ProjectColumnEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): MoveProjectColumnPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): MoveProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun columnEdge(subProjection: ProjectColumnEdgeResponseProjection): MoveProjectColumnPayloadResponseProjection = columnEdge(null, subProjection)

    fun columnEdge(alias: String?, subProjection: ProjectColumnEdgeResponseProjection): MoveProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("columnEdge").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MoveProjectColumnPayloadResponseProjection = typename(null)

    fun typename(alias: String?): MoveProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
