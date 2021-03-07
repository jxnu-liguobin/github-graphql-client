package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueTimelineItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class IssueTimelineItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineItemResponseProjection = {
        this.typename()
        this
    }

    def onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): IssueTimelineItemResponseProjection = {
        onUnlabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlabeledEvent(alias: String, subProjection: UnlabeledEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onMilestonedEvent(subProjection: MilestonedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onMilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMilestonedEvent(alias: String, subProjection: MilestonedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemResponseProjection = {
        onRenamedTitleEvent(null.asInstanceOf[String], subProjection)
    }

    def onRenamedTitleEvent(alias: String, subProjection: RenamedTitleEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReopenedEvent(subProjection: ReopenedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onReopenedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReopenedEvent(alias: String, subProjection: ReopenedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlockedEvent(subProjection: UnlockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onUnlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlockedEvent(alias: String, subProjection: UnlockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnassignedEvent(subProjection: UnassignedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onUnassignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnassignedEvent(alias: String, subProjection: UnassignedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onUserBlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUserBlockedEvent(alias: String, subProjection: UserBlockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): IssueTimelineItemResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): IssueTimelineItemResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onUnsubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnsubscribedEvent(alias: String, subProjection: UnsubscribedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onAssignedEvent(subProjection: AssignedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onAssignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onAssignedEvent(alias: String, subProjection: AssignedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLabeledEvent(subProjection: LabeledEventResponseProjection): IssueTimelineItemResponseProjection = {
        onLabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onLabeledEvent(alias: String, subProjection: LabeledEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onSubscribedEvent(subProjection: SubscribedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onSubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onSubscribedEvent(alias: String, subProjection: SubscribedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onDemilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDemilestonedEvent(alias: String, subProjection: DemilestonedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLockedEvent(subProjection: LockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onLockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onLockedEvent(alias: String, subProjection: LockedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReferencedEvent(subProjection: ReferencedEventResponseProjection): IssueTimelineItemResponseProjection = {
        onReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReferencedEvent(alias: String, subProjection: ReferencedEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onTransferredEvent(subProjection: TransferredEventResponseProjection): IssueTimelineItemResponseProjection = {
        onTransferredEvent(null.asInstanceOf[String], subProjection)
    }

    def onTransferredEvent(alias: String, subProjection: TransferredEventResponseProjection): IssueTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueTimelineItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineItemResponseProjection = {
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
        val that = obj.asInstanceOf[IssueTimelineItemResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
