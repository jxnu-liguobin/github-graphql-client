package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueTO(
    override
    val activeLockReason: LockReasonTO?,
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
    val closed: Boolean,
    override
    val closedAt: String?,
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
    val locked: Boolean,
    val milestone: MilestoneTO?,
    val number: Int,
    override
    val publishedAt: String?,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    override
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val state: IssueStateTO,
    val title: String,
    override
    val updatedAt: String,
    override
    val url: String,
    override
    val viewerCanReact: Boolean,
    override
    val viewerCanSubscribe: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean,
    override
    val viewerSubscription: SubscriptionStateTO?
) : IssueOrPullRequestTO, ReferencedSubjectTO, SearchResultItemTO, RenamedTitleSubjectTO, ProjectCardItemTO, MilestoneItemTO, SubscribableTO, UniformResourceLocatableTO, UpdatableCommentTO, ClosableTO, LockableTO, NodeTO, LabelableTO, ReactableTO, RepositoryNodeTO, AssignableTO, CommentTO, UpdatableTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (activeLockReason != null) {
            joiner.add("activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason))
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation))
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText))
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
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
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked))
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone))
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact))
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons))
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor))
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription))
        }
        return joiner.toString()
    }

    class Builder {

        private var activeLockReason: LockReasonTO? = null
        private var author: ActorTO? = null
        private lateinit var authorAssociation: CommentAuthorAssociationTO
        private lateinit var body: String
        private lateinit var bodyHTML: String
        private lateinit var bodyText: String
        private var closed: Boolean = false
        private var closedAt: String? = null
        private lateinit var createdAt: String
        private var createdViaEmail: Boolean = false
        private var databaseId: Int? = null
        private var editor: ActorTO? = null
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var lastEditedAt: String? = null
        private var locked: Boolean = false
        private var milestone: MilestoneTO? = null
        private var number: Int = 0
        private var publishedAt: String? = null
        private var reactionGroups: List<ReactionGroupTO>? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var state: IssueStateTO
        private lateinit var title: String
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanReact: Boolean = false
        private var viewerCanSubscribe: Boolean = false
        private var viewerCanUpdate: Boolean = false
        private lateinit var viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>
        private var viewerDidAuthor: Boolean = false
        private var viewerSubscription: SubscriptionStateTO? = null

        fun setActiveLockReason(activeLockReason: LockReasonTO?): Builder {
            this.activeLockReason = activeLockReason
            return this
        }

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

        fun setClosed(closed: Boolean): Builder {
            this.closed = closed
            return this
        }

        fun setClosedAt(closedAt: String?): Builder {
            this.closedAt = closedAt
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

        fun setLocked(locked: Boolean): Builder {
            this.locked = locked
            return this
        }

        fun setMilestone(milestone: MilestoneTO?): Builder {
            this.milestone = milestone
            return this
        }

        fun setNumber(number: Int): Builder {
            this.number = number
            return this
        }

        fun setPublishedAt(publishedAt: String?): Builder {
            this.publishedAt = publishedAt
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

        fun setState(state: IssueStateTO): Builder {
            this.state = state
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
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

        fun setViewerCanReact(viewerCanReact: Boolean): Builder {
            this.viewerCanReact = viewerCanReact
            return this
        }

        fun setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder {
            this.viewerCanSubscribe = viewerCanSubscribe
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

        fun setViewerSubscription(viewerSubscription: SubscriptionStateTO?): Builder {
            this.viewerSubscription = viewerSubscription
            return this
        }

        fun build(): IssueTO {
            return IssueTO(activeLockReason, author, authorAssociation, body, bodyHTML, bodyText, closed, closedAt, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, locked, milestone, number, publishedAt, reactionGroups, repository, resourcePath, state, title, updatedAt, url, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)
        }
    }
}
