package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MoveProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
