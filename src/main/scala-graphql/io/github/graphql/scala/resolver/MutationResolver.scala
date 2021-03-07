package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Mutation
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait MutationResolver {

    @throws[Exception]
    def acceptTopicSuggestion(input: AcceptTopicSuggestionInputTO): AcceptTopicSuggestionPayloadTO

    @throws[Exception]
    def addAssigneesToAssignable(input: AddAssigneesToAssignableInputTO): AddAssigneesToAssignablePayloadTO

    @throws[Exception]
    def addComment(input: AddCommentInputTO): AddCommentPayloadTO

    @throws[Exception]
    def addLabelsToLabelable(input: AddLabelsToLabelableInputTO): AddLabelsToLabelablePayloadTO

    @throws[Exception]
    def addProjectCard(input: AddProjectCardInputTO): AddProjectCardPayloadTO

    @throws[Exception]
    def addProjectColumn(input: AddProjectColumnInputTO): AddProjectColumnPayloadTO

    @throws[Exception]
    def addPullRequestReview(input: AddPullRequestReviewInputTO): AddPullRequestReviewPayloadTO

    @throws[Exception]
    def addPullRequestReviewComment(input: AddPullRequestReviewCommentInputTO): AddPullRequestReviewCommentPayloadTO

    @throws[Exception]
    def addReaction(input: AddReactionInputTO): AddReactionPayloadTO

    @throws[Exception]
    def addStar(input: AddStarInputTO): AddStarPayloadTO

    @throws[Exception]
    def changeUserStatus(input: ChangeUserStatusInputTO): ChangeUserStatusPayloadTO

    @throws[Exception]
    def clearLabelsFromLabelable(input: ClearLabelsFromLabelableInputTO): ClearLabelsFromLabelablePayloadTO

    @throws[Exception]
    def cloneProject(input: CloneProjectInputTO): CloneProjectPayloadTO

    @throws[Exception]
    def cloneTemplateRepository(input: CloneTemplateRepositoryInputTO): CloneTemplateRepositoryPayloadTO

    @throws[Exception]
    def closeIssue(input: CloseIssueInputTO): CloseIssuePayloadTO

    @throws[Exception]
    def closePullRequest(input: ClosePullRequestInputTO): ClosePullRequestPayloadTO

    @throws[Exception]
    def convertProjectCardNoteToIssue(input: ConvertProjectCardNoteToIssueInputTO): ConvertProjectCardNoteToIssuePayloadTO

    @throws[Exception]
    def createBranchProtectionRule(input: CreateBranchProtectionRuleInputTO): CreateBranchProtectionRulePayloadTO

    @throws[Exception]
    def createIssue(input: CreateIssueInputTO): CreateIssuePayloadTO

    @throws[Exception]
    def createProject(input: CreateProjectInputTO): CreateProjectPayloadTO

    @throws[Exception]
    def createPullRequest(input: CreatePullRequestInputTO): CreatePullRequestPayloadTO

    @throws[Exception]
    def createRef(input: CreateRefInputTO): CreateRefPayloadTO

    @throws[Exception]
    def createRepository(input: CreateRepositoryInputTO): CreateRepositoryPayloadTO

    @throws[Exception]
    def declineTopicSuggestion(input: DeclineTopicSuggestionInputTO): DeclineTopicSuggestionPayloadTO

    @throws[Exception]
    def deleteBranchProtectionRule(input: DeleteBranchProtectionRuleInputTO): DeleteBranchProtectionRulePayloadTO

    @throws[Exception]
    def deleteIssue(input: DeleteIssueInputTO): DeleteIssuePayloadTO

    @throws[Exception]
    def deleteIssueComment(input: DeleteIssueCommentInputTO): DeleteIssueCommentPayloadTO

    @throws[Exception]
    def deleteProject(input: DeleteProjectInputTO): DeleteProjectPayloadTO

    @throws[Exception]
    def deleteProjectCard(input: DeleteProjectCardInputTO): DeleteProjectCardPayloadTO

    @throws[Exception]
    def deleteProjectColumn(input: DeleteProjectColumnInputTO): DeleteProjectColumnPayloadTO

    @throws[Exception]
    def deletePullRequestReview(input: DeletePullRequestReviewInputTO): DeletePullRequestReviewPayloadTO

    @throws[Exception]
    def deletePullRequestReviewComment(input: DeletePullRequestReviewCommentInputTO): DeletePullRequestReviewCommentPayloadTO

    @throws[Exception]
    def deleteRef(input: DeleteRefInputTO): DeleteRefPayloadTO

    @throws[Exception]
    def dismissPullRequestReview(input: DismissPullRequestReviewInputTO): DismissPullRequestReviewPayloadTO

    @throws[Exception]
    def linkRepositoryToProject(input: LinkRepositoryToProjectInputTO): LinkRepositoryToProjectPayloadTO

    @throws[Exception]
    def lockLockable(input: LockLockableInputTO): LockLockablePayloadTO

    @throws[Exception]
    def mergeBranch(input: MergeBranchInputTO): MergeBranchPayloadTO

    @throws[Exception]
    def mergePullRequest(input: MergePullRequestInputTO): MergePullRequestPayloadTO

    @throws[Exception]
    def moveProjectCard(input: MoveProjectCardInputTO): MoveProjectCardPayloadTO

    @throws[Exception]
    def moveProjectColumn(input: MoveProjectColumnInputTO): MoveProjectColumnPayloadTO

    @throws[Exception]
    def removeAssigneesFromAssignable(input: RemoveAssigneesFromAssignableInputTO): RemoveAssigneesFromAssignablePayloadTO

    @throws[Exception]
    def removeLabelsFromLabelable(input: RemoveLabelsFromLabelableInputTO): RemoveLabelsFromLabelablePayloadTO

    @throws[Exception]
    def removeOutsideCollaborator(input: RemoveOutsideCollaboratorInputTO): RemoveOutsideCollaboratorPayloadTO

    @throws[Exception]
    def removeReaction(input: RemoveReactionInputTO): RemoveReactionPayloadTO

    @throws[Exception]
    def removeStar(input: RemoveStarInputTO): RemoveStarPayloadTO

    @throws[Exception]
    def reopenIssue(input: ReopenIssueInputTO): ReopenIssuePayloadTO

    @throws[Exception]
    def reopenPullRequest(input: ReopenPullRequestInputTO): ReopenPullRequestPayloadTO

    @throws[Exception]
    def requestReviews(input: RequestReviewsInputTO): RequestReviewsPayloadTO

    @throws[Exception]
    def resolveReviewThread(input: ResolveReviewThreadInputTO): ResolveReviewThreadPayloadTO

    @throws[Exception]
    def submitPullRequestReview(input: SubmitPullRequestReviewInputTO): SubmitPullRequestReviewPayloadTO

    @throws[Exception]
    def unlinkRepositoryFromProject(input: UnlinkRepositoryFromProjectInputTO): UnlinkRepositoryFromProjectPayloadTO

    @throws[Exception]
    def unlockLockable(input: UnlockLockableInputTO): UnlockLockablePayloadTO

    @throws[Exception]
    def unmarkIssueAsDuplicate(input: UnmarkIssueAsDuplicateInputTO): UnmarkIssueAsDuplicatePayloadTO

    @throws[Exception]
    def unresolveReviewThread(input: UnresolveReviewThreadInputTO): UnresolveReviewThreadPayloadTO

    @throws[Exception]
    def updateBranchProtectionRule(input: UpdateBranchProtectionRuleInputTO): UpdateBranchProtectionRulePayloadTO

    @throws[Exception]
    def updateIssue(input: UpdateIssueInputTO): UpdateIssuePayloadTO

    @throws[Exception]
    def updateIssueComment(input: UpdateIssueCommentInputTO): UpdateIssueCommentPayloadTO

    @throws[Exception]
    def updateProject(input: UpdateProjectInputTO): UpdateProjectPayloadTO

    @throws[Exception]
    def updateProjectCard(input: UpdateProjectCardInputTO): UpdateProjectCardPayloadTO

    @throws[Exception]
    def updateProjectColumn(input: UpdateProjectColumnInputTO): UpdateProjectColumnPayloadTO

    @throws[Exception]
    def updatePullRequest(input: UpdatePullRequestInputTO): UpdatePullRequestPayloadTO

    @throws[Exception]
    def updatePullRequestReview(input: UpdatePullRequestReviewInputTO): UpdatePullRequestReviewPayloadTO

    @throws[Exception]
    def updatePullRequestReviewComment(input: UpdatePullRequestReviewCommentInputTO): UpdatePullRequestReviewCommentPayloadTO

    @throws[Exception]
    def updateRef(input: UpdateRefInputTO): UpdateRefPayloadTO

    @throws[Exception]
    def updateRepository(input: UpdateRepositoryInputTO): UpdateRepositoryPayloadTO

    @throws[Exception]
    def updateSubscription(input: UpdateSubscriptionInputTO): UpdateSubscriptionPayloadTO

    @throws[Exception]
    def updateTopics(input: UpdateTopicsInputTO): UpdateTopicsPayloadTO

}
