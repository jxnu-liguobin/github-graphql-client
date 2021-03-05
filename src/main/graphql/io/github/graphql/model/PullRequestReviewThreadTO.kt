package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestReviewThreadTO(
    override
    val id: String,
    val isResolved: Boolean,
    val pullRequest: PullRequestTO,
    val repository: RepositoryTO,
    val resolvedBy: UserTO?,
    val viewerCanResolve: Boolean,
    val viewerCanUnresolve: Boolean
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isResolved: " + GraphQLRequestSerializer.getEntry(isResolved))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (resolvedBy != null) {
            joiner.add("resolvedBy: " + GraphQLRequestSerializer.getEntry(resolvedBy))
        }
        joiner.add("viewerCanResolve: " + GraphQLRequestSerializer.getEntry(viewerCanResolve))
        joiner.add("viewerCanUnresolve: " + GraphQLRequestSerializer.getEntry(viewerCanUnresolve))
        return joiner.toString()
    }
}
