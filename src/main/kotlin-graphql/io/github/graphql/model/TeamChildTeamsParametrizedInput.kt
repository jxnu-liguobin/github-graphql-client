package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field childTeams in type Team
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class TeamChildTeamsParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val immediateOnly: Boolean? = true,
    val last: Int?,
    val orderBy: TeamOrderTO?,
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
        if (immediateOnly != null) {
            joiner.add("immediateOnly: " + GraphQLRequestSerializer.getEntry(immediateOnly))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (userLogins != null) {
            joiner.add("userLogins: " + GraphQLRequestSerializer.getEntry(userLogins))
        }
        return joiner.toString()
    }
}
