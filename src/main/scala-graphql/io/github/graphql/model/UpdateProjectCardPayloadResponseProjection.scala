package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectCardPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdateProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateProjectCardPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateProjectCardPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1)
            this.projectCard(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateProjectCardPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def projectCard(subProjection: ProjectCardResponseProjection): UpdateProjectCardPayloadResponseProjection = {
        projectCard(null.asInstanceOf[String], subProjection)
    }

    def projectCard(alias: String, subProjection: ProjectCardResponseProjection): UpdateProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("projectCard").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateProjectCardPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateProjectCardPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
