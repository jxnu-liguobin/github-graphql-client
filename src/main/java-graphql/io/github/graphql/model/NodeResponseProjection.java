package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Node
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class NodeResponseProjection extends GraphQLResponseProjection {

    public NodeResponseProjection() {
    }

    @Override
    public NodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public NodeResponseProjection all$(int maxDepth) {
        this.id();
        this.typename();
        return this;
    }

    public NodeResponseProjection id() {
        return id(null);
    }

    public NodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NodeResponseProjection onApp(AppResponseProjection subProjection) {
        return onApp(null, subProjection);
    }

    public NodeResponseProjection onApp(String alias, AppResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on App").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRepositoryInvitation(RepositoryInvitationResponseProjection subProjection) {
        return onRepositoryInvitation(null, subProjection);
    }

    public NodeResponseProjection onRepositoryInvitation(String alias, RepositoryInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RepositoryInvitation").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProjectColumn(ProjectColumnResponseProjection subProjection) {
        return onProjectColumn(null, subProjection);
    }

    public NodeResponseProjection onProjectColumn(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ProjectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public NodeResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLicense(LicenseResponseProjection subProjection) {
        return onLicense(null, subProjection);
    }

    public NodeResponseProjection onLicense(String alias, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on License").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReviewRequestedEvent(ReviewRequestedEventResponseProjection subProjection) {
        return onReviewRequestedEvent(null, subProjection);
    }

    public NodeResponseProjection onReviewRequestedEvent(String alias, ReviewRequestedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUserStatus(UserStatusResponseProjection subProjection) {
        return onUserStatus(null, subProjection);
    }

    public NodeResponseProjection onUserStatus(String alias, UserStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserStatus").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRegistryPackageDependency(RegistryPackageDependencyResponseProjection subProjection) {
        return onRegistryPackageDependency(null, subProjection);
    }

    public NodeResponseProjection onRegistryPackageDependency(String alias, RegistryPackageDependencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RegistryPackageDependency").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLabeledEvent(LabeledEventResponseProjection subProjection) {
        return onLabeledEvent(null, subProjection);
    }

    public NodeResponseProjection onLabeledEvent(String alias, LabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSponsorsListing(SponsorsListingResponseProjection subProjection) {
        return onSponsorsListing(null, subProjection);
    }

    public NodeResponseProjection onSponsorsListing(String alias, SponsorsListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SponsorsListing").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMarkedAsDuplicateEvent(MarkedAsDuplicateEventResponseProjection subProjection) {
        return onMarkedAsDuplicateEvent(null, subProjection);
    }

    public NodeResponseProjection onMarkedAsDuplicateEvent(String alias, MarkedAsDuplicateEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MarkedAsDuplicateEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSubscribedEvent(SubscribedEventResponseProjection subProjection) {
        return onSubscribedEvent(null, subProjection);
    }

    public NodeResponseProjection onSubscribedEvent(String alias, SubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDemilestonedEvent(DemilestonedEventResponseProjection subProjection) {
        return onDemilestonedEvent(null, subProjection);
    }

    public NodeResponseProjection onDemilestonedEvent(String alias, DemilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DemilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onStatus(StatusResponseProjection subProjection) {
        return onStatus(null, subProjection);
    }

    public NodeResponseProjection onStatus(String alias, StatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Status").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMovedColumnsInProjectEvent(MovedColumnsInProjectEventResponseProjection subProjection) {
        return onMovedColumnsInProjectEvent(null, subProjection);
    }

    public NodeResponseProjection onMovedColumnsInProjectEvent(String alias, MovedColumnsInProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MovedColumnsInProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUnlabeledEvent(UnlabeledEventResponseProjection subProjection) {
        return onUnlabeledEvent(null, subProjection);
    }

    public NodeResponseProjection onUnlabeledEvent(String alias, UnlabeledEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlabeledEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCommitCommentThread(CommitCommentThreadResponseProjection subProjection) {
        return onCommitCommentThread(null, subProjection);
    }

    public NodeResponseProjection onCommitCommentThread(String alias, CommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMarketplaceCategory(MarketplaceCategoryResponseProjection subProjection) {
        return onMarketplaceCategory(null, subProjection);
    }

    public NodeResponseProjection onMarketplaceCategory(String alias, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MarketplaceCategory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSponsorship(SponsorshipResponseProjection subProjection) {
        return onSponsorship(null, subProjection);
    }

    public NodeResponseProjection onSponsorship(String alias, SponsorshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Sponsorship").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProject(ProjectResponseProjection subProjection) {
        return onProject(null, subProjection);
    }

    public NodeResponseProjection onProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReadyForReviewEvent(ReadyForReviewEventResponseProjection subProjection) {
        return onReadyForReviewEvent(null, subProjection);
    }

    public NodeResponseProjection onReadyForReviewEvent(String alias, ReadyForReviewEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public NodeResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReviewRequest(ReviewRequestResponseProjection subProjection) {
        return onReviewRequest(null, subProjection);
    }

    public NodeResponseProjection onReviewRequest(String alias, ReviewRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequest").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReviewDismissalAllowance(ReviewDismissalAllowanceResponseProjection subProjection) {
        return onReviewDismissalAllowance(null, subProjection);
    }

    public NodeResponseProjection onReviewDismissalAllowance(String alias, ReviewDismissalAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewDismissalAllowance").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUserContentEdit(UserContentEditResponseProjection subProjection) {
        return onUserContentEdit(null, subProjection);
    }

    public NodeResponseProjection onUserContentEdit(String alias, UserContentEditResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserContentEdit").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDeploymentEnvironmentChangedEvent(DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        return onDeploymentEnvironmentChangedEvent(null, subProjection);
    }

    public NodeResponseProjection onDeploymentEnvironmentChangedEvent(String alias, DeploymentEnvironmentChangedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeploymentEnvironmentChangedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public NodeResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public NodeResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequestCommitCommentThread(PullRequestCommitCommentThreadResponseProjection subProjection) {
        return onPullRequestCommitCommentThread(null, subProjection);
    }

    public NodeResponseProjection onPullRequestCommitCommentThread(String alias, PullRequestCommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public NodeResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRegistryPackage(RegistryPackageResponseProjection subProjection) {
        return onRegistryPackage(null, subProjection);
    }

    public NodeResponseProjection onRegistryPackage(String alias, RegistryPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RegistryPackage").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMentionedEvent(MentionedEventResponseProjection subProjection) {
        return onMentionedEvent(null, subProjection);
    }

    public NodeResponseProjection onMentionedEvent(String alias, MentionedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MentionedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUnsubscribedEvent(UnsubscribedEventResponseProjection subProjection) {
        return onUnsubscribedEvent(null, subProjection);
    }

    public NodeResponseProjection onUnsubscribedEvent(String alias, UnsubscribedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnsubscribedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public NodeResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReferencedEvent(ReferencedEventResponseProjection subProjection) {
        return onReferencedEvent(null, subProjection);
    }

    public NodeResponseProjection onReferencedEvent(String alias, ReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLockedEvent(LockedEventResponseProjection subProjection) {
        return onLockedEvent(null, subProjection);
    }

    public NodeResponseProjection onLockedEvent(String alias, LockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on LockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRemovedFromProjectEvent(RemovedFromProjectEventResponseProjection subProjection) {
        return onRemovedFromProjectEvent(null, subProjection);
    }

    public NodeResponseProjection onRemovedFromProjectEvent(String alias, RemovedFromProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RemovedFromProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUnlockedEvent(UnlockedEventResponseProjection subProjection) {
        return onUnlockedEvent(null, subProjection);
    }

    public NodeResponseProjection onUnlockedEvent(String alias, UnlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReaction(ReactionResponseProjection subProjection) {
        return onReaction(null, subProjection);
    }

    public NodeResponseProjection onReaction(String alias, ReactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Reaction").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUnassignedEvent(UnassignedEventResponseProjection subProjection) {
        return onUnassignedEvent(null, subProjection);
    }

    public NodeResponseProjection onUnassignedEvent(String alias, UnassignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnassignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public NodeResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRef(RefResponseProjection subProjection) {
        return onRef(null, subProjection);
    }

    public NodeResponseProjection onRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Ref").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public NodeResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onHeadRefForcePushedEvent(HeadRefForcePushedEventResponseProjection subProjection) {
        return onHeadRefForcePushedEvent(null, subProjection);
    }

    public NodeResponseProjection onHeadRefForcePushedEvent(String alias, HeadRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMannequin(MannequinResponseProjection subProjection) {
        return onMannequin(null, subProjection);
    }

    public NodeResponseProjection onMannequin(String alias, MannequinResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSavedReply(SavedReplyResponseProjection subProjection) {
        return onSavedReply(null, subProjection);
    }

    public NodeResponseProjection onSavedReply(String alias, SavedReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SavedReply").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onHeadRefRestoredEvent(HeadRefRestoredEventResponseProjection subProjection) {
        return onHeadRefRestoredEvent(null, subProjection);
    }

    public NodeResponseProjection onHeadRefRestoredEvent(String alias, HeadRefRestoredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefRestoredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRegistryPackageFile(RegistryPackageFileResponseProjection subProjection) {
        return onRegistryPackageFile(null, subProjection);
    }

    public NodeResponseProjection onRegistryPackageFile(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RegistryPackageFile").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTag(TagResponseProjection subProjection) {
        return onTag(null, subProjection);
    }

    public NodeResponseProjection onTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onStatusContext(StatusContextResponseProjection subProjection) {
        return onStatusContext(null, subProjection);
    }

    public NodeResponseProjection onStatusContext(String alias, StatusContextResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on StatusContext").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDeploymentStatus(DeploymentStatusResponseProjection subProjection) {
        return onDeploymentStatus(null, subProjection);
    }

    public NodeResponseProjection onDeploymentStatus(String alias, DeploymentStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeploymentStatus").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRegistryPackageTag(RegistryPackageTagResponseProjection subProjection) {
        return onRegistryPackageTag(null, subProjection);
    }

    public NodeResponseProjection onRegistryPackageTag(String alias, RegistryPackageTagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RegistryPackageTag").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public NodeResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDeployKey(DeployKeyResponseProjection subProjection) {
        return onDeployKey(null, subProjection);
    }

    public NodeResponseProjection onDeployKey(String alias, DeployKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeployKey").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLabel(LabelResponseProjection subProjection) {
        return onLabel(null, subProjection);
    }

    public NodeResponseProjection onLabel(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Label").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDeployment(DeploymentResponseProjection subProjection) {
        return onDeployment(null, subProjection);
    }

    public NodeResponseProjection onDeployment(String alias, DeploymentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Deployment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBaseRefChangedEvent(BaseRefChangedEventResponseProjection subProjection) {
        return onBaseRefChangedEvent(null, subProjection);
    }

    public NodeResponseProjection onBaseRefChangedEvent(String alias, BaseRefChangedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BaseRefChangedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCommentDeletedEvent(CommentDeletedEventResponseProjection subProjection) {
        return onCommentDeletedEvent(null, subProjection);
    }

    public NodeResponseProjection onCommentDeletedEvent(String alias, CommentDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommentDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUserBlockedEvent(UserBlockedEventResponseProjection subProjection) {
        return onUserBlockedEvent(null, subProjection);
    }

    public NodeResponseProjection onUserBlockedEvent(String alias, UserBlockedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserBlockedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRepositoryTopic(RepositoryTopicResponseProjection subProjection) {
        return onRepositoryTopic(null, subProjection);
    }

    public NodeResponseProjection onRepositoryTopic(String alias, RepositoryTopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRegistryPackageVersion(RegistryPackageVersionResponseProjection subProjection) {
        return onRegistryPackageVersion(null, subProjection);
    }

    public NodeResponseProjection onRegistryPackageVersion(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RegistryPackageVersion").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTree(TreeResponseProjection subProjection) {
        return onTree(null, subProjection);
    }

    public NodeResponseProjection onTree(String alias, TreeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tree").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTransferredEvent(TransferredEventResponseProjection subProjection) {
        return onTransferredEvent(null, subProjection);
    }

    public NodeResponseProjection onTransferredEvent(String alias, TransferredEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on TransferredEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReviewRequestRemovedEvent(ReviewRequestRemovedEventResponseProjection subProjection) {
        return onReviewRequestRemovedEvent(null, subProjection);
    }

    public NodeResponseProjection onReviewRequestRemovedEvent(String alias, ReviewRequestRemovedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewRequestRemovedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBlob(BlobResponseProjection subProjection) {
        return onBlob(null, subProjection);
    }

    public NodeResponseProjection onBlob(String alias, BlobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Blob").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMilestonedEvent(MilestonedEventResponseProjection subProjection) {
        return onMilestonedEvent(null, subProjection);
    }

    public NodeResponseProjection onMilestonedEvent(String alias, MilestonedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MilestonedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRenamedTitleEvent(RenamedTitleEventResponseProjection subProjection) {
        return onRenamedTitleEvent(null, subProjection);
    }

    public NodeResponseProjection onRenamedTitleEvent(String alias, RenamedTitleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RenamedTitleEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPublicKey(PublicKeyResponseProjection subProjection) {
        return onPublicKey(null, subProjection);
    }

    public NodeResponseProjection onPublicKey(String alias, PublicKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PublicKey").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMilestone(MilestoneResponseProjection subProjection) {
        return onMilestone(null, subProjection);
    }

    public NodeResponseProjection onMilestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBot(BotResponseProjection subProjection) {
        return onBot(null, subProjection);
    }

    public NodeResponseProjection onBot(String alias, BotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPushAllowance(PushAllowanceResponseProjection subProjection) {
        return onPushAllowance(null, subProjection);
    }

    public NodeResponseProjection onPushAllowance(String alias, PushAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PushAllowance").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onHeadRefDeletedEvent(HeadRefDeletedEventResponseProjection subProjection) {
        return onHeadRefDeletedEvent(null, subProjection);
    }

    public NodeResponseProjection onHeadRefDeletedEvent(String alias, HeadRefDeletedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on HeadRefDeletedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onConvertedNoteToIssueEvent(ConvertedNoteToIssueEventResponseProjection subProjection) {
        return onConvertedNoteToIssueEvent(null, subProjection);
    }

    public NodeResponseProjection onConvertedNoteToIssueEvent(String alias, ConvertedNoteToIssueEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ConvertedNoteToIssueEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReleaseAsset(ReleaseAssetResponseProjection subProjection) {
        return onReleaseAsset(null, subProjection);
    }

    public NodeResponseProjection onReleaseAsset(String alias, ReleaseAssetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReleaseAsset").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onSecurityAdvisory(SecurityAdvisoryResponseProjection subProjection) {
        return onSecurityAdvisory(null, subProjection);
    }

    public NodeResponseProjection onSecurityAdvisory(String alias, SecurityAdvisoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SecurityAdvisory").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPinnedEvent(PinnedEventResponseProjection subProjection) {
        return onPinnedEvent(null, subProjection);
    }

    public NodeResponseProjection onPinnedEvent(String alias, PinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCodeOfConduct(CodeOfConductResponseProjection subProjection) {
        return onCodeOfConduct(null, subProjection);
    }

    public NodeResponseProjection onCodeOfConduct(String alias, CodeOfConductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CodeOfConduct").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onGist(GistResponseProjection subProjection) {
        return onGist(null, subProjection);
    }

    public NodeResponseProjection onGist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public NodeResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public NodeResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrganizationIdentityProvider(OrganizationIdentityProviderResponseProjection subProjection) {
        return onOrganizationIdentityProvider(null, subProjection);
    }

    public NodeResponseProjection onOrganizationIdentityProvider(String alias, OrganizationIdentityProviderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on OrganizationIdentityProvider").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onAddedToProjectEvent(AddedToProjectEventResponseProjection subProjection) {
        return onAddedToProjectEvent(null, subProjection);
    }

    public NodeResponseProjection onAddedToProjectEvent(String alias, AddedToProjectEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AddedToProjectEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onGistComment(GistCommentResponseProjection subProjection) {
        return onGistComment(null, subProjection);
    }

    public NodeResponseProjection onGistComment(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequestCommit(PullRequestCommitResponseProjection subProjection) {
        return onPullRequestCommit(null, subProjection);
    }

    public NodeResponseProjection onPullRequestCommit(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onDeployedEvent(DeployedEventResponseProjection subProjection) {
        return onDeployedEvent(null, subProjection);
    }

    public NodeResponseProjection onDeployedEvent(String alias, DeployedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on DeployedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReviewDismissedEvent(ReviewDismissedEventResponseProjection subProjection) {
        return onReviewDismissedEvent(null, subProjection);
    }

    public NodeResponseProjection onReviewDismissedEvent(String alias, ReviewDismissedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onLanguage(LanguageResponseProjection subProjection) {
        return onLanguage(null, subProjection);
    }

    public NodeResponseProjection onLanguage(String alias, LanguageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Language").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onTopic(TopicResponseProjection subProjection) {
        return onTopic(null, subProjection);
    }

    public NodeResponseProjection onTopic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Topic").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onRelease(ReleaseResponseProjection subProjection) {
        return onRelease(null, subProjection);
    }

    public NodeResponseProjection onRelease(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Release").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onUnpinnedEvent(UnpinnedEventResponseProjection subProjection) {
        return onUnpinnedEvent(null, subProjection);
    }

    public NodeResponseProjection onUnpinnedEvent(String alias, UnpinnedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnpinnedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onOrganizationInvitation(OrganizationInvitationResponseProjection subProjection) {
        return onOrganizationInvitation(null, subProjection);
    }

    public NodeResponseProjection onOrganizationInvitation(String alias, OrganizationInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on OrganizationInvitation").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBaseRefForcePushedEvent(BaseRefForcePushedEventResponseProjection subProjection) {
        return onBaseRefForcePushedEvent(null, subProjection);
    }

    public NodeResponseProjection onBaseRefForcePushedEvent(String alias, BaseRefForcePushedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BaseRefForcePushedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public NodeResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onReopenedEvent(ReopenedEventResponseProjection subProjection) {
        return onReopenedEvent(null, subProjection);
    }

    public NodeResponseProjection onReopenedEvent(String alias, ReopenedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReopenedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onBranchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return onBranchProtectionRule(null, subProjection);
    }

    public NodeResponseProjection onBranchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on BranchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public NodeResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onProjectCard(ProjectCardResponseProjection subProjection) {
        return onProjectCard(null, subProjection);
    }

    public NodeResponseProjection onProjectCard(String alias, ProjectCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ProjectCard").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMarketplaceListing(MarketplaceListingResponseProjection subProjection) {
        return onMarketplaceListing(null, subProjection);
    }

    public NodeResponseProjection onMarketplaceListing(String alias, MarketplaceListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MarketplaceListing").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onExternalIdentity(ExternalIdentityResponseProjection subProjection) {
        return onExternalIdentity(null, subProjection);
    }

    public NodeResponseProjection onExternalIdentity(String alias, ExternalIdentityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ExternalIdentity").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onAssignedEvent(AssignedEventResponseProjection subProjection) {
        return onAssignedEvent(null, subProjection);
    }

    public NodeResponseProjection onAssignedEvent(String alias, AssignedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AssignedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onMergedEvent(MergedEventResponseProjection subProjection) {
        return onMergedEvent(null, subProjection);
    }

    public NodeResponseProjection onMergedEvent(String alias, MergedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection onPullRequestReviewThread(PullRequestReviewThreadResponseProjection subProjection) {
        return onPullRequestReviewThread(null, subProjection);
    }

    public NodeResponseProjection onPullRequestReviewThread(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewThread").alias(alias).projection(subProjection));
        return this;
    }

    public NodeResponseProjection typename() {
        return typename(null);
    }

    public NodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
