package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface MutationResolver {

    AcceptTopicSuggestionPayloadTO acceptTopicSuggestion(AcceptTopicSuggestionInputTO input) throws Exception;

    AddAssigneesToAssignablePayloadTO addAssigneesToAssignable(AddAssigneesToAssignableInputTO input) throws Exception;

    AddCommentPayloadTO addComment(AddCommentInputTO input) throws Exception;

    AddLabelsToLabelablePayloadTO addLabelsToLabelable(AddLabelsToLabelableInputTO input) throws Exception;

    AddProjectCardPayloadTO addProjectCard(AddProjectCardInputTO input) throws Exception;

    AddProjectColumnPayloadTO addProjectColumn(AddProjectColumnInputTO input) throws Exception;

    AddPullRequestReviewPayloadTO addPullRequestReview(AddPullRequestReviewInputTO input) throws Exception;

    AddPullRequestReviewCommentPayloadTO addPullRequestReviewComment(AddPullRequestReviewCommentInputTO input) throws Exception;

    AddReactionPayloadTO addReaction(AddReactionInputTO input) throws Exception;

    AddStarPayloadTO addStar(AddStarInputTO input) throws Exception;

    ChangeUserStatusPayloadTO changeUserStatus(ChangeUserStatusInputTO input) throws Exception;

    ClearLabelsFromLabelablePayloadTO clearLabelsFromLabelable(ClearLabelsFromLabelableInputTO input) throws Exception;

    CloneProjectPayloadTO cloneProject(CloneProjectInputTO input) throws Exception;

    CloneTemplateRepositoryPayloadTO cloneTemplateRepository(CloneTemplateRepositoryInputTO input) throws Exception;

    CloseIssuePayloadTO closeIssue(CloseIssueInputTO input) throws Exception;

    ClosePullRequestPayloadTO closePullRequest(ClosePullRequestInputTO input) throws Exception;

    ConvertProjectCardNoteToIssuePayloadTO convertProjectCardNoteToIssue(ConvertProjectCardNoteToIssueInputTO input) throws Exception;

    CreateBranchProtectionRulePayloadTO createBranchProtectionRule(CreateBranchProtectionRuleInputTO input) throws Exception;

    CreateIssuePayloadTO createIssue(CreateIssueInputTO input) throws Exception;

    CreateProjectPayloadTO createProject(CreateProjectInputTO input) throws Exception;

    CreatePullRequestPayloadTO createPullRequest(CreatePullRequestInputTO input) throws Exception;

    CreateRefPayloadTO createRef(CreateRefInputTO input) throws Exception;

    CreateRepositoryPayloadTO createRepository(CreateRepositoryInputTO input) throws Exception;

    DeclineTopicSuggestionPayloadTO declineTopicSuggestion(DeclineTopicSuggestionInputTO input) throws Exception;

    DeleteBranchProtectionRulePayloadTO deleteBranchProtectionRule(DeleteBranchProtectionRuleInputTO input) throws Exception;

    DeleteIssuePayloadTO deleteIssue(DeleteIssueInputTO input) throws Exception;

    DeleteIssueCommentPayloadTO deleteIssueComment(DeleteIssueCommentInputTO input) throws Exception;

    DeleteProjectPayloadTO deleteProject(DeleteProjectInputTO input) throws Exception;

    DeleteProjectCardPayloadTO deleteProjectCard(DeleteProjectCardInputTO input) throws Exception;

    DeleteProjectColumnPayloadTO deleteProjectColumn(DeleteProjectColumnInputTO input) throws Exception;

    DeletePullRequestReviewPayloadTO deletePullRequestReview(DeletePullRequestReviewInputTO input) throws Exception;

    DeletePullRequestReviewCommentPayloadTO deletePullRequestReviewComment(DeletePullRequestReviewCommentInputTO input) throws Exception;

    DeleteRefPayloadTO deleteRef(DeleteRefInputTO input) throws Exception;

    DismissPullRequestReviewPayloadTO dismissPullRequestReview(DismissPullRequestReviewInputTO input) throws Exception;

    LinkRepositoryToProjectPayloadTO linkRepositoryToProject(LinkRepositoryToProjectInputTO input) throws Exception;

    LockLockablePayloadTO lockLockable(LockLockableInputTO input) throws Exception;

    MergeBranchPayloadTO mergeBranch(MergeBranchInputTO input) throws Exception;

    MergePullRequestPayloadTO mergePullRequest(MergePullRequestInputTO input) throws Exception;

    MoveProjectCardPayloadTO moveProjectCard(MoveProjectCardInputTO input) throws Exception;

    MoveProjectColumnPayloadTO moveProjectColumn(MoveProjectColumnInputTO input) throws Exception;

    RemoveAssigneesFromAssignablePayloadTO removeAssigneesFromAssignable(RemoveAssigneesFromAssignableInputTO input) throws Exception;

    RemoveLabelsFromLabelablePayloadTO removeLabelsFromLabelable(RemoveLabelsFromLabelableInputTO input) throws Exception;

    RemoveOutsideCollaboratorPayloadTO removeOutsideCollaborator(RemoveOutsideCollaboratorInputTO input) throws Exception;

    RemoveReactionPayloadTO removeReaction(RemoveReactionInputTO input) throws Exception;

    RemoveStarPayloadTO removeStar(RemoveStarInputTO input) throws Exception;

    ReopenIssuePayloadTO reopenIssue(ReopenIssueInputTO input) throws Exception;

    ReopenPullRequestPayloadTO reopenPullRequest(ReopenPullRequestInputTO input) throws Exception;

    RequestReviewsPayloadTO requestReviews(RequestReviewsInputTO input) throws Exception;

    ResolveReviewThreadPayloadTO resolveReviewThread(ResolveReviewThreadInputTO input) throws Exception;

    SubmitPullRequestReviewPayloadTO submitPullRequestReview(SubmitPullRequestReviewInputTO input) throws Exception;

    UnlinkRepositoryFromProjectPayloadTO unlinkRepositoryFromProject(UnlinkRepositoryFromProjectInputTO input) throws Exception;

    UnlockLockablePayloadTO unlockLockable(UnlockLockableInputTO input) throws Exception;

    UnmarkIssueAsDuplicatePayloadTO unmarkIssueAsDuplicate(UnmarkIssueAsDuplicateInputTO input) throws Exception;

    UnresolveReviewThreadPayloadTO unresolveReviewThread(UnresolveReviewThreadInputTO input) throws Exception;

    UpdateBranchProtectionRulePayloadTO updateBranchProtectionRule(UpdateBranchProtectionRuleInputTO input) throws Exception;

    UpdateIssuePayloadTO updateIssue(UpdateIssueInputTO input) throws Exception;

    UpdateIssueCommentPayloadTO updateIssueComment(UpdateIssueCommentInputTO input) throws Exception;

    UpdateProjectPayloadTO updateProject(UpdateProjectInputTO input) throws Exception;

    UpdateProjectCardPayloadTO updateProjectCard(UpdateProjectCardInputTO input) throws Exception;

    UpdateProjectColumnPayloadTO updateProjectColumn(UpdateProjectColumnInputTO input) throws Exception;

    UpdatePullRequestPayloadTO updatePullRequest(UpdatePullRequestInputTO input) throws Exception;

    UpdatePullRequestReviewPayloadTO updatePullRequestReview(UpdatePullRequestReviewInputTO input) throws Exception;

    UpdatePullRequestReviewCommentPayloadTO updatePullRequestReviewComment(UpdatePullRequestReviewCommentInputTO input) throws Exception;

    UpdateRefPayloadTO updateRef(UpdateRefInputTO input) throws Exception;

    UpdateRepositoryPayloadTO updateRepository(UpdateRepositoryInputTO input) throws Exception;

    UpdateSubscriptionPayloadTO updateSubscription(UpdateSubscriptionInputTO input) throws Exception;

    UpdateTopicsPayloadTO updateTopics(UpdateTopicsInputTO input) throws Exception;

}
