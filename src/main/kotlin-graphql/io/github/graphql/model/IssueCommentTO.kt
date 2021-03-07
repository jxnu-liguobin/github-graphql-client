package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueCommentTO(
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
    val isMinimized: Boolean,
    val issue: IssueTO,
    override
    val lastEditedAt: String?,
    val minimizedReason: String?,
    override
    val publishedAt: String?,
    val pullRequest: PullRequestTO?,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    override
    val repository: RepositoryTO,
    val resourcePath: String,
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
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, DeletableTO, UpdatableCommentTO, NodeTO, ReactableTO, RepositoryNodeTO, CommentTO, UpdatableTO {

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
        joiner.add("isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized))
        joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        if (minimizedReason != null) {
            joiner.add("minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
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

    class Builder {

        private var author: ActorTO? = null
        private lateinit var authorAssociation: CommentAuthorAssociationTO
        private lateinit var body: String
        private lateinit var bodyHTML: String
        private lateinit var bodyText: String
        private lateinit var createdAt: String
        private var createdViaEmail: Boolean = false
        private var databaseId: Int? = null
        private var editor: ActorTO? = null
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var isMinimized: Boolean = false
        private lateinit var issue: IssueTO
        private var lastEditedAt: String? = null
        private var minimizedReason: String? = null
        private var publishedAt: String? = null
        private var pullRequest: PullRequestTO? = null
        private var reactionGroups: List<ReactionGroupTO>? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
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

        fun setIsMinimized(isMinimized: Boolean): Builder {
            this.isMinimized = isMinimized
            return this
        }

        fun setIssue(issue: IssueTO): Builder {
            this.issue = issue
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

        fun setPublishedAt(publishedAt: String?): Builder {
            this.publishedAt = publishedAt
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO?): Builder {
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

        fun build(): IssueCommentTO {
            return IssueCommentTO(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, isMinimized, issue, lastEditedAt, minimizedReason, publishedAt, pullRequest, reactionGroups, repository, resourcePath, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
        }
    }
}
