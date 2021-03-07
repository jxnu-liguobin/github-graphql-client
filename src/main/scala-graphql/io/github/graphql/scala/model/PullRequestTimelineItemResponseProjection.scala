package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestTimelineItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class PullRequestTimelineItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineItemResponseProjection = {
        this.typename()
        this
    }

    def onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onDeploymentEnvironmentChangedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeploymentEnvironmentChangedEvent(alias: String, subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onReviewRequestedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestedEvent(alias: String, subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDeployedEvent(subProjection: DeployedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onDeployedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeployedEvent(alias: String, subProjection: DeployedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onUserBlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUserBlockedEvent(alias: String, subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onReviewDismissedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewDismissedEvent(alias: String, subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onUnsubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnsubscribedEvent(alias: String, subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLabeledEvent(subProjection: LabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onLabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onLabeledEvent(alias: String, subProjection: LabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onSubscribedEvent(subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onSubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onSubscribedEvent(alias: String, subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onDemilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDemilestonedEvent(alias: String, subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLockedEvent(subProjection: LockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onLockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onLockedEvent(alias: String, subProjection: LockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReferencedEvent(subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReferencedEvent(alias: String, subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onReviewRequestRemovedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestRemovedEvent(alias: String, subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onUnlabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlabeledEvent(alias: String, subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): PullRequestTimelineItemResponseProjection = {
        onCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onCommitCommentThread(alias: String, subProjection: CommitCommentThreadResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def onMilestonedEvent(subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onMilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMilestonedEvent(alias: String, subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onRenamedTitleEvent(null.asInstanceOf[String], subProjection)
    }

    def onRenamedTitleEvent(alias: String, subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        this
    }

    def onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onBaseRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onBaseRefForcePushedEvent(alias: String, subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReopenedEvent(subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onReopenedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReopenedEvent(alias: String, subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlockedEvent(subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onUnlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlockedEvent(alias: String, subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onHeadRefDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefDeletedEvent(alias: String, subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnassignedEvent(subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onUnassignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnassignedEvent(alias: String, subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onHeadRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefForcePushedEvent(alias: String, subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): PullRequestTimelineItemResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): PullRequestTimelineItemResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): PullRequestTimelineItemResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onAssignedEvent(subProjection: AssignedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onAssignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onAssignedEvent(alias: String, subProjection: AssignedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onHeadRefRestoredEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefRestoredEvent(alias: String, subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        this
    }

    def onMergedEvent(subProjection: MergedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        onMergedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMergedEvent(alias: String, subProjection: MergedEventResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemResponseProjection = {
        onPullRequestReviewThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewThread(alias: String, subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestTimelineItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineItemResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestTimelineItemResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
