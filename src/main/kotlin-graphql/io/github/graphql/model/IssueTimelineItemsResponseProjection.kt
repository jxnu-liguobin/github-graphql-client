package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItems
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class IssueTimelineItemsResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineItemsResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineItemsResponseProjection {
        this.typename()
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): IssueTimelineItemsResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): IssueTimelineItemsResponseProjection = onAddedToProjectEvent(null, subProjection)

    fun onAddedToProjectEvent(alias: String?, subProjection: AddedToProjectEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): IssueTimelineItemsResponseProjection = onCommentDeletedEvent(null, subProjection)

    fun onCommentDeletedEvent(alias: String?, subProjection: CommentDeletedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): IssueTimelineItemsResponseProjection = onUserBlockedEvent(null, subProjection)

    fun onUserBlockedEvent(alias: String?, subProjection: UserBlockedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMentionedEvent(subProjection: MentionedEventResponseProjection): IssueTimelineItemsResponseProjection = onMentionedEvent(null, subProjection)

    fun onMentionedEvent(alias: String?, subProjection: MentionedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = onUnsubscribedEvent(null, subProjection)

    fun onUnsubscribedEvent(alias: String?, subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLabeledEvent(subProjection: LabeledEventResponseProjection): IssueTimelineItemsResponseProjection = onLabeledEvent(null, subProjection)

    fun onLabeledEvent(alias: String?, subProjection: LabeledEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): IssueTimelineItemsResponseProjection = onMarkedAsDuplicateEvent(null, subProjection)

    fun onMarkedAsDuplicateEvent(alias: String?, subProjection: MarkedAsDuplicateEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSubscribedEvent(subProjection: SubscribedEventResponseProjection): IssueTimelineItemsResponseProjection = onSubscribedEvent(null, subProjection)

    fun onSubscribedEvent(alias: String?, subProjection: SubscribedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = onDemilestonedEvent(null, subProjection)

    fun onDemilestonedEvent(alias: String?, subProjection: DemilestonedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLockedEvent(subProjection: LockedEventResponseProjection): IssueTimelineItemsResponseProjection = onLockedEvent(null, subProjection)

    fun onLockedEvent(alias: String?, subProjection: LockedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReferencedEvent(subProjection: ReferencedEventResponseProjection): IssueTimelineItemsResponseProjection = onReferencedEvent(null, subProjection)

    fun onReferencedEvent(alias: String?, subProjection: ReferencedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onTransferredEvent(subProjection: TransferredEventResponseProjection): IssueTimelineItemsResponseProjection = onTransferredEvent(null, subProjection)

    fun onTransferredEvent(alias: String?, subProjection: TransferredEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): IssueTimelineItemsResponseProjection = onMovedColumnsInProjectEvent(null, subProjection)

    fun onMovedColumnsInProjectEvent(alias: String?, subProjection: MovedColumnsInProjectEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): IssueTimelineItemsResponseProjection = onUnlabeledEvent(null, subProjection)

    fun onUnlabeledEvent(alias: String?, subProjection: UnlabeledEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): IssueTimelineItemsResponseProjection = onUnpinnedEvent(null, subProjection)

    fun onUnpinnedEvent(alias: String?, subProjection: UnpinnedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestonedEvent(subProjection: MilestonedEventResponseProjection): IssueTimelineItemsResponseProjection = onMilestonedEvent(null, subProjection)

    fun onMilestonedEvent(alias: String?, subProjection: MilestonedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): IssueTimelineItemsResponseProjection = onRemovedFromProjectEvent(null, subProjection)

    fun onRemovedFromProjectEvent(alias: String?, subProjection: RemovedFromProjectEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemsResponseProjection = onRenamedTitleEvent(null, subProjection)

    fun onRenamedTitleEvent(alias: String?, subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReopenedEvent(subProjection: ReopenedEventResponseProjection): IssueTimelineItemsResponseProjection = onReopenedEvent(null, subProjection)

    fun onReopenedEvent(alias: String?, subProjection: ReopenedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlockedEvent(subProjection: UnlockedEventResponseProjection): IssueTimelineItemsResponseProjection = onUnlockedEvent(null, subProjection)

    fun onUnlockedEvent(alias: String?, subProjection: UnlockedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnassignedEvent(subProjection: UnassignedEventResponseProjection): IssueTimelineItemsResponseProjection = onUnassignedEvent(null, subProjection)

    fun onUnassignedEvent(alias: String?, subProjection: UnassignedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): IssueTimelineItemsResponseProjection = onConvertedNoteToIssueEvent(null, subProjection)

    fun onConvertedNoteToIssueEvent(alias: String?, subProjection: ConvertedNoteToIssueEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): IssueTimelineItemsResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onAssignedEvent(subProjection: AssignedEventResponseProjection): IssueTimelineItemsResponseProjection = onAssignedEvent(null, subProjection)

    fun onAssignedEvent(alias: String?, subProjection: AssignedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPinnedEvent(subProjection: PinnedEventResponseProjection): IssueTimelineItemsResponseProjection = onPinnedEvent(null, subProjection)

    fun onPinnedEvent(alias: String?, subProjection: PinnedEventResponseProjection): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueTimelineItemsResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineItemsResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
