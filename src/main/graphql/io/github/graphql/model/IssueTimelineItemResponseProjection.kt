package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueTimelineItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueTimelineItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueTimelineItemResponseProjection {
        this.typename()
        return this
    }

    fun onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): IssueTimelineItemResponseProjection = onUnlabeledEvent(null, subProjection)

    fun onUnlabeledEvent(alias: String?, subProjection: UnlabeledEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestonedEvent(subProjection: MilestonedEventResponseProjection): IssueTimelineItemResponseProjection = onMilestonedEvent(null, subProjection)

    fun onMilestonedEvent(alias: String?, subProjection: MilestonedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemResponseProjection = onRenamedTitleEvent(null, subProjection)

    fun onRenamedTitleEvent(alias: String?, subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): IssueTimelineItemResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReopenedEvent(subProjection: ReopenedEventResponseProjection): IssueTimelineItemResponseProjection = onReopenedEvent(null, subProjection)

    fun onReopenedEvent(alias: String?, subProjection: ReopenedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlockedEvent(subProjection: UnlockedEventResponseProjection): IssueTimelineItemResponseProjection = onUnlockedEvent(null, subProjection)

    fun onUnlockedEvent(alias: String?, subProjection: UnlockedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnassignedEvent(subProjection: UnassignedEventResponseProjection): IssueTimelineItemResponseProjection = onUnassignedEvent(null, subProjection)

    fun onUnassignedEvent(alias: String?, subProjection: UnassignedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): IssueTimelineItemResponseProjection = onUserBlockedEvent(null, subProjection)

    fun onUserBlockedEvent(alias: String?, subProjection: UserBlockedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): IssueTimelineItemResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): IssueTimelineItemResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemResponseProjection = onUnsubscribedEvent(null, subProjection)

    fun onUnsubscribedEvent(alias: String?, subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onAssignedEvent(subProjection: AssignedEventResponseProjection): IssueTimelineItemResponseProjection = onAssignedEvent(null, subProjection)

    fun onAssignedEvent(alias: String?, subProjection: AssignedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLabeledEvent(subProjection: LabeledEventResponseProjection): IssueTimelineItemResponseProjection = onLabeledEvent(null, subProjection)

    fun onLabeledEvent(alias: String?, subProjection: LabeledEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSubscribedEvent(subProjection: SubscribedEventResponseProjection): IssueTimelineItemResponseProjection = onSubscribedEvent(null, subProjection)

    fun onSubscribedEvent(alias: String?, subProjection: SubscribedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): IssueTimelineItemResponseProjection = onDemilestonedEvent(null, subProjection)

    fun onDemilestonedEvent(alias: String?, subProjection: DemilestonedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLockedEvent(subProjection: LockedEventResponseProjection): IssueTimelineItemResponseProjection = onLockedEvent(null, subProjection)

    fun onLockedEvent(alias: String?, subProjection: LockedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReferencedEvent(subProjection: ReferencedEventResponseProjection): IssueTimelineItemResponseProjection = onReferencedEvent(null, subProjection)

    fun onReferencedEvent(alias: String?, subProjection: ReferencedEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onTransferredEvent(subProjection: TransferredEventResponseProjection): IssueTimelineItemResponseProjection = onTransferredEvent(null, subProjection)

    fun onTransferredEvent(alias: String?, subProjection: TransferredEventResponseProjection): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueTimelineItemResponseProjection = typename(null)

    fun typename(alias: String?): IssueTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
