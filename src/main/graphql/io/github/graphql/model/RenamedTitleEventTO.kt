package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RenamedTitleEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val currentTitle: String,
    override
    val id: String,
    val previousTitle: String,
    val subject: RenamedTitleSubjectTO
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("currentTitle: " + GraphQLRequestSerializer.getEntry(currentTitle))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("previousTitle: " + GraphQLRequestSerializer.getEntry(previousTitle))
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        return joiner.toString()
    }
}
