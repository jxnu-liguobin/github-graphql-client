package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestTimelineItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestTimelineItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestTimelineItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestTimelineItemResponseProjection {
        this.typename()
        return this
    }

    fun onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemResponseProjection = onDeploymentEnvironmentChangedEvent(null, subProjection)

    fun onDeploymentEnvironmentChangedEvent(alias: String?, subProjection: DeploymentEnvironmentChangedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): PullRequestTimelineItemResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemResponseProjection = onReviewRequestedEvent(null, subProjection)

    fun onReviewRequestedEvent(alias: String?, subProjection: ReviewRequestedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDeployedEvent(subProjection: DeployedEventResponseProjection): PullRequestTimelineItemResponseProjection = onDeployedEvent(null, subProjection)

    fun onDeployedEvent(alias: String?, subProjection: DeployedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = onUserBlockedEvent(null, subProjection)

    fun onUserBlockedEvent(alias: String?, subProjection: UserBlockedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemResponseProjection = onReviewDismissedEvent(null, subProjection)

    fun onReviewDismissedEvent(alias: String?, subProjection: ReviewDismissedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = onUnsubscribedEvent(null, subProjection)

    fun onUnsubscribedEvent(alias: String?, subProjection: UnsubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLabeledEvent(subProjection: LabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = onLabeledEvent(null, subProjection)

    fun onLabeledEvent(alias: String?, subProjection: LabeledEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSubscribedEvent(subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection = onSubscribedEvent(null, subProjection)

    fun onSubscribedEvent(alias: String?, subProjection: SubscribedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = onDemilestonedEvent(null, subProjection)

    fun onDemilestonedEvent(alias: String?, subProjection: DemilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLockedEvent(subProjection: LockedEventResponseProjection): PullRequestTimelineItemResponseProjection = onLockedEvent(null, subProjection)

    fun onLockedEvent(alias: String?, subProjection: LockedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReferencedEvent(subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection = onReferencedEvent(null, subProjection)

    fun onReferencedEvent(alias: String?, subProjection: ReferencedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemResponseProjection = onReviewRequestRemovedEvent(null, subProjection)

    fun onReviewRequestRemovedEvent(alias: String?, subProjection: ReviewRequestRemovedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemResponseProjection = onUnlabeledEvent(null, subProjection)

    fun onUnlabeledEvent(alias: String?, subProjection: UnlabeledEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): PullRequestTimelineItemResponseProjection = onCommitCommentThread(null, subProjection)

    fun onCommitCommentThread(alias: String?, subProjection: CommitCommentThreadResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestonedEvent(subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection = onMilestonedEvent(null, subProjection)

    fun onMilestonedEvent(alias: String?, subProjection: MilestonedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemResponseProjection = onRenamedTitleEvent(null, subProjection)

    fun onRenamedTitleEvent(alias: String?, subProjection: RenamedTitleEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = onBaseRefForcePushedEvent(null, subProjection)

    fun onBaseRefForcePushedEvent(alias: String?, subProjection: BaseRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReopenedEvent(subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemResponseProjection = onReopenedEvent(null, subProjection)

    fun onReopenedEvent(alias: String?, subProjection: ReopenedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlockedEvent(subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemResponseProjection = onUnlockedEvent(null, subProjection)

    fun onUnlockedEvent(alias: String?, subProjection: UnlockedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemResponseProjection = onHeadRefDeletedEvent(null, subProjection)

    fun onHeadRefDeletedEvent(alias: String?, subProjection: HeadRefDeletedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnassignedEvent(subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemResponseProjection = onUnassignedEvent(null, subProjection)

    fun onUnassignedEvent(alias: String?, subProjection: UnassignedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection = onHeadRefForcePushedEvent(null, subProjection)

    fun onHeadRefForcePushedEvent(alias: String?, subProjection: HeadRefForcePushedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): PullRequestTimelineItemResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): PullRequestTimelineItemResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): PullRequestTimelineItemResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onAssignedEvent(subProjection: AssignedEventResponseProjection): PullRequestTimelineItemResponseProjection = onAssignedEvent(null, subProjection)

    fun onAssignedEvent(alias: String?, subProjection: AssignedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemResponseProjection = onHeadRefRestoredEvent(null, subProjection)

    fun onHeadRefRestoredEvent(alias: String?, subProjection: HeadRefRestoredEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMergedEvent(subProjection: MergedEventResponseProjection): PullRequestTimelineItemResponseProjection = onMergedEvent(null, subProjection)

    fun onMergedEvent(alias: String?, subProjection: MergedEventResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemResponseProjection = onPullRequestReviewThread(null, subProjection)

    fun onPullRequestReviewThread(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestTimelineItemResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestTimelineItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
