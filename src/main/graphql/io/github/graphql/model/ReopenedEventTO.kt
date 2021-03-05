package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReopenedEventTO(
    val actor: ActorTO?,
    val closable: ClosableTO,
    val createdAt: String,
    override
    val id: String
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("closable: " + GraphQLRequestSerializer.getEntry(closable))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }
}
