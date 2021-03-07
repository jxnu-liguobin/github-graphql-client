package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueTimelineItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class IssueTimelineItemResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineItemResponseProjection() {
    }

    @Override
    public IssueTimelineItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineItemResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public IssueTimelineItemResponseProjection onUnlabeledEvent(UnlabeledEventResponseProjection subProjection) {
        return onUnlabeledEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onUnlabeledEvent(String alias, UnlabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onMilestonedEvent(MilestonedEventResponseProjection subProjection) {
        return onMilestonedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onMilestonedEvent(String alias, MilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onRenamedTitleEvent(RenamedTitleEventResponseProjection subProjection) {
        return onRenamedTitleEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onRenamedTitleEvent(String alias, RenamedTitleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onReopenedEvent(ReopenedEventResponseProjection subProjection) {
        return onReopenedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onReopenedEvent(String alias, ReopenedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onUnlockedEvent(UnlockedEventResponseProjection subProjection) {
        return onUnlockedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onUnlockedEvent(String alias, UnlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onUnassignedEvent(UnassignedEventResponseProjection subProjection) {
        return onUnassignedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onUnassignedEvent(String alias, UnassignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onUserBlockedEvent(UserBlockedEventResponseProjection subProjection) {
        return onUserBlockedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onUserBlockedEvent(String alias, UserBlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onUnsubscribedEvent(UnsubscribedEventResponseProjection subProjection) {
        return onUnsubscribedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onUnsubscribedEvent(String alias, UnsubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onAssignedEvent(AssignedEventResponseProjection subProjection) {
        return onAssignedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onAssignedEvent(String alias, AssignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onLabeledEvent(LabeledEventResponseProjection subProjection) {
        return onLabeledEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onLabeledEvent(String alias, LabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onSubscribedEvent(SubscribedEventResponseProjection subProjection) {
        return onSubscribedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onSubscribedEvent(String alias, SubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onDemilestonedEvent(DemilestonedEventResponseProjection subProjection) {
        return onDemilestonedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onDemilestonedEvent(String alias, DemilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onLockedEvent(LockedEventResponseProjection subProjection) {
        return onLockedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onLockedEvent(String alias, LockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onReferencedEvent(ReferencedEventResponseProjection subProjection) {
        return onReferencedEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onReferencedEvent(String alias, ReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection onTransferredEvent(TransferredEventResponseProjection subProjection) {
        return onTransferredEvent(null, subProjection);
    }

    public IssueTimelineItemResponseProjection onTransferredEvent(String alias, TransferredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
