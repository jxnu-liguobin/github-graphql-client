package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestTO(
    override
    val activeLockReason: LockReasonTO?,
    val additions: Int,
    override
    val author: ActorTO?,
    override
    val authorAssociation: CommentAuthorAssociationTO,
    val baseRef: RefTO?,
    val baseRefName: String,
    val baseRefOid: String,
    val baseRepository: RepositoryTO?,
    override
    val body: String,
    override
    val bodyHTML: String,
    override
    val bodyText: String,
    val changedFiles: Int,
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
    val deletions: Int,
    override
    val editor: ActorTO?,
    val headRef: RefTO?,
    val headRefName: String,
    val headRefOid: String,
    val headRepository: RepositoryTO?,
    val headRepositoryOwner: RepositoryOwnerTO?,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    val isCrossRepository: Boolean,
    override
    val lastEditedAt: String?,
    override
    val locked: Boolean,
    val maintainerCanModify: Boolean,
    val mergeCommit: CommitTO?,
    val mergeable: MergeableStateTO,
    val merged: Boolean,
    val mergedAt: String?,
    val mergedBy: ActorTO?,
    val milestone: MilestoneTO?,
    val number: Int,
    val permalink: String,
    val potentialMergeCommit: CommitTO?,
    override
    val publishedAt: String?,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    override
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val revertResourcePath: String,
    val revertUrl: String,
    val state: PullRequestStateTO,
    val suggestedReviewers: List<SuggestedReviewerTO?>,
    val title: String,
    override
    val updatedAt: String,
    override
    val url: String,
    val viewerCanApplySuggestion: Boolean,
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
) : CloserTO, IssueOrPullRequestTO, ReferencedSubjectTO, SearchResultItemTO, RenamedTitleSubjectTO, ProjectCardItemTO, MilestoneItemTO, SubscribableTO, UniformResourceLocatableTO, UpdatableCommentTO, ClosableTO, LockableTO, NodeTO, LabelableTO, ReactableTO, RepositoryNodeTO, AssignableTO, CommentTO, UpdatableTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (activeLockReason != null) {
            joiner.add("activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason))
        }
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions))
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation))
        if (baseRef != null) {
            joiner.add("baseRef: " + GraphQLRequestSerializer.getEntry(baseRef))
        }
        joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName))
        joiner.add("baseRefOid: " + GraphQLRequestSerializer.getEntry(baseRefOid))
        if (baseRepository != null) {
            joiner.add("baseRepository: " + GraphQLRequestSerializer.getEntry(baseRepository))
        }
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText))
        joiner.add("changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles))
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions))
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        if (headRef != null) {
            joiner.add("headRef: " + GraphQLRequestSerializer.getEntry(headRef))
        }
        joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName))
        joiner.add("headRefOid: " + GraphQLRequestSerializer.getEntry(headRefOid))
        if (headRepository != null) {
            joiner.add("headRepository: " + GraphQLRequestSerializer.getEntry(headRepository))
        }
        if (headRepositoryOwner != null) {
            joiner.add("headRepositoryOwner: " + GraphQLRequestSerializer.getEntry(headRepositoryOwner))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked))
        joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify))
        if (mergeCommit != null) {
            joiner.add("mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit))
        }
        joiner.add("mergeable: " + GraphQLRequestSerializer.getEntry(mergeable))
        joiner.add("merged: " + GraphQLRequestSerializer.getEntry(merged))
        if (mergedAt != null) {
            joiner.add("mergedAt: " + GraphQLRequestSerializer.getEntry(mergedAt))
        }
        if (mergedBy != null) {
            joiner.add("mergedBy: " + GraphQLRequestSerializer.getEntry(mergedBy))
        }
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone))
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("permalink: " + GraphQLRequestSerializer.getEntry(permalink))
        if (potentialMergeCommit != null) {
            joiner.add("potentialMergeCommit: " + GraphQLRequestSerializer.getEntry(potentialMergeCommit))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("revertResourcePath: " + GraphQLRequestSerializer.getEntry(revertResourcePath))
        joiner.add("revertUrl: " + GraphQLRequestSerializer.getEntry(revertUrl))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("suggestedReviewers: " + GraphQLRequestSerializer.getEntry(suggestedReviewers))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanApplySuggestion: " + GraphQLRequestSerializer.getEntry(viewerCanApplySuggestion))
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
        private var additions: Int = 0
        private var author: ActorTO? = null
        private lateinit var authorAssociation: CommentAuthorAssociationTO
        private var baseRef: RefTO? = null
        private lateinit var baseRefName: String
        private lateinit var baseRefOid: String
        private var baseRepository: RepositoryTO? = null
        private lateinit var body: String
        private lateinit var bodyHTML: String
        private lateinit var bodyText: String
        private var changedFiles: Int = 0
        private var closed: Boolean = false
        private var closedAt: String? = null
        private lateinit var createdAt: String
        private var createdViaEmail: Boolean = false
        private var databaseId: Int? = null
        private var deletions: Int = 0
        private var editor: ActorTO? = null
        private var headRef: RefTO? = null
        private lateinit var headRefName: String
        private lateinit var headRefOid: String
        private var headRepository: RepositoryTO? = null
        private var headRepositoryOwner: RepositoryOwnerTO? = null
        private lateinit var id: String
        private var includesCreatedEdit: Boolean = false
        private var isCrossRepository: Boolean = false
        private var lastEditedAt: String? = null
        private var locked: Boolean = false
        private var maintainerCanModify: Boolean = false
        private var mergeCommit: CommitTO? = null
        private lateinit var mergeable: MergeableStateTO
        private var merged: Boolean = false
        private var mergedAt: String? = null
        private var mergedBy: ActorTO? = null
        private var milestone: MilestoneTO? = null
        private var number: Int = 0
        private lateinit var permalink: String
        private var potentialMergeCommit: CommitTO? = null
        private var publishedAt: String? = null
        private var reactionGroups: List<ReactionGroupTO>? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var revertResourcePath: String
        private lateinit var revertUrl: String
        private lateinit var state: PullRequestStateTO
        private lateinit var suggestedReviewers: List<SuggestedReviewerTO?>
        private lateinit var title: String
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanApplySuggestion: Boolean = false
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

        fun setAdditions(additions: Int): Builder {
            this.additions = additions
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

        fun setBaseRef(baseRef: RefTO?): Builder {
            this.baseRef = baseRef
            return this
        }

        fun setBaseRefName(baseRefName: String): Builder {
            this.baseRefName = baseRefName
            return this
        }

        fun setBaseRefOid(baseRefOid: String): Builder {
            this.baseRefOid = baseRefOid
            return this
        }

        fun setBaseRepository(baseRepository: RepositoryTO?): Builder {
            this.baseRepository = baseRepository
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

        fun setChangedFiles(changedFiles: Int): Builder {
            this.changedFiles = changedFiles
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

        fun setDeletions(deletions: Int): Builder {
            this.deletions = deletions
            return this
        }

        fun setEditor(editor: ActorTO?): Builder {
            this.editor = editor
            return this
        }

        fun setHeadRef(headRef: RefTO?): Builder {
            this.headRef = headRef
            return this
        }

        fun setHeadRefName(headRefName: String): Builder {
            this.headRefName = headRefName
            return this
        }

        fun setHeadRefOid(headRefOid: String): Builder {
            this.headRefOid = headRefOid
            return this
        }

        fun setHeadRepository(headRepository: RepositoryTO?): Builder {
            this.headRepository = headRepository
            return this
        }

        fun setHeadRepositoryOwner(headRepositoryOwner: RepositoryOwnerTO?): Builder {
            this.headRepositoryOwner = headRepositoryOwner
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

        fun setIsCrossRepository(isCrossRepository: Boolean): Builder {
            this.isCrossRepository = isCrossRepository
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

        fun setMaintainerCanModify(maintainerCanModify: Boolean): Builder {
            this.maintainerCanModify = maintainerCanModify
            return this
        }

        fun setMergeCommit(mergeCommit: CommitTO?): Builder {
            this.mergeCommit = mergeCommit
            return this
        }

        fun setMergeable(mergeable: MergeableStateTO): Builder {
            this.mergeable = mergeable
            return this
        }

        fun setMerged(merged: Boolean): Builder {
            this.merged = merged
            return this
        }

        fun setMergedAt(mergedAt: String?): Builder {
            this.mergedAt = mergedAt
            return this
        }

        fun setMergedBy(mergedBy: ActorTO?): Builder {
            this.mergedBy = mergedBy
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

        fun setPermalink(permalink: String): Builder {
            this.permalink = permalink
            return this
        }

        fun setPotentialMergeCommit(potentialMergeCommit: CommitTO?): Builder {
            this.potentialMergeCommit = potentialMergeCommit
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

        fun setRevertResourcePath(revertResourcePath: String): Builder {
            this.revertResourcePath = revertResourcePath
            return this
        }

        fun setRevertUrl(revertUrl: String): Builder {
            this.revertUrl = revertUrl
            return this
        }

        fun setState(state: PullRequestStateTO): Builder {
            this.state = state
            return this
        }

        fun setSuggestedReviewers(suggestedReviewers: List<SuggestedReviewerTO?>): Builder {
            this.suggestedReviewers = suggestedReviewers
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

        fun setViewerCanApplySuggestion(viewerCanApplySuggestion: Boolean): Builder {
            this.viewerCanApplySuggestion = viewerCanApplySuggestion
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

        fun build(): PullRequestTO {
            return PullRequestTO(activeLockReason, additions, author, authorAssociation, baseRef, baseRefName, baseRefOid, baseRepository, body, bodyHTML, bodyText, changedFiles, closed, closedAt, createdAt, createdViaEmail, databaseId, deletions, editor, headRef, headRefName, headRefOid, headRepository, headRepositoryOwner, id, includesCreatedEdit, isCrossRepository, lastEditedAt, locked, maintainerCanModify, mergeCommit, mergeable, merged, mergedAt, mergedBy, milestone, number, permalink, potentialMergeCommit, publishedAt, reactionGroups, repository, resourcePath, revertResourcePath, revertUrl, state, suggestedReviewers, title, updatedAt, url, viewerCanApplySuggestion, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription)
        }
    }
}
