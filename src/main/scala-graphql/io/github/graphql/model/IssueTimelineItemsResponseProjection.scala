package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItems
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class IssueTimelineItemsResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineItemsResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineItemsResponseProjection = {
        this.typename()
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onAddedToProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onAddedToProjectEvent(alias: String, subProjection: AddedToProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onCommentDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCommentDeletedEvent(alias: String, subProjection: CommentDeletedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUserBlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUserBlockedEvent(alias: String, subProjection: UserBlockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMentionedEvent(subProjection: MentionedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onMentionedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMentionedEvent(alias: String, subProjection: MentionedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUnsubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnsubscribedEvent(alias: String, subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLabeledEvent(subProjection: LabeledEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onLabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onLabeledEvent(alias: String, subProjection: LabeledEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onMarkedAsDuplicateEvent(null.asInstanceOf[String], subProjection)
    }

    def onMarkedAsDuplicateEvent(alias: String, subProjection: MarkedAsDuplicateEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        this
    }

    def onSubscribedEvent(subProjection: SubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onSubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onSubscribedEvent(alias: String, subProjection: SubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onDemilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDemilestonedEvent(alias: String, subProjection: DemilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLockedEvent(subProjection: LockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onLockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onLockedEvent(alias: String, subProjection: LockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReferencedEvent(subProjection: ReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReferencedEvent(alias: String, subProjection: ReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onTransferredEvent(subProjection: TransferredEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onTransferredEvent(null.asInstanceOf[String], subProjection)
    }

    def onTransferredEvent(alias: String, subProjection: TransferredEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        this
    }

    def onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onMovedColumnsInProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onMovedColumnsInProjectEvent(alias: String, subProjection: MovedColumnsInProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUnlabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlabeledEvent(alias: String, subProjection: UnlabeledEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUnpinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnpinnedEvent(alias: String, subProjection: UnpinnedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMilestonedEvent(subProjection: MilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onMilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMilestonedEvent(alias: String, subProjection: MilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onRemovedFromProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onRemovedFromProjectEvent(alias: String, subProjection: RemovedFromProjectEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onRenamedTitleEvent(null.asInstanceOf[String], subProjection)
    }

    def onRenamedTitleEvent(alias: String, subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        this
    }

    def onReopenedEvent(subProjection: ReopenedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onReopenedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReopenedEvent(alias: String, subProjection: ReopenedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlockedEvent(subProjection: UnlockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUnlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlockedEvent(alias: String, subProjection: UnlockedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnassignedEvent(subProjection: UnassignedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onUnassignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnassignedEvent(alias: String, subProjection: UnassignedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onConvertedNoteToIssueEvent(null.asInstanceOf[String], subProjection)
    }

    def onConvertedNoteToIssueEvent(alias: String, subProjection: ConvertedNoteToIssueEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): IssueTimelineItemsResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onAssignedEvent(subProjection: AssignedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onAssignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onAssignedEvent(alias: String, subProjection: AssignedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPinnedEvent(subProjection: PinnedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        onPinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onPinnedEvent(alias: String, subProjection: PinnedEventResponseProjection): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueTimelineItemsResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineItemsResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
