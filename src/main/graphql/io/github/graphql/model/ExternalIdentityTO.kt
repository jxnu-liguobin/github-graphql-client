package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ExternalIdentityTO(
    val guid: String,
    override
    val id: String,
    val organizationInvitation: OrganizationInvitationTO?,
    val samlIdentity: ExternalIdentitySamlAttributesTO?,
    val scimIdentity: ExternalIdentityScimAttributesTO?,
    val user: UserTO?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (organizationInvitation != null) {
            joiner.add("organizationInvitation: " + GraphQLRequestSerializer.getEntry(organizationInvitation))
        }
        if (samlIdentity != null) {
            joiner.add("samlIdentity: " + GraphQLRequestSerializer.getEntry(samlIdentity))
        }
        if (scimIdentity != null) {
            joiner.add("scimIdentity: " + GraphQLRequestSerializer.getEntry(scimIdentity))
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }
}
