package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveOutsideCollaboratorPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RemoveOutsideCollaboratorPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemoveOutsideCollaboratorPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemoveOutsideCollaboratorPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser"] = projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) + 1
            this.removedUser(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): RemoveOutsideCollaboratorPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RemoveOutsideCollaboratorPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun removedUser(subProjection: UserResponseProjection): RemoveOutsideCollaboratorPayloadResponseProjection = removedUser(null, subProjection)

    fun removedUser(alias: String?, subProjection: UserResponseProjection): RemoveOutsideCollaboratorPayloadResponseProjection {
        fields.add(GraphQLResponseField("removedUser").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RemoveOutsideCollaboratorPayloadResponseProjection = typename(null)

    fun typename(alias: String?): RemoveOutsideCollaboratorPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
