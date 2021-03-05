package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestRevisionMarkerTO(
    val createdAt: String,
    val lastSeenCommit: CommitTO,
    val pullRequest: PullRequestTO
) : PullRequestTimelineItemsTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("lastSeenCommit: " + GraphQLRequestSerializer.getEntry(lastSeenCommit))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        return joiner.toString()
    }
}
