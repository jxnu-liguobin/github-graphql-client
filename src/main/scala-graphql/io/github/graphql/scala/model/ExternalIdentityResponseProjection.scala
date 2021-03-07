package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentity
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ExternalIdentityResponseProjection extends GraphQLResponseProjection {

    override def all$(): ExternalIdentityResponseProjection = all$(3)

    override def all$(maxDepth: Int): ExternalIdentityResponseProjection = {
        this.guid()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) + 1)
            this.organizationInvitation(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) + 1)
            this.samlIdentity(new ExternalIdentitySamlAttributesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) + 1)
            this.scimIdentity(new ExternalIdentityScimAttributesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def guid(): ExternalIdentityResponseProjection = {
        guid(null.asInstanceOf[String])
    }

    def guid(alias: String): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("guid").alias(alias))
        this
    }

    def id(): ExternalIdentityResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def organizationInvitation(subProjection: OrganizationInvitationResponseProjection): ExternalIdentityResponseProjection = {
        organizationInvitation(null.asInstanceOf[String], subProjection)
    }

    def organizationInvitation(alias: String, subProjection: OrganizationInvitationResponseProjection): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("organizationInvitation").alias(alias).projection(subProjection))
        this
    }

    def samlIdentity(subProjection: ExternalIdentitySamlAttributesResponseProjection): ExternalIdentityResponseProjection = {
        samlIdentity(null.asInstanceOf[String], subProjection)
    }

    def samlIdentity(alias: String, subProjection: ExternalIdentitySamlAttributesResponseProjection): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("samlIdentity").alias(alias).projection(subProjection))
        this
    }

    def scimIdentity(subProjection: ExternalIdentityScimAttributesResponseProjection): ExternalIdentityResponseProjection = {
        scimIdentity(null.asInstanceOf[String], subProjection)
    }

    def scimIdentity(alias: String, subProjection: ExternalIdentityScimAttributesResponseProjection): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("scimIdentity").alias(alias).projection(subProjection))
        this
    }

    def user(subProjection: UserResponseProjection): ExternalIdentityResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): ExternalIdentityResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): ExternalIdentityResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ExternalIdentityResponseProjection = {
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
        val that = obj.asInstanceOf[ExternalIdentityResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
