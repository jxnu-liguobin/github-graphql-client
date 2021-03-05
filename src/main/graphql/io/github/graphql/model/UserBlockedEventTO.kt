package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserBlockedEventTO(
    val actor: ActorTO?,
    val blockDuration: UserBlockDurationTO,
    val createdAt: String,
    override
    val id: String,
    val subject: UserTO?
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("blockDuration: " + GraphQLRequestSerializer.getEntry(blockDuration))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        }
        return joiner.toString()
    }
}
