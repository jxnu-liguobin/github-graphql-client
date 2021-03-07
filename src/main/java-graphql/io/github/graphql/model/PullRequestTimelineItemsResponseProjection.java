package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestTimelineItems
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestTimelineItemsResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineItemsResponseProjection() {
    }

    @Override
    public PullRequestTimelineItemsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineItemsResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onDeploymentEnvironmentChangedEvent(DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        return onDeploymentEnvironmentChangedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onDeploymentEnvironmentChangedEvent(String alias, DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReviewRequestedEvent(ReviewRequestedEventResponseProjection subProjection) {
        return onReviewRequestedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReviewRequestedEvent(String alias, ReviewRequestedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onAddedToProjectEvent(AddedToProjectEventResponseProjection subProjection) {
        return onAddedToProjectEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onAddedToProjectEvent(String alias, AddedToProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onBaseRefChangedEvent(BaseRefChangedEventResponseProjection subProjection) {
        return onBaseRefChangedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onBaseRefChangedEvent(String alias, BaseRefChangedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestCommitCommentThread(PullRequestCommitCommentThreadResponseProjection subProjection) {
        return onPullRequestCommitCommentThread(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestCommitCommentThread(String alias, PullRequestCommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onCommentDeletedEvent(CommentDeletedEventResponseProjection subProjection) {
        return onCommentDeletedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onCommentDeletedEvent(String alias, CommentDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestCommit(PullRequestCommitResponseProjection subProjection) {
        return onPullRequestCommit(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestCommit(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onDeployedEvent(DeployedEventResponseProjection subProjection) {
        return onDeployedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onDeployedEvent(String alias, DeployedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUserBlockedEvent(UserBlockedEventResponseProjection subProjection) {
        return onUserBlockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUserBlockedEvent(String alias, UserBlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReviewDismissedEvent(ReviewDismissedEventResponseProjection subProjection) {
        return onReviewDismissedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReviewDismissedEvent(String alias, ReviewDismissedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onMentionedEvent(MentionedEventResponseProjection subProjection) {
        return onMentionedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onMentionedEvent(String alias, MentionedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUnsubscribedEvent(UnsubscribedEventResponseProjection subProjection) {
        return onUnsubscribedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUnsubscribedEvent(String alias, UnsubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onLabeledEvent(LabeledEventResponseProjection subProjection) {
        return onLabeledEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onLabeledEvent(String alias, LabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onMarkedAsDuplicateEvent(MarkedAsDuplicateEventResponseProjection subProjection) {
        return onMarkedAsDuplicateEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onMarkedAsDuplicateEvent(String alias, MarkedAsDuplicateEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onSubscribedEvent(SubscribedEventResponseProjection subProjection) {
        return onSubscribedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onSubscribedEvent(String alias, SubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onDemilestonedEvent(DemilestonedEventResponseProjection subProjection) {
        return onDemilestonedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onDemilestonedEvent(String alias, DemilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onLockedEvent(LockedEventResponseProjection subProjection) {
        return onLockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onLockedEvent(String alias, LockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReferencedEvent(ReferencedEventResponseProjection subProjection) {
        return onReferencedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReferencedEvent(String alias, ReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onTransferredEvent(TransferredEventResponseProjection subProjection) {
        return onTransferredEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onTransferredEvent(String alias, TransferredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onMovedColumnsInProjectEvent(MovedColumnsInProjectEventResponseProjection subProjection) {
        return onMovedColumnsInProjectEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onMovedColumnsInProjectEvent(String alias, MovedColumnsInProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReviewRequestRemovedEvent(ReviewRequestRemovedEventResponseProjection subProjection) {
        return onReviewRequestRemovedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReviewRequestRemovedEvent(String alias, ReviewRequestRemovedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUnlabeledEvent(UnlabeledEventResponseProjection subProjection) {
        return onUnlabeledEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUnlabeledEvent(String alias, UnlabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUnpinnedEvent(UnpinnedEventResponseProjection subProjection) {
        return onUnpinnedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUnpinnedEvent(String alias, UnpinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onMilestonedEvent(MilestonedEventResponseProjection subProjection) {
        return onMilestonedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onMilestonedEvent(String alias, MilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onRemovedFromProjectEvent(RemovedFromProjectEventResponseProjection subProjection) {
        return onRemovedFromProjectEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onRemovedFromProjectEvent(String alias, RemovedFromProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onRenamedTitleEvent(RenamedTitleEventResponseProjection subProjection) {
        return onRenamedTitleEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onRenamedTitleEvent(String alias, RenamedTitleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onBaseRefForcePushedEvent(BaseRefForcePushedEventResponseProjection subProjection) {
        return onBaseRefForcePushedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onBaseRefForcePushedEvent(String alias, BaseRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReopenedEvent(ReopenedEventResponseProjection subProjection) {
        return onReopenedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReopenedEvent(String alias, ReopenedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestRevisionMarker(PullRequestRevisionMarkerResponseProjection subProjection) {
        return onPullRequestRevisionMarker(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestRevisionMarker(String alias, PullRequestRevisionMarkerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestRevisionMarker").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUnlockedEvent(UnlockedEventResponseProjection subProjection) {
        return onUnlockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUnlockedEvent(String alias, UnlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefDeletedEvent(HeadRefDeletedEventResponseProjection subProjection) {
        return onHeadRefDeletedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefDeletedEvent(String alias, HeadRefDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onUnassignedEvent(UnassignedEventResponseProjection subProjection) {
        return onUnassignedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onUnassignedEvent(String alias, UnassignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onConvertedNoteToIssueEvent(ConvertedNoteToIssueEventResponseProjection subProjection) {
        return onConvertedNoteToIssueEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onConvertedNoteToIssueEvent(String alias, ConvertedNoteToIssueEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefForcePushedEvent(HeadRefForcePushedEventResponseProjection subProjection) {
        return onHeadRefForcePushedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefForcePushedEvent(String alias, HeadRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onReadyForReviewEvent(ReadyForReviewEventResponseProjection subProjection) {
        return onReadyForReviewEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onReadyForReviewEvent(String alias, ReadyForReviewEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onAssignedEvent(AssignedEventResponseProjection subProjection) {
        return onAssignedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onAssignedEvent(String alias, AssignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefRestoredEvent(HeadRefRestoredEventResponseProjection subProjection) {
        return onHeadRefRestoredEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onHeadRefRestoredEvent(String alias, HeadRefRestoredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onMergedEvent(MergedEventResponseProjection subProjection) {
        return onMergedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onMergedEvent(String alias, MergedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPinnedEvent(PinnedEventResponseProjection subProjection) {
        return onPinnedEvent(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPinnedEvent(String alias, PinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestReviewThread(PullRequestReviewThreadResponseProjection subProjection) {
        return onPullRequestReviewThread(null, subProjection);
    }

    public PullRequestTimelineItemsResponseProjection onPullRequestReviewThread(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineItemsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
