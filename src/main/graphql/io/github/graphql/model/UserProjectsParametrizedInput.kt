package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field projects in type User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class UserProjectsParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val last: Int?,
    val orderBy: ProjectOrderTO?,
    val search: String?,
    val states: List<ProjectStateTO>?
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
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (search != null) {
            joiner.add("search: " + GraphQLRequestSerializer.getEntry(search))
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states))
        }
        return joiner.toString()
    }
}
