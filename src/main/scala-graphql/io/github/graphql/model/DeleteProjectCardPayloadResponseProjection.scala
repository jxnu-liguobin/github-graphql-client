package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectCardPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteProjectCardPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteProjectCardPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) + 1)
            this.column(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0)))
        }
        this.deletedCardId()
        this.typename()
        this
    }

    def clientMutationId(): DeleteProjectCardPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def column(subProjection: ProjectColumnResponseProjection): DeleteProjectCardPayloadResponseProjection = {
        column(null.asInstanceOf[String], subProjection)
    }

    def column(alias: String, subProjection: ProjectColumnResponseProjection): DeleteProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("column").alias(alias).projection(subProjection))
        this
    }

    def deletedCardId(): DeleteProjectCardPayloadResponseProjection = {
        deletedCardId(null.asInstanceOf[String])
    }

    def deletedCardId(alias: String): DeleteProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("deletedCardId").alias(alias))
        this
    }

    def typename(): DeleteProjectCardPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
