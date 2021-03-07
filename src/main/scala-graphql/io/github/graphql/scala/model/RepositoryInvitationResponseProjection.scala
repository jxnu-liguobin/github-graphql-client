package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryInvitation
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryInvitationResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryInvitationResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryInvitationResponseProjection = {
        this.id()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1)
            this.invitee(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1)
            this.inviter(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def id(): RepositoryInvitationResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def invitee(subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = {
        invitee(null.asInstanceOf[String], subProjection)
    }

    def invitee(alias: String, subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("invitee").alias(alias).projection(subProjection))
        this
    }

    def inviter(subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = {
        inviter(null.asInstanceOf[String], subProjection)
    }

    def inviter(alias: String, subProjection: UserResponseProjection): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("inviter").alias(alias).projection(subProjection))
        this
    }

    def permission(): RepositoryInvitationResponseProjection = {
        permission(null.asInstanceOf[String])
    }

    def permission(alias: String): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("permission").alias(alias))
        this
    }

    def repository(subProjection: RepositoryInfoResponseProjection): RepositoryInvitationResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryInfoResponseProjection): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryInvitationResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryInvitationResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RepositoryInvitationResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
