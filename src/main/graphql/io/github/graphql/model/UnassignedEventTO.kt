package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnassignedEventTO(
    val actor: ActorTO?,
    val assignable: AssignableTO,
    val assignee: AssigneeTO?,
    val createdAt: String,
    override
    val id: String,
    @Deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    val user: UserTO?
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("assignable: " + GraphQLRequestSerializer.getEntry(assignable))
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }
}
