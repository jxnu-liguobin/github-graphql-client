package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[OrganizationIdentityProviderTO]
        Objects.equals(digestMethod, that.digestMethod) &&
        Objects.equals(id, that.id) &&
        Objects.equals(idpCertificate, that.idpCertificate) &&
        Objects.equals(issuer, that.issuer) &&
        Objects.equals(organization, that.organization) &&
        Objects.equals(signatureMethod, that.signatureMethod) &&
        Objects.equals(ssoUrl, that.ssoUrl)
    }

    override def hashCode(): Int = {
        Objects.hash(digestMethod, id, idpCertificate, issuer, organization, signatureMethod, ssoUrl)
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
