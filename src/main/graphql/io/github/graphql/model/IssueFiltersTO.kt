package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueFiltersTO(
    val assignee: String?,
    val createdBy: String?,
    val labels: List<String>?,
    val mentioned: String?,
    val milestone: String?,
    val since: String?,
    val states: List<IssueStateTO>?,
    val viewerSubscribed: Boolean? = false
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee))
        }
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy))
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels))
        }
        if (mentioned != null) {
            joiner.add("mentioned: " + GraphQLRequestSerializer.getEntry(mentioned))
        }
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone))
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since))
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states))
        }
        if (viewerSubscribed != null) {
            joiner.add("viewerSubscribed: " + GraphQLRequestSerializer.getEntry(viewerSubscribed))
        }
        return joiner.toString()
    }
}
