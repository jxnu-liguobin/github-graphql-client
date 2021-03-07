package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import CommentAuthorAssociationTO._
import CommentCannotUpdateReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueCommentTO(
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
    override val createdAt: String,
    override val createdViaEmail: Boolean,
    override val databaseId: Option[Int],
    override val editor: ActorTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    override val includesCreatedEdit: Boolean,
    isMinimized: Boolean,
    @javax.validation.constraints.NotNull
    issue: IssueTO,
    override val lastEditedAt: String,
    minimizedReason: String,
    override val publishedAt: String,
    pullRequest: PullRequestTO,
    @javax.validation.constraints.NotNull
    override val reactionGroups: Seq[ReactionGroupTO],
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
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
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with DeletableTO with UpdatableCommentTO with NodeTO with ReactableTO with RepositoryNodeTO with CommentTO with UpdatableTO {

    override def toString(): String = {
        Seq(
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (authorAssociation != null) "authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            if (bodyText != null) "bodyText: " + GraphQLRequestSerializer.getEntry(bodyText) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            "createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail),
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (editor != null) "editor: " + GraphQLRequestSerializer.getEntry(editor) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit),
            "isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized),
            if (issue != null) "issue: " + GraphQLRequestSerializer.getEntry(issue) else "",
            if (lastEditedAt != null) "lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt) else "",
            if (minimizedReason != null) "minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason) else "",
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (reactionGroups != null) "reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups.asJava) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
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
        val that = obj.asInstanceOf[IssueCommentTO]
        Objects.equals(author, that.author) &&
        Objects.equals(authorAssociation, that.authorAssociation) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bodyHTML, that.bodyHTML) &&
        Objects.equals(bodyText, that.bodyText) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(createdViaEmail, that.createdViaEmail) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(editor, that.editor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includesCreatedEdit, that.includesCreatedEdit) &&
        Objects.equals(isMinimized, that.isMinimized) &&
        Objects.equals(issue, that.issue) &&
        Objects.equals(lastEditedAt, that.lastEditedAt) &&
        Objects.equals(minimizedReason, that.minimizedReason) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(reactionGroups, that.reactionGroups) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
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
        Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, isMinimized, issue, lastEditedAt, minimizedReason, publishedAt, pullRequest, reactionGroups, repository, resourcePath, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)
    }
}

object IssueCommentTO {

    def builder(): IssueCommentTO.Builder = new Builder()

    class Builder {

        private var author: ActorTO = _
        private var authorAssociation: CommentAuthorAssociationTO = _
        private var body: String = _
        private var bodyHTML: String = _
        private var bodyText: String = _
        private var createdAt: String = _
        private var createdViaEmail: Boolean = _
        private var databaseId: Option[Int] = _
        private var editor: ActorTO = _
        private var id: String = _
        private var includesCreatedEdit: Boolean = _
        private var isMinimized: Boolean = _
        private var issue: IssueTO = _
        private var lastEditedAt: String = _
        private var minimizedReason: String = _
        private var publishedAt: String = _
        private var pullRequest: PullRequestTO = _
        private var reactionGroups: Seq[ReactionGroupTO] = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
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

        def setIsMinimized(isMinimized: Boolean): Builder = {
            this.isMinimized = isMinimized
            this
        }

        def setIssue(issue: IssueTO): Builder = {
            this.issue = issue
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

        def setPublishedAt(publishedAt: String): Builder = {
            this.publishedAt = publishedAt
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
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

        def build(): IssueCommentTO = new IssueCommentTO(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, isMinimized, issue, lastEditedAt, minimizedReason, publishedAt, pullRequest, reactionGroups, repository, resourcePath, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor)

    }
}
