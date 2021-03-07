package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import LockReasonTO._
import CommentAuthorAssociationTO._
import IssueStateTO._
import CommentCannotUpdateReasonTO._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueTO(
    override val activeLockReason: LockReasonTO,
    override val author: ActorTO,
    @javax.validation.constraints.NotNull
    override val authorAssociation: CommentAuthorAssociationTO,
    @javax.validation.constraints.NotNull
    override val body: String,
    @javax.validation.constraints.NotNull
    override val bodyHTML: String,
    @javax.validation.constraints.NotNull
    override val bodyText: String,
    override val closed: Boolean,
    override val closedAt: String,
    @javax.validation.constraints.NotNull
    override val createdAt: String,
    override val createdViaEmail: Boolean,
    override val databaseId: Option[Int],
    override val editor: ActorTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    override val includesCreatedEdit: Boolean,
    override val lastEditedAt: String,
    override val locked: Boolean,
    milestone: MilestoneTO,
    number: Int,
    override val publishedAt: String,
    @javax.validation.constraints.NotNull
    override val reactionGroups: Seq[ReactionGroupTO],
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    state: IssueStateTO,
    @javax.validation.constraints.NotNull
    title: String,
    @javax.validation.constraints.NotNull
    override val updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    override val viewerCanReact: Boolean,
    override val viewerCanSubscribe: Boolean,
    override val viewerCanUpdate: Boolean,
    @javax.validation.constraints.NotNull
    override val viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO],
    override val viewerDidAuthor: Boolean,
    override val viewerSubscription: SubscriptionStateTO
) extends IssueOrPullRequestTO with ReferencedSubjectTO with SearchResultItemTO with RenamedTitleSubjectTO with ProjectCardItemTO with MilestoneItemTO with SubscribableTO with UniformResourceLocatableTO with UpdatableCommentTO with ClosableTO with LockableTO with NodeTO with LabelableTO with ReactableTO with RepositoryNodeTO with AssignableTO with CommentTO with UpdatableTO {

    override def toString(): String = {
        Seq(
            if (activeLockReason != null) "activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason) else "",
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (authorAssociation != null) "authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            if (bodyText != null) "bodyText: " + GraphQLRequestSerializer.getEntry(bodyText) else "",
            "closed: " + GraphQLRequestSerializer.getEntry(closed),
            if (closedAt != null) "closedAt: " + GraphQLRequestSerializer.getEntry(closedAt) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            "createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail),
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (editor != null) "editor: " + GraphQLRequestSerializer.getEntry(editor) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit),
            if (lastEditedAt != null) "lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt) else "",
            "locked: " + GraphQLRequestSerializer.getEntry(locked),
            if (milestone != null) "milestone: " + GraphQLRequestSerializer.getEntry(milestone) else "",
            "number: " + GraphQLRequestSerializer.getEntry(number),
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (reactionGroups != null) "reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups.asJava) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact),
            "viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe),
            "viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate),
            if (viewerCannotUpdateReasons != null) "viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons.asJava) else "",
            "viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor),
            if (viewerSubscription != null) "viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[IssueTO]
        Objects.equals(activeLockReason, that.activeLockReason) &&
        Objects.equals(author, that.author) &&
        Objects.equals(authorAssociation, that.authorAssociation) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bodyHTML, that.bodyHTML) &&
        Objects.equals(bodyText, that.bodyText) &&
        Objects.equals(closed, that.closed) &&
        Objects.equals(closedAt, that.closedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(createdViaEmail, that.createdViaEmail) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(editor, that.editor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includesCreatedEdit, that.includesCreatedEdit) &&
        Objects.equals(lastEditedAt, that.lastEditedAt) &&
        Objects.equals(locked, that.locked) &&
        Objects.equals(milestone, that.milestone) &&
        Objects.equals(number, that.number) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(reactionGroups, that.reactionGroups) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(state, that.state) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerCanReact, that.viewerCanReact) &&
        Objects.equals(viewerCanSubscribe, that.viewerCanSubscribe) &&
        Objects.equals(viewerCanUpdate, that.viewerCanUpdate) &&
        Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons) &&
        Objects.equals(viewerDidAuthor, that.viewerDidAuthor) &&
        Objects.equals(viewerSubscription, that.viewerSubscription)
    }

    override def hashCode(): Int = {
        Objects.hash(activeLockReason, author, authorAssociation, body, bodyHTML, bodyText, closed, closedAt, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, locked, milestone, number, publishedAt, reactionGroups, repository, resourcePath, state, title, updatedAt, url, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)
    }
}

object IssueTO {

    def builder(): IssueTO.Builder = new Builder()

    class Builder {

        private var activeLockReason: LockReasonTO = _
        private var author: ActorTO = _
        private var authorAssociation: CommentAuthorAssociationTO = _
        private var body: String = _
        private var bodyHTML: String = _
        private var bodyText: String = _
        private var closed: Boolean = _
        private var closedAt: String = _
        private var createdAt: String = _
        private var createdViaEmail: Boolean = _
        private var databaseId: Option[Int] = _
        private var editor: ActorTO = _
        private var id: String = _
        private var includesCreatedEdit: Boolean = _
        private var lastEditedAt: String = _
        private var locked: Boolean = _
        private var milestone: MilestoneTO = _
        private var number: Int = _
        private var publishedAt: String = _
        private var reactionGroups: Seq[ReactionGroupTO] = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var state: IssueStateTO = _
        private var title: String = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanReact: Boolean = _
        private var viewerCanSubscribe: Boolean = _
        private var viewerCanUpdate: Boolean = _
        private var viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO] = _
        private var viewerDidAuthor: Boolean = _
        private var viewerSubscription: SubscriptionStateTO = _

        def setActiveLockReason(activeLockReason: LockReasonTO): Builder = {
            this.activeLockReason = activeLockReason
            this
        }

        def setAuthor(author: ActorTO): Builder = {
            this.author = author
            this
        }

        def setAuthorAssociation(authorAssociation: CommentAuthorAssociationTO): Builder = {
            this.authorAssociation = authorAssociation
            this
        }

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setBodyHTML(bodyHTML: String): Builder = {
            this.bodyHTML = bodyHTML
            this
        }

        def setBodyText(bodyText: String): Builder = {
            this.bodyText = bodyText
            this
        }

        def setClosed(closed: Boolean): Builder = {
            this.closed = closed
            this
        }

        def setClosedAt(closedAt: String): Builder = {
            this.closedAt = closedAt
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setCreatedViaEmail(createdViaEmail: Boolean): Builder = {
            this.createdViaEmail = createdViaEmail
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setEditor(editor: ActorTO): Builder = {
            this.editor = editor
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIncludesCreatedEdit(includesCreatedEdit: Boolean): Builder = {
            this.includesCreatedEdit = includesCreatedEdit
            this
        }

        def setLastEditedAt(lastEditedAt: String): Builder = {
            this.lastEditedAt = lastEditedAt
            this
        }

        def setLocked(locked: Boolean): Builder = {
            this.locked = locked
            this
        }

        def setMilestone(milestone: MilestoneTO): Builder = {
            this.milestone = milestone
            this
        }

        def setNumber(number: Int): Builder = {
            this.number = number
            this
        }

        def setPublishedAt(publishedAt: String): Builder = {
            this.publishedAt = publishedAt
            this
        }

        def setReactionGroups(reactionGroups: Seq[ReactionGroupTO]): Builder = {
            this.reactionGroups = reactionGroups
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setState(state: IssueStateTO): Builder = {
            this.state = state
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def setViewerCanReact(viewerCanReact: Boolean): Builder = {
            this.viewerCanReact = viewerCanReact
            this
        }

        def setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder = {
            this.viewerCanSubscribe = viewerCanSubscribe
            this
        }

        def setViewerCanUpdate(viewerCanUpdate: Boolean): Builder = {
            this.viewerCanUpdate = viewerCanUpdate
            this
        }

        def setViewerCannotUpdateReasons(viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO]): Builder = {
            this.viewerCannotUpdateReasons = viewerCannotUpdateReasons
            this
        }

        def setViewerDidAuthor(viewerDidAuthor: Boolean): Builder = {
            this.viewerDidAuthor = viewerDidAuthor
            this
        }

        def setViewerSubscription(viewerSubscription: SubscriptionStateTO): Builder = {
            this.viewerSubscription = viewerSubscription
            this
        }

        def build(): IssueTO = new IssueTO(activeLockReason, author, authorAssociation, body, bodyHTML, bodyText, closed, closedAt, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, locked, milestone, number, publishedAt, reactionGroups, repository, resourcePath, state, title, updatedAt, url, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)

    }
}
