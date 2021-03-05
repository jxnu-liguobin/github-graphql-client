package io.github.graphql.resolver

import io.github.graphql.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MutationResolver {

    @Throws(Exception::class)
    fun acceptTopicSuggestion(input: AcceptTopicSuggestionInputTO): AcceptTopicSuggestionPayloadTO?

    @Throws(Exception::class)
    fun addAssigneesToAssignable(input: AddAssigneesToAssignableInputTO): AddAssigneesToAssignablePayloadTO?

    @Throws(Exception::class)
    fun addComment(input: AddCommentInputTO): AddCommentPayloadTO?

    @Throws(Exception::class)
    fun addLabelsToLabelable(input: AddLabelsToLabelableInputTO): AddLabelsToLabelablePayloadTO?

    @Throws(Exception::class)
    fun addProjectCard(input: AddProjectCardInputTO): AddProjectCardPayloadTO?

    @Throws(Exception::class)
    fun addProjectColumn(input: AddProjectColumnInputTO): AddProjectColumnPayloadTO?

    @Throws(Exception::class)
    fun addPullRequestReview(input: AddPullRequestReviewInputTO): AddPullRequestReviewPayloadTO?

    @Throws(Exception::class)
    fun addPullRequestReviewComment(input: AddPullRequestReviewCommentInputTO): AddPullRequestReviewCommentPayloadTO?

    @Throws(Exception::class)
    fun addReaction(input: AddReactionInputTO): AddReactionPayloadTO?

    @Throws(Exception::class)
    fun addStar(input: AddStarInputTO): AddStarPayloadTO?

    @Throws(Exception::class)
    fun changeUserStatus(input: ChangeUserStatusInputTO): ChangeUserStatusPayloadTO?

    @Throws(Exception::class)
    fun clearLabelsFromLabelable(input: ClearLabelsFromLabelableInputTO): ClearLabelsFromLabelablePayloadTO?

    @Throws(Exception::class)
    fun cloneProject(input: CloneProjectInputTO): CloneProjectPayloadTO?

    @Throws(Exception::class)
    fun cloneTemplateRepository(input: CloneTemplateRepositoryInputTO): CloneTemplateRepositoryPayloadTO?

    @Throws(Exception::class)
    fun closeIssue(input: CloseIssueInputTO): CloseIssuePayloadTO?

    @Throws(Exception::class)
    fun closePullRequest(input: ClosePullRequestInputTO): ClosePullRequestPayloadTO?

    @Throws(Exception::class)
    fun convertProjectCardNoteToIssue(input: ConvertProjectCardNoteToIssueInputTO): ConvertProjectCardNoteToIssuePayloadTO?

    @Throws(Exception::class)
    fun createBranchProtectionRule(input: CreateBranchProtectionRuleInputTO): CreateBranchProtectionRulePayloadTO?

    @Throws(Exception::class)
    fun createIssue(input: CreateIssueInputTO): CreateIssuePayloadTO?

    @Throws(Exception::class)
    fun createProject(input: CreateProjectInputTO): CreateProjectPayloadTO?

    @Throws(Exception::class)
    fun createPullRequest(input: CreatePullRequestInputTO): CreatePullRequestPayloadTO?

    @Throws(Exception::class)
    fun createRef(input: CreateRefInputTO): CreateRefPayloadTO?

    @Throws(Exception::class)
    fun createRepository(input: CreateRepositoryInputTO): CreateRepositoryPayloadTO?

    @Throws(Exception::class)
    fun declineTopicSuggestion(input: DeclineTopicSuggestionInputTO): DeclineTopicSuggestionPayloadTO?

    @Throws(Exception::class)
    fun deleteBranchProtectionRule(input: DeleteBranchProtectionRuleInputTO): DeleteBranchProtectionRulePayloadTO?

    @Throws(Exception::class)
    fun deleteIssue(input: DeleteIssueInputTO): DeleteIssuePayloadTO?

    @Throws(Exception::class)
    fun deleteIssueComment(input: DeleteIssueCommentInputTO): DeleteIssueCommentPayloadTO?

    @Throws(Exception::class)
    fun deleteProject(input: DeleteProjectInputTO): DeleteProjectPayloadTO?

    @Throws(Exception::class)
    fun deleteProjectCard(input: DeleteProjectCardInputTO): DeleteProjectCardPayloadTO?

    @Throws(Exception::class)
    fun deleteProjectColumn(input: DeleteProjectColumnInputTO): DeleteProjectColumnPayloadTO?

    @Throws(Exception::class)
    fun deletePullRequestReview(input: DeletePullRequestReviewInputTO): DeletePullRequestReviewPayloadTO?

    @Throws(Exception::class)
    fun deletePullRequestReviewComment(input: DeletePullRequestReviewCommentInputTO): DeletePullRequestReviewCommentPayloadTO?

    @Throws(Exception::class)
    fun deleteRef(input: DeleteRefInputTO): DeleteRefPayloadTO?

    @Throws(Exception::class)
    fun dismissPullRequestReview(input: DismissPullRequestReviewInputTO): DismissPullRequestReviewPayloadTO?

    @Throws(Exception::class)
    fun linkRepositoryToProject(input: LinkRepositoryToProjectInputTO): LinkRepositoryToProjectPayloadTO?

    @Throws(Exception::class)
    fun lockLockable(input: LockLockableInputTO): LockLockablePayloadTO?

    @Throws(Exception::class)
    fun mergeBranch(input: MergeBranchInputTO): MergeBranchPayloadTO?

    @Throws(Exception::class)
    fun mergePullRequest(input: MergePullRequestInputTO): MergePullRequestPayloadTO?

    @Throws(Exception::class)
    fun moveProjectCard(input: MoveProjectCardInputTO): MoveProjectCardPayloadTO?

    @Throws(Exception::class)
    fun moveProjectColumn(input: MoveProjectColumnInputTO): MoveProjectColumnPayloadTO?

    @Throws(Exception::class)
    fun removeAssigneesFromAssignable(input: RemoveAssigneesFromAssignableInputTO): RemoveAssigneesFromAssignablePayloadTO?

    @Throws(Exception::class)
    fun removeLabelsFromLabelable(input: RemoveLabelsFromLabelableInputTO): RemoveLabelsFromLabelablePayloadTO?

    @Throws(Exception::class)
    fun removeOutsideCollaborator(input: RemoveOutsideCollaboratorInputTO): RemoveOutsideCollaboratorPayloadTO?

    @Throws(Exception::class)
    fun removeReaction(input: RemoveReactionInputTO): RemoveReactionPayloadTO?

    @Throws(Exception::class)
    fun removeStar(input: RemoveStarInputTO): RemoveStarPayloadTO?

    @Throws(Exception::class)
    fun reopenIssue(input: ReopenIssueInputTO): ReopenIssuePayloadTO?

    @Throws(Exception::class)
    fun reopenPullRequest(input: ReopenPullRequestInputTO): ReopenPullRequestPayloadTO?

    @Throws(Exception::class)
    fun requestReviews(input: RequestReviewsInputTO): RequestReviewsPayloadTO?

    @Throws(Exception::class)
    fun resolveReviewThread(input: ResolveReviewThreadInputTO): ResolveReviewThreadPayloadTO?

    @Throws(Exception::class)
    fun submitPullRequestReview(input: SubmitPullRequestReviewInputTO): SubmitPullRequestReviewPayloadTO?

    @Throws(Exception::class)
    fun unlinkRepositoryFromProject(input: UnlinkRepositoryFromProjectInputTO): UnlinkRepositoryFromProjectPayloadTO?

    @Throws(Exception::class)
    fun unlockLockable(input: UnlockLockableInputTO): UnlockLockablePayloadTO?

    @Throws(Exception::class)
    fun unmarkIssueAsDuplicate(input: UnmarkIssueAsDuplicateInputTO): UnmarkIssueAsDuplicatePayloadTO?

    @Throws(Exception::class)
    fun unresolveReviewThread(input: UnresolveReviewThreadInputTO): UnresolveReviewThreadPayloadTO?

    @Throws(Exception::class)
    fun updateBranchProtectionRule(input: UpdateBranchProtectionRuleInputTO): UpdateBranchProtectionRulePayloadTO?

    @Throws(Exception::class)
    fun updateIssue(input: UpdateIssueInputTO): UpdateIssuePayloadTO?

    @Throws(Exception::class)
    fun updateIssueComment(input: UpdateIssueCommentInputTO): UpdateIssueCommentPayloadTO?

    @Throws(Exception::class)
    fun updateProject(input: UpdateProjectInputTO): UpdateProjectPayloadTO?

    @Throws(Exception::class)
    fun updateProjectCard(input: UpdateProjectCardInputTO): UpdateProjectCardPayloadTO?

    @Throws(Exception::class)
    fun updateProjectColumn(input: UpdateProjectColumnInputTO): UpdateProjectColumnPayloadTO?

    @Throws(Exception::class)
    fun updatePullRequest(input: UpdatePullRequestInputTO): UpdatePullRequestPayloadTO?

    @Throws(Exception::class)
    fun updatePullRequestReview(input: UpdatePullRequestReviewInputTO): UpdatePullRequestReviewPayloadTO?

    @Throws(Exception::class)
    fun updatePullRequestReviewComment(input: UpdatePullRequestReviewCommentInputTO): UpdatePullRequestReviewCommentPayloadTO?

    @Throws(Exception::class)
    fun updateRef(input: UpdateRefInputTO): UpdateRefPayloadTO?

    @Throws(Exception::class)
    fun updateRepository(input: UpdateRepositoryInputTO): UpdateRepositoryPayloadTO?

    @Throws(Exception::class)
    fun updateSubscription(input: UpdateSubscriptionInputTO): UpdateSubscriptionPayloadTO?

    @Throws(Exception::class)
    fun updateTopics(input: UpdateTopicsInputTO): UpdateTopicsPayloadTO?

}
