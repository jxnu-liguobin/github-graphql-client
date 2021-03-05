package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
