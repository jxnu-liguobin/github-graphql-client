package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationMemberEdgeTO(
    val cursor: String,
    val hasTwoFactorEnabled: Boolean?,
    val node: UserTO?,
    val role: OrganizationMemberRoleTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        if (hasTwoFactorEnabled != null) {
            joiner.add("hasTwoFactorEnabled: " + GraphQLRequestSerializer.getEntry(hasTwoFactorEnabled))
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        }
        return joiner.toString()
    }
}
