package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Mutation
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MutationResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MutationResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MutationResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) + 1
            this.acceptTopicSuggestion(AcceptTopicSuggestionPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) + 1
            this.addAssigneesToAssignable(AddAssigneesToAssignablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddCommentPayloadResponseProjection.addComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) + 1
            this.addComment(AddCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) + 1
            this.addLabelsToLabelable(AddLabelsToLabelablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) + 1
            this.addProjectCard(AddProjectCardPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) + 1
            this.addProjectColumn(AddProjectColumnPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) + 1
            this.addPullRequestReview(AddPullRequestReviewPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) + 1
            this.addPullRequestReviewComment(AddPullRequestReviewCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) + 1
            this.addReaction(AddReactionPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.AddStarPayloadResponseProjection.addStar"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) + 1
            this.addStar(AddStarPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) + 1
            this.changeUserStatus(ChangeUserStatusPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) + 1
            this.clearLabelsFromLabelable(ClearLabelsFromLabelablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) + 1
            this.cloneProject(CloneProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) + 1
            this.cloneTemplateRepository(CloneTemplateRepositoryPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) + 1
            this.closeIssue(CloseIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) + 1
            this.closePullRequest(ClosePullRequestPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) + 1
            this.convertProjectCardNoteToIssue(ConvertProjectCardNoteToIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) + 1
            this.createBranchProtectionRule(CreateBranchProtectionRulePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) + 1
            this.createIssue(CreateIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) + 1
            this.createProject(CreateProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) + 1
            this.createPullRequest(CreatePullRequestPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreateRefPayloadResponseProjection.createRef"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) + 1
            this.createRef(CreateRefPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) + 1
            this.createRepository(CreateRepositoryPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) + 1
            this.declineTopicSuggestion(DeclineTopicSuggestionPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) + 1
            this.deleteBranchProtectionRule(DeleteBranchProtectionRulePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) + 1
            this.deleteIssue(DeleteIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) + 1
            this.deleteIssueComment(DeleteIssueCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) + 1
            this.deleteProject(DeleteProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) + 1
            this.deleteProjectCard(DeleteProjectCardPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) + 1
            this.deleteProjectColumn(DeleteProjectColumnPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) + 1
            this.deletePullRequestReview(DeletePullRequestReviewPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) + 1
            this.deletePullRequestReviewComment(DeletePullRequestReviewCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) + 1
            this.deleteRef(DeleteRefPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) + 1
            this.dismissPullRequestReview(DismissPullRequestReviewPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) + 1
            this.linkRepositoryToProject(LinkRepositoryToProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) + 1
            this.lockLockable(LockLockablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) + 1
            this.mergeBranch(MergeBranchPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) + 1
            this.mergePullRequest(MergePullRequestPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) + 1
            this.moveProjectCard(MoveProjectCardPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) + 1
            this.moveProjectColumn(MoveProjectColumnPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) + 1
            this.removeAssigneesFromAssignable(RemoveAssigneesFromAssignablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) + 1
            this.removeLabelsFromLabelable(RemoveLabelsFromLabelablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) + 1
            this.removeOutsideCollaborator(RemoveOutsideCollaboratorPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) + 1
            this.removeReaction(RemoveReactionPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) + 1
            this.removeStar(RemoveStarPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) + 1
            this.reopenIssue(ReopenIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) + 1
            this.reopenPullRequest(ReopenPullRequestPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) + 1
            this.requestReviews(RequestReviewsPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) + 1
            this.resolveReviewThread(ResolveReviewThreadPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) + 1
            this.submitPullRequestReview(SubmitPullRequestReviewPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) + 1
            this.unlinkRepositoryFromProject(UnlinkRepositoryFromProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) + 1
            this.unlockLockable(UnlockLockablePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) + 1
            this.unmarkIssueAsDuplicate(UnmarkIssueAsDuplicatePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) + 1
            this.unresolveReviewThread(UnresolveReviewThreadPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) + 1
            this.updateBranchProtectionRule(UpdateBranchProtectionRulePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) + 1
            this.updateIssue(UpdateIssuePayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) + 1
            this.updateIssueComment(UpdateIssueCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) + 1
            this.updateProject(UpdateProjectPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) + 1
            this.updateProjectCard(UpdateProjectCardPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) + 1
            this.updateProjectColumn(UpdateProjectColumnPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) + 1
            this.updatePullRequest(UpdatePullRequestPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) + 1
            this.updatePullRequestReview(UpdatePullRequestReviewPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) + 1
            this.updatePullRequestReviewComment(UpdatePullRequestReviewCommentPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) + 1
            this.updateRef(UpdateRefPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) + 1
            this.updateRepository(UpdateRepositoryPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) + 1
            this.updateSubscription(UpdateSubscriptionPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) <= maxDepth) {
            projectionDepthOnFields["MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics"] = projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) + 1
            this.updateTopics(UpdateTopicsPayloadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0)))
        }
        this.typename()
        return this
    }

    fun acceptTopicSuggestion(subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = acceptTopicSuggestion(null, subProjection)

    fun acceptTopicSuggestion(alias: String?, subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("acceptTopicSuggestion").alias(alias).projection(subProjection))
        return this
    }

    fun acceptTopicSuggestion(input: MutationAcceptTopicSuggestionParametrizedInput, subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = acceptTopicSuggestion(null, input, subProjection)

    fun acceptTopicSuggestion(alias: String?, input: MutationAcceptTopicSuggestionParametrizedInput, subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("acceptTopicSuggestion").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addAssigneesToAssignable(subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = addAssigneesToAssignable(null, subProjection)

    fun addAssigneesToAssignable(alias: String?, subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addAssigneesToAssignable").alias(alias).projection(subProjection))
        return this
    }

    fun addAssigneesToAssignable(input: MutationAddAssigneesToAssignableParametrizedInput, subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = addAssigneesToAssignable(null, input, subProjection)

    fun addAssigneesToAssignable(alias: String?, input: MutationAddAssigneesToAssignableParametrizedInput, subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addAssigneesToAssignable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addComment(subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = addComment(null, subProjection)

    fun addComment(alias: String?, subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addComment").alias(alias).projection(subProjection))
        return this
    }

    fun addComment(input: MutationAddCommentParametrizedInput, subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = addComment(null, input, subProjection)

    fun addComment(alias: String?, input: MutationAddCommentParametrizedInput, subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addLabelsToLabelable(subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = addLabelsToLabelable(null, subProjection)

    fun addLabelsToLabelable(alias: String?, subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addLabelsToLabelable").alias(alias).projection(subProjection))
        return this
    }

    fun addLabelsToLabelable(input: MutationAddLabelsToLabelableParametrizedInput, subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = addLabelsToLabelable(null, input, subProjection)

    fun addLabelsToLabelable(alias: String?, input: MutationAddLabelsToLabelableParametrizedInput, subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addLabelsToLabelable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addProjectCard(subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = addProjectCard(null, subProjection)

    fun addProjectCard(alias: String?, subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addProjectCard").alias(alias).projection(subProjection))
        return this
    }

    fun addProjectCard(input: MutationAddProjectCardParametrizedInput, subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = addProjectCard(null, input, subProjection)

    fun addProjectCard(alias: String?, input: MutationAddProjectCardParametrizedInput, subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addProjectCard").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addProjectColumn(subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = addProjectColumn(null, subProjection)

    fun addProjectColumn(alias: String?, subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addProjectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun addProjectColumn(input: MutationAddProjectColumnParametrizedInput, subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = addProjectColumn(null, input, subProjection)

    fun addProjectColumn(alias: String?, input: MutationAddProjectColumnParametrizedInput, subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addProjectColumn").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addPullRequestReview(subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = addPullRequestReview(null, subProjection)

    fun addPullRequestReview(alias: String?, subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addPullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun addPullRequestReview(input: MutationAddPullRequestReviewParametrizedInput, subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = addPullRequestReview(null, input, subProjection)

    fun addPullRequestReview(alias: String?, input: MutationAddPullRequestReviewParametrizedInput, subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addPullRequestReviewComment(subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = addPullRequestReviewComment(null, subProjection)

    fun addPullRequestReviewComment(alias: String?, subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addPullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun addPullRequestReviewComment(input: MutationAddPullRequestReviewCommentParametrizedInput, subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = addPullRequestReviewComment(null, input, subProjection)

    fun addPullRequestReviewComment(alias: String?, input: MutationAddPullRequestReviewCommentParametrizedInput, subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addPullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addReaction(subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = addReaction(null, subProjection)

    fun addReaction(alias: String?, subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addReaction").alias(alias).projection(subProjection))
        return this
    }

    fun addReaction(input: MutationAddReactionParametrizedInput, subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = addReaction(null, input, subProjection)

    fun addReaction(alias: String?, input: MutationAddReactionParametrizedInput, subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addReaction").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun addStar(subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = addStar(null, subProjection)

    fun addStar(alias: String?, subProjection: AddStarPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addStar").alias(alias).projection(subProjection))
        return this
    }

    fun addStar(input: MutationAddStarParametrizedInput, subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = addStar(null, input, subProjection)

    fun addStar(alias: String?, input: MutationAddStarParametrizedInput, subProjection: AddStarPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("addStar").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun changeUserStatus(subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = changeUserStatus(null, subProjection)

    fun changeUserStatus(alias: String?, subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("changeUserStatus").alias(alias).projection(subProjection))
        return this
    }

    fun changeUserStatus(input: MutationChangeUserStatusParametrizedInput, subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = changeUserStatus(null, input, subProjection)

    fun changeUserStatus(alias: String?, input: MutationChangeUserStatusParametrizedInput, subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("changeUserStatus").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun clearLabelsFromLabelable(subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = clearLabelsFromLabelable(null, subProjection)

    fun clearLabelsFromLabelable(alias: String?, subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("clearLabelsFromLabelable").alias(alias).projection(subProjection))
        return this
    }

    fun clearLabelsFromLabelable(input: MutationClearLabelsFromLabelableParametrizedInput, subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = clearLabelsFromLabelable(null, input, subProjection)

    fun clearLabelsFromLabelable(alias: String?, input: MutationClearLabelsFromLabelableParametrizedInput, subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("clearLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun cloneProject(subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = cloneProject(null, subProjection)

    fun cloneProject(alias: String?, subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("cloneProject").alias(alias).projection(subProjection))
        return this
    }

    fun cloneProject(input: MutationCloneProjectParametrizedInput, subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = cloneProject(null, input, subProjection)

    fun cloneProject(alias: String?, input: MutationCloneProjectParametrizedInput, subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("cloneProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun cloneTemplateRepository(subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = cloneTemplateRepository(null, subProjection)

    fun cloneTemplateRepository(alias: String?, subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("cloneTemplateRepository").alias(alias).projection(subProjection))
        return this
    }

    fun cloneTemplateRepository(input: MutationCloneTemplateRepositoryParametrizedInput, subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = cloneTemplateRepository(null, input, subProjection)

    fun cloneTemplateRepository(alias: String?, input: MutationCloneTemplateRepositoryParametrizedInput, subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("cloneTemplateRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun closeIssue(subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = closeIssue(null, subProjection)

    fun closeIssue(alias: String?, subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("closeIssue").alias(alias).projection(subProjection))
        return this
    }

    fun closeIssue(input: MutationCloseIssueParametrizedInput, subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = closeIssue(null, input, subProjection)

    fun closeIssue(alias: String?, input: MutationCloseIssueParametrizedInput, subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("closeIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun closePullRequest(subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = closePullRequest(null, subProjection)

    fun closePullRequest(alias: String?, subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("closePullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun closePullRequest(input: MutationClosePullRequestParametrizedInput, subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = closePullRequest(null, input, subProjection)

    fun closePullRequest(alias: String?, input: MutationClosePullRequestParametrizedInput, subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("closePullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun convertProjectCardNoteToIssue(subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = convertProjectCardNoteToIssue(null, subProjection)

    fun convertProjectCardNoteToIssue(alias: String?, subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).projection(subProjection))
        return this
    }

    fun convertProjectCardNoteToIssue(input: MutationConvertProjectCardNoteToIssueParametrizedInput, subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = convertProjectCardNoteToIssue(null, input, subProjection)

    fun convertProjectCardNoteToIssue(alias: String?, input: MutationConvertProjectCardNoteToIssueParametrizedInput, subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createBranchProtectionRule(subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = createBranchProtectionRule(null, subProjection)

    fun createBranchProtectionRule(alias: String?, subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createBranchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun createBranchProtectionRule(input: MutationCreateBranchProtectionRuleParametrizedInput, subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = createBranchProtectionRule(null, input, subProjection)

    fun createBranchProtectionRule(alias: String?, input: MutationCreateBranchProtectionRuleParametrizedInput, subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createIssue(subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = createIssue(null, subProjection)

    fun createIssue(alias: String?, subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createIssue").alias(alias).projection(subProjection))
        return this
    }

    fun createIssue(input: MutationCreateIssueParametrizedInput, subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = createIssue(null, input, subProjection)

    fun createIssue(alias: String?, input: MutationCreateIssueParametrizedInput, subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createProject(subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = createProject(null, subProjection)

    fun createProject(alias: String?, subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createProject").alias(alias).projection(subProjection))
        return this
    }

    fun createProject(input: MutationCreateProjectParametrizedInput, subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = createProject(null, input, subProjection)

    fun createProject(alias: String?, input: MutationCreateProjectParametrizedInput, subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createPullRequest(subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = createPullRequest(null, subProjection)

    fun createPullRequest(alias: String?, subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createPullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun createPullRequest(input: MutationCreatePullRequestParametrizedInput, subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = createPullRequest(null, input, subProjection)

    fun createPullRequest(alias: String?, input: MutationCreatePullRequestParametrizedInput, subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createPullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createRef(subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = createRef(null, subProjection)

    fun createRef(alias: String?, subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createRef").alias(alias).projection(subProjection))
        return this
    }

    fun createRef(input: MutationCreateRefParametrizedInput, subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = createRef(null, input, subProjection)

    fun createRef(alias: String?, input: MutationCreateRefParametrizedInput, subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createRef").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createRepository(subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = createRepository(null, subProjection)

    fun createRepository(alias: String?, subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createRepository").alias(alias).projection(subProjection))
        return this
    }

    fun createRepository(input: MutationCreateRepositoryParametrizedInput, subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = createRepository(null, input, subProjection)

    fun createRepository(alias: String?, input: MutationCreateRepositoryParametrizedInput, subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("createRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun declineTopicSuggestion(subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = declineTopicSuggestion(null, subProjection)

    fun declineTopicSuggestion(alias: String?, subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("declineTopicSuggestion").alias(alias).projection(subProjection))
        return this
    }

    fun declineTopicSuggestion(input: MutationDeclineTopicSuggestionParametrizedInput, subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = declineTopicSuggestion(null, input, subProjection)

    fun declineTopicSuggestion(alias: String?, input: MutationDeclineTopicSuggestionParametrizedInput, subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("declineTopicSuggestion").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteBranchProtectionRule(subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = deleteBranchProtectionRule(null, subProjection)

    fun deleteBranchProtectionRule(alias: String?, subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteBranchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun deleteBranchProtectionRule(input: MutationDeleteBranchProtectionRuleParametrizedInput, subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = deleteBranchProtectionRule(null, input, subProjection)

    fun deleteBranchProtectionRule(alias: String?, input: MutationDeleteBranchProtectionRuleParametrizedInput, subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteIssue(subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = deleteIssue(null, subProjection)

    fun deleteIssue(alias: String?, subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteIssue").alias(alias).projection(subProjection))
        return this
    }

    fun deleteIssue(input: MutationDeleteIssueParametrizedInput, subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = deleteIssue(null, input, subProjection)

    fun deleteIssue(alias: String?, input: MutationDeleteIssueParametrizedInput, subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteIssueComment(subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = deleteIssueComment(null, subProjection)

    fun deleteIssueComment(alias: String?, subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteIssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun deleteIssueComment(input: MutationDeleteIssueCommentParametrizedInput, subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = deleteIssueComment(null, input, subProjection)

    fun deleteIssueComment(alias: String?, input: MutationDeleteIssueCommentParametrizedInput, subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteIssueComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteProject(subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = deleteProject(null, subProjection)

    fun deleteProject(alias: String?, subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProject").alias(alias).projection(subProjection))
        return this
    }

    fun deleteProject(input: MutationDeleteProjectParametrizedInput, subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = deleteProject(null, input, subProjection)

    fun deleteProject(alias: String?, input: MutationDeleteProjectParametrizedInput, subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteProjectCard(subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = deleteProjectCard(null, subProjection)

    fun deleteProjectCard(alias: String?, subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProjectCard").alias(alias).projection(subProjection))
        return this
    }

    fun deleteProjectCard(input: MutationDeleteProjectCardParametrizedInput, subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = deleteProjectCard(null, input, subProjection)

    fun deleteProjectCard(alias: String?, input: MutationDeleteProjectCardParametrizedInput, subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProjectCard").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteProjectColumn(subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = deleteProjectColumn(null, subProjection)

    fun deleteProjectColumn(alias: String?, subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProjectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun deleteProjectColumn(input: MutationDeleteProjectColumnParametrizedInput, subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = deleteProjectColumn(null, input, subProjection)

    fun deleteProjectColumn(alias: String?, input: MutationDeleteProjectColumnParametrizedInput, subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteProjectColumn").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deletePullRequestReview(subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = deletePullRequestReview(null, subProjection)

    fun deletePullRequestReview(alias: String?, subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deletePullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun deletePullRequestReview(input: MutationDeletePullRequestReviewParametrizedInput, subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = deletePullRequestReview(null, input, subProjection)

    fun deletePullRequestReview(alias: String?, input: MutationDeletePullRequestReviewParametrizedInput, subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deletePullRequestReview").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deletePullRequestReviewComment(subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = deletePullRequestReviewComment(null, subProjection)

    fun deletePullRequestReviewComment(alias: String?, subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deletePullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun deletePullRequestReviewComment(input: MutationDeletePullRequestReviewCommentParametrizedInput, subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = deletePullRequestReviewComment(null, input, subProjection)

    fun deletePullRequestReviewComment(alias: String?, input: MutationDeletePullRequestReviewCommentParametrizedInput, subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deletePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deleteRef(subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = deleteRef(null, subProjection)

    fun deleteRef(alias: String?, subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteRef").alias(alias).projection(subProjection))
        return this
    }

    fun deleteRef(input: MutationDeleteRefParametrizedInput, subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = deleteRef(null, input, subProjection)

    fun deleteRef(alias: String?, input: MutationDeleteRefParametrizedInput, subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("deleteRef").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun dismissPullRequestReview(subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = dismissPullRequestReview(null, subProjection)

    fun dismissPullRequestReview(alias: String?, subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("dismissPullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun dismissPullRequestReview(input: MutationDismissPullRequestReviewParametrizedInput, subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = dismissPullRequestReview(null, input, subProjection)

    fun dismissPullRequestReview(alias: String?, input: MutationDismissPullRequestReviewParametrizedInput, subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("dismissPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun linkRepositoryToProject(subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = linkRepositoryToProject(null, subProjection)

    fun linkRepositoryToProject(alias: String?, subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("linkRepositoryToProject").alias(alias).projection(subProjection))
        return this
    }

    fun linkRepositoryToProject(input: MutationLinkRepositoryToProjectParametrizedInput, subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = linkRepositoryToProject(null, input, subProjection)

    fun linkRepositoryToProject(alias: String?, input: MutationLinkRepositoryToProjectParametrizedInput, subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("linkRepositoryToProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun lockLockable(subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = lockLockable(null, subProjection)

    fun lockLockable(alias: String?, subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("lockLockable").alias(alias).projection(subProjection))
        return this
    }

    fun lockLockable(input: MutationLockLockableParametrizedInput, subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = lockLockable(null, input, subProjection)

    fun lockLockable(alias: String?, input: MutationLockLockableParametrizedInput, subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("lockLockable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun mergeBranch(subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = mergeBranch(null, subProjection)

    fun mergeBranch(alias: String?, subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("mergeBranch").alias(alias).projection(subProjection))
        return this
    }

    fun mergeBranch(input: MutationMergeBranchParametrizedInput, subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = mergeBranch(null, input, subProjection)

    fun mergeBranch(alias: String?, input: MutationMergeBranchParametrizedInput, subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("mergeBranch").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun mergePullRequest(subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = mergePullRequest(null, subProjection)

    fun mergePullRequest(alias: String?, subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("mergePullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun mergePullRequest(input: MutationMergePullRequestParametrizedInput, subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = mergePullRequest(null, input, subProjection)

    fun mergePullRequest(alias: String?, input: MutationMergePullRequestParametrizedInput, subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("mergePullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun moveProjectCard(subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = moveProjectCard(null, subProjection)

    fun moveProjectCard(alias: String?, subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("moveProjectCard").alias(alias).projection(subProjection))
        return this
    }

    fun moveProjectCard(input: MutationMoveProjectCardParametrizedInput, subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = moveProjectCard(null, input, subProjection)

    fun moveProjectCard(alias: String?, input: MutationMoveProjectCardParametrizedInput, subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("moveProjectCard").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun moveProjectColumn(subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = moveProjectColumn(null, subProjection)

    fun moveProjectColumn(alias: String?, subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("moveProjectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun moveProjectColumn(input: MutationMoveProjectColumnParametrizedInput, subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = moveProjectColumn(null, input, subProjection)

    fun moveProjectColumn(alias: String?, input: MutationMoveProjectColumnParametrizedInput, subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("moveProjectColumn").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun removeAssigneesFromAssignable(subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = removeAssigneesFromAssignable(null, subProjection)

    fun removeAssigneesFromAssignable(alias: String?, subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).projection(subProjection))
        return this
    }

    fun removeAssigneesFromAssignable(input: MutationRemoveAssigneesFromAssignableParametrizedInput, subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = removeAssigneesFromAssignable(null, input, subProjection)

    fun removeAssigneesFromAssignable(alias: String?, input: MutationRemoveAssigneesFromAssignableParametrizedInput, subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun removeLabelsFromLabelable(subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = removeLabelsFromLabelable(null, subProjection)

    fun removeLabelsFromLabelable(alias: String?, subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeLabelsFromLabelable").alias(alias).projection(subProjection))
        return this
    }

    fun removeLabelsFromLabelable(input: MutationRemoveLabelsFromLabelableParametrizedInput, subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = removeLabelsFromLabelable(null, input, subProjection)

    fun removeLabelsFromLabelable(alias: String?, input: MutationRemoveLabelsFromLabelableParametrizedInput, subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun removeOutsideCollaborator(subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = removeOutsideCollaborator(null, subProjection)

    fun removeOutsideCollaborator(alias: String?, subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeOutsideCollaborator").alias(alias).projection(subProjection))
        return this
    }

    fun removeOutsideCollaborator(input: MutationRemoveOutsideCollaboratorParametrizedInput, subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = removeOutsideCollaborator(null, input, subProjection)

    fun removeOutsideCollaborator(alias: String?, input: MutationRemoveOutsideCollaboratorParametrizedInput, subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeOutsideCollaborator").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun removeReaction(subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = removeReaction(null, subProjection)

    fun removeReaction(alias: String?, subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeReaction").alias(alias).projection(subProjection))
        return this
    }

    fun removeReaction(input: MutationRemoveReactionParametrizedInput, subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = removeReaction(null, input, subProjection)

    fun removeReaction(alias: String?, input: MutationRemoveReactionParametrizedInput, subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeReaction").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun removeStar(subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = removeStar(null, subProjection)

    fun removeStar(alias: String?, subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeStar").alias(alias).projection(subProjection))
        return this
    }

    fun removeStar(input: MutationRemoveStarParametrizedInput, subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = removeStar(null, input, subProjection)

    fun removeStar(alias: String?, input: MutationRemoveStarParametrizedInput, subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("removeStar").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun reopenIssue(subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = reopenIssue(null, subProjection)

    fun reopenIssue(alias: String?, subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("reopenIssue").alias(alias).projection(subProjection))
        return this
    }

    fun reopenIssue(input: MutationReopenIssueParametrizedInput, subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = reopenIssue(null, input, subProjection)

    fun reopenIssue(alias: String?, input: MutationReopenIssueParametrizedInput, subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("reopenIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun reopenPullRequest(subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = reopenPullRequest(null, subProjection)

    fun reopenPullRequest(alias: String?, subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("reopenPullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun reopenPullRequest(input: MutationReopenPullRequestParametrizedInput, subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = reopenPullRequest(null, input, subProjection)

    fun reopenPullRequest(alias: String?, input: MutationReopenPullRequestParametrizedInput, subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("reopenPullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun requestReviews(subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = requestReviews(null, subProjection)

    fun requestReviews(alias: String?, subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("requestReviews").alias(alias).projection(subProjection))
        return this
    }

    fun requestReviews(input: MutationRequestReviewsParametrizedInput, subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = requestReviews(null, input, subProjection)

    fun requestReviews(alias: String?, input: MutationRequestReviewsParametrizedInput, subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("requestReviews").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resolveReviewThread(subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = resolveReviewThread(null, subProjection)

    fun resolveReviewThread(alias: String?, subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("resolveReviewThread").alias(alias).projection(subProjection))
        return this
    }

    fun resolveReviewThread(input: MutationResolveReviewThreadParametrizedInput, subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = resolveReviewThread(null, input, subProjection)

    fun resolveReviewThread(alias: String?, input: MutationResolveReviewThreadParametrizedInput, subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("resolveReviewThread").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun submitPullRequestReview(subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = submitPullRequestReview(null, subProjection)

    fun submitPullRequestReview(alias: String?, subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("submitPullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun submitPullRequestReview(input: MutationSubmitPullRequestReviewParametrizedInput, subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = submitPullRequestReview(null, input, subProjection)

    fun submitPullRequestReview(alias: String?, input: MutationSubmitPullRequestReviewParametrizedInput, subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("submitPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun unlinkRepositoryFromProject(subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = unlinkRepositoryFromProject(null, subProjection)

    fun unlinkRepositoryFromProject(alias: String?, subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).projection(subProjection))
        return this
    }

    fun unlinkRepositoryFromProject(input: MutationUnlinkRepositoryFromProjectParametrizedInput, subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = unlinkRepositoryFromProject(null, input, subProjection)

    fun unlinkRepositoryFromProject(alias: String?, input: MutationUnlinkRepositoryFromProjectParametrizedInput, subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun unlockLockable(subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = unlockLockable(null, subProjection)

    fun unlockLockable(alias: String?, subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unlockLockable").alias(alias).projection(subProjection))
        return this
    }

    fun unlockLockable(input: MutationUnlockLockableParametrizedInput, subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = unlockLockable(null, input, subProjection)

    fun unlockLockable(alias: String?, input: MutationUnlockLockableParametrizedInput, subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unlockLockable").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun unmarkIssueAsDuplicate(subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = unmarkIssueAsDuplicate(null, subProjection)

    fun unmarkIssueAsDuplicate(alias: String?, subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).projection(subProjection))
        return this
    }

    fun unmarkIssueAsDuplicate(input: MutationUnmarkIssueAsDuplicateParametrizedInput, subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = unmarkIssueAsDuplicate(null, input, subProjection)

    fun unmarkIssueAsDuplicate(alias: String?, input: MutationUnmarkIssueAsDuplicateParametrizedInput, subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun unresolveReviewThread(subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = unresolveReviewThread(null, subProjection)

    fun unresolveReviewThread(alias: String?, subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unresolveReviewThread").alias(alias).projection(subProjection))
        return this
    }

    fun unresolveReviewThread(input: MutationUnresolveReviewThreadParametrizedInput, subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = unresolveReviewThread(null, input, subProjection)

    fun unresolveReviewThread(alias: String?, input: MutationUnresolveReviewThreadParametrizedInput, subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("unresolveReviewThread").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateBranchProtectionRule(subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = updateBranchProtectionRule(null, subProjection)

    fun updateBranchProtectionRule(alias: String?, subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateBranchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun updateBranchProtectionRule(input: MutationUpdateBranchProtectionRuleParametrizedInput, subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = updateBranchProtectionRule(null, input, subProjection)

    fun updateBranchProtectionRule(alias: String?, input: MutationUpdateBranchProtectionRuleParametrizedInput, subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateIssue(subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = updateIssue(null, subProjection)

    fun updateIssue(alias: String?, subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateIssue").alias(alias).projection(subProjection))
        return this
    }

    fun updateIssue(input: MutationUpdateIssueParametrizedInput, subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = updateIssue(null, input, subProjection)

    fun updateIssue(alias: String?, input: MutationUpdateIssueParametrizedInput, subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateIssue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateIssueComment(subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = updateIssueComment(null, subProjection)

    fun updateIssueComment(alias: String?, subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateIssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun updateIssueComment(input: MutationUpdateIssueCommentParametrizedInput, subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = updateIssueComment(null, input, subProjection)

    fun updateIssueComment(alias: String?, input: MutationUpdateIssueCommentParametrizedInput, subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateIssueComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateProject(subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = updateProject(null, subProjection)

    fun updateProject(alias: String?, subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProject").alias(alias).projection(subProjection))
        return this
    }

    fun updateProject(input: MutationUpdateProjectParametrizedInput, subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = updateProject(null, input, subProjection)

    fun updateProject(alias: String?, input: MutationUpdateProjectParametrizedInput, subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProject").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateProjectCard(subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = updateProjectCard(null, subProjection)

    fun updateProjectCard(alias: String?, subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProjectCard").alias(alias).projection(subProjection))
        return this
    }

    fun updateProjectCard(input: MutationUpdateProjectCardParametrizedInput, subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = updateProjectCard(null, input, subProjection)

    fun updateProjectCard(alias: String?, input: MutationUpdateProjectCardParametrizedInput, subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProjectCard").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateProjectColumn(subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = updateProjectColumn(null, subProjection)

    fun updateProjectColumn(alias: String?, subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProjectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun updateProjectColumn(input: MutationUpdateProjectColumnParametrizedInput, subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = updateProjectColumn(null, input, subProjection)

    fun updateProjectColumn(alias: String?, input: MutationUpdateProjectColumnParametrizedInput, subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateProjectColumn").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updatePullRequest(subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = updatePullRequest(null, subProjection)

    fun updatePullRequest(alias: String?, subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun updatePullRequest(input: MutationUpdatePullRequestParametrizedInput, subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = updatePullRequest(null, input, subProjection)

    fun updatePullRequest(alias: String?, input: MutationUpdatePullRequestParametrizedInput, subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updatePullRequestReview(subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = updatePullRequestReview(null, subProjection)

    fun updatePullRequestReview(alias: String?, subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun updatePullRequestReview(input: MutationUpdatePullRequestReviewParametrizedInput, subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = updatePullRequestReview(null, input, subProjection)

    fun updatePullRequestReview(alias: String?, input: MutationUpdatePullRequestReviewParametrizedInput, subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequestReview").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updatePullRequestReviewComment(subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = updatePullRequestReviewComment(null, subProjection)

    fun updatePullRequestReviewComment(alias: String?, subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun updatePullRequestReviewComment(input: MutationUpdatePullRequestReviewCommentParametrizedInput, subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = updatePullRequestReviewComment(null, input, subProjection)

    fun updatePullRequestReviewComment(alias: String?, input: MutationUpdatePullRequestReviewCommentParametrizedInput, subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updatePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateRef(subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = updateRef(null, subProjection)

    fun updateRef(alias: String?, subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateRef").alias(alias).projection(subProjection))
        return this
    }

    fun updateRef(input: MutationUpdateRefParametrizedInput, subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = updateRef(null, input, subProjection)

    fun updateRef(alias: String?, input: MutationUpdateRefParametrizedInput, subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateRef").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateRepository(subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = updateRepository(null, subProjection)

    fun updateRepository(alias: String?, subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateRepository").alias(alias).projection(subProjection))
        return this
    }

    fun updateRepository(input: MutationUpdateRepositoryParametrizedInput, subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = updateRepository(null, input, subProjection)

    fun updateRepository(alias: String?, input: MutationUpdateRepositoryParametrizedInput, subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateSubscription(subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = updateSubscription(null, subProjection)

    fun updateSubscription(alias: String?, subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateSubscription").alias(alias).projection(subProjection))
        return this
    }

    fun updateSubscription(input: MutationUpdateSubscriptionParametrizedInput, subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = updateSubscription(null, input, subProjection)

    fun updateSubscription(alias: String?, input: MutationUpdateSubscriptionParametrizedInput, subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateSubscription").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updateTopics(subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = updateTopics(null, subProjection)

    fun updateTopics(alias: String?, subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateTopics").alias(alias).projection(subProjection))
        return this
    }

    fun updateTopics(input: MutationUpdateTopicsParametrizedInput, subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = updateTopics(null, input, subProjection)

    fun updateTopics(alias: String?, input: MutationUpdateTopicsParametrizedInput, subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection {
        fields.add(GraphQLResponseField("updateTopics").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun typename(): MutationResponseProjection = typename(null)

    fun typename(alias: String?): MutationResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MutationResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
