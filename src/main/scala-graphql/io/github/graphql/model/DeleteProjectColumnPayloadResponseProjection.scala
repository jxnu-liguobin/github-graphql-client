package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectColumnPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteProjectColumnPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteProjectColumnPayloadResponseProjection = {
        this.clientMutationId()
        this.deletedColumnId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeleteProjectColumnPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def deletedColumnId(): DeleteProjectColumnPayloadResponseProjection = {
        deletedColumnId(null.asInstanceOf[String])
    }

    def deletedColumnId(alias: String): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("deletedColumnId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeleteProjectColumnPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
