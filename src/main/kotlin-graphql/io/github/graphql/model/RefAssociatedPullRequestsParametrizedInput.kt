package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field associatedPullRequests in type Ref
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class RefAssociatedPullRequestsParametrizedInput(
    val after: String?,
    val baseRefName: String?,
    val before: String?,
    val first: Int?,
    val headRefName: String?,
    val labels: List<String>?,
    val last: Int?,
    val orderBy: IssueOrderTO?,
    val states: List<PullRequestStateTO>?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName))
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states))
        }
        return joiner.toString()
    }
}
