package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateProjectPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CreateProjectPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreateProjectPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreateProjectPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CreateProjectPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CreateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): CreateProjectPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): CreateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreateProjectPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreateProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
