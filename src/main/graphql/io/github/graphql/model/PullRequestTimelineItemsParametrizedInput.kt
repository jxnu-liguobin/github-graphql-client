package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field timelineItems in type PullRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class PullRequestTimelineItemsParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val itemTypes: List<PullRequestTimelineItemsItemTypeTO>?,
    val last: Int?,
    val since: String?,
    val skip: Int?
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
        if (itemTypes != null) {
            joiner.add("itemTypes: " + GraphQLRequestSerializer.getEntry(itemTypes))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since))
        }
        if (skip != null) {
            joiner.add("skip: " + GraphQLRequestSerializer.getEntry(skip))
        }
        return joiner.toString()
    }
}
