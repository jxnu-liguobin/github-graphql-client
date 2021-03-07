package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationIdentityProvider
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationIdentityProviderResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationIdentityProviderResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationIdentityProviderResponseProjection {
        this.digestMethod()
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities"] = projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) + 1
            this.externalIdentities(ExternalIdentityConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0)))
        }
        this.id()
        this.idpCertificate()
        this.issuer()
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.signatureMethod()
        this.ssoUrl()
        this.typename()
        return this
    }

    fun digestMethod(): OrganizationIdentityProviderResponseProjection = digestMethod(null)

    fun digestMethod(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("digestMethod").alias(alias))
        return this
    }

    fun externalIdentities(subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = externalIdentities(null, subProjection)

    fun externalIdentities(alias: String?, subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("externalIdentities").alias(alias).projection(subProjection))
        return this
    }

    fun externalIdentities(input: OrganizationIdentityProviderExternalIdentitiesParametrizedInput, subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = externalIdentities(null, input, subProjection)

    fun externalIdentities(alias: String?, input: OrganizationIdentityProviderExternalIdentitiesParametrizedInput, subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("externalIdentities").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): OrganizationIdentityProviderResponseProjection = id(null)

    fun id(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun idpCertificate(): OrganizationIdentityProviderResponseProjection = idpCertificate(null)

    fun idpCertificate(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("idpCertificate").alias(alias))
        return this
    }

    fun issuer(): OrganizationIdentityProviderResponseProjection = issuer(null)

    fun issuer(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("issuer").alias(alias))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): OrganizationIdentityProviderResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun signatureMethod(): OrganizationIdentityProviderResponseProjection = signatureMethod(null)

    fun signatureMethod(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("signatureMethod").alias(alias))
        return this
    }

    fun ssoUrl(): OrganizationIdentityProviderResponseProjection = ssoUrl(null)

    fun ssoUrl(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("ssoUrl").alias(alias))
        return this
    }

    fun typename(): OrganizationIdentityProviderResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationIdentityProviderResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
