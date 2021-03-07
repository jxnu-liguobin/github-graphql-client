package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectColumnPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateProjectColumnPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateProjectColumnPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1)
            this.projectColumn(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateProjectColumnPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def projectColumn(subProjection: ProjectColumnResponseProjection): UpdateProjectColumnPayloadResponseProjection = {
        projectColumn(null.asInstanceOf[String], subProjection)
    }

    def projectColumn(alias: String, subProjection: ProjectColumnResponseProjection): UpdateProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("projectColumn").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateProjectColumnPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
