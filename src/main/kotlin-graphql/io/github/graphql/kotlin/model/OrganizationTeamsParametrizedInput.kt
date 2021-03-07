package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field teams in type Organization
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class OrganizationTeamsParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val last: Int?,
    val ldapMapped: Boolean?,
    val orderBy: TeamOrderTO?,
    val privacy: TeamPrivacyTO?,
    val query: String?,
    val role: TeamRoleTO?,
    val rootTeamsOnly: Boolean? = false,
    val userLogins: List<String>?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (ldapMapped != null) {
            joiner.add("ldapMapped: " + GraphQLRequestSerializer.getEntry(ldapMapped))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy))
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query))
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        }
        if (rootTeamsOnly != null) {
            joiner.add("rootTeamsOnly: " + GraphQLRequestSerializer.getEntry(rootTeamsOnly))
        }
        if (userLogins != null) {
            joiner.add("userLogins: " + GraphQLRequestSerializer.getEntry(userLogins))
        }
        return joiner.toString()
    }
}
