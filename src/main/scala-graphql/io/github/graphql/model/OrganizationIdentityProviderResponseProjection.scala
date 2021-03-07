package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationIdentityProvider
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationIdentityProviderResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationIdentityProviderResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationIdentityProviderResponseProjection = {
        this.digestMethod()
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) + 1)
            this.externalIdentities(new ExternalIdentityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0)))
        }
        this.id()
        this.idpCertificate()
        this.issuer()
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.signatureMethod()
        this.ssoUrl()
        this.typename()
        this
    }

    def digestMethod(): OrganizationIdentityProviderResponseProjection = {
        digestMethod(null.asInstanceOf[String])
    }

    def digestMethod(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("digestMethod").alias(alias))
        this
    }

    def externalIdentities(subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = {
        externalIdentities(null.asInstanceOf[String], subProjection)
    }

    def externalIdentities(alias: String, subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("externalIdentities").alias(alias).projection(subProjection))
        this
    }

    def externalIdentities(input: OrganizationIdentityProviderExternalIdentitiesParametrizedInput,subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = {
        externalIdentities(null.asInstanceOf[String], input, subProjection)
    }

    def externalIdentities(alias: String, input: OrganizationIdentityProviderExternalIdentitiesParametrizedInput , subProjection: ExternalIdentityConnectionResponseProjection): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("externalIdentities").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): OrganizationIdentityProviderResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def idpCertificate(): OrganizationIdentityProviderResponseProjection = {
        idpCertificate(null.asInstanceOf[String])
    }

    def idpCertificate(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("idpCertificate").alias(alias))
        this
    }

    def issuer(): OrganizationIdentityProviderResponseProjection = {
        issuer(null.asInstanceOf[String])
    }

    def issuer(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("issuer").alias(alias))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): OrganizationIdentityProviderResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def signatureMethod(): OrganizationIdentityProviderResponseProjection = {
        signatureMethod(null.asInstanceOf[String])
    }

    def signatureMethod(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("signatureMethod").alias(alias))
        this
    }

    def ssoUrl(): OrganizationIdentityProviderResponseProjection = {
        ssoUrl(null.asInstanceOf[String])
    }

    def ssoUrl(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("ssoUrl").alias(alias))
        this
    }

    def typename(): OrganizationIdentityProviderResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationIdentityProviderResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
