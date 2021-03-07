package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PullRequestReviewCommentTO
        return Objects.equals(author, that.author)
                && Objects.equals(authorAssociation, that.authorAssociation)
                && Objects.equals(body, that.body)
                && Objects.equals(bodyHTML, that.bodyHTML)
                && Objects.equals(bodyText, that.bodyText)
                && Objects.equals(commit, that.commit)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(createdViaEmail, that.createdViaEmail)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(diffHunk, that.diffHunk)
                && Objects.equals(draftedAt, that.draftedAt)
                && Objects.equals(editor, that.editor)
                && Objects.equals(id, that.id)
                && Objects.equals(includesCreatedEdit, that.includesCreatedEdit)
                && Objects.equals(isMinimized, that.isMinimized)
                && Objects.equals(lastEditedAt, that.lastEditedAt)
                && Objects.equals(minimizedReason, that.minimizedReason)
                && Objects.equals(originalCommit, that.originalCommit)
                && Objects.equals(originalPosition, that.originalPosition)
                && Objects.equals(outdated, that.outdated)
                && Objects.equals(path, that.path)
                && Objects.equals(position, that.position)
                && Objects.equals(publishedAt, that.publishedAt)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(pullRequestReview, that.pullRequestReview)
                && Objects.equals(reactionGroups, that.reactionGroups)
                && Objects.equals(replyTo, that.replyTo)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(state, that.state)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)
                && Objects.equals(viewerCanDelete, that.viewerCanDelete)
                && Objects.equals(viewerCanMinimize, that.viewerCanMinimize)
                && Objects.equals(viewerCanReact, that.viewerCanReact)
                && Objects.equals(viewerCanUpdate, that.viewerCanUpdate)
                && Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons)
                && Objects.equals(viewerDidAuthor, that.viewerDidAuthor)

    }

    override fun hashCode(): Int = {
        return Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
    }

    class Builder {

        private var author: ActorTO? = null
        private lateinit var authorAssociation: CommentAuthorAssociationTO
        private lateinit var body: String
        private lateinit var bodyHTML: String
        private lateinit var bodyText: String
        private lateinit var commit: CommitTO
        private lateinit var createdAt: String
        private var createdViaEmail: Boolean = false
        private var databaseId: Int? = null
        private lateinit var diffHunk: String
        private lateinit var draftedAt: String
        private var editor: ActorTO? = null
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var isMinimized: Boolean = false
        private var lastEditedAt: String? = null
        private var minimizedReason: String? = null
        private var originalCommit: CommitTO? = null
        private var originalPosition: Int = 0
        private var outdated: Boolean = false
        private lateinit var path: String
        private var position: Int? = null
        private var publishedAt: String? = null
        private lateinit var pullRequest: PullRequestTO
        private var pullRequestReview: PullRequestReviewTO? = null
        private var reactionGroups: List<ReactionGroupTO>? = null
        private var replyTo: PullRequestReviewCommentTO? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var state: PullRequestReviewCommentStateTO
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanDelete: Boolean = false
        private var viewerCanMinimize: Boolean = false
        private var viewerCanReact: Boolean = false
        private var viewerCanUpdate: Boolean = false
        private lateinit var viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>
        private var viewerDidAuthor: Boolean = false

        fun setAuthor(author: ActorTO?): Builder {
            this.author = author
            return this
        }

        fun setAuthorAssociation(authorAssociation: CommentAuthorAssociationTO): Builder {
            this.authorAssociation = authorAssociation
            return this
        }

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setBodyHTML(bodyHTML: String): Builder {
            this.bodyHTML = bodyHTML
            return this
        }

        fun setBodyText(bodyText: String): Builder {
            this.bodyText = bodyText
            return this
        }

        fun setCommit(commit: CommitTO): Builder {
            this.commit = commit
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setCreatedViaEmail(createdViaEmail: Boolean): Builder {
            this.createdViaEmail = createdViaEmail
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDiffHunk(diffHunk: String): Builder {
            this.diffHunk = diffHunk
            return this
        }

        fun setDraftedAt(draftedAt: String): Builder {
            this.draftedAt = draftedAt
            return this
        }

        fun setEditor(editor: ActorTO?): Builder {
            this.editor = editor
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIncludesCreatedEdit(includesCreatedEdit: Boolean): Builder {
            this.includesCreatedEdit = includesCreatedEdit
            return this
        }

        fun setIsMinimized(isMinimized: Boolean): Builder {
            this.isMinimized = isMinimized
            return this
        }

        fun setLastEditedAt(lastEditedAt: String?): Builder {
            this.lastEditedAt = lastEditedAt
            return this
        }

        fun setMinimizedReason(minimizedReason: String?): Builder {
            this.minimizedReason = minimizedReason
            return this
        }

        fun setOriginalCommit(originalCommit: CommitTO?): Builder {
            this.originalCommit = originalCommit
            return this
        }

        fun setOriginalPosition(originalPosition: Int): Builder {
            this.originalPosition = originalPosition
            return this
        }

        fun setOutdated(outdated: Boolean): Builder {
            this.outdated = outdated
            return this
        }

        fun setPath(path: String): Builder {
            this.path = path
            return this
        }

        fun setPosition(position: Int?): Builder {
            this.position = position
            return this
        }

        fun setPublishedAt(publishedAt: String?): Builder {
            this.publishedAt = publishedAt
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setPullRequestReview(pullRequestReview: PullRequestReviewTO?): Builder {
            this.pullRequestReview = pullRequestReview
            return this
        }

        fun setReactionGroups(reactionGroups: List<ReactionGroupTO>?): Builder {
            this.reactionGroups = reactionGroups
            return this
        }

        fun setReplyTo(replyTo: PullRequestReviewCommentTO?): Builder {
            this.replyTo = replyTo
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setState(state: PullRequestReviewCommentStateTO): Builder {
            this.state = state
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setViewerCanDelete(viewerCanDelete: Boolean): Builder {
            this.viewerCanDelete = viewerCanDelete
            return this
        }

        fun setViewerCanMinimize(viewerCanMinimize: Boolean): Builder {
            this.viewerCanMinimize = viewerCanMinimize
            return this
        }

        fun setViewerCanReact(viewerCanReact: Boolean): Builder {
            this.viewerCanReact = viewerCanReact
            return this
        }

        fun setViewerCanUpdate(viewerCanUpdate: Boolean): Builder {
            this.viewerCanUpdate = viewerCanUpdate
            return this
        }

        fun setViewerCannotUpdateReasons(viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>): Builder {
            this.viewerCannotUpdateReasons = viewerCannotUpdateReasons
            return this
        }

        fun setViewerDidAuthor(viewerDidAuthor: Boolean): Builder {
            this.viewerDidAuthor = viewerDidAuthor
            return this
        }

        fun build(): PullRequestReviewCommentTO {
            return PullRequestReviewCommentTO(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
        }
    }
}
