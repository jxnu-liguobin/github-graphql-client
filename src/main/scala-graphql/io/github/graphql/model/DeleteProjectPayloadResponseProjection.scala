package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteProjectPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteProjectPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1)
            this.owner(new ProjectOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeleteProjectPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def owner(subProjection: ProjectOwnerResponseProjection): DeleteProjectPayloadResponseProjection = {
        owner(null.asInstanceOf[String], subProjection)
    }

    def owner(alias: String, subProjection: ProjectOwnerResponseProjection): DeleteProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeleteProjectPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
