package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewDismissedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val databaseId: Int?,
    val dismissalMessage: String?,
    val dismissalMessageHTML: String?,
    override
    val id: String,
    val previousReviewState: PullRequestReviewStateTO,
    val pullRequest: PullRequestTO,
    val pullRequestCommit: PullRequestCommitTO?,
    override
    val resourcePath: String,
    val review: PullRequestReviewTO?,
    override
    val url: String
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (dismissalMessage != null) {
            joiner.add("dismissalMessage: " + GraphQLRequestSerializer.getEntry(dismissalMessage))
        }
        if (dismissalMessageHTML != null) {
            joiner.add("dismissalMessageHTML: " + GraphQLRequestSerializer.getEntry(dismissalMessageHTML))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("previousReviewState: " + GraphQLRequestSerializer.getEntry(previousReviewState))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (pullRequestCommit != null) {
            joiner.add("pullRequestCommit: " + GraphQLRequestSerializer.getEntry(pullRequestCommit))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (review != null) {
            joiner.add("review: " + GraphQLRequestSerializer.getEntry(review))
        }
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
