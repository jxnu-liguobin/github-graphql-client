package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class OrganizationIdentityProviderTO(
    val digestMethod: String?,
    override
    val id: String,
    val idpCertificate: String?,
    val issuer: String?,
    val organization: OrganizationTO?,
    val signatureMethod: String?,
    val ssoUrl: String?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (digestMethod != null) {
            joiner.add("digestMethod: " + GraphQLRequestSerializer.getEntry(digestMethod))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (idpCertificate != null) {
            joiner.add("idpCertificate: " + GraphQLRequestSerializer.getEntry(idpCertificate))
        }
        if (issuer != null) {
            joiner.add("issuer: " + GraphQLRequestSerializer.getEntry(issuer))
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        }
        if (signatureMethod != null) {
            joiner.add("signatureMethod: " + GraphQLRequestSerializer.getEntry(signatureMethod))
        }
        if (ssoUrl != null) {
            joiner.add("ssoUrl: " + GraphQLRequestSerializer.getEntry(ssoUrl))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as OrganizationIdentityProviderTO
        return Objects.equals(digestMethod, that.digestMethod)
                && Objects.equals(id, that.id)
                && Objects.equals(idpCertificate, that.idpCertificate)
                && Objects.equals(issuer, that.issuer)
                && Objects.equals(organization, that.organization)
                && Objects.equals(signatureMethod, that.signatureMethod)
                && Objects.equals(ssoUrl, that.ssoUrl)

    }

    override fun hashCode(): Int = {
        return Objects.hash(digestMethod, id, idpCertificate, issuer, organization, signatureMethod, ssoUrl)
    }

    class Builder {

        private var digestMethod: String? = null
        private lateinit var id: String
        private var idpCertificate: String? = null
        private var issuer: String? = null
        private var organization: OrganizationTO? = null
        private var signatureMethod: String? = null
        private var ssoUrl: String? = null

        fun setDigestMethod(digestMethod: String?): Builder {
            this.digestMethod = digestMethod
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIdpCertificate(idpCertificate: String?): Builder {
            this.idpCertificate = idpCertificate
            return this
        }

        fun setIssuer(issuer: String?): Builder {
            this.issuer = issuer
            return this
        }

        fun setOrganization(organization: OrganizationTO?): Builder {
            this.organization = organization
            return this
        }

        fun setSignatureMethod(signatureMethod: String?): Builder {
            this.signatureMethod = signatureMethod
            return this
        }

        fun setSsoUrl(ssoUrl: String?): Builder {
            this.ssoUrl = ssoUrl
            return this
        }

        fun build(): OrganizationIdentityProviderTO {
            return OrganizationIdentityProviderTO(digestMethod, id, idpCertificate, issuer, organization, signatureMethod, ssoUrl)
        }
    }
}
