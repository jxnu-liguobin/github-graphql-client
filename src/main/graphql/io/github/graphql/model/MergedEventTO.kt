package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MergedEventTO(
    val actor: ActorTO?,
    val commit: CommitTO?,
    val createdAt: String,
    override
    val id: String,
    val mergeRef: RefTO?,
    val mergeRefName: String,
    val pullRequest: PullRequestTO,
    override
    val resourcePath: String,
    override
    val url: String
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (mergeRef != null) {
            joiner.add("mergeRef: " + GraphQLRequestSerializer.getEntry(mergeRef))
        }
        joiner.add("mergeRefName: " + GraphQLRequestSerializer.getEntry(mergeRefName))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
