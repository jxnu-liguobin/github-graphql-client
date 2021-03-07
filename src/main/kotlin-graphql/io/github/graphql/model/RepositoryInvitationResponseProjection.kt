package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryInvitation
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RepositoryInvitationResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryInvitationResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryInvitationResponseProjection {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInvitationResponseProjection.UserResponseProjection.invitee"] = projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1
            this.invitee(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInvitationResponseProjection.UserResponseProjection.inviter"] = projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1
            this.inviter(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) + 1
            this.repository(RepositoryInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun id(): RepositoryInvitationResponseProjection = id(null)

    fun id(alias: String?): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun invitee(subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = invitee(null, subProjection)

    fun invitee(alias: String?, subProjection: UserResponseProjection): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("invitee").alias(alias).projection(subProjection))
        return this
    }

    fun inviter(subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = inviter(null, subProjection)

    fun inviter(alias: String?, subProjection: UserResponseProjection): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("inviter").alias(alias).projection(subProjection))
        return this
    }

    fun permission(): RepositoryInvitationResponseProjection = permission(null)

    fun permission(alias: String?): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("permission").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryInfoResponseProjection): RepositoryInvitationResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryInfoResponseProjection): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryInvitationResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryInvitationResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
