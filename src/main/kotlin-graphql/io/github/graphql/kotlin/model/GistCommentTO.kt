package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GistCommentTO(
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
    val databaseId: Int?,
    override
    val editor: ActorTO?,
    val gist: GistTO,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    val isMinimized: Boolean,
    override
    val lastEditedAt: String?,
    val minimizedReason: String?,
    override
    val publishedAt: String?,
    override
    val updatedAt: String,
    override
    val viewerCanDelete: Boolean,
    val viewerCanMinimize: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean
) : DeletableTO, UpdatableCommentTO, NodeTO, CommentTO, UpdatableTO {

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
        joiner.add("gist: " + GraphQLRequestSerializer.getEntry(gist))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        joiner.add("isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        if (minimizedReason != null) {
            joiner.add("minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete))
        joiner.add("viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize))
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
        val that = other as GistCommentTO
        return Objects.equals(author, that.author)
                && Objects.equals(authorAssociation, that.authorAssociation)
                && Objects.equals(body, that.body)
                && Objects.equals(bodyHTML, that.bodyHTML)
                && Objects.equals(bodyText, that.bodyText)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(createdViaEmail, that.createdViaEmail)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(editor, that.editor)
                && Objects.equals(gist, that.gist)
                && Objects.equals(id, that.id)
                && Objects.equals(includesCreatedEdit, that.includesCreatedEdit)
                && Objects.equals(isMinimized, that.isMinimized)
                && Objects.equals(lastEditedAt, that.lastEditedAt)
                && Objects.equals(minimizedReason, that.minimizedReason)
                && Objects.equals(publishedAt, that.publishedAt)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(viewerCanDelete, that.viewerCanDelete)
                && Objects.equals(viewerCanMinimize, that.viewerCanMinimize)
                && Objects.equals(viewerCanUpdate, that.viewerCanUpdate)
                && Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons)
                && Objects.equals(viewerDidAuthor, that.viewerDidAuthor)

    }

    override fun hashCode(): Int = {
        return Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, gist, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, publishedAt, updatedAt, viewerCanDelete, viewerCanMinimize, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
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
        private lateinit var gist: GistTO
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var isMinimized: Boolean = false
        private var lastEditedAt: String? = null
        private var minimizedReason: String? = null
        private var publishedAt: String? = null
        private lateinit var updatedAt: String
        private var viewerCanDelete: Boolean = false
        private var viewerCanMinimize: Boolean = false
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

        fun setGist(gist: GistTO): Builder {
            this.gist = gist
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

        fun setPublishedAt(publishedAt: String?): Builder {
            this.publishedAt = publishedAt
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
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

        fun build(): GistCommentTO {
            return GistCommentTO(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, gist, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, publishedAt, updatedAt, viewerCanDelete, viewerCanMinimize, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
        }
    }
}
