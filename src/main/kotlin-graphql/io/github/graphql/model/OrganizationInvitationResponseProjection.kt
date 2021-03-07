package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationInvitation
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationInvitationResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationInvitationResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationInvitationResponseProjection {
        this.createdAt()
        this.email()
        this.id()
        this.invitationType()
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationResponseProjection.UserResponseProjection.invitee"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1
            this.invitee(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationResponseProjection.UserResponseProjection.inviter"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1
            this.inviter(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.role()
        this.typename()
        return this
    }

    fun createdAt(): OrganizationInvitationResponseProjection = createdAt(null)

    fun createdAt(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun email(): OrganizationInvitationResponseProjection = email(null)

    fun email(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun id(): OrganizationInvitationResponseProjection = id(null)

    fun id(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun invitationType(): OrganizationInvitationResponseProjection = invitationType(null)

    fun invitationType(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("invitationType").alias(alias))
        return this
    }

    fun invitee(subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = invitee(null, subProjection)

    fun invitee(alias: String?, subProjection: UserResponseProjection): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("invitee").alias(alias).projection(subProjection))
        return this
    }

    fun inviter(subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = inviter(null, subProjection)

    fun inviter(alias: String?, subProjection: UserResponseProjection): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("inviter").alias(alias).projection(subProjection))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): OrganizationInvitationResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun role(): OrganizationInvitationResponseProjection = role(null)

    fun role(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("role").alias(alias))
        return this
    }

    fun typename(): OrganizationInvitationResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationInvitationResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
