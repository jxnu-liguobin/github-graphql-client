package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentity
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ExternalIdentityResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ExternalIdentityResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ExternalIdentityResponseProjection {
        this.guid()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation"] = projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) + 1
            this.organizationInvitation(OrganizationInvitationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity"] = projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) + 1
            this.samlIdentity(ExternalIdentitySamlAttributesResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity"] = projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) + 1
            this.scimIdentity(ExternalIdentityScimAttributesResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun guid(): ExternalIdentityResponseProjection = guid(null)

    fun guid(alias: String?): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("guid").alias(alias))
        return this
    }

    fun id(): ExternalIdentityResponseProjection = id(null)

    fun id(alias: String?): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun organizationInvitation(subProjection: OrganizationInvitationResponseProjection): ExternalIdentityResponseProjection = organizationInvitation(null, subProjection)

    fun organizationInvitation(alias: String?, subProjection: OrganizationInvitationResponseProjection): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("organizationInvitation").alias(alias).projection(subProjection))
        return this
    }

    fun samlIdentity(subProjection: ExternalIdentitySamlAttributesResponseProjection): ExternalIdentityResponseProjection = samlIdentity(null, subProjection)

    fun samlIdentity(alias: String?, subProjection: ExternalIdentitySamlAttributesResponseProjection): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("samlIdentity").alias(alias).projection(subProjection))
        return this
    }

    fun scimIdentity(subProjection: ExternalIdentityScimAttributesResponseProjection): ExternalIdentityResponseProjection = scimIdentity(null, subProjection)

    fun scimIdentity(alias: String?, subProjection: ExternalIdentityScimAttributesResponseProjection): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("scimIdentity").alias(alias).projection(subProjection))
        return this
    }

    fun user(subProjection: UserResponseProjection): ExternalIdentityResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ExternalIdentityResponseProjection = typename(null)

    fun typename(alias: String?): ExternalIdentityResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
