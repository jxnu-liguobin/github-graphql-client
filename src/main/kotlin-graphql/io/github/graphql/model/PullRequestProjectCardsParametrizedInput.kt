package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field projectCards in type PullRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class PullRequestProjectCardsParametrizedInput(
    val after: String?,
    val archivedStates: List<ProjectCardArchivedStateTO?>? = listOf(ProjectCardArchivedStateTO.ARCHIVED, ProjectCardArchivedStateTO.NOT_ARCHIVED),
    val before: String?,
    val first: Int?,
    val last: Int?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (archivedStates != null) {
            joiner.add("archivedStates: " + GraphQLRequestSerializer.getEntry(archivedStates))
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
        return joiner.toString()
    }
}