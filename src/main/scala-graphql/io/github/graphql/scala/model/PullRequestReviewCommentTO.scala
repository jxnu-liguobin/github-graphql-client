package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import CommentAuthorAssociationTO._
import PullRequestReviewCommentStateTO._
import CommentCannotUpdateReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestReviewCommentTO(
    override val author: ActorTO,
    @javax.validation.constraints.NotNull
    override val authorAssociation: CommentAuthorAssociationTO,
    @javax.validation.constraints.NotNull
    override val body: String,
    @javax.validation.constraints.NotNull
    override val bodyHTML: String,
    @javax.validation.constraints.NotNull
    override val bodyText: String,
    @javax.validation.constraints.NotNull
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    override val createdAt: String,
    override val createdViaEmail: Boolean,
    override val databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    diffHunk: String,
    @javax.validation.constraints.NotNull
    draftedAt: String,
    override val editor: ActorTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    override val includesCreatedEdit: Boolean,
    isMinimized: Boolean,
    override val lastEditedAt: String,
    minimizedReason: String,
    originalCommit: CommitTO,
    originalPosition: Int,
    outdated: Boolean,
    @javax.validation.constraints.NotNull
    path: String,
    position: Option[Int],
    override val publishedAt: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    pullRequestReview: PullRequestReviewTO,
    @javax.validation.constraints.NotNull
    override val reactionGroups: Seq[ReactionGroupTO],
    replyTo: PullRequestReviewCommentTO,
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    state: PullRequestReviewCommentStateTO,
    @javax.validation.constraints.NotNull
    override val updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String,
    override val viewerCanDelete: Boolean,
    viewerCanMinimize: Boolean,
    override val viewerCanReact: Boolean,
    override val viewerCanUpdate: Boolean,
    @javax.validation.constraints.NotNull
    override val viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO],
    override val viewerDidAuthor: Boolean
) extends PullRequestTimelineItemTO with DeletableTO with UpdatableCommentTO with NodeTO with ReactableTO with RepositoryNodeTO with CommentTO with UpdatableTO {

    override def toString(): String = {
        Seq(
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (authorAssociation != null) "authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            if (bodyText != null) "bodyText: " + GraphQLRequestSerializer.getEntry(bodyText) else "",
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            "createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail),
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (diffHunk != null) "diffHunk: " + GraphQLRequestSerializer.getEntry(diffHunk) else "",
            if (draftedAt != null) "draftedAt: " + GraphQLRequestSerializer.getEntry(draftedAt) else "",
            if (editor != null) "editor: " + GraphQLRequestSerializer.getEntry(editor) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit),
            "isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized),
            if (lastEditedAt != null) "lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt) else "",
            if (minimizedReason != null) "minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason) else "",
            if (originalCommit != null) "originalCommit: " + GraphQLRequestSerializer.getEntry(originalCommit) else "",
            "originalPosition: " + GraphQLRequestSerializer.getEntry(originalPosition),
            "outdated: " + GraphQLRequestSerializer.getEntry(outdated),
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else "",
            if (position.isDefined) "position: " + GraphQLRequestSerializer.getEntry(position.get) else "",
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (pullRequestReview != null) "pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview) else "",
            if (reactionGroups != null) "reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups.asJava) else "",
            if (replyTo != null) "replyTo: " + GraphQLRequestSerializer.getEntry(replyTo) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete),
            "viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize),
            "viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact),
            "viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate),
            if (viewerCannotUpdateReasons != null) "viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons.asJava) else "",
            "viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestReviewCommentTO]
        Objects.equals(author, that.author) &&
        Objects.equals(authorAssociation, that.authorAssociation) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bodyHTML, that.bodyHTML) &&
        Objects.equals(bodyText, that.bodyText) &&
        Objects.equals(commit, that.commit) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(createdViaEmail, that.createdViaEmail) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(diffHunk, that.diffHunk) &&
        Objects.equals(draftedAt, that.draftedAt) &&
        Objects.equals(editor, that.editor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includesCreatedEdit, that.includesCreatedEdit) &&
        Objects.equals(isMinimized, that.isMinimized) &&
        Objects.equals(lastEditedAt, that.lastEditedAt) &&
        Objects.equals(minimizedReason, that.minimizedReason) &&
        Objects.equals(originalCommit, that.originalCommit) &&
        Objects.equals(originalPosition, that.originalPosition) &&
        Objects.equals(outdated, that.outdated) &&
        Objects.equals(path, that.path) &&
        Objects.equals(position, that.position) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(pullRequestReview, that.pullRequestReview) &&
        Objects.equals(reactionGroups, that.reactionGroups) &&
        Objects.equals(replyTo, that.replyTo) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(state, that.state) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerCanDelete, that.viewerCanDelete) &&
        Objects.equals(viewerCanMinimize, that.viewerCanMinimize) &&
        Objects.equals(viewerCanReact, that.viewerCanReact) &&
        Objects.equals(viewerCanUpdate, that.viewerCanUpdate) &&
        Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons) &&
        Objects.equals(viewerDidAuthor, that.viewerDidAuthor)
    }

    override def hashCode(): Int = {
        Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
    }
}

object PullRequestReviewCommentTO {

    def builder(): PullRequestReviewCommentTO.Builder = new Builder()

    class Builder {

        private var author: ActorTO = _
        private var authorAssociation: CommentAuthorAssociationTO = _
        private var body: String = _
        private var bodyHTML: String = _
        private var bodyText: String = _
        private var commit: CommitTO = _
        private var createdAt: String = _
        private var createdViaEmail: Boolean = _
        private var databaseId: Option[Int] = _
        private var diffHunk: String = _
        private var draftedAt: String = _
        private var editor: ActorTO = _
        private var id: String = _
        private var includesCreatedEdit: Boolean = _
        private var isMinimized: Boolean = _
        private var lastEditedAt: String = _
        private var minimizedReason: String = _
        private var originalCommit: CommitTO = _
        private var originalPosition: Int = _
        private var outdated: Boolean = _
        private var path: String = _
        private var position: Option[Int] = _
        private var publishedAt: String = _
        private var pullRequest: PullRequestTO = _
        private var pullRequestReview: PullRequestReviewTO = _
        private var reactionGroups: Seq[ReactionGroupTO] = _
        private var replyTo: PullRequestReviewCommentTO = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var state: PullRequestReviewCommentStateTO = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanDelete: Boolean = _
        private var viewerCanMinimize: Boolean = _
        private var viewerCanReact: Boolean = _
        private var viewerCanUpdate: Boolean = _
        private var viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO] = _
        private var viewerDidAuthor: Boolean = _

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

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
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

        def setDiffHunk(diffHunk: String): Builder = {
            this.diffHunk = diffHunk
            this
        }

        def setDraftedAt(draftedAt: String): Builder = {
            this.draftedAt = draftedAt
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

        def setIsMinimized(isMinimized: Boolean): Builder = {
            this.isMinimized = isMinimized
            this
        }

        def setLastEditedAt(lastEditedAt: String): Builder = {
            this.lastEditedAt = lastEditedAt
            this
        }

        def setMinimizedReason(minimizedReason: String): Builder = {
            this.minimizedReason = minimizedReason
            this
        }

        def setOriginalCommit(originalCommit: CommitTO): Builder = {
            this.originalCommit = originalCommit
            this
        }

        def setOriginalPosition(originalPosition: Int): Builder = {
            this.originalPosition = originalPosition
            this
        }

        def setOutdated(outdated: Boolean): Builder = {
            this.outdated = outdated
            this
        }

        def setPath(path: String): Builder = {
            this.path = path
            this
        }

        def setPosition(position: Option[Int]): Builder = {
            this.position = position
            this
        }

        def setPublishedAt(publishedAt: String): Builder = {
            this.publishedAt = publishedAt
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def setPullRequestReview(pullRequestReview: PullRequestReviewTO): Builder = {
            this.pullRequestReview = pullRequestReview
            this
        }

        def setReactionGroups(reactionGroups: Seq[ReactionGroupTO]): Builder = {
            this.reactionGroups = reactionGroups
            this
        }

        def setReplyTo(replyTo: PullRequestReviewCommentTO): Builder = {
            this.replyTo = replyTo
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

        def setState(state: PullRequestReviewCommentStateTO): Builder = {
            this.state = state
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

        def setViewerCanDelete(viewerCanDelete: Boolean): Builder = {
            this.viewerCanDelete = viewerCanDelete
            this
        }

        def setViewerCanMinimize(viewerCanMinimize: Boolean): Builder = {
            this.viewerCanMinimize = viewerCanMinimize
            this
        }

        def setViewerCanReact(viewerCanReact: Boolean): Builder = {
            this.viewerCanReact = viewerCanReact
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

        def build(): PullRequestReviewCommentTO = new PullRequestReviewCommentTO(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)

    }
}
