package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestCommitCommentThreadTO(
    val commit: CommitTO,
    override
    val id: String,
    val path: String?,
    val position: Int?,
    val pullRequest: PullRequestTO,
    override
    val repository: RepositoryTO
) : PullRequestTimelineItemsTO, NodeTO, RepositoryNodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        }
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }
}
