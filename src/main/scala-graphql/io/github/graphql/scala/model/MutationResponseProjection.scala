package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Mutation
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MutationResponseProjection extends GraphQLResponseProjection {

    override def all$(): MutationResponseProjection = all$(3)

    override def all$(maxDepth: Int): MutationResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) + 1)
            this.acceptTopicSuggestion(new AcceptTopicSuggestionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) + 1)
            this.addAssigneesToAssignable(new AddAssigneesToAssignablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) + 1)
            this.addComment(new AddCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) + 1)
            this.addLabelsToLabelable(new AddLabelsToLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) + 1)
            this.addProjectCard(new AddProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) + 1)
            this.addProjectColumn(new AddProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) + 1)
            this.addPullRequestReview(new AddPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) + 1)
            this.addPullRequestReviewComment(new AddPullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) + 1)
            this.addReaction(new AddReactionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) + 1)
            this.addStar(new AddStarPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) + 1)
            this.changeUserStatus(new ChangeUserStatusPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) + 1)
            this.clearLabelsFromLabelable(new ClearLabelsFromLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) + 1)
            this.cloneProject(new CloneProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) + 1)
            this.cloneTemplateRepository(new CloneTemplateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) + 1)
            this.closeIssue(new CloseIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) + 1)
            this.closePullRequest(new ClosePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) + 1)
            this.convertProjectCardNoteToIssue(new ConvertProjectCardNoteToIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) + 1)
            this.createBranchProtectionRule(new CreateBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) + 1)
            this.createIssue(new CreateIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) + 1)
            this.createProject(new CreateProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) + 1)
            this.createPullRequest(new CreatePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) + 1)
            this.createRef(new CreateRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) + 1)
            this.createRepository(new CreateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) + 1)
            this.declineTopicSuggestion(new DeclineTopicSuggestionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) + 1)
            this.deleteBranchProtectionRule(new DeleteBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) + 1)
            this.deleteIssue(new DeleteIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) + 1)
            this.deleteIssueComment(new DeleteIssueCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) + 1)
            this.deleteProject(new DeleteProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) + 1)
            this.deleteProjectCard(new DeleteProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) + 1)
            this.deleteProjectColumn(new DeleteProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) + 1)
            this.deletePullRequestReview(new DeletePullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) + 1)
            this.deletePullRequestReviewComment(new DeletePullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) + 1)
            this.deleteRef(new DeleteRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) + 1)
            this.dismissPullRequestReview(new DismissPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) + 1)
            this.linkRepositoryToProject(new LinkRepositoryToProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) + 1)
            this.lockLockable(new LockLockablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) + 1)
            this.mergeBranch(new MergeBranchPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) + 1)
            this.mergePullRequest(new MergePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) + 1)
            this.moveProjectCard(new MoveProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) + 1)
            this.moveProjectColumn(new MoveProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) + 1)
            this.removeAssigneesFromAssignable(new RemoveAssigneesFromAssignablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) + 1)
            this.removeLabelsFromLabelable(new RemoveLabelsFromLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) + 1)
            this.removeOutsideCollaborator(new RemoveOutsideCollaboratorPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) + 1)
            this.removeReaction(new RemoveReactionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) + 1)
            this.removeStar(new RemoveStarPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) + 1)
            this.reopenIssue(new ReopenIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) + 1)
            this.reopenPullRequest(new ReopenPullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) + 1)
            this.requestReviews(new RequestReviewsPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) + 1)
            this.resolveReviewThread(new ResolveReviewThreadPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) + 1)
            this.submitPullRequestReview(new SubmitPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) + 1)
            this.unlinkRepositoryFromProject(new UnlinkRepositoryFromProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) + 1)
            this.unlockLockable(new UnlockLockablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) + 1)
            this.unmarkIssueAsDuplicate(new UnmarkIssueAsDuplicatePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) + 1)
            this.unresolveReviewThread(new UnresolveReviewThreadPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) + 1)
            this.updateBranchProtectionRule(new UpdateBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) + 1)
            this.updateIssue(new UpdateIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) + 1)
            this.updateIssueComment(new UpdateIssueCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) + 1)
            this.updateProject(new UpdateProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) + 1)
            this.updateProjectCard(new UpdateProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) + 1)
            this.updateProjectColumn(new UpdateProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) + 1)
            this.updatePullRequest(new UpdatePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) + 1)
            this.updatePullRequestReview(new UpdatePullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) + 1)
            this.updatePullRequestReviewComment(new UpdatePullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) + 1)
            this.updateRef(new UpdateRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) + 1)
            this.updateRepository(new UpdateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) + 1)
            this.updateSubscription(new UpdateSubscriptionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) + 1)
            this.updateTopics(new UpdateTopicsPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0)))
        }
        this.typename()
        this
    }

    def acceptTopicSuggestion(subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        acceptTopicSuggestion(null.asInstanceOf[String], subProjection)
    }

    def acceptTopicSuggestion(alias: String, subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("acceptTopicSuggestion").alias(alias).projection(subProjection))
        this
    }

    def acceptTopicSuggestion(input: MutationAcceptTopicSuggestionParametrizedInput,subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        acceptTopicSuggestion(null.asInstanceOf[String], input, subProjection)
    }

    def acceptTopicSuggestion(alias: String, input: MutationAcceptTopicSuggestionParametrizedInput , subProjection: AcceptTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("acceptTopicSuggestion").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addAssigneesToAssignable(subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = {
        addAssigneesToAssignable(null.asInstanceOf[String], subProjection)
    }

    def addAssigneesToAssignable(alias: String, subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addAssigneesToAssignable").alias(alias).projection(subProjection))
        this
    }

    def addAssigneesToAssignable(input: MutationAddAssigneesToAssignableParametrizedInput,subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = {
        addAssigneesToAssignable(null.asInstanceOf[String], input, subProjection)
    }

    def addAssigneesToAssignable(alias: String, input: MutationAddAssigneesToAssignableParametrizedInput , subProjection: AddAssigneesToAssignablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addAssigneesToAssignable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addComment(subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = {
        addComment(null.asInstanceOf[String], subProjection)
    }

    def addComment(alias: String, subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addComment").alias(alias).projection(subProjection))
        this
    }

    def addComment(input: MutationAddCommentParametrizedInput,subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = {
        addComment(null.asInstanceOf[String], input, subProjection)
    }

    def addComment(alias: String, input: MutationAddCommentParametrizedInput , subProjection: AddCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addLabelsToLabelable(subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = {
        addLabelsToLabelable(null.asInstanceOf[String], subProjection)
    }

    def addLabelsToLabelable(alias: String, subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addLabelsToLabelable").alias(alias).projection(subProjection))
        this
    }

    def addLabelsToLabelable(input: MutationAddLabelsToLabelableParametrizedInput,subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = {
        addLabelsToLabelable(null.asInstanceOf[String], input, subProjection)
    }

    def addLabelsToLabelable(alias: String, input: MutationAddLabelsToLabelableParametrizedInput , subProjection: AddLabelsToLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addLabelsToLabelable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addProjectCard(subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = {
        addProjectCard(null.asInstanceOf[String], subProjection)
    }

    def addProjectCard(alias: String, subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addProjectCard").alias(alias).projection(subProjection))
        this
    }

    def addProjectCard(input: MutationAddProjectCardParametrizedInput,subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = {
        addProjectCard(null.asInstanceOf[String], input, subProjection)
    }

    def addProjectCard(alias: String, input: MutationAddProjectCardParametrizedInput , subProjection: AddProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addProjectCard").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addProjectColumn(subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        addProjectColumn(null.asInstanceOf[String], subProjection)
    }

    def addProjectColumn(alias: String, subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addProjectColumn").alias(alias).projection(subProjection))
        this
    }

    def addProjectColumn(input: MutationAddProjectColumnParametrizedInput,subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        addProjectColumn(null.asInstanceOf[String], input, subProjection)
    }

    def addProjectColumn(alias: String, input: MutationAddProjectColumnParametrizedInput , subProjection: AddProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addProjectColumn").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addPullRequestReview(subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        addPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def addPullRequestReview(alias: String, subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addPullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def addPullRequestReview(input: MutationAddPullRequestReviewParametrizedInput,subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        addPullRequestReview(null.asInstanceOf[String], input, subProjection)
    }

    def addPullRequestReview(alias: String, input: MutationAddPullRequestReviewParametrizedInput , subProjection: AddPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addPullRequestReviewComment(subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        addPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def addPullRequestReviewComment(alias: String, subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addPullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def addPullRequestReviewComment(input: MutationAddPullRequestReviewCommentParametrizedInput,subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        addPullRequestReviewComment(null.asInstanceOf[String], input, subProjection)
    }

    def addPullRequestReviewComment(alias: String, input: MutationAddPullRequestReviewCommentParametrizedInput , subProjection: AddPullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addPullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addReaction(subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = {
        addReaction(null.asInstanceOf[String], subProjection)
    }

    def addReaction(alias: String, subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addReaction").alias(alias).projection(subProjection))
        this
    }

    def addReaction(input: MutationAddReactionParametrizedInput,subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = {
        addReaction(null.asInstanceOf[String], input, subProjection)
    }

    def addReaction(alias: String, input: MutationAddReactionParametrizedInput , subProjection: AddReactionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addReaction").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def addStar(subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = {
        addStar(null.asInstanceOf[String], subProjection)
    }

    def addStar(alias: String, subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addStar").alias(alias).projection(subProjection))
        this
    }

    def addStar(input: MutationAddStarParametrizedInput,subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = {
        addStar(null.asInstanceOf[String], input, subProjection)
    }

    def addStar(alias: String, input: MutationAddStarParametrizedInput , subProjection: AddStarPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("addStar").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def changeUserStatus(subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = {
        changeUserStatus(null.asInstanceOf[String], subProjection)
    }

    def changeUserStatus(alias: String, subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("changeUserStatus").alias(alias).projection(subProjection))
        this
    }

    def changeUserStatus(input: MutationChangeUserStatusParametrizedInput,subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = {
        changeUserStatus(null.asInstanceOf[String], input, subProjection)
    }

    def changeUserStatus(alias: String, input: MutationChangeUserStatusParametrizedInput , subProjection: ChangeUserStatusPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("changeUserStatus").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def clearLabelsFromLabelable(subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        clearLabelsFromLabelable(null.asInstanceOf[String], subProjection)
    }

    def clearLabelsFromLabelable(alias: String, subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("clearLabelsFromLabelable").alias(alias).projection(subProjection))
        this
    }

    def clearLabelsFromLabelable(input: MutationClearLabelsFromLabelableParametrizedInput,subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        clearLabelsFromLabelable(null.asInstanceOf[String], input, subProjection)
    }

    def clearLabelsFromLabelable(alias: String, input: MutationClearLabelsFromLabelableParametrizedInput , subProjection: ClearLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("clearLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def cloneProject(subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = {
        cloneProject(null.asInstanceOf[String], subProjection)
    }

    def cloneProject(alias: String, subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("cloneProject").alias(alias).projection(subProjection))
        this
    }

    def cloneProject(input: MutationCloneProjectParametrizedInput,subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = {
        cloneProject(null.asInstanceOf[String], input, subProjection)
    }

    def cloneProject(alias: String, input: MutationCloneProjectParametrizedInput , subProjection: CloneProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("cloneProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def cloneTemplateRepository(subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        cloneTemplateRepository(null.asInstanceOf[String], subProjection)
    }

    def cloneTemplateRepository(alias: String, subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("cloneTemplateRepository").alias(alias).projection(subProjection))
        this
    }

    def cloneTemplateRepository(input: MutationCloneTemplateRepositoryParametrizedInput,subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        cloneTemplateRepository(null.asInstanceOf[String], input, subProjection)
    }

    def cloneTemplateRepository(alias: String, input: MutationCloneTemplateRepositoryParametrizedInput , subProjection: CloneTemplateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("cloneTemplateRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def closeIssue(subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = {
        closeIssue(null.asInstanceOf[String], subProjection)
    }

    def closeIssue(alias: String, subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("closeIssue").alias(alias).projection(subProjection))
        this
    }

    def closeIssue(input: MutationCloseIssueParametrizedInput,subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = {
        closeIssue(null.asInstanceOf[String], input, subProjection)
    }

    def closeIssue(alias: String, input: MutationCloseIssueParametrizedInput , subProjection: CloseIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("closeIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def closePullRequest(subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = {
        closePullRequest(null.asInstanceOf[String], subProjection)
    }

    def closePullRequest(alias: String, subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("closePullRequest").alias(alias).projection(subProjection))
        this
    }

    def closePullRequest(input: MutationClosePullRequestParametrizedInput,subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = {
        closePullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def closePullRequest(alias: String, input: MutationClosePullRequestParametrizedInput , subProjection: ClosePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("closePullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def convertProjectCardNoteToIssue(subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = {
        convertProjectCardNoteToIssue(null.asInstanceOf[String], subProjection)
    }

    def convertProjectCardNoteToIssue(alias: String, subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).projection(subProjection))
        this
    }

    def convertProjectCardNoteToIssue(input: MutationConvertProjectCardNoteToIssueParametrizedInput,subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = {
        convertProjectCardNoteToIssue(null.asInstanceOf[String], input, subProjection)
    }

    def convertProjectCardNoteToIssue(alias: String, input: MutationConvertProjectCardNoteToIssueParametrizedInput , subProjection: ConvertProjectCardNoteToIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createBranchProtectionRule(subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        createBranchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def createBranchProtectionRule(alias: String, subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createBranchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def createBranchProtectionRule(input: MutationCreateBranchProtectionRuleParametrizedInput,subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        createBranchProtectionRule(null.asInstanceOf[String], input, subProjection)
    }

    def createBranchProtectionRule(alias: String, input: MutationCreateBranchProtectionRuleParametrizedInput , subProjection: CreateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createIssue(subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = {
        createIssue(null.asInstanceOf[String], subProjection)
    }

    def createIssue(alias: String, subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createIssue").alias(alias).projection(subProjection))
        this
    }

    def createIssue(input: MutationCreateIssueParametrizedInput,subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = {
        createIssue(null.asInstanceOf[String], input, subProjection)
    }

    def createIssue(alias: String, input: MutationCreateIssueParametrizedInput , subProjection: CreateIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createProject(subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = {
        createProject(null.asInstanceOf[String], subProjection)
    }

    def createProject(alias: String, subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createProject").alias(alias).projection(subProjection))
        this
    }

    def createProject(input: MutationCreateProjectParametrizedInput,subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = {
        createProject(null.asInstanceOf[String], input, subProjection)
    }

    def createProject(alias: String, input: MutationCreateProjectParametrizedInput , subProjection: CreateProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createPullRequest(subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        createPullRequest(null.asInstanceOf[String], subProjection)
    }

    def createPullRequest(alias: String, subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createPullRequest").alias(alias).projection(subProjection))
        this
    }

    def createPullRequest(input: MutationCreatePullRequestParametrizedInput,subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        createPullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def createPullRequest(alias: String, input: MutationCreatePullRequestParametrizedInput , subProjection: CreatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createPullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createRef(subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = {
        createRef(null.asInstanceOf[String], subProjection)
    }

    def createRef(alias: String, subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createRef").alias(alias).projection(subProjection))
        this
    }

    def createRef(input: MutationCreateRefParametrizedInput,subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = {
        createRef(null.asInstanceOf[String], input, subProjection)
    }

    def createRef(alias: String, input: MutationCreateRefParametrizedInput , subProjection: CreateRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createRef").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createRepository(subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        createRepository(null.asInstanceOf[String], subProjection)
    }

    def createRepository(alias: String, subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createRepository").alias(alias).projection(subProjection))
        this
    }

    def createRepository(input: MutationCreateRepositoryParametrizedInput,subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        createRepository(null.asInstanceOf[String], input, subProjection)
    }

    def createRepository(alias: String, input: MutationCreateRepositoryParametrizedInput , subProjection: CreateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("createRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def declineTopicSuggestion(subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        declineTopicSuggestion(null.asInstanceOf[String], subProjection)
    }

    def declineTopicSuggestion(alias: String, subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("declineTopicSuggestion").alias(alias).projection(subProjection))
        this
    }

    def declineTopicSuggestion(input: MutationDeclineTopicSuggestionParametrizedInput,subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        declineTopicSuggestion(null.asInstanceOf[String], input, subProjection)
    }

    def declineTopicSuggestion(alias: String, input: MutationDeclineTopicSuggestionParametrizedInput , subProjection: DeclineTopicSuggestionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("declineTopicSuggestion").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteBranchProtectionRule(subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        deleteBranchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def deleteBranchProtectionRule(alias: String, subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteBranchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def deleteBranchProtectionRule(input: MutationDeleteBranchProtectionRuleParametrizedInput,subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        deleteBranchProtectionRule(null.asInstanceOf[String], input, subProjection)
    }

    def deleteBranchProtectionRule(alias: String, input: MutationDeleteBranchProtectionRuleParametrizedInput , subProjection: DeleteBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteIssue(subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = {
        deleteIssue(null.asInstanceOf[String], subProjection)
    }

    def deleteIssue(alias: String, subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteIssue").alias(alias).projection(subProjection))
        this
    }

    def deleteIssue(input: MutationDeleteIssueParametrizedInput,subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = {
        deleteIssue(null.asInstanceOf[String], input, subProjection)
    }

    def deleteIssue(alias: String, input: MutationDeleteIssueParametrizedInput , subProjection: DeleteIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteIssueComment(subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        deleteIssueComment(null.asInstanceOf[String], subProjection)
    }

    def deleteIssueComment(alias: String, subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteIssueComment").alias(alias).projection(subProjection))
        this
    }

    def deleteIssueComment(input: MutationDeleteIssueCommentParametrizedInput,subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        deleteIssueComment(null.asInstanceOf[String], input, subProjection)
    }

    def deleteIssueComment(alias: String, input: MutationDeleteIssueCommentParametrizedInput , subProjection: DeleteIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteIssueComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteProject(subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = {
        deleteProject(null.asInstanceOf[String], subProjection)
    }

    def deleteProject(alias: String, subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias).projection(subProjection))
        this
    }

    def deleteProject(input: MutationDeleteProjectParametrizedInput,subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = {
        deleteProject(null.asInstanceOf[String], input, subProjection)
    }

    def deleteProject(alias: String, input: MutationDeleteProjectParametrizedInput , subProjection: DeleteProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteProjectCard(subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = {
        deleteProjectCard(null.asInstanceOf[String], subProjection)
    }

    def deleteProjectCard(alias: String, subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProjectCard").alias(alias).projection(subProjection))
        this
    }

    def deleteProjectCard(input: MutationDeleteProjectCardParametrizedInput,subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = {
        deleteProjectCard(null.asInstanceOf[String], input, subProjection)
    }

    def deleteProjectCard(alias: String, input: MutationDeleteProjectCardParametrizedInput , subProjection: DeleteProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProjectCard").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteProjectColumn(subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        deleteProjectColumn(null.asInstanceOf[String], subProjection)
    }

    def deleteProjectColumn(alias: String, subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProjectColumn").alias(alias).projection(subProjection))
        this
    }

    def deleteProjectColumn(input: MutationDeleteProjectColumnParametrizedInput,subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        deleteProjectColumn(null.asInstanceOf[String], input, subProjection)
    }

    def deleteProjectColumn(alias: String, input: MutationDeleteProjectColumnParametrizedInput , subProjection: DeleteProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteProjectColumn").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deletePullRequestReview(subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        deletePullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def deletePullRequestReview(alias: String, subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deletePullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def deletePullRequestReview(input: MutationDeletePullRequestReviewParametrizedInput,subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        deletePullRequestReview(null.asInstanceOf[String], input, subProjection)
    }

    def deletePullRequestReview(alias: String, input: MutationDeletePullRequestReviewParametrizedInput , subProjection: DeletePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deletePullRequestReview").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deletePullRequestReviewComment(subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        deletePullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def deletePullRequestReviewComment(alias: String, subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deletePullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def deletePullRequestReviewComment(input: MutationDeletePullRequestReviewCommentParametrizedInput,subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        deletePullRequestReviewComment(null.asInstanceOf[String], input, subProjection)
    }

    def deletePullRequestReviewComment(alias: String, input: MutationDeletePullRequestReviewCommentParametrizedInput , subProjection: DeletePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deletePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deleteRef(subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = {
        deleteRef(null.asInstanceOf[String], subProjection)
    }

    def deleteRef(alias: String, subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteRef").alias(alias).projection(subProjection))
        this
    }

    def deleteRef(input: MutationDeleteRefParametrizedInput,subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = {
        deleteRef(null.asInstanceOf[String], input, subProjection)
    }

    def deleteRef(alias: String, input: MutationDeleteRefParametrizedInput , subProjection: DeleteRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("deleteRef").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def dismissPullRequestReview(subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        dismissPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def dismissPullRequestReview(alias: String, subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("dismissPullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def dismissPullRequestReview(input: MutationDismissPullRequestReviewParametrizedInput,subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        dismissPullRequestReview(null.asInstanceOf[String], input, subProjection)
    }

    def dismissPullRequestReview(alias: String, input: MutationDismissPullRequestReviewParametrizedInput , subProjection: DismissPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("dismissPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def linkRepositoryToProject(subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = {
        linkRepositoryToProject(null.asInstanceOf[String], subProjection)
    }

    def linkRepositoryToProject(alias: String, subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("linkRepositoryToProject").alias(alias).projection(subProjection))
        this
    }

    def linkRepositoryToProject(input: MutationLinkRepositoryToProjectParametrizedInput,subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = {
        linkRepositoryToProject(null.asInstanceOf[String], input, subProjection)
    }

    def linkRepositoryToProject(alias: String, input: MutationLinkRepositoryToProjectParametrizedInput , subProjection: LinkRepositoryToProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("linkRepositoryToProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def lockLockable(subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = {
        lockLockable(null.asInstanceOf[String], subProjection)
    }

    def lockLockable(alias: String, subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("lockLockable").alias(alias).projection(subProjection))
        this
    }

    def lockLockable(input: MutationLockLockableParametrizedInput,subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = {
        lockLockable(null.asInstanceOf[String], input, subProjection)
    }

    def lockLockable(alias: String, input: MutationLockLockableParametrizedInput , subProjection: LockLockablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("lockLockable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def mergeBranch(subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = {
        mergeBranch(null.asInstanceOf[String], subProjection)
    }

    def mergeBranch(alias: String, subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("mergeBranch").alias(alias).projection(subProjection))
        this
    }

    def mergeBranch(input: MutationMergeBranchParametrizedInput,subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = {
        mergeBranch(null.asInstanceOf[String], input, subProjection)
    }

    def mergeBranch(alias: String, input: MutationMergeBranchParametrizedInput , subProjection: MergeBranchPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("mergeBranch").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def mergePullRequest(subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = {
        mergePullRequest(null.asInstanceOf[String], subProjection)
    }

    def mergePullRequest(alias: String, subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("mergePullRequest").alias(alias).projection(subProjection))
        this
    }

    def mergePullRequest(input: MutationMergePullRequestParametrizedInput,subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = {
        mergePullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def mergePullRequest(alias: String, input: MutationMergePullRequestParametrizedInput , subProjection: MergePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("mergePullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def moveProjectCard(subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = {
        moveProjectCard(null.asInstanceOf[String], subProjection)
    }

    def moveProjectCard(alias: String, subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("moveProjectCard").alias(alias).projection(subProjection))
        this
    }

    def moveProjectCard(input: MutationMoveProjectCardParametrizedInput,subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = {
        moveProjectCard(null.asInstanceOf[String], input, subProjection)
    }

    def moveProjectCard(alias: String, input: MutationMoveProjectCardParametrizedInput , subProjection: MoveProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("moveProjectCard").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def moveProjectColumn(subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        moveProjectColumn(null.asInstanceOf[String], subProjection)
    }

    def moveProjectColumn(alias: String, subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("moveProjectColumn").alias(alias).projection(subProjection))
        this
    }

    def moveProjectColumn(input: MutationMoveProjectColumnParametrizedInput,subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        moveProjectColumn(null.asInstanceOf[String], input, subProjection)
    }

    def moveProjectColumn(alias: String, input: MutationMoveProjectColumnParametrizedInput , subProjection: MoveProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("moveProjectColumn").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def removeAssigneesFromAssignable(subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = {
        removeAssigneesFromAssignable(null.asInstanceOf[String], subProjection)
    }

    def removeAssigneesFromAssignable(alias: String, subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).projection(subProjection))
        this
    }

    def removeAssigneesFromAssignable(input: MutationRemoveAssigneesFromAssignableParametrizedInput,subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = {
        removeAssigneesFromAssignable(null.asInstanceOf[String], input, subProjection)
    }

    def removeAssigneesFromAssignable(alias: String, input: MutationRemoveAssigneesFromAssignableParametrizedInput , subProjection: RemoveAssigneesFromAssignablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def removeLabelsFromLabelable(subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        removeLabelsFromLabelable(null.asInstanceOf[String], subProjection)
    }

    def removeLabelsFromLabelable(alias: String, subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeLabelsFromLabelable").alias(alias).projection(subProjection))
        this
    }

    def removeLabelsFromLabelable(input: MutationRemoveLabelsFromLabelableParametrizedInput,subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        removeLabelsFromLabelable(null.asInstanceOf[String], input, subProjection)
    }

    def removeLabelsFromLabelable(alias: String, input: MutationRemoveLabelsFromLabelableParametrizedInput , subProjection: RemoveLabelsFromLabelablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def removeOutsideCollaborator(subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = {
        removeOutsideCollaborator(null.asInstanceOf[String], subProjection)
    }

    def removeOutsideCollaborator(alias: String, subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeOutsideCollaborator").alias(alias).projection(subProjection))
        this
    }

    def removeOutsideCollaborator(input: MutationRemoveOutsideCollaboratorParametrizedInput,subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = {
        removeOutsideCollaborator(null.asInstanceOf[String], input, subProjection)
    }

    def removeOutsideCollaborator(alias: String, input: MutationRemoveOutsideCollaboratorParametrizedInput , subProjection: RemoveOutsideCollaboratorPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeOutsideCollaborator").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def removeReaction(subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = {
        removeReaction(null.asInstanceOf[String], subProjection)
    }

    def removeReaction(alias: String, subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeReaction").alias(alias).projection(subProjection))
        this
    }

    def removeReaction(input: MutationRemoveReactionParametrizedInput,subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = {
        removeReaction(null.asInstanceOf[String], input, subProjection)
    }

    def removeReaction(alias: String, input: MutationRemoveReactionParametrizedInput , subProjection: RemoveReactionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeReaction").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def removeStar(subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = {
        removeStar(null.asInstanceOf[String], subProjection)
    }

    def removeStar(alias: String, subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeStar").alias(alias).projection(subProjection))
        this
    }

    def removeStar(input: MutationRemoveStarParametrizedInput,subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = {
        removeStar(null.asInstanceOf[String], input, subProjection)
    }

    def removeStar(alias: String, input: MutationRemoveStarParametrizedInput , subProjection: RemoveStarPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("removeStar").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def reopenIssue(subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = {
        reopenIssue(null.asInstanceOf[String], subProjection)
    }

    def reopenIssue(alias: String, subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("reopenIssue").alias(alias).projection(subProjection))
        this
    }

    def reopenIssue(input: MutationReopenIssueParametrizedInput,subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = {
        reopenIssue(null.asInstanceOf[String], input, subProjection)
    }

    def reopenIssue(alias: String, input: MutationReopenIssueParametrizedInput , subProjection: ReopenIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("reopenIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def reopenPullRequest(subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = {
        reopenPullRequest(null.asInstanceOf[String], subProjection)
    }

    def reopenPullRequest(alias: String, subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("reopenPullRequest").alias(alias).projection(subProjection))
        this
    }

    def reopenPullRequest(input: MutationReopenPullRequestParametrizedInput,subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = {
        reopenPullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def reopenPullRequest(alias: String, input: MutationReopenPullRequestParametrizedInput , subProjection: ReopenPullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("reopenPullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def requestReviews(subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = {
        requestReviews(null.asInstanceOf[String], subProjection)
    }

    def requestReviews(alias: String, subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("requestReviews").alias(alias).projection(subProjection))
        this
    }

    def requestReviews(input: MutationRequestReviewsParametrizedInput,subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = {
        requestReviews(null.asInstanceOf[String], input, subProjection)
    }

    def requestReviews(alias: String, input: MutationRequestReviewsParametrizedInput , subProjection: RequestReviewsPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("requestReviews").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resolveReviewThread(subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        resolveReviewThread(null.asInstanceOf[String], subProjection)
    }

    def resolveReviewThread(alias: String, subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("resolveReviewThread").alias(alias).projection(subProjection))
        this
    }

    def resolveReviewThread(input: MutationResolveReviewThreadParametrizedInput,subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        resolveReviewThread(null.asInstanceOf[String], input, subProjection)
    }

    def resolveReviewThread(alias: String, input: MutationResolveReviewThreadParametrizedInput , subProjection: ResolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("resolveReviewThread").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def submitPullRequestReview(subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        submitPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def submitPullRequestReview(alias: String, subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("submitPullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def submitPullRequestReview(input: MutationSubmitPullRequestReviewParametrizedInput,subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        submitPullRequestReview(null.asInstanceOf[String], input, subProjection)
    }

    def submitPullRequestReview(alias: String, input: MutationSubmitPullRequestReviewParametrizedInput , subProjection: SubmitPullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("submitPullRequestReview").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def unlinkRepositoryFromProject(subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = {
        unlinkRepositoryFromProject(null.asInstanceOf[String], subProjection)
    }

    def unlinkRepositoryFromProject(alias: String, subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).projection(subProjection))
        this
    }

    def unlinkRepositoryFromProject(input: MutationUnlinkRepositoryFromProjectParametrizedInput,subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = {
        unlinkRepositoryFromProject(null.asInstanceOf[String], input, subProjection)
    }

    def unlinkRepositoryFromProject(alias: String, input: MutationUnlinkRepositoryFromProjectParametrizedInput , subProjection: UnlinkRepositoryFromProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def unlockLockable(subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = {
        unlockLockable(null.asInstanceOf[String], subProjection)
    }

    def unlockLockable(alias: String, subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unlockLockable").alias(alias).projection(subProjection))
        this
    }

    def unlockLockable(input: MutationUnlockLockableParametrizedInput,subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = {
        unlockLockable(null.asInstanceOf[String], input, subProjection)
    }

    def unlockLockable(alias: String, input: MutationUnlockLockableParametrizedInput , subProjection: UnlockLockablePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unlockLockable").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def unmarkIssueAsDuplicate(subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = {
        unmarkIssueAsDuplicate(null.asInstanceOf[String], subProjection)
    }

    def unmarkIssueAsDuplicate(alias: String, subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).projection(subProjection))
        this
    }

    def unmarkIssueAsDuplicate(input: MutationUnmarkIssueAsDuplicateParametrizedInput,subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = {
        unmarkIssueAsDuplicate(null.asInstanceOf[String], input, subProjection)
    }

    def unmarkIssueAsDuplicate(alias: String, input: MutationUnmarkIssueAsDuplicateParametrizedInput , subProjection: UnmarkIssueAsDuplicatePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def unresolveReviewThread(subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        unresolveReviewThread(null.asInstanceOf[String], subProjection)
    }

    def unresolveReviewThread(alias: String, subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unresolveReviewThread").alias(alias).projection(subProjection))
        this
    }

    def unresolveReviewThread(input: MutationUnresolveReviewThreadParametrizedInput,subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        unresolveReviewThread(null.asInstanceOf[String], input, subProjection)
    }

    def unresolveReviewThread(alias: String, input: MutationUnresolveReviewThreadParametrizedInput , subProjection: UnresolveReviewThreadPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("unresolveReviewThread").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateBranchProtectionRule(subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        updateBranchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def updateBranchProtectionRule(alias: String, subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateBranchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def updateBranchProtectionRule(input: MutationUpdateBranchProtectionRuleParametrizedInput,subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        updateBranchProtectionRule(null.asInstanceOf[String], input, subProjection)
    }

    def updateBranchProtectionRule(alias: String, input: MutationUpdateBranchProtectionRuleParametrizedInput , subProjection: UpdateBranchProtectionRulePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateBranchProtectionRule").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateIssue(subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = {
        updateIssue(null.asInstanceOf[String], subProjection)
    }

    def updateIssue(alias: String, subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateIssue").alias(alias).projection(subProjection))
        this
    }

    def updateIssue(input: MutationUpdateIssueParametrizedInput,subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = {
        updateIssue(null.asInstanceOf[String], input, subProjection)
    }

    def updateIssue(alias: String, input: MutationUpdateIssueParametrizedInput , subProjection: UpdateIssuePayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateIssue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateIssueComment(subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        updateIssueComment(null.asInstanceOf[String], subProjection)
    }

    def updateIssueComment(alias: String, subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateIssueComment").alias(alias).projection(subProjection))
        this
    }

    def updateIssueComment(input: MutationUpdateIssueCommentParametrizedInput,subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        updateIssueComment(null.asInstanceOf[String], input, subProjection)
    }

    def updateIssueComment(alias: String, input: MutationUpdateIssueCommentParametrizedInput , subProjection: UpdateIssueCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateIssueComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateProject(subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = {
        updateProject(null.asInstanceOf[String], subProjection)
    }

    def updateProject(alias: String, subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).projection(subProjection))
        this
    }

    def updateProject(input: MutationUpdateProjectParametrizedInput,subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = {
        updateProject(null.asInstanceOf[String], input, subProjection)
    }

    def updateProject(alias: String, input: MutationUpdateProjectParametrizedInput , subProjection: UpdateProjectPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateProjectCard(subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = {
        updateProjectCard(null.asInstanceOf[String], subProjection)
    }

    def updateProjectCard(alias: String, subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProjectCard").alias(alias).projection(subProjection))
        this
    }

    def updateProjectCard(input: MutationUpdateProjectCardParametrizedInput,subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = {
        updateProjectCard(null.asInstanceOf[String], input, subProjection)
    }

    def updateProjectCard(alias: String, input: MutationUpdateProjectCardParametrizedInput , subProjection: UpdateProjectCardPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProjectCard").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateProjectColumn(subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        updateProjectColumn(null.asInstanceOf[String], subProjection)
    }

    def updateProjectColumn(alias: String, subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProjectColumn").alias(alias).projection(subProjection))
        this
    }

    def updateProjectColumn(input: MutationUpdateProjectColumnParametrizedInput,subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        updateProjectColumn(null.asInstanceOf[String], input, subProjection)
    }

    def updateProjectColumn(alias: String, input: MutationUpdateProjectColumnParametrizedInput , subProjection: UpdateProjectColumnPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateProjectColumn").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updatePullRequest(subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequest(null.asInstanceOf[String], subProjection)
    }

    def updatePullRequest(alias: String, subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequest").alias(alias).projection(subProjection))
        this
    }

    def updatePullRequest(input: MutationUpdatePullRequestParametrizedInput,subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def updatePullRequest(alias: String, input: MutationUpdatePullRequestParametrizedInput , subProjection: UpdatePullRequestPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updatePullRequestReview(subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def updatePullRequestReview(alias: String, subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def updatePullRequestReview(input: MutationUpdatePullRequestReviewParametrizedInput,subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequestReview(null.asInstanceOf[String], input, subProjection)
    }

    def updatePullRequestReview(alias: String, input: MutationUpdatePullRequestReviewParametrizedInput , subProjection: UpdatePullRequestReviewPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequestReview").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updatePullRequestReviewComment(subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def updatePullRequestReviewComment(alias: String, subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def updatePullRequestReviewComment(input: MutationUpdatePullRequestReviewCommentParametrizedInput,subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        updatePullRequestReviewComment(null.asInstanceOf[String], input, subProjection)
    }

    def updatePullRequestReviewComment(alias: String, input: MutationUpdatePullRequestReviewCommentParametrizedInput , subProjection: UpdatePullRequestReviewCommentPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updatePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateRef(subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = {
        updateRef(null.asInstanceOf[String], subProjection)
    }

    def updateRef(alias: String, subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateRef").alias(alias).projection(subProjection))
        this
    }

    def updateRef(input: MutationUpdateRefParametrizedInput,subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = {
        updateRef(null.asInstanceOf[String], input, subProjection)
    }

    def updateRef(alias: String, input: MutationUpdateRefParametrizedInput , subProjection: UpdateRefPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateRef").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateRepository(subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        updateRepository(null.asInstanceOf[String], subProjection)
    }

    def updateRepository(alias: String, subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateRepository").alias(alias).projection(subProjection))
        this
    }

    def updateRepository(input: MutationUpdateRepositoryParametrizedInput,subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        updateRepository(null.asInstanceOf[String], input, subProjection)
    }

    def updateRepository(alias: String, input: MutationUpdateRepositoryParametrizedInput , subProjection: UpdateRepositoryPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateSubscription(subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = {
        updateSubscription(null.asInstanceOf[String], subProjection)
    }

    def updateSubscription(alias: String, subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateSubscription").alias(alias).projection(subProjection))
        this
    }

    def updateSubscription(input: MutationUpdateSubscriptionParametrizedInput,subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = {
        updateSubscription(null.asInstanceOf[String], input, subProjection)
    }

    def updateSubscription(alias: String, input: MutationUpdateSubscriptionParametrizedInput , subProjection: UpdateSubscriptionPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateSubscription").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updateTopics(subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = {
        updateTopics(null.asInstanceOf[String], subProjection)
    }

    def updateTopics(alias: String, subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateTopics").alias(alias).projection(subProjection))
        this
    }

    def updateTopics(input: MutationUpdateTopicsParametrizedInput,subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = {
        updateTopics(null.asInstanceOf[String], input, subProjection)
    }

    def updateTopics(alias: String, input: MutationUpdateTopicsParametrizedInput , subProjection: UpdateTopicsPayloadResponseProjection): MutationResponseProjection = {
        fields.add(new GraphQLResponseField("updateTopics").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def typename(): MutationResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MutationResponseProjection = {
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
        val that = obj.asInstanceOf[MutationResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
