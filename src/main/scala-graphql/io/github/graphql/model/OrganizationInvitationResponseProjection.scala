package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationInvitation
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationInvitationResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationInvitationResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationInvitationResponseProjection = {
        this.createdAt()
        this.email()
        this.id()
        this.invitationType()
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1)
            this.invitee(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1)
            this.inviter(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.role()
        this.typename()
        this
    }

    def createdAt(): OrganizationInvitationResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def email(): OrganizationInvitationResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def id(): OrganizationInvitationResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def invitationType(): OrganizationInvitationResponseProjection = {
        invitationType(null.asInstanceOf[String])
    }

    def invitationType(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("invitationType").alias(alias))
        this
    }

    def invitee(subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = {
        invitee(null.asInstanceOf[String], subProjection)
    }

    def invitee(alias: String, subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("invitee").alias(alias).projection(subProjection))
        this
    }

    def inviter(subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = {
        inviter(null.asInstanceOf[String], subProjection)
    }

    def inviter(alias: String, subProjection: UserResponseProjection): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("inviter").alias(alias).projection(subProjection))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): OrganizationInvitationResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def role(): OrganizationInvitationResponseProjection = {
        role(null.asInstanceOf[String])
    }

    def role(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("role").alias(alias))
        this
    }

    def typename(): OrganizationInvitationResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
