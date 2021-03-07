package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field members in type Team
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class TeamMembersParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val last: Int?,
    val membership: TeamMembershipTypeTO? = TeamMembershipTypeTO.ALL,
    val orderBy: TeamMemberOrderTO?,
    val query: String?,
    val role: TeamMemberRoleTO?
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
        if (membership != null) {
            joiner.add("membership: " + GraphQLRequestSerializer.getEntry(membership))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query))
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        }
        return joiner.toString()
    }
}