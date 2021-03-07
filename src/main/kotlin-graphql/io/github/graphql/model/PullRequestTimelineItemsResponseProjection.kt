package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItems
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class PullRequestTimelineItemsResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineItemsResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineItemsResponseProjection {
        this.typename()
        return this
    }

    fun onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onDeploymentEnvironmentChangedEvent(null, subProjection)

    fun onDeploymentEnvironmentChangedEvent(alias: String?, subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemsResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReviewRequestedEvent(null, subProjection)

    fun onReviewRequestedEvent(alias: String?, subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = onAddedToProjectEvent(null, subProjection)

    fun onAddedToProjectEvent(alias: String?, subProjection: AddedToProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onBaseRefChangedEvent(subProjection: BaseRefChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onBaseRefChangedEvent(null, subProjection)

    fun onBaseRefChangedEvent(alias: String?, subProjection: BaseRefChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): PullRequestTimelineItemsResponseProjection = onPullRequestCommitCommentThread(null, subProjection)

    fun onPullRequestCommitCommentThread(alias: String?, subProjection: PullRequestCommitCommentThreadResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onCommentDeletedEvent(null, subProjection)

    fun onCommentDeletedEvent(alias: String?, subProjection: CommentDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): PullRequestTimelineItemsResponseProjection = onPullRequestCommit(null, subProjection)

    fun onPullRequestCommit(alias: String?, subProjection: PullRequestCommitResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        return this
    }

    fun onDeployedEvent(subProjection: DeployedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onDeployedEvent(null, subProjection)

    fun onDeployedEvent(alias: String?, subProjection: DeployedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUserBlockedEvent(null, subProjection)

    fun onUserBlockedEvent(alias: String?, subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReviewDismissedEvent(null, subProjection)

    fun onReviewDismissedEvent(alias: String?, subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMentionedEvent(subProjection: MentionedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onMentionedEvent(null, subProjection)

    fun onMentionedEvent(alias: String?, subProjection: MentionedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUnsubscribedEvent(null, subProjection)

    fun onUnsubscribedEvent(alias: String?, subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLabeledEvent(subProjection: LabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = onLabeledEvent(null, subProjection)

    fun onLabeledEvent(alias: String?, subProjection: LabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): PullRequestTimelineItemsResponseProjection = onMarkedAsDuplicateEvent(null, subProjection)

    fun onMarkedAsDuplicateEvent(alias: String?, subProjection: MarkedAsDuplicateEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSubscribedEvent(subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onSubscribedEvent(null, subProjection)

    fun onSubscribedEvent(alias: String?, subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onDemilestonedEvent(null, subProjection)

    fun onDemilestonedEvent(alias: String?, subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLockedEvent(subProjection: LockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onLockedEvent(null, subProjection)

    fun onLockedEvent(alias: String?, subProjection: LockedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReferencedEvent(subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReferencedEvent(null, subProjection)

    fun onReferencedEvent(alias: String?, subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onTransferredEvent(subProjection: TransferredEventResponseProjection): PullRequestTimelineItemsResponseProjection = onTransferredEvent(null, subProjection)

    fun onTransferredEvent(alias: String?, subProjection: TransferredEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = onMovedColumnsInProjectEvent(null, subProjection)

    fun onMovedColumnsInProjectEvent(alias: String?, subProjection: MovedColumnsInProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReviewRequestRemovedEvent(null, subProjection)

    fun onReviewRequestRemovedEvent(alias: String?, subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUnlabeledEvent(null, subProjection)

    fun onUnlabeledEvent(alias: String?, subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUnpinnedEvent(null, subProjection)

    fun onUnpinnedEvent(alias: String?, subProjection: UnpinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestonedEvent(subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onMilestonedEvent(null, subProjection)

    fun onMilestonedEvent(alias: String?, subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = onRemovedFromProjectEvent(null, subProjection)

    fun onRemovedFromProjectEvent(alias: String?, subProjection: RemovedFromProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemsResponseProjection = onRenamedTitleEvent(null, subProjection)

    fun onRenamedTitleEvent(alias: String?, subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onBaseRefForcePushedEvent(null, subProjection)

    fun onBaseRefForcePushedEvent(alias: String?, subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReopenedEvent(subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReopenedEvent(null, subProjection)

    fun onReopenedEvent(alias: String?, subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestRevisionMarker(subProjection: PullRequestRevisionMarkerResponseProjection): PullRequestTimelineItemsResponseProjection = onPullRequestRevisionMarker(null, subProjection)

    fun onPullRequestRevisionMarker(alias: String?, subProjection: PullRequestRevisionMarkerResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestRevisionMarker").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlockedEvent(subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUnlockedEvent(null, subProjection)

    fun onUnlockedEvent(alias: String?, subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onHeadRefDeletedEvent(null, subProjection)

    fun onHeadRefDeletedEvent(alias: String?, subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnassignedEvent(subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onUnassignedEvent(null, subProjection)

    fun onUnassignedEvent(alias: String?, subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): PullRequestTimelineItemsResponseProjection = onConvertedNoteToIssueEvent(null, subProjection)

    fun onConvertedNoteToIssueEvent(alias: String?, subProjection: ConvertedNoteToIssueEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onHeadRefForcePushedEvent(null, subProjection)

    fun onHeadRefForcePushedEvent(alias: String?, subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): PullRequestTimelineItemsResponseProjection = onReadyForReviewEvent(null, subProjection)

    fun onReadyForReviewEvent(alias: String?, subProjection: ReadyForReviewEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): PullRequestTimelineItemsResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onAssignedEvent(subProjection: AssignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onAssignedEvent(null, subProjection)

    fun onAssignedEvent(alias: String?, subProjection: AssignedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemsResponseProjection = onHeadRefRestoredEvent(null, subProjection)

    fun onHeadRefRestoredEvent(alias: String?, subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMergedEvent(subProjection: MergedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onMergedEvent(null, subProjection)

    fun onMergedEvent(alias: String?, subProjection: MergedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPinnedEvent(subProjection: PinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = onPinnedEvent(null, subProjection)

    fun onPinnedEvent(alias: String?, subProjection: PinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemsResponseProjection = onPullRequestReviewThread(null, subProjection)

    fun onPullRequestReviewThread(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestTimelineItemsResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
