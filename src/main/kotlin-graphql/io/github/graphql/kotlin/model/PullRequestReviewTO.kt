package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestReviewTO(
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
    val commit: CommitTO?,
    override
    val createdAt: String,
    override
    val createdViaEmail: Boolean,
    override
    val databaseId: Int?,
    override
    val editor: ActorTO?,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    override
    val lastEditedAt: String?,
    override
    val publishedAt: String?,
    val pullRequest: PullRequestTO,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    override
    val repository: RepositoryTO,
    val resourcePath: String,
    val state: PullRequestReviewStateTO,
    val submittedAt: String?,
    override
    val updatedAt: String,
    val url: String,
    override
    val viewerCanDelete: Boolean,
    override
    val viewerCanReact: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, DeletableTO, UpdatableCommentTO, NodeTO, ReactableTO, RepositoryNodeTO, CommentTO, UpdatableTO {

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
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        if (submittedAt != null) {
            joiner.add("submittedAt: " + GraphQLRequestSerializer.getEntry(submittedAt))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete))
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
        val that = other as PullRequestReviewTO
        return Objects.equals(author, that.author)
                && Objects.equals(authorAssociation, that.authorAssociation)
                && Objects.equals(body, that.body)
                && Objects.equals(bodyHTML, that.bodyHTML)
                && Objects.equals(bodyText, that.bodyText)
                && Objects.equals(commit, that.commit)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(createdViaEmail, that.createdViaEmail)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(editor, that.editor)
                && Objects.equals(id, that.id)
                && Objects.equals(includesCreatedEdit, that.includesCreatedEdit)
                && Objects.equals(lastEditedAt, that.lastEditedAt)
                && Objects.equals(publishedAt, that.publishedAt)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(reactionGroups, that.reactionGroups)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(state, that.state)
                && Objects.equals(submittedAt, that.submittedAt)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)
                && Objects.equals(viewerCanDelete, that.viewerCanDelete)
                && Objects.equals(viewerCanReact, that.viewerCanReact)
                && Objects.equals(viewerCanUpdate, that.viewerCanUpdate)
                && Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons)
                && Objects.equals(viewerDidAuthor, that.viewerDidAuthor)

    }

    override fun hashCode(): Int = {
        return Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, publishedAt, pullRequest, reactionGroups, repository, resourcePath, state, submittedAt, updatedAt, url, viewerCanDelete, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
    }

    class Builder {

        private var author: ActorTO? = null
        private lateinit var authorAssociation: CommentAuthorAssociationTO
        private lateinit var body: String
        private lateinit var bodyHTML: String
        private lateinit var bodyText: String
        private var commit: CommitTO? = null
        private lateinit var createdAt: String
        private var createdViaEmail: Boolean = false
        private var databaseId: Int? = null
        private var editor: ActorTO? = null
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var lastEditedAt: String? = null
        private var publishedAt: String? = null
        private lateinit var pullRequest: PullRequestTO
        private var reactionGroups: List<ReactionGroupTO>? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var state: PullRequestReviewStateTO
        private var submittedAt: String? = null
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanDelete: Boolean = false
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

        fun setCommit(commit: CommitTO?): Builder {
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

        fun setLastEditedAt(lastEditedAt: String?): Builder {
            this.lastEditedAt = lastEditedAt
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

        fun setReactionGroups(reactionGroups: List<ReactionGroupTO>?): Builder {
            this.reactionGroups = reactionGroups
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

        fun setState(state: PullRequestReviewStateTO): Builder {
            this.state = state
            return this
        }

        fun setSubmittedAt(submittedAt: String?): Builder {
            this.submittedAt = submittedAt
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

        fun build(): PullRequestReviewTO {
            return PullRequestReviewTO(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, publishedAt, pullRequest, reactionGroups, repository, resourcePath, state, submittedAt, updatedAt, url, viewerCanDelete, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
        }
    }
}
