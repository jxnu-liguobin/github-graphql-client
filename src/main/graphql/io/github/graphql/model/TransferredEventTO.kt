package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TransferredEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val fromRepository: RepositoryTO?,
    override
    val id: String,
    val issue: IssueTO
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (fromRepository != null) {
            joiner.add("fromRepository: " + GraphQLRequestSerializer.getEntry(fromRepository))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
        return joiner.toString()
    }
}
