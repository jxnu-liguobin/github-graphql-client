package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveOutsideCollaboratorPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveOutsideCollaboratorPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemoveOutsideCollaboratorPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemoveOutsideCollaboratorPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) + 1)
            this.removedUser(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): RemoveOutsideCollaboratorPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RemoveOutsideCollaboratorPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def removedUser(subProjection: UserResponseProjection): RemoveOutsideCollaboratorPayloadResponseProjection = {
        removedUser(null.asInstanceOf[String], subProjection)
    }

    def removedUser(alias: String, subProjection: UserResponseProjection): RemoveOutsideCollaboratorPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("removedUser").alias(alias).projection(subProjection))
        this
    }

    def typename(): RemoveOutsideCollaboratorPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemoveOutsideCollaboratorPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
