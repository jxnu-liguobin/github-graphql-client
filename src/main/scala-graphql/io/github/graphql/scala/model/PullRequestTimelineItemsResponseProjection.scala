package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestTimelineItems
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class PullRequestTimelineItemsResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineItemsResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineItemsResponseProjection = {
        this.typename()
        this
    }

    def onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onDeploymentEnvironmentChangedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeploymentEnvironmentChangedEvent(alias: String, subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReviewRequestedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestedEvent(alias: String, subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        this
    }

    def onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onAddedToProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onAddedToProjectEvent(alias: String, subProjection: AddedToProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onBaseRefChangedEvent(subProjection: BaseRefChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onBaseRefChangedEvent(null.asInstanceOf[String], subProjection)
    }

    def onBaseRefChangedEvent(alias: String, subProjection: BaseRefChangedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPullRequestCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommitCommentThread(alias: String, subProjection: PullRequestCommitCommentThreadResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onCommentDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCommentDeletedEvent(alias: String, subProjection: CommentDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPullRequestCommit(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommit(alias: String, subProjection: PullRequestCommitResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        this
    }

    def onDeployedEvent(subProjection: DeployedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onDeployedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeployedEvent(alias: String, subProjection: DeployedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUserBlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUserBlockedEvent(alias: String, subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReviewDismissedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewDismissedEvent(alias: String, subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMentionedEvent(subProjection: MentionedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onMentionedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMentionedEvent(alias: String, subProjection: MentionedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUnsubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnsubscribedEvent(alias: String, subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLabeledEvent(subProjection: LabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onLabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onLabeledEvent(alias: String, subProjection: LabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onMarkedAsDuplicateEvent(null.asInstanceOf[String], subProjection)
    }

    def onMarkedAsDuplicateEvent(alias: String, subProjection: MarkedAsDuplicateEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        this
    }

    def onSubscribedEvent(subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onSubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onSubscribedEvent(alias: String, subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onDemilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDemilestonedEvent(alias: String, subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLockedEvent(subProjection: LockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onLockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onLockedEvent(alias: String, subProjection: LockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReferencedEvent(subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReferencedEvent(alias: String, subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onTransferredEvent(subProjection: TransferredEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onTransferredEvent(null.asInstanceOf[String], subProjection)
    }

    def onTransferredEvent(alias: String, subProjection: TransferredEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        this
    }

    def onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onMovedColumnsInProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onMovedColumnsInProjectEvent(alias: String, subProjection: MovedColumnsInProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReviewRequestRemovedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestRemovedEvent(alias: String, subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUnlabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlabeledEvent(alias: String, subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUnpinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnpinnedEvent(alias: String, subProjection: UnpinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMilestonedEvent(subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onMilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMilestonedEvent(alias: String, subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onRemovedFromProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onRemovedFromProjectEvent(alias: String, subProjection: RemovedFromProjectEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onRenamedTitleEvent(null.asInstanceOf[String], subProjection)
    }

    def onRenamedTitleEvent(alias: String, subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        this
    }

    def onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onBaseRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onBaseRefForcePushedEvent(alias: String, subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReopenedEvent(subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReopenedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReopenedEvent(alias: String, subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestRevisionMarker(subProjection: PullRequestRevisionMarkerResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPullRequestRevisionMarker(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestRevisionMarker(alias: String, subProjection: PullRequestRevisionMarkerResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestRevisionMarker").alias(alias).projection(subProjection))
        this
    }

    def onUnlockedEvent(subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUnlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlockedEvent(alias: String, subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onHeadRefDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefDeletedEvent(alias: String, subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnassignedEvent(subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onUnassignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnassignedEvent(alias: String, subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onConvertedNoteToIssueEvent(null.asInstanceOf[String], subProjection)
    }

    def onConvertedNoteToIssueEvent(alias: String, subProjection: ConvertedNoteToIssueEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onHeadRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefForcePushedEvent(alias: String, subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onReadyForReviewEvent(null.asInstanceOf[String], subProjection)
    }

    def onReadyForReviewEvent(alias: String, subProjection: ReadyForReviewEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onAssignedEvent(subProjection: AssignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onAssignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onAssignedEvent(alias: String, subProjection: AssignedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onHeadRefRestoredEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefRestoredEvent(alias: String, subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        this
    }

    def onMergedEvent(subProjection: MergedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onMergedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMergedEvent(alias: String, subProjection: MergedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPinnedEvent(subProjection: PinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onPinnedEvent(alias: String, subProjection: PinnedEventResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemsResponseProjection = {
        onPullRequestReviewThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewThread(alias: String, subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestTimelineItemsResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestTimelineItemsResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
