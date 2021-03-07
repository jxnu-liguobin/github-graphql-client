package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestTimelineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestTimelineItemResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineItemResponseProjection() {
    }

    @Override
    public PullRequestTimelineItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineItemResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public PullRequestTimelineItemResponseProjection onDeploymentEnvironmentChangedEvent(DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        return onDeploymentEnvironmentChangedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onDeploymentEnvironmentChangedEvent(String alias, DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onReviewRequestedEvent(ReviewRequestedEventResponseProjection subProjection) {
        return onReviewRequestedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onReviewRequestedEvent(String alias, ReviewRequestedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onDeployedEvent(DeployedEventResponseProjection subProjection) {
        return onDeployedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onDeployedEvent(String alias, DeployedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onUserBlockedEvent(UserBlockedEventResponseProjection subProjection) {
        return onUserBlockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onUserBlockedEvent(String alias, UserBlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onReviewDismissedEvent(ReviewDismissedEventResponseProjection subProjection) {
        return onReviewDismissedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onReviewDismissedEvent(String alias, ReviewDismissedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onUnsubscribedEvent(UnsubscribedEventResponseProjection subProjection) {
        return onUnsubscribedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onUnsubscribedEvent(String alias, UnsubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onLabeledEvent(LabeledEventResponseProjection subProjection) {
        return onLabeledEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onLabeledEvent(String alias, LabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onSubscribedEvent(SubscribedEventResponseProjection subProjection) {
        return onSubscribedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onSubscribedEvent(String alias, SubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onDemilestonedEvent(DemilestonedEventResponseProjection subProjection) {
        return onDemilestonedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onDemilestonedEvent(String alias, DemilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onLockedEvent(LockedEventResponseProjection subProjection) {
        return onLockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onLockedEvent(String alias, LockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onReferencedEvent(ReferencedEventResponseProjection subProjection) {
        return onReferencedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onReferencedEvent(String alias, ReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onReviewRequestRemovedEvent(ReviewRequestRemovedEventResponseProjection subProjection) {
        return onReviewRequestRemovedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onReviewRequestRemovedEvent(String alias, ReviewRequestRemovedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onUnlabeledEvent(UnlabeledEventResponseProjection subProjection) {
        return onUnlabeledEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onUnlabeledEvent(String alias, UnlabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onCommitCommentThread(CommitCommentThreadResponseProjection subProjection) {
        return onCommitCommentThread(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onCommitCommentThread(String alias, CommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onMilestonedEvent(MilestonedEventResponseProjection subProjection) {
        return onMilestonedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onMilestonedEvent(String alias, MilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onRenamedTitleEvent(RenamedTitleEventResponseProjection subProjection) {
        return onRenamedTitleEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onRenamedTitleEvent(String alias, RenamedTitleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onBaseRefForcePushedEvent(BaseRefForcePushedEventResponseProjection subProjection) {
        return onBaseRefForcePushedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onBaseRefForcePushedEvent(String alias, BaseRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onReopenedEvent(ReopenedEventResponseProjection subProjection) {
        return onReopenedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onReopenedEvent(String alias, ReopenedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onUnlockedEvent(UnlockedEventResponseProjection subProjection) {
        return onUnlockedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onUnlockedEvent(String alias, UnlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onHeadRefDeletedEvent(HeadRefDeletedEventResponseProjection subProjection) {
        return onHeadRefDeletedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onHeadRefDeletedEvent(String alias, HeadRefDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onUnassignedEvent(UnassignedEventResponseProjection subProjection) {
        return onUnassignedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onUnassignedEvent(String alias, UnassignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onHeadRefForcePushedEvent(HeadRefForcePushedEventResponseProjection subProjection) {
        return onHeadRefForcePushedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onHeadRefForcePushedEvent(String alias, HeadRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onAssignedEvent(AssignedEventResponseProjection subProjection) {
        return onAssignedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onAssignedEvent(String alias, AssignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onHeadRefRestoredEvent(HeadRefRestoredEventResponseProjection subProjection) {
        return onHeadRefRestoredEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onHeadRefRestoredEvent(String alias, HeadRefRestoredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onMergedEvent(MergedEventResponseProjection subProjection) {
        return onMergedEvent(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onMergedEvent(String alias, MergedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReviewThread(PullRequestReviewThreadResponseProjection subProjection) {
        return onPullRequestReviewThread(null, subProjection);
    }

    public PullRequestTimelineItemResponseProjection onPullRequestReviewThread(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
