package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
