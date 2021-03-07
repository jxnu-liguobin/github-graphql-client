package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateProjectPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateProjectPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateProjectPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): UpdateProjectPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): UpdateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateProjectPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
