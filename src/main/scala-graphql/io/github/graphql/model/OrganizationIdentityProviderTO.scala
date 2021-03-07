package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationIdentityProviderTO(
    digestMethod: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    idpCertificate: String,
    issuer: String,
    organization: OrganizationTO,
    signatureMethod: String,
    ssoUrl: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (digestMethod != null) "digestMethod: " + GraphQLRequestSerializer.getEntry(digestMethod) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (idpCertificate != null) "idpCertificate: " + GraphQLRequestSerializer.getEntry(idpCertificate) else "",
            if (issuer != null) "issuer: " + GraphQLRequestSerializer.getEntry(issuer) else "",
            if (organization != null) "organization: " + GraphQLRequestSerializer.getEntry(organization) else "",
            if (signatureMethod != null) "signatureMethod: " + GraphQLRequestSerializer.getEntry(signatureMethod) else "",
            if (ssoUrl != null) "ssoUrl: " + GraphQLRequestSerializer.getEntry(ssoUrl) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object OrganizationIdentityProviderTO {

    def builder(): OrganizationIdentityProviderTO.Builder = new Builder()

    class Builder {

        private var digestMethod: String = _
        private var id: String = _
        private var idpCertificate: String = _
        private var issuer: String = _
        private var organization: OrganizationTO = _
        private var signatureMethod: String = _
        private var ssoUrl: String = _

        def setDigestMethod(digestMethod: String): Builder = {
            this.digestMethod = digestMethod
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIdpCertificate(idpCertificate: String): Builder = {
            this.idpCertificate = idpCertificate
            this
        }

        def setIssuer(issuer: String): Builder = {
            this.issuer = issuer
            this
        }

        def setOrganization(organization: OrganizationTO): Builder = {
            this.organization = organization
            this
        }

        def setSignatureMethod(signatureMethod: String): Builder = {
            this.signatureMethod = signatureMethod
            this
        }

        def setSsoUrl(ssoUrl: String): Builder = {
            this.ssoUrl = ssoUrl
            this
        }

        def build(): OrganizationIdentityProviderTO = new OrganizationIdentityProviderTO(digestMethod, id, idpCertificate, issuer, organization, signatureMethod, ssoUrl)

    }
}
