package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestReviewCommentTO(
    override
    val author: ActorTO?,
    override
    val authorAssociation: CommentAuthorAssociationTO,
    override
    val body: String,
    override
    val bodyHTML: String,
    override
    val bodyText: String,
    val commit: CommitTO,
    override
    val createdAt: String,
    override
    val createdViaEmail: Boolean,
    override
    val databaseId: Int?,
    val diffHunk: String,
    val draftedAt: String,
    override
    val editor: ActorTO?,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    val isMinimized: Boolean,
    override
    val lastEditedAt: String?,
    val minimizedReason: String?,
    val originalCommit: CommitTO?,
    val originalPosition: Int,
    val outdated: Boolean,
    val path: String,
    val position: Int?,
    override
    val publishedAt: String?,
    val pullRequest: PullRequestTO,
    val pullRequestReview: PullRequestReviewTO?,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    val replyTo: PullRequestReviewCommentTO?,
    override
    val repository: RepositoryTO,
    val resourcePath: String,
    val state: PullRequestReviewCommentStateTO,
    override
    val updatedAt: String,
    val url: String,
    override
    val viewerCanDelete: Boolean,
    val viewerCanMinimize: Boolean,
    override
    val viewerCanReact: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean
) : PullRequestTimelineItemTO, DeletableTO, UpdatableCommentTO, NodeTO, ReactableTO, RepositoryNodeTO, CommentTO, UpdatableTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation))
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText))
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("diffHunk: " + GraphQLRequestSerializer.getEntry(diffHunk))
        joiner.add("draftedAt: " + GraphQLRequestSerializer.getEntry(draftedAt))
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        joiner.add("isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        if (minimizedReason != null) {
            joiner.add("minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason))
        }
        if (originalCommit != null) {
            joiner.add("originalCommit: " + GraphQLRequestSerializer.getEntry(originalCommit))
        }
        joiner.add("originalPosition: " + GraphQLRequestSerializer.getEntry(originalPosition))
        joiner.add("outdated: " + GraphQLRequestSerializer.getEntry(outdated))
        joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview))
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        if (replyTo != null) {
            joiner.add("replyTo: " + GraphQLRequestSerializer.getEntry(replyTo))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete))
        joiner.add("viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize))
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons))
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor))
        return joiner.toString()
    }
}
