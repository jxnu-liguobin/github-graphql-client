package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationInvitationTO(
    val createdAt: String,
    val email: String?,
    override
    val id: String,
    val invitationType: OrganizationInvitationTypeTO,
    val invitee: UserTO?,
    val inviter: UserTO,
    val organization: OrganizationTO,
    val role: OrganizationInvitationRoleTO
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("invitationType: " + GraphQLRequestSerializer.getEntry(invitationType))
        if (invitee != null) {
            joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee))
        }
        joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter))
        joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        return joiner.toString()
    }
}
