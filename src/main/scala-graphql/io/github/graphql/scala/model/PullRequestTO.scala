package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import LockReasonTO._
import CommentAuthorAssociationTO._
import MergeableStateTO._
import PullRequestStateTO._
import CommentCannotUpdateReasonTO._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestTO(
    override val activeLockReason: LockReasonTO,
    additions: Int,
    override val author: ActorTO,
    @javax.validation.constraints.NotNull
    override val authorAssociation: CommentAuthorAssociationTO,
    baseRef: RefTO,
    @javax.validation.constraints.NotNull
    baseRefName: String,
    @javax.validation.constraints.NotNull
    baseRefOid: String,
    baseRepository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val body: String,
    @javax.validation.constraints.NotNull
    override val bodyHTML: String,
    @javax.validation.constraints.NotNull
    override val bodyText: String,
    changedFiles: Int,
    override val closed: Boolean,
    override val closedAt: String,
    @javax.validation.constraints.NotNull
    override val createdAt: String,
    override val createdViaEmail: Boolean,
    override val databaseId: Option[Int],
    deletions: Int,
    override val editor: ActorTO,
    headRef: RefTO,
    @javax.validation.constraints.NotNull
    headRefName: String,
    @javax.validation.constraints.NotNull
    headRefOid: String,
    headRepository: RepositoryTO,
    headRepositoryOwner: RepositoryOwnerTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    override val includesCreatedEdit: Boolean,
    isCrossRepository: Boolean,
    override val lastEditedAt: String,
    override val locked: Boolean,
    maintainerCanModify: Boolean,
    mergeCommit: CommitTO,
    @javax.validation.constraints.NotNull
    mergeable: MergeableStateTO,
    merged: Boolean,
    mergedAt: String,
    mergedBy: ActorTO,
    milestone: MilestoneTO,
    number: Int,
    @javax.validation.constraints.NotNull
    permalink: String,
    potentialMergeCommit: CommitTO,
    override val publishedAt: String,
    @javax.validation.constraints.NotNull
    override val reactionGroups: Seq[ReactionGroupTO],
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    revertResourcePath: String,
    @javax.validation.constraints.NotNull
    revertUrl: String,
    @javax.validation.constraints.NotNull
    state: PullRequestStateTO,
    @javax.validation.constraints.NotNull
    suggestedReviewers: Seq[SuggestedReviewerTO],
    @javax.validation.constraints.NotNull
    title: String,
    @javax.validation.constraints.NotNull
    override val updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    viewerCanApplySuggestion: Boolean,
    override val viewerCanReact: Boolean,
    override val viewerCanSubscribe: Boolean,
    override val viewerCanUpdate: Boolean,
    @javax.validation.constraints.NotNull
    override val viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO],
    override val viewerDidAuthor: Boolean,
    override val viewerSubscription: SubscriptionStateTO
) extends CloserTO with IssueOrPullRequestTO with ReferencedSubjectTO with SearchResultItemTO with RenamedTitleSubjectTO with ProjectCardItemTO with MilestoneItemTO with SubscribableTO with UniformResourceLocatableTO with UpdatableCommentTO with ClosableTO with LockableTO with NodeTO with LabelableTO with ReactableTO with RepositoryNodeTO with AssignableTO with CommentTO with UpdatableTO {

    override def toString(): String = {
        Seq(
            if (activeLockReason != null) "activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason) else "",
            "additions: " + GraphQLRequestSerializer.getEntry(additions),
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (authorAssociation != null) "authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation) else "",
            if (baseRef != null) "baseRef: " + GraphQLRequestSerializer.getEntry(baseRef) else "",
            if (baseRefName != null) "baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName) else "",
            if (baseRefOid != null) "baseRefOid: " + GraphQLRequestSerializer.getEntry(baseRefOid) else "",
            if (baseRepository != null) "baseRepository: " + GraphQLRequestSerializer.getEntry(baseRepository) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            if (bodyText != null) "bodyText: " + GraphQLRequestSerializer.getEntry(bodyText) else "",
            "changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles),
            "closed: " + GraphQLRequestSerializer.getEntry(closed),
            if (closedAt != null) "closedAt: " + GraphQLRequestSerializer.getEntry(closedAt) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            "createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail),
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            "deletions: " + GraphQLRequestSerializer.getEntry(deletions),
            if (editor != null) "editor: " + GraphQLRequestSerializer.getEntry(editor) else "",
            if (headRef != null) "headRef: " + GraphQLRequestSerializer.getEntry(headRef) else "",
            if (headRefName != null) "headRefName: " + GraphQLRequestSerializer.getEntry(headRefName) else "",
            if (headRefOid != null) "headRefOid: " + GraphQLRequestSerializer.getEntry(headRefOid) else "",
            if (headRepository != null) "headRepository: " + GraphQLRequestSerializer.getEntry(headRepository) else "",
            if (headRepositoryOwner != null) "headRepositoryOwner: " + GraphQLRequestSerializer.getEntry(headRepositoryOwner) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit),
            "isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository),
            if (lastEditedAt != null) "lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt) else "",
            "locked: " + GraphQLRequestSerializer.getEntry(locked),
            "maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify),
            if (mergeCommit != null) "mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit) else "",
            if (mergeable != null) "mergeable: " + GraphQLRequestSerializer.getEntry(mergeable) else "",
            "merged: " + GraphQLRequestSerializer.getEntry(merged),
            if (mergedAt != null) "mergedAt: " + GraphQLRequestSerializer.getEntry(mergedAt) else "",
            if (mergedBy != null) "mergedBy: " + GraphQLRequestSerializer.getEntry(mergedBy) else "",
            if (milestone != null) "milestone: " + GraphQLRequestSerializer.getEntry(milestone) else "",
            "number: " + GraphQLRequestSerializer.getEntry(number),
            if (permalink != null) "permalink: " + GraphQLRequestSerializer.getEntry(permalink) else "",
            if (potentialMergeCommit != null) "potentialMergeCommit: " + GraphQLRequestSerializer.getEntry(potentialMergeCommit) else "",
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (reactionGroups != null) "reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups.asJava) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (revertResourcePath != null) "revertResourcePath: " + GraphQLRequestSerializer.getEntry(revertResourcePath) else "",
            if (revertUrl != null) "revertUrl: " + GraphQLRequestSerializer.getEntry(revertUrl) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (suggestedReviewers != null) "suggestedReviewers: " + GraphQLRequestSerializer.getEntry(suggestedReviewers.asJava) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanApplySuggestion: " + GraphQLRequestSerializer.getEntry(viewerCanApplySuggestion),
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
        val that = obj.asInstanceOf[PullRequestTO]
        Objects.equals(activeLockReason, that.activeLockReason) &&
        Objects.equals(additions, that.additions) &&
        Objects.equals(author, that.author) &&
        Objects.equals(authorAssociation, that.authorAssociation) &&
        Objects.equals(baseRef, that.baseRef) &&
        Objects.equals(baseRefName, that.baseRefName) &&
        Objects.equals(baseRefOid, that.baseRefOid) &&
        Objects.equals(baseRepository, that.baseRepository) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bodyHTML, that.bodyHTML) &&
        Objects.equals(bodyText, that.bodyText) &&
        Objects.equals(changedFiles, that.changedFiles) &&
        Objects.equals(closed, that.closed) &&
        Objects.equals(closedAt, that.closedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(createdViaEmail, that.createdViaEmail) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(deletions, that.deletions) &&
        Objects.equals(editor, that.editor) &&
        Objects.equals(headRef, that.headRef) &&
        Objects.equals(headRefName, that.headRefName) &&
        Objects.equals(headRefOid, that.headRefOid) &&
        Objects.equals(headRepository, that.headRepository) &&
        Objects.equals(headRepositoryOwner, that.headRepositoryOwner) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includesCreatedEdit, that.includesCreatedEdit) &&
        Objects.equals(isCrossRepository, that.isCrossRepository) &&
        Objects.equals(lastEditedAt, that.lastEditedAt) &&
        Objects.equals(locked, that.locked) &&
        Objects.equals(maintainerCanModify, that.maintainerCanModify) &&
        Objects.equals(mergeCommit, that.mergeCommit) &&
        Objects.equals(mergeable, that.mergeable) &&
        Objects.equals(merged, that.merged) &&
        Objects.equals(mergedAt, that.mergedAt) &&
        Objects.equals(mergedBy, that.mergedBy) &&
        Objects.equals(milestone, that.milestone) &&
        Objects.equals(number, that.number) &&
        Objects.equals(permalink, that.permalink) &&
        Objects.equals(potentialMergeCommit, that.potentialMergeCommit) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(reactionGroups, that.reactionGroups) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(revertResourcePath, that.revertResourcePath) &&
        Objects.equals(revertUrl, that.revertUrl) &&
        Objects.equals(state, that.state) &&
        Objects.equals(suggestedReviewers, that.suggestedReviewers) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerCanApplySuggestion, that.viewerCanApplySuggestion) &&
        Objects.equals(viewerCanReact, that.viewerCanReact) &&
        Objects.equals(viewerCanSubscribe, that.viewerCanSubscribe) &&
        Objects.equals(viewerCanUpdate, that.viewerCanUpdate) &&
        Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons) &&
        Objects.equals(viewerDidAuthor, that.viewerDidAuthor) &&
        Objects.equals(viewerSubscription, that.viewerSubscription)
    }

    override def hashCode(): Int = {
        Objects.hash(activeLockReason, additions, author, authorAssociation, baseRef, baseRefName, baseRefOid, baseRepository, body, bodyHTML, bodyText, changedFiles, closed, closedAt, createdAt, createdViaEmail, databaseId, deletions, editor, headRef, headRefName, headRefOid, headRepository, headRepositoryOwner, id, includesCreatedEdit, isCrossRepository, lastEditedAt, locked, maintainerCanModify, mergeCommit, mergeable, merged, mergedAt, mergedBy, milestone, number, permalink, potentialMergeCommit, publishedAt, reactionGroups, repository, resourcePath, revertResourcePath, revertUrl, state, suggestedReviewers, title, updatedAt, url, viewerCanApplySuggestion, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)
    }
}

object PullRequestTO {

    def builder(): PullRequestTO.Builder = new Builder()

    class Builder {

        private var activeLockReason: LockReasonTO = _
        private var additions: Int = _
        private var author: ActorTO = _
        private var authorAssociation: CommentAuthorAssociationTO = _
        private var baseRef: RefTO = _
        private var baseRefName: String = _
        private var baseRefOid: String = _
        private var baseRepository: RepositoryTO = _
        private var body: String = _
        private var bodyHTML: String = _
        private var bodyText: String = _
        private var changedFiles: Int = _
        private var closed: Boolean = _
        private var closedAt: String = _
        private var createdAt: String = _
        private var createdViaEmail: Boolean = _
        private var databaseId: Option[Int] = _
        private var deletions: Int = _
        private var editor: ActorTO = _
        private var headRef: RefTO = _
        private var headRefName: String = _
        private var headRefOid: String = _
        private var headRepository: RepositoryTO = _
        private var headRepositoryOwner: RepositoryOwnerTO = _
        private var id: String = _
        private var includesCreatedEdit: Boolean = _
        private var isCrossRepository: Boolean = _
        private var lastEditedAt: String = _
        private var locked: Boolean = _
        private var maintainerCanModify: Boolean = _
        private var mergeCommit: CommitTO = _
        private var mergeable: MergeableStateTO = _
        private var merged: Boolean = _
        private var mergedAt: String = _
        private var mergedBy: ActorTO = _
        private var milestone: MilestoneTO = _
        private var number: Int = _
        private var permalink: String = _
        private var potentialMergeCommit: CommitTO = _
        private var publishedAt: String = _
        private var reactionGroups: Seq[ReactionGroupTO] = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var revertResourcePath: String = _
        private var revertUrl: String = _
        private var state: PullRequestStateTO = _
        private var suggestedReviewers: Seq[SuggestedReviewerTO] = _
        private var title: String = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanApplySuggestion: Boolean = _
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

        def setAdditions(additions: Int): Builder = {
            this.additions = additions
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

        def setBaseRef(baseRef: RefTO): Builder = {
            this.baseRef = baseRef
            this
        }

        def setBaseRefName(baseRefName: String): Builder = {
            this.baseRefName = baseRefName
            this
        }

        def setBaseRefOid(baseRefOid: String): Builder = {
            this.baseRefOid = baseRefOid
            this
        }

        def setBaseRepository(baseRepository: RepositoryTO): Builder = {
            this.baseRepository = baseRepository
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

        def setChangedFiles(changedFiles: Int): Builder = {
            this.changedFiles = changedFiles
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

        def setDeletions(deletions: Int): Builder = {
            this.deletions = deletions
            this
        }

        def setEditor(editor: ActorTO): Builder = {
            this.editor = editor
            this
        }

        def setHeadRef(headRef: RefTO): Builder = {
            this.headRef = headRef
            this
        }

        def setHeadRefName(headRefName: String): Builder = {
            this.headRefName = headRefName
            this
        }

        def setHeadRefOid(headRefOid: String): Builder = {
            this.headRefOid = headRefOid
            this
        }

        def setHeadRepository(headRepository: RepositoryTO): Builder = {
            this.headRepository = headRepository
            this
        }

        def setHeadRepositoryOwner(headRepositoryOwner: RepositoryOwnerTO): Builder = {
            this.headRepositoryOwner = headRepositoryOwner
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

        def setIsCrossRepository(isCrossRepository: Boolean): Builder = {
            this.isCrossRepository = isCrossRepository
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

        def setMaintainerCanModify(maintainerCanModify: Boolean): Builder = {
            this.maintainerCanModify = maintainerCanModify
            this
        }

        def setMergeCommit(mergeCommit: CommitTO): Builder = {
            this.mergeCommit = mergeCommit
            this
        }

        def setMergeable(mergeable: MergeableStateTO): Builder = {
            this.mergeable = mergeable
            this
        }

        def setMerged(merged: Boolean): Builder = {
            this.merged = merged
            this
        }

        def setMergedAt(mergedAt: String): Builder = {
            this.mergedAt = mergedAt
            this
        }

        def setMergedBy(mergedBy: ActorTO): Builder = {
            this.mergedBy = mergedBy
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

        def setPermalink(permalink: String): Builder = {
            this.permalink = permalink
            this
        }

        def setPotentialMergeCommit(potentialMergeCommit: CommitTO): Builder = {
            this.potentialMergeCommit = potentialMergeCommit
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

        def setRevertResourcePath(revertResourcePath: String): Builder = {
            this.revertResourcePath = revertResourcePath
            this
        }

        def setRevertUrl(revertUrl: String): Builder = {
            this.revertUrl = revertUrl
            this
        }

        def setState(state: PullRequestStateTO): Builder = {
            this.state = state
            this
        }

        def setSuggestedReviewers(suggestedReviewers: Seq[SuggestedReviewerTO]): Builder = {
            this.suggestedReviewers = suggestedReviewers
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

        def setViewerCanApplySuggestion(viewerCanApplySuggestion: Boolean): Builder = {
            this.viewerCanApplySuggestion = viewerCanApplySuggestion
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

        def build(): PullRequestTO = new PullRequestTO(activeLockReason, additions, author, authorAssociation, baseRef, baseRefName, baseRefOid, baseRepository, body, bodyHTML, bodyText, changedFiles, closed, closedAt, createdAt, createdViaEmail, databaseId, deletions, editor, headRef, headRefName, headRefOid, headRepository, headRepositoryOwner, id, includesCreatedEdit, isCrossRepository, lastEditedAt, locked, maintainerCanModify, mergeCommit, mergeable, merged, mergedAt, mergedBy, milestone, number, permalink, potentialMergeCommit, publishedAt, reactionGroups, repository, resourcePath, revertResourcePath, revertUrl, state, suggestedReviewers, title, updatedAt, url, viewerCanApplySuggestion, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)

    }
}
