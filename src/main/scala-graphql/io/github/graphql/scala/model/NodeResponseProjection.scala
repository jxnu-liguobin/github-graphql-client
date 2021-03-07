package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Node
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class NodeResponseProjection extends GraphQLResponseProjection {

    override def all$(): NodeResponseProjection = all$(3)

    override def all$(maxDepth: Int): NodeResponseProjection = {
        this.id()
        this.typename()
        this
    }

    def id(): NodeResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def onApp(subProjection: AppResponseProjection): NodeResponseProjection = {
        onApp(null.asInstanceOf[String], subProjection)
    }

    def onApp(alias: String, subProjection: AppResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on App").alias(alias).projection(subProjection))
        this
    }

    def onRepositoryInvitation(subProjection: RepositoryInvitationResponseProjection): NodeResponseProjection = {
        onRepositoryInvitation(null.asInstanceOf[String], subProjection)
    }

    def onRepositoryInvitation(alias: String, subProjection: RepositoryInvitationResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RepositoryInvitation").alias(alias).projection(subProjection))
        this
    }

    def onProjectColumn(subProjection: ProjectColumnResponseProjection): NodeResponseProjection = {
        onProjectColumn(null.asInstanceOf[String], subProjection)
    }

    def onProjectColumn(alias: String, subProjection: ProjectColumnResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ProjectColumn").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): NodeResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onLicense(subProjection: LicenseResponseProjection): NodeResponseProjection = {
        onLicense(null.asInstanceOf[String], subProjection)
    }

    def onLicense(alias: String, subProjection: LicenseResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on License").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestedEvent(subProjection: ReviewRequestedEventResponseProjection): NodeResponseProjection = {
        onReviewRequestedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestedEvent(alias: String, subProjection: ReviewRequestedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserStatus(subProjection: UserStatusResponseProjection): NodeResponseProjection = {
        onUserStatus(null.asInstanceOf[String], subProjection)
    }

    def onUserStatus(alias: String, subProjection: UserStatusResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserStatus").alias(alias).projection(subProjection))
        this
    }

    def onRegistryPackageDependency(subProjection: RegistryPackageDependencyResponseProjection): NodeResponseProjection = {
        onRegistryPackageDependency(null.asInstanceOf[String], subProjection)
    }

    def onRegistryPackageDependency(alias: String, subProjection: RegistryPackageDependencyResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RegistryPackageDependency").alias(alias).projection(subProjection))
        this
    }

    def onLabeledEvent(subProjection: LabeledEventResponseProjection): NodeResponseProjection = {
        onLabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onLabeledEvent(alias: String, subProjection: LabeledEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onSponsorsListing(subProjection: SponsorsListingResponseProjection): NodeResponseProjection = {
        onSponsorsListing(null.asInstanceOf[String], subProjection)
    }

    def onSponsorsListing(alias: String, subProjection: SponsorsListingResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on SponsorsListing").alias(alias).projection(subProjection))
        this
    }

    def onMarkedAsDuplicateEvent(subProjection: MarkedAsDuplicateEventResponseProjection): NodeResponseProjection = {
        onMarkedAsDuplicateEvent(null.asInstanceOf[String], subProjection)
    }

    def onMarkedAsDuplicateEvent(alias: String, subProjection: MarkedAsDuplicateEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection))
        this
    }

    def onSubscribedEvent(subProjection: SubscribedEventResponseProjection): NodeResponseProjection = {
        onSubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onSubscribedEvent(alias: String, subProjection: SubscribedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onDemilestonedEvent(subProjection: DemilestonedEventResponseProjection): NodeResponseProjection = {
        onDemilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDemilestonedEvent(alias: String, subProjection: DemilestonedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onStatus(subProjection: StatusResponseProjection): NodeResponseProjection = {
        onStatus(null.asInstanceOf[String], subProjection)
    }

    def onStatus(alias: String, subProjection: StatusResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Status").alias(alias).projection(subProjection))
        this
    }

    def onMovedColumnsInProjectEvent(subProjection: MovedColumnsInProjectEventResponseProjection): NodeResponseProjection = {
        onMovedColumnsInProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onMovedColumnsInProjectEvent(alias: String, subProjection: MovedColumnsInProjectEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlabeledEvent(subProjection: UnlabeledEventResponseProjection): NodeResponseProjection = {
        onUnlabeledEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlabeledEvent(alias: String, subProjection: UnlabeledEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): NodeResponseProjection = {
        onCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onCommitCommentThread(alias: String, subProjection: CommitCommentThreadResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def onMarketplaceCategory(subProjection: MarketplaceCategoryResponseProjection): NodeResponseProjection = {
        onMarketplaceCategory(null.asInstanceOf[String], subProjection)
    }

    def onMarketplaceCategory(alias: String, subProjection: MarketplaceCategoryResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarketplaceCategory").alias(alias).projection(subProjection))
        this
    }

    def onSponsorship(subProjection: SponsorshipResponseProjection): NodeResponseProjection = {
        onSponsorship(null.asInstanceOf[String], subProjection)
    }

    def onSponsorship(alias: String, subProjection: SponsorshipResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Sponsorship").alias(alias).projection(subProjection))
        this
    }

    def onProject(subProjection: ProjectResponseProjection): NodeResponseProjection = {
        onProject(null.asInstanceOf[String], subProjection)
    }

    def onProject(alias: String, subProjection: ProjectResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        this
    }

    def onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): NodeResponseProjection = {
        onReadyForReviewEvent(null.asInstanceOf[String], subProjection)
    }

    def onReadyForReviewEvent(alias: String, subProjection: ReadyForReviewEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): NodeResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequest(subProjection: ReviewRequestResponseProjection): NodeResponseProjection = {
        onReviewRequest(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequest(alias: String, subProjection: ReviewRequestResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequest").alias(alias).projection(subProjection))
        this
    }

    def onReviewDismissalAllowance(subProjection: ReviewDismissalAllowanceResponseProjection): NodeResponseProjection = {
        onReviewDismissalAllowance(null.asInstanceOf[String], subProjection)
    }

    def onReviewDismissalAllowance(alias: String, subProjection: ReviewDismissalAllowanceResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewDismissalAllowance").alias(alias).projection(subProjection))
        this
    }

    def onUserContentEdit(subProjection: UserContentEditResponseProjection): NodeResponseProjection = {
        onUserContentEdit(null.asInstanceOf[String], subProjection)
    }

    def onUserContentEdit(alias: String, subProjection: UserContentEditResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserContentEdit").alias(alias).projection(subProjection))
        this
    }

    def onDeploymentEnvironmentChangedEvent(subProjection: DeploymentEnvironmentChangedEventResponseProjection): NodeResponseProjection = {
        onDeploymentEnvironmentChangedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeploymentEnvironmentChangedEvent(alias: String, subProjection: DeploymentEnvironmentChangedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): NodeResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): NodeResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): NodeResponseProjection = {
        onPullRequestCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommitCommentThread(alias: String, subProjection: PullRequestCommitCommentThreadResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): NodeResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRegistryPackage(subProjection: RegistryPackageResponseProjection): NodeResponseProjection = {
        onRegistryPackage(null.asInstanceOf[String], subProjection)
    }

    def onRegistryPackage(alias: String, subProjection: RegistryPackageResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RegistryPackage").alias(alias).projection(subProjection))
        this
    }

    def onMentionedEvent(subProjection: MentionedEventResponseProjection): NodeResponseProjection = {
        onMentionedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMentionedEvent(alias: String, subProjection: MentionedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnsubscribedEvent(subProjection: UnsubscribedEventResponseProjection): NodeResponseProjection = {
        onUnsubscribedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnsubscribedEvent(alias: String, subProjection: UnsubscribedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): NodeResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def onReferencedEvent(subProjection: ReferencedEventResponseProjection): NodeResponseProjection = {
        onReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReferencedEvent(alias: String, subProjection: ReferencedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLockedEvent(subProjection: LockedEventResponseProjection): NodeResponseProjection = {
        onLockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onLockedEvent(alias: String, subProjection: LockedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRemovedFromProjectEvent(subProjection: RemovedFromProjectEventResponseProjection): NodeResponseProjection = {
        onRemovedFromProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onRemovedFromProjectEvent(alias: String, subProjection: RemovedFromProjectEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onUnlockedEvent(subProjection: UnlockedEventResponseProjection): NodeResponseProjection = {
        onUnlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnlockedEvent(alias: String, subProjection: UnlockedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReaction(subProjection: ReactionResponseProjection): NodeResponseProjection = {
        onReaction(null.asInstanceOf[String], subProjection)
    }

    def onReaction(alias: String, subProjection: ReactionResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Reaction").alias(alias).projection(subProjection))
        this
    }

    def onUnassignedEvent(subProjection: UnassignedEventResponseProjection): NodeResponseProjection = {
        onUnassignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnassignedEvent(alias: String, subProjection: UnassignedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): NodeResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onRef(subProjection: RefResponseProjection): NodeResponseProjection = {
        onRef(null.asInstanceOf[String], subProjection)
    }

    def onRef(alias: String, subProjection: RefResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Ref").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): NodeResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefForcePushedEvent(subProjection: HeadRefForcePushedEventResponseProjection): NodeResponseProjection = {
        onHeadRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefForcePushedEvent(alias: String, subProjection: HeadRefForcePushedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMannequin(subProjection: MannequinResponseProjection): NodeResponseProjection = {
        onMannequin(null.asInstanceOf[String], subProjection)
    }

    def onMannequin(alias: String, subProjection: MannequinResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        this
    }

    def onSavedReply(subProjection: SavedReplyResponseProjection): NodeResponseProjection = {
        onSavedReply(null.asInstanceOf[String], subProjection)
    }

    def onSavedReply(alias: String, subProjection: SavedReplyResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on SavedReply").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefRestoredEvent(subProjection: HeadRefRestoredEventResponseProjection): NodeResponseProjection = {
        onHeadRefRestoredEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefRestoredEvent(alias: String, subProjection: HeadRefRestoredEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection))
        this
    }

    def onRegistryPackageFile(subProjection: RegistryPackageFileResponseProjection): NodeResponseProjection = {
        onRegistryPackageFile(null.asInstanceOf[String], subProjection)
    }

    def onRegistryPackageFile(alias: String, subProjection: RegistryPackageFileResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RegistryPackageFile").alias(alias).projection(subProjection))
        this
    }

    def onTag(subProjection: TagResponseProjection): NodeResponseProjection = {
        onTag(null.asInstanceOf[String], subProjection)
    }

    def onTag(alias: String, subProjection: TagResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection))
        this
    }

    def onStatusContext(subProjection: StatusContextResponseProjection): NodeResponseProjection = {
        onStatusContext(null.asInstanceOf[String], subProjection)
    }

    def onStatusContext(alias: String, subProjection: StatusContextResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on StatusContext").alias(alias).projection(subProjection))
        this
    }

    def onDeploymentStatus(subProjection: DeploymentStatusResponseProjection): NodeResponseProjection = {
        onDeploymentStatus(null.asInstanceOf[String], subProjection)
    }

    def onDeploymentStatus(alias: String, subProjection: DeploymentStatusResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeploymentStatus").alias(alias).projection(subProjection))
        this
    }

    def onRegistryPackageTag(subProjection: RegistryPackageTagResponseProjection): NodeResponseProjection = {
        onRegistryPackageTag(null.asInstanceOf[String], subProjection)
    }

    def onRegistryPackageTag(alias: String, subProjection: RegistryPackageTagResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RegistryPackageTag").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): NodeResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onDeployKey(subProjection: DeployKeyResponseProjection): NodeResponseProjection = {
        onDeployKey(null.asInstanceOf[String], subProjection)
    }

    def onDeployKey(alias: String, subProjection: DeployKeyResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeployKey").alias(alias).projection(subProjection))
        this
    }

    def onLabel(subProjection: LabelResponseProjection): NodeResponseProjection = {
        onLabel(null.asInstanceOf[String], subProjection)
    }

    def onLabel(alias: String, subProjection: LabelResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Label").alias(alias).projection(subProjection))
        this
    }

    def onDeployment(subProjection: DeploymentResponseProjection): NodeResponseProjection = {
        onDeployment(null.asInstanceOf[String], subProjection)
    }

    def onDeployment(alias: String, subProjection: DeploymentResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Deployment").alias(alias).projection(subProjection))
        this
    }

    def onBaseRefChangedEvent(subProjection: BaseRefChangedEventResponseProjection): NodeResponseProjection = {
        onBaseRefChangedEvent(null.asInstanceOf[String], subProjection)
    }

    def onBaseRefChangedEvent(alias: String, subProjection: BaseRefChangedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommentDeletedEvent(subProjection: CommentDeletedEventResponseProjection): NodeResponseProjection = {
        onCommentDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCommentDeletedEvent(alias: String, subProjection: CommentDeletedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onUserBlockedEvent(subProjection: UserBlockedEventResponseProjection): NodeResponseProjection = {
        onUserBlockedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUserBlockedEvent(alias: String, subProjection: UserBlockedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRepositoryTopic(subProjection: RepositoryTopicResponseProjection): NodeResponseProjection = {
        onRepositoryTopic(null.asInstanceOf[String], subProjection)
    }

    def onRepositoryTopic(alias: String, subProjection: RepositoryTopicResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection))
        this
    }

    def onRegistryPackageVersion(subProjection: RegistryPackageVersionResponseProjection): NodeResponseProjection = {
        onRegistryPackageVersion(null.asInstanceOf[String], subProjection)
    }

    def onRegistryPackageVersion(alias: String, subProjection: RegistryPackageVersionResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RegistryPackageVersion").alias(alias).projection(subProjection))
        this
    }

    def onTree(subProjection: TreeResponseProjection): NodeResponseProjection = {
        onTree(null.asInstanceOf[String], subProjection)
    }

    def onTree(alias: String, subProjection: TreeResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Tree").alias(alias).projection(subProjection))
        this
    }

    def onTransferredEvent(subProjection: TransferredEventResponseProjection): NodeResponseProjection = {
        onTransferredEvent(null.asInstanceOf[String], subProjection)
    }

    def onTransferredEvent(alias: String, subProjection: TransferredEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewRequestRemovedEvent(subProjection: ReviewRequestRemovedEventResponseProjection): NodeResponseProjection = {
        onReviewRequestRemovedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewRequestRemovedEvent(alias: String, subProjection: ReviewRequestRemovedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection))
        this
    }

    def onBlob(subProjection: BlobResponseProjection): NodeResponseProjection = {
        onBlob(null.asInstanceOf[String], subProjection)
    }

    def onBlob(alias: String, subProjection: BlobResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Blob").alias(alias).projection(subProjection))
        this
    }

    def onMilestonedEvent(subProjection: MilestonedEventResponseProjection): NodeResponseProjection = {
        onMilestonedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMilestonedEvent(alias: String, subProjection: MilestonedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRenamedTitleEvent(subProjection: RenamedTitleEventResponseProjection): NodeResponseProjection = {
        onRenamedTitleEvent(null.asInstanceOf[String], subProjection)
    }

    def onRenamedTitleEvent(alias: String, subProjection: RenamedTitleEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection))
        this
    }

    def onPublicKey(subProjection: PublicKeyResponseProjection): NodeResponseProjection = {
        onPublicKey(null.asInstanceOf[String], subProjection)
    }

    def onPublicKey(alias: String, subProjection: PublicKeyResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PublicKey").alias(alias).projection(subProjection))
        this
    }

    def onMilestone(subProjection: MilestoneResponseProjection): NodeResponseProjection = {
        onMilestone(null.asInstanceOf[String], subProjection)
    }

    def onMilestone(alias: String, subProjection: MilestoneResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        this
    }

    def onBot(subProjection: BotResponseProjection): NodeResponseProjection = {
        onBot(null.asInstanceOf[String], subProjection)
    }

    def onBot(alias: String, subProjection: BotResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        this
    }

    def onPushAllowance(subProjection: PushAllowanceResponseProjection): NodeResponseProjection = {
        onPushAllowance(null.asInstanceOf[String], subProjection)
    }

    def onPushAllowance(alias: String, subProjection: PushAllowanceResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PushAllowance").alias(alias).projection(subProjection))
        this
    }

    def onHeadRefDeletedEvent(subProjection: HeadRefDeletedEventResponseProjection): NodeResponseProjection = {
        onHeadRefDeletedEvent(null.asInstanceOf[String], subProjection)
    }

    def onHeadRefDeletedEvent(alias: String, subProjection: HeadRefDeletedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection))
        this
    }

    def onConvertedNoteToIssueEvent(subProjection: ConvertedNoteToIssueEventResponseProjection): NodeResponseProjection = {
        onConvertedNoteToIssueEvent(null.asInstanceOf[String], subProjection)
    }

    def onConvertedNoteToIssueEvent(alias: String, subProjection: ConvertedNoteToIssueEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection))
        this
    }

    def onReleaseAsset(subProjection: ReleaseAssetResponseProjection): NodeResponseProjection = {
        onReleaseAsset(null.asInstanceOf[String], subProjection)
    }

    def onReleaseAsset(alias: String, subProjection: ReleaseAssetResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReleaseAsset").alias(alias).projection(subProjection))
        this
    }

    def onSecurityAdvisory(subProjection: SecurityAdvisoryResponseProjection): NodeResponseProjection = {
        onSecurityAdvisory(null.asInstanceOf[String], subProjection)
    }

    def onSecurityAdvisory(alias: String, subProjection: SecurityAdvisoryResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on SecurityAdvisory").alias(alias).projection(subProjection))
        this
    }

    def onPinnedEvent(subProjection: PinnedEventResponseProjection): NodeResponseProjection = {
        onPinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onPinnedEvent(alias: String, subProjection: PinnedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCodeOfConduct(subProjection: CodeOfConductResponseProjection): NodeResponseProjection = {
        onCodeOfConduct(null.asInstanceOf[String], subProjection)
    }

    def onCodeOfConduct(alias: String, subProjection: CodeOfConductResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CodeOfConduct").alias(alias).projection(subProjection))
        this
    }

    def onGist(subProjection: GistResponseProjection): NodeResponseProjection = {
        onGist(null.asInstanceOf[String], subProjection)
    }

    def onGist(alias: String, subProjection: GistResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): NodeResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): NodeResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onOrganizationIdentityProvider(subProjection: OrganizationIdentityProviderResponseProjection): NodeResponseProjection = {
        onOrganizationIdentityProvider(null.asInstanceOf[String], subProjection)
    }

    def onOrganizationIdentityProvider(alias: String, subProjection: OrganizationIdentityProviderResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on OrganizationIdentityProvider").alias(alias).projection(subProjection))
        this
    }

    def onAddedToProjectEvent(subProjection: AddedToProjectEventResponseProjection): NodeResponseProjection = {
        onAddedToProjectEvent(null.asInstanceOf[String], subProjection)
    }

    def onAddedToProjectEvent(alias: String, subProjection: AddedToProjectEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection))
        this
    }

    def onGistComment(subProjection: GistCommentResponseProjection): NodeResponseProjection = {
        onGistComment(null.asInstanceOf[String], subProjection)
    }

    def onGistComment(alias: String, subProjection: GistCommentResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): NodeResponseProjection = {
        onPullRequestCommit(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommit(alias: String, subProjection: PullRequestCommitResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        this
    }

    def onDeployedEvent(subProjection: DeployedEventResponseProjection): NodeResponseProjection = {
        onDeployedEvent(null.asInstanceOf[String], subProjection)
    }

    def onDeployedEvent(alias: String, subProjection: DeployedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection))
        this
    }

    def onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): NodeResponseProjection = {
        onReviewDismissedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewDismissedEvent(alias: String, subProjection: ReviewDismissedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        this
    }

    def onLanguage(subProjection: LanguageResponseProjection): NodeResponseProjection = {
        onLanguage(null.asInstanceOf[String], subProjection)
    }

    def onLanguage(alias: String, subProjection: LanguageResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Language").alias(alias).projection(subProjection))
        this
    }

    def onTopic(subProjection: TopicResponseProjection): NodeResponseProjection = {
        onTopic(null.asInstanceOf[String], subProjection)
    }

    def onTopic(alias: String, subProjection: TopicResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Topic").alias(alias).projection(subProjection))
        this
    }

    def onRelease(subProjection: ReleaseResponseProjection): NodeResponseProjection = {
        onRelease(null.asInstanceOf[String], subProjection)
    }

    def onRelease(alias: String, subProjection: ReleaseResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Release").alias(alias).projection(subProjection))
        this
    }

    def onUnpinnedEvent(subProjection: UnpinnedEventResponseProjection): NodeResponseProjection = {
        onUnpinnedEvent(null.asInstanceOf[String], subProjection)
    }

    def onUnpinnedEvent(alias: String, subProjection: UnpinnedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection))
        this
    }

    def onOrganizationInvitation(subProjection: OrganizationInvitationResponseProjection): NodeResponseProjection = {
        onOrganizationInvitation(null.asInstanceOf[String], subProjection)
    }

    def onOrganizationInvitation(alias: String, subProjection: OrganizationInvitationResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on OrganizationInvitation").alias(alias).projection(subProjection))
        this
    }

    def onBaseRefForcePushedEvent(subProjection: BaseRefForcePushedEventResponseProjection): NodeResponseProjection = {
        onBaseRefForcePushedEvent(null.asInstanceOf[String], subProjection)
    }

    def onBaseRefForcePushedEvent(alias: String, subProjection: BaseRefForcePushedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): NodeResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onReopenedEvent(subProjection: ReopenedEventResponseProjection): NodeResponseProjection = {
        onReopenedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReopenedEvent(alias: String, subProjection: ReopenedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection))
        this
    }

    def onBranchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): NodeResponseProjection = {
        onBranchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def onBranchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on BranchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): NodeResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onProjectCard(subProjection: ProjectCardResponseProjection): NodeResponseProjection = {
        onProjectCard(null.asInstanceOf[String], subProjection)
    }

    def onProjectCard(alias: String, subProjection: ProjectCardResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ProjectCard").alias(alias).projection(subProjection))
        this
    }

    def onMarketplaceListing(subProjection: MarketplaceListingResponseProjection): NodeResponseProjection = {
        onMarketplaceListing(null.asInstanceOf[String], subProjection)
    }

    def onMarketplaceListing(alias: String, subProjection: MarketplaceListingResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarketplaceListing").alias(alias).projection(subProjection))
        this
    }

    def onExternalIdentity(subProjection: ExternalIdentityResponseProjection): NodeResponseProjection = {
        onExternalIdentity(null.asInstanceOf[String], subProjection)
    }

    def onExternalIdentity(alias: String, subProjection: ExternalIdentityResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on ExternalIdentity").alias(alias).projection(subProjection))
        this
    }

    def onAssignedEvent(subProjection: AssignedEventResponseProjection): NodeResponseProjection = {
        onAssignedEvent(null.asInstanceOf[String], subProjection)
    }

    def onAssignedEvent(alias: String, subProjection: AssignedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection))
        this
    }

    def onMergedEvent(subProjection: MergedEventResponseProjection): NodeResponseProjection = {
        onMergedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMergedEvent(alias: String, subProjection: MergedEventResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewThread(subProjection: PullRequestReviewThreadResponseProjection): NodeResponseProjection = {
        onPullRequestReviewThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewThread(alias: String, subProjection: PullRequestReviewThreadResponseProjection): NodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection))
        this
    }

    def typename(): NodeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): NodeResponseProjection = {
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
        val that = obj.asInstanceOf[NodeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
