package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field timelineItems in type Issue
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class IssueTimelineItemsParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val itemTypes: List<IssueTimelineItemsItemTypeTO>?,
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
