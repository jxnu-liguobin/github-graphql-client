package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for IssueTimelineItems
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class IssueTimelineItemsResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineItemsResponseProjection() {
    }

    @Override
    public IssueTimelineItemsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineItemsResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public IssueTimelineItemsResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onAddedToProjectEvent(AddedToProjectEventResponseProjection subProjection) {
        return onAddedToProjectEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onAddedToProjectEvent(String alias, AddedToProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onCommentDeletedEvent(CommentDeletedEventResponseProjection subProjection) {
        return onCommentDeletedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onCommentDeletedEvent(String alias, CommentDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUserBlockedEvent(UserBlockedEventResponseProjection subProjection) {
        return onUserBlockedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUserBlockedEvent(String alias, UserBlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onMentionedEvent(MentionedEventResponseProjection subProjection) {
        return onMentionedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onMentionedEvent(String alias, MentionedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUnsubscribedEvent(UnsubscribedEventResponseProjection subProjection) {
        return onUnsubscribedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUnsubscribedEvent(String alias, UnsubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onLabeledEvent(LabeledEventResponseProjection subProjection) {
        return onLabeledEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onLabeledEvent(String alias, LabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onMarkedAsDuplicateEvent(MarkedAsDuplicateEventResponseProjection subProjection) {
        return onMarkedAsDuplicateEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onMarkedAsDuplicateEvent(String alias, MarkedAsDuplicateEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onSubscribedEvent(SubscribedEventResponseProjection subProjection) {
        return onSubscribedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onSubscribedEvent(String alias, SubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onDemilestonedEvent(DemilestonedEventResponseProjection subProjection) {
        return onDemilestonedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onDemilestonedEvent(String alias, DemilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onLockedEvent(LockedEventResponseProjection subProjection) {
        return onLockedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onLockedEvent(String alias, LockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onReferencedEvent(ReferencedEventResponseProjection subProjection) {
        return onReferencedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onReferencedEvent(String alias, ReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onTransferredEvent(TransferredEventResponseProjection subProjection) {
        return onTransferredEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onTransferredEvent(String alias, TransferredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onMovedColumnsInProjectEvent(MovedColumnsInProjectEventResponseProjection subProjection) {
        return onMovedColumnsInProjectEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onMovedColumnsInProjectEvent(String alias, MovedColumnsInProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUnlabeledEvent(UnlabeledEventResponseProjection subProjection) {
        return onUnlabeledEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUnlabeledEvent(String alias, UnlabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUnpinnedEvent(UnpinnedEventResponseProjection subProjection) {
        return onUnpinnedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUnpinnedEvent(String alias, UnpinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onMilestonedEvent(MilestonedEventResponseProjection subProjection) {
        return onMilestonedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onMilestonedEvent(String alias, MilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onRemovedFromProjectEvent(RemovedFromProjectEventResponseProjection subProjection) {
        return onRemovedFromProjectEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onRemovedFromProjectEvent(String alias, RemovedFromProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onRenamedTitleEvent(RenamedTitleEventResponseProjection subProjection) {
        return onRenamedTitleEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onRenamedTitleEvent(String alias, RenamedTitleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onReopenedEvent(ReopenedEventResponseProjection subProjection) {
        return onReopenedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onReopenedEvent(String alias, ReopenedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUnlockedEvent(UnlockedEventResponseProjection subProjection) {
        return onUnlockedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUnlockedEvent(String alias, UnlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onUnassignedEvent(UnassignedEventResponseProjection subProjection) {
        return onUnassignedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onUnassignedEvent(String alias, UnassignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onConvertedNoteToIssueEvent(ConvertedNoteToIssueEventResponseProjection subProjection) {
        return onConvertedNoteToIssueEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onConvertedNoteToIssueEvent(String alias, ConvertedNoteToIssueEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onAssignedEvent(AssignedEventResponseProjection subProjection) {
        return onAssignedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onAssignedEvent(String alias, AssignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection onPinnedEvent(PinnedEventResponseProjection subProjection) {
        return onPinnedEvent(null, subProjection);
    }

    public IssueTimelineItemsResponseProjection onPinnedEvent(String alias, PinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineItemsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final IssueTimelineItemsResponseProjection that = (IssueTimelineItemsResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
