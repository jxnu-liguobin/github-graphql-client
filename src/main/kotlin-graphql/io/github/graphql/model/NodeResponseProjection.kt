package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Node
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class NodeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): NodeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): NodeResponseProjection {
        this.id()
        this.typename()
        return this
    }

    fun id(): NodeResponseProjection = id(null)

    fun id(alias: String?): NodeResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun onApp(subProjection: AppResponseProjection): NodeResponseProjection = onApp(null, subProjection)

    fun onApp(alias: String?, subProjection: AppResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on App").alias(alias).projection(subProjection))
        return this
    }

    fun onRepositoryInvitation(subProjection: RepositoryInvitationResponseProjection): NodeResponseProjection = onRepositoryInvitation(null, subProjection)

    fun onRepositoryInvitation(alias: String?, subProjection: RepositoryInvitationResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RepositoryInvitation").alias(alias).projection(subProjection))
        return this
    }

    fun onProjectColumn(subProjection: ProjectColumnResponseProjection): NodeResponseProjection = onProjectColumn(null, subProjection)

    fun onProjectColumn(alias: String?, subProjection: ProjectColumnResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ProjectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): NodeResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onLicense(subProjection: LicenseResponseProjection): NodeResponseProjection = onLicense(null, subProjection)

    fun onLicense(alias: String?, subProjection: LicenseResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on License").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): NodeResponseProjection = onReviewRequestedEvent(null, subProjection)

    fun onReviewRequestedEvent(alias: String?, subProjection: ReviewRequestedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserStatus(subProjection: UserStatusResponseProjection): NodeResponseProjection = onUserStatus(null, subProjection)

    fun onUserStatus(alias: String?, subProjection: UserStatusResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UserStatus").alias(alias).projection(subProjection))
        return this
    }

    fun onRegistryPackageDependency(subProjection: RegistryPackageDependencyResponseProjection): NodeResponseProjection = onRegistryPackageDependency(null, subProjection)

    fun onRegistryPackageDependency(alias: String?, subProjection: RegistryPackageDependencyResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RegistryPackageDependency").alias(alias).projection(subProjection))
        return this
    }

    fun onLabeledEvent(subProjection: LabeledEventResponseProjection): NodeResponseProjection = onLabeledEvent(null, subProjection)

    fun onLabeledEvent(alias: String?, subProjection: LabeledEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSponsorsListing(subProjection: SponsorsListingResponseProjection): NodeResponseProjection = onSponsorsListing(null, subProjection)

    fun onSponsorsListing(alias: String?, subProjection: SponsorsListingResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on SponsorsListing").alias(alias).projection(subProjection))
        return this
    }

    fun onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): NodeResponseProjection = onMarkedAsDuplicateEvent(null, subProjection)

    fun onMarkedAsDuplicateEvent(alias: String?, subProjection: MarkedAsDuplicateEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onSubscribedEvent(subProjection: SubscribedEventResponseProjection): NodeResponseProjection = onSubscribedEvent(null, subProjection)

    fun onSubscribedEvent(alias: String?, subProjection: SubscribedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): NodeResponseProjection = onDemilestonedEvent(null, subProjection)

    fun onDemilestonedEvent(alias: String?, subProjection: DemilestonedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onStatus(subProjection: StatusResponseProjection): NodeResponseProjection = onStatus(null, subProjection)

    fun onStatus(alias: String?, subProjection: StatusResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Status").alias(alias).projection(subProjection))
        return this
    }

    fun onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): NodeResponseProjection = onMovedColumnsInProjectEvent(null, subProjection)

    fun onMovedColumnsInProjectEvent(alias: String?, subProjection: MovedColumnsInProjectEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): NodeResponseProjection = onUnlabeledEvent(null, subProjection)

    fun onUnlabeledEvent(alias: String?, subProjection: UnlabeledEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): NodeResponseProjection = onCommitCommentThread(null, subProjection)

    fun onCommitCommentThread(alias: String?, subProjection: CommitCommentThreadResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun onMarketplaceCategory(subProjection: MarketplaceCategoryResponseProjection): NodeResponseProjection = onMarketplaceCategory(null, subProjection)

    fun onMarketplaceCategory(alias: String?, subProjection: MarketplaceCategoryResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MarketplaceCategory").alias(alias).projection(subProjection))
        return this
    }

    fun onSponsorship(subProjection: SponsorshipResponseProjection): NodeResponseProjection = onSponsorship(null, subProjection)

    fun onSponsorship(alias: String?, subProjection: SponsorshipResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Sponsorship").alias(alias).projection(subProjection))
        return this
    }

    fun onProject(subProjection: ProjectResponseProjection): NodeResponseProjection = onProject(null, subProjection)

    fun onProject(alias: String?, subProjection: ProjectResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        return this
    }

    fun onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): NodeResponseProjection = onReadyForReviewEvent(null, subProjection)

    fun onReadyForReviewEvent(alias: String?, subProjection: ReadyForReviewEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): NodeResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequest(subProjection: ReviewRequestResponseProjection): NodeResponseProjection = onReviewRequest(null, subProjection)

    fun onReviewRequest(alias: String?, subProjection: ReviewRequestResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewDismissalAllowance(subProjection: ReviewDismissalAllowanceResponseProjection): NodeResponseProjection = onReviewDismissalAllowance(null, subProjection)

    fun onReviewDismissalAllowance(alias: String?, subProjection: ReviewDismissalAllowanceResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewDismissalAllowance").alias(alias).projection(subProjection))
        return this
    }

    fun onUserContentEdit(subProjection: UserContentEditResponseProjection): NodeResponseProjection = onUserContentEdit(null, subProjection)

    fun onUserContentEdit(alias: String?, subProjection: UserContentEditResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UserContentEdit").alias(alias).projection(subProjection))
        return this
    }

    fun onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): NodeResponseProjection = onDeploymentEnvironmentChangedEvent(null, subProjection)

    fun onDeploymentEnvironmentChangedEvent(alias: String?, subProjection: DeploymentEnvironmentChangedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): NodeResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): NodeResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): NodeResponseProjection = onPullRequestCommitCommentThread(null, subProjection)

    fun onPullRequestCommitCommentThread(alias: String?, subProjection: PullRequestCommitCommentThreadResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): NodeResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRegistryPackage(subProjection: RegistryPackageResponseProjection): NodeResponseProjection = onRegistryPackage(null, subProjection)

    fun onRegistryPackage(alias: String?, subProjection: RegistryPackageResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RegistryPackage").alias(alias).projection(subProjection))
        return this
    }

    fun onMentionedEvent(subProjection: MentionedEventResponseProjection): NodeResponseProjection = onMentionedEvent(null, subProjection)

    fun onMentionedEvent(alias: String?, subProjection: MentionedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): NodeResponseProjection = onUnsubscribedEvent(null, subProjection)

    fun onUnsubscribedEvent(alias: String?, subProjection: UnsubscribedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): NodeResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun onReferencedEvent(subProjection: ReferencedEventResponseProjection): NodeResponseProjection = onReferencedEvent(null, subProjection)

    fun onReferencedEvent(alias: String?, subProjection: ReferencedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLockedEvent(subProjection: LockedEventResponseProjection): NodeResponseProjection = onLockedEvent(null, subProjection)

    fun onLockedEvent(alias: String?, subProjection: LockedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): NodeResponseProjection = onRemovedFromProjectEvent(null, subProjection)

    fun onRemovedFromProjectEvent(alias: String?, subProjection: RemovedFromProjectEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUnlockedEvent(subProjection: UnlockedEventResponseProjection): NodeResponseProjection = onUnlockedEvent(null, subProjection)

    fun onUnlockedEvent(alias: String?, subProjection: UnlockedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReaction(subProjection: ReactionResponseProjection): NodeResponseProjection = onReaction(null, subProjection)

    fun onReaction(alias: String?, subProjection: ReactionResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Reaction").alias(alias).projection(subProjection))
        return this
    }

    fun onUnassignedEvent(subProjection: UnassignedEventResponseProjection): NodeResponseProjection = onUnassignedEvent(null, subProjection)

    fun onUnassignedEvent(alias: String?, subProjection: UnassignedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): NodeResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onRef(subProjection: RefResponseProjection): NodeResponseProjection = onRef(null, subProjection)

    fun onRef(alias: String?, subProjection: RefResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Ref").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): NodeResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): NodeResponseProjection = onHeadRefForcePushedEvent(null, subProjection)

    fun onHeadRefForcePushedEvent(alias: String?, subProjection: HeadRefForcePushedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMannequin(subProjection: MannequinResponseProjection): NodeResponseProjection = onMannequin(null, subProjection)

    fun onMannequin(alias: String?, subProjection: MannequinResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        return this
    }

    fun onSavedReply(subProjection: SavedReplyResponseProjection): NodeResponseProjection = onSavedReply(null, subProjection)

    fun onSavedReply(alias: String?, subProjection: SavedReplyResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on SavedReply").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): NodeResponseProjection = onHeadRefRestoredEvent(null, subProjection)

    fun onHeadRefRestoredEvent(alias: String?, subProjection: HeadRefRestoredEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRegistryPackageFile(subProjection: RegistryPackageFileResponseProjection): NodeResponseProjection = onRegistryPackageFile(null, subProjection)

    fun onRegistryPackageFile(alias: String?, subProjection: RegistryPackageFileResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RegistryPackageFile").alias(alias).projection(subProjection))
        return this
    }

    fun onTag(subProjection: TagResponseProjection): NodeResponseProjection = onTag(null, subProjection)

    fun onTag(alias: String?, subProjection: TagResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Tag").alias(alias).projection(subProjection))
        return this
    }

    fun onStatusContext(subProjection: StatusContextResponseProjection): NodeResponseProjection = onStatusContext(null, subProjection)

    fun onStatusContext(alias: String?, subProjection: StatusContextResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on StatusContext").alias(alias).projection(subProjection))
        return this
    }

    fun onDeploymentStatus(subProjection: DeploymentStatusResponseProjection): NodeResponseProjection = onDeploymentStatus(null, subProjection)

    fun onDeploymentStatus(alias: String?, subProjection: DeploymentStatusResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on DeploymentStatus").alias(alias).projection(subProjection))
        return this
    }

    fun onRegistryPackageTag(subProjection: RegistryPackageTagResponseProjection): NodeResponseProjection = onRegistryPackageTag(null, subProjection)

    fun onRegistryPackageTag(alias: String?, subProjection: RegistryPackageTagResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RegistryPackageTag").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): NodeResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onDeployKey(subProjection: DeployKeyResponseProjection): NodeResponseProjection = onDeployKey(null, subProjection)

    fun onDeployKey(alias: String?, subProjection: DeployKeyResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on DeployKey").alias(alias).projection(subProjection))
        return this
    }

    fun onLabel(subProjection: LabelResponseProjection): NodeResponseProjection = onLabel(null, subProjection)

    fun onLabel(alias: String?, subProjection: LabelResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Label").alias(alias).projection(subProjection))
        return this
    }

    fun onDeployment(subProjection: DeploymentResponseProjection): NodeResponseProjection = onDeployment(null, subProjection)

    fun onDeployment(alias: String?, subProjection: DeploymentResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Deployment").alias(alias).projection(subProjection))
        return this
    }

    fun onBaseRefChangedEvent(subProjection: BaseRefChangedEventResponseProjection): NodeResponseProjection = onBaseRefChangedEvent(null, subProjection)

    fun onBaseRefChangedEvent(alias: String?, subProjection: BaseRefChangedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): NodeResponseProjection = onCommentDeletedEvent(null, subProjection)

    fun onCommentDeletedEvent(alias: String?, subProjection: CommentDeletedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): NodeResponseProjection = onUserBlockedEvent(null, subProjection)

    fun onUserBlockedEvent(alias: String?, subProjection: UserBlockedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRepositoryTopic(subProjection: RepositoryTopicResponseProjection): NodeResponseProjection = onRepositoryTopic(null, subProjection)

    fun onRepositoryTopic(alias: String?, subProjection: RepositoryTopicResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection))
        return this
    }

    fun onRegistryPackageVersion(subProjection: RegistryPackageVersionResponseProjection): NodeResponseProjection = onRegistryPackageVersion(null, subProjection)

    fun onRegistryPackageVersion(alias: String?, subProjection: RegistryPackageVersionResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RegistryPackageVersion").alias(alias).projection(subProjection))
        return this
    }

    fun onTree(subProjection: TreeResponseProjection): NodeResponseProjection = onTree(null, subProjection)

    fun onTree(alias: String?, subProjection: TreeResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Tree").alias(alias).projection(subProjection))
        return this
    }

    fun onTransferredEvent(subProjection: TransferredEventResponseProjection): NodeResponseProjection = onTransferredEvent(null, subProjection)

    fun onTransferredEvent(alias: String?, subProjection: TransferredEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): NodeResponseProjection = onReviewRequestRemovedEvent(null, subProjection)

    fun onReviewRequestRemovedEvent(alias: String?, subProjection: ReviewRequestRemovedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onBlob(subProjection: BlobResponseProjection): NodeResponseProjection = onBlob(null, subProjection)

    fun onBlob(alias: String?, subProjection: BlobResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Blob").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestonedEvent(subProjection: MilestonedEventResponseProjection): NodeResponseProjection = onMilestonedEvent(null, subProjection)

    fun onMilestonedEvent(alias: String?, subProjection: MilestonedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): NodeResponseProjection = onRenamedTitleEvent(null, subProjection)

    fun onRenamedTitleEvent(alias: String?, subProjection: RenamedTitleEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPublicKey(subProjection: PublicKeyResponseProjection): NodeResponseProjection = onPublicKey(null, subProjection)

    fun onPublicKey(alias: String?, subProjection: PublicKeyResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PublicKey").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestone(subProjection: MilestoneResponseProjection): NodeResponseProjection = onMilestone(null, subProjection)

    fun onMilestone(alias: String?, subProjection: MilestoneResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        return this
    }

    fun onBot(subProjection: BotResponseProjection): NodeResponseProjection = onBot(null, subProjection)

    fun onBot(alias: String?, subProjection: BotResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        return this
    }

    fun onPushAllowance(subProjection: PushAllowanceResponseProjection): NodeResponseProjection = onPushAllowance(null, subProjection)

    fun onPushAllowance(alias: String?, subProjection: PushAllowanceResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PushAllowance").alias(alias).projection(subProjection))
        return this
    }

    fun onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): NodeResponseProjection = onHeadRefDeletedEvent(null, subProjection)

    fun onHeadRefDeletedEvent(alias: String?, subProjection: HeadRefDeletedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): NodeResponseProjection = onConvertedNoteToIssueEvent(null, subProjection)

    fun onConvertedNoteToIssueEvent(alias: String?, subProjection: ConvertedNoteToIssueEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReleaseAsset(subProjection: ReleaseAssetResponseProjection): NodeResponseProjection = onReleaseAsset(null, subProjection)

    fun onReleaseAsset(alias: String?, subProjection: ReleaseAssetResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReleaseAsset").alias(alias).projection(subProjection))
        return this
    }

    fun onSecurityAdvisory(subProjection: SecurityAdvisoryResponseProjection): NodeResponseProjection = onSecurityAdvisory(null, subProjection)

    fun onSecurityAdvisory(alias: String?, subProjection: SecurityAdvisoryResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on SecurityAdvisory").alias(alias).projection(subProjection))
        return this
    }

    fun onPinnedEvent(subProjection: PinnedEventResponseProjection): NodeResponseProjection = onPinnedEvent(null, subProjection)

    fun onPinnedEvent(alias: String?, subProjection: PinnedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCodeOfConduct(subProjection: CodeOfConductResponseProjection): NodeResponseProjection = onCodeOfConduct(null, subProjection)

    fun onCodeOfConduct(alias: String?, subProjection: CodeOfConductResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on CodeOfConduct").alias(alias).projection(subProjection))
        return this
    }

    fun onGist(subProjection: GistResponseProjection): NodeResponseProjection = onGist(null, subProjection)

    fun onGist(alias: String?, subProjection: GistResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): NodeResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): NodeResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganizationIdentityProvider(subProjection: OrganizationIdentityProviderResponseProjection): NodeResponseProjection = onOrganizationIdentityProvider(null, subProjection)

    fun onOrganizationIdentityProvider(alias: String?, subProjection: OrganizationIdentityProviderResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on OrganizationIdentityProvider").alias(alias).projection(subProjection))
        return this
    }

    fun onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): NodeResponseProjection = onAddedToProjectEvent(null, subProjection)

    fun onAddedToProjectEvent(alias: String?, subProjection: AddedToProjectEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onGistComment(subProjection: GistCommentResponseProjection): NodeResponseProjection = onGistComment(null, subProjection)

    fun onGistComment(alias: String?, subProjection: GistCommentResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): NodeResponseProjection = onPullRequestCommit(null, subProjection)

    fun onPullRequestCommit(alias: String?, subProjection: PullRequestCommitResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        return this
    }

    fun onDeployedEvent(subProjection: DeployedEventResponseProjection): NodeResponseProjection = onDeployedEvent(null, subProjection)

    fun onDeployedEvent(alias: String?, subProjection: DeployedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): NodeResponseProjection = onReviewDismissedEvent(null, subProjection)

    fun onReviewDismissedEvent(alias: String?, subProjection: ReviewDismissedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onLanguage(subProjection: LanguageResponseProjection): NodeResponseProjection = onLanguage(null, subProjection)

    fun onLanguage(alias: String?, subProjection: LanguageResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Language").alias(alias).projection(subProjection))
        return this
    }

    fun onTopic(subProjection: TopicResponseProjection): NodeResponseProjection = onTopic(null, subProjection)

    fun onTopic(alias: String?, subProjection: TopicResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Topic").alias(alias).projection(subProjection))
        return this
    }

    fun onRelease(subProjection: ReleaseResponseProjection): NodeResponseProjection = onRelease(null, subProjection)

    fun onRelease(alias: String?, subProjection: ReleaseResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Release").alias(alias).projection(subProjection))
        return this
    }

    fun onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): NodeResponseProjection = onUnpinnedEvent(null, subProjection)

    fun onUnpinnedEvent(alias: String?, subProjection: UnpinnedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganizationInvitation(subProjection: OrganizationInvitationResponseProjection): NodeResponseProjection = onOrganizationInvitation(null, subProjection)

    fun onOrganizationInvitation(alias: String?, subProjection: OrganizationInvitationResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on OrganizationInvitation").alias(alias).projection(subProjection))
        return this
    }

    fun onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): NodeResponseProjection = onBaseRefForcePushedEvent(null, subProjection)

    fun onBaseRefForcePushedEvent(alias: String?, subProjection: BaseRefForcePushedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): NodeResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onReopenedEvent(subProjection: ReopenedEventResponseProjection): NodeResponseProjection = onReopenedEvent(null, subProjection)

    fun onReopenedEvent(alias: String?, subProjection: ReopenedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onBranchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): NodeResponseProjection = onBranchProtectionRule(null, subProjection)

    fun onBranchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on BranchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): NodeResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onProjectCard(subProjection: ProjectCardResponseProjection): NodeResponseProjection = onProjectCard(null, subProjection)

    fun onProjectCard(alias: String?, subProjection: ProjectCardResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ProjectCard").alias(alias).projection(subProjection))
        return this
    }

    fun onMarketplaceListing(subProjection: MarketplaceListingResponseProjection): NodeResponseProjection = onMarketplaceListing(null, subProjection)

    fun onMarketplaceListing(alias: String?, subProjection: MarketplaceListingResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MarketplaceListing").alias(alias).projection(subProjection))
        return this
    }

    fun onExternalIdentity(subProjection: ExternalIdentityResponseProjection): NodeResponseProjection = onExternalIdentity(null, subProjection)

    fun onExternalIdentity(alias: String?, subProjection: ExternalIdentityResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on ExternalIdentity").alias(alias).projection(subProjection))
        return this
    }

    fun onAssignedEvent(subProjection: AssignedEventResponseProjection): NodeResponseProjection = onAssignedEvent(null, subProjection)

    fun onAssignedEvent(alias: String?, subProjection: AssignedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMergedEvent(subProjection: MergedEventResponseProjection): NodeResponseProjection = onMergedEvent(null, subProjection)

    fun onMergedEvent(alias: String?, subProjection: MergedEventResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): NodeResponseProjection = onPullRequestReviewThread(null, subProjection)

    fun onPullRequestReviewThread(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): NodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): NodeResponseProjection = typename(null)

    fun typename(alias: String?): NodeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
