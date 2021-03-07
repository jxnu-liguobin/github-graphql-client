package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MutationResponseProjection extends GraphQLResponseProjection {

    public MutationResponseProjection() {
    }

    @Override
    public MutationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MutationResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0) + 1);
            this.acceptTopicSuggestion(new AcceptTopicSuggestionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AcceptTopicSuggestionPayloadResponseProjection.acceptTopicSuggestion", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0) + 1);
            this.addAssigneesToAssignable(new AddAssigneesToAssignablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddAssigneesToAssignablePayloadResponseProjection.addAssigneesToAssignable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0) + 1);
            this.addComment(new AddCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddCommentPayloadResponseProjection.addComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0) + 1);
            this.addLabelsToLabelable(new AddLabelsToLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddLabelsToLabelablePayloadResponseProjection.addLabelsToLabelable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0) + 1);
            this.addProjectCard(new AddProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectCardPayloadResponseProjection.addProjectCard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0) + 1);
            this.addProjectColumn(new AddProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddProjectColumnPayloadResponseProjection.addProjectColumn", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0) + 1);
            this.addPullRequestReview(new AddPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewPayloadResponseProjection.addPullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0) + 1);
            this.addPullRequestReviewComment(new AddPullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddPullRequestReviewCommentPayloadResponseProjection.addPullRequestReviewComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0) + 1);
            this.addReaction(new AddReactionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddReactionPayloadResponseProjection.addReaction", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0) + 1);
            this.addStar(new AddStarPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AddStarPayloadResponseProjection.addStar", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0) + 1);
            this.changeUserStatus(new ChangeUserStatusPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ChangeUserStatusPayloadResponseProjection.changeUserStatus", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0) + 1);
            this.clearLabelsFromLabelable(new ClearLabelsFromLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClearLabelsFromLabelablePayloadResponseProjection.clearLabelsFromLabelable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0) + 1);
            this.cloneProject(new CloneProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneProjectPayloadResponseProjection.cloneProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0) + 1);
            this.cloneTemplateRepository(new CloneTemplateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloneTemplateRepositoryPayloadResponseProjection.cloneTemplateRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0) + 1);
            this.closeIssue(new CloseIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CloseIssuePayloadResponseProjection.closeIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0) + 1);
            this.closePullRequest(new ClosePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ClosePullRequestPayloadResponseProjection.closePullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0) + 1);
            this.convertProjectCardNoteToIssue(new ConvertProjectCardNoteToIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ConvertProjectCardNoteToIssuePayloadResponseProjection.convertProjectCardNoteToIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0) + 1);
            this.createBranchProtectionRule(new CreateBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateBranchProtectionRulePayloadResponseProjection.createBranchProtectionRule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0) + 1);
            this.createIssue(new CreateIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateIssuePayloadResponseProjection.createIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0) + 1);
            this.createProject(new CreateProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateProjectPayloadResponseProjection.createProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0) + 1);
            this.createPullRequest(new CreatePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreatePullRequestPayloadResponseProjection.createPullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0) + 1);
            this.createRef(new CreateRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRefPayloadResponseProjection.createRef", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0) + 1);
            this.createRepository(new CreateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateRepositoryPayloadResponseProjection.createRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0) + 1);
            this.declineTopicSuggestion(new DeclineTopicSuggestionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeclineTopicSuggestionPayloadResponseProjection.declineTopicSuggestion", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0) + 1);
            this.deleteBranchProtectionRule(new DeleteBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteBranchProtectionRulePayloadResponseProjection.deleteBranchProtectionRule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0) + 1);
            this.deleteIssue(new DeleteIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssuePayloadResponseProjection.deleteIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0) + 1);
            this.deleteIssueComment(new DeleteIssueCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteIssueCommentPayloadResponseProjection.deleteIssueComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0) + 1);
            this.deleteProject(new DeleteProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectPayloadResponseProjection.deleteProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0) + 1);
            this.deleteProjectCard(new DeleteProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectCardPayloadResponseProjection.deleteProjectCard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0) + 1);
            this.deleteProjectColumn(new DeleteProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteProjectColumnPayloadResponseProjection.deleteProjectColumn", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0) + 1);
            this.deletePullRequestReview(new DeletePullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewPayloadResponseProjection.deletePullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0) + 1);
            this.deletePullRequestReviewComment(new DeletePullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeletePullRequestReviewCommentPayloadResponseProjection.deletePullRequestReviewComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0) + 1);
            this.deleteRef(new DeleteRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DeleteRefPayloadResponseProjection.deleteRef", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0) + 1);
            this.dismissPullRequestReview(new DismissPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DismissPullRequestReviewPayloadResponseProjection.dismissPullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0) + 1);
            this.linkRepositoryToProject(new LinkRepositoryToProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LinkRepositoryToProjectPayloadResponseProjection.linkRepositoryToProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0) + 1);
            this.lockLockable(new LockLockablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.LockLockablePayloadResponseProjection.lockLockable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0) + 1);
            this.mergeBranch(new MergeBranchPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergeBranchPayloadResponseProjection.mergeBranch", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0) + 1);
            this.mergePullRequest(new MergePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MergePullRequestPayloadResponseProjection.mergePullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0) + 1);
            this.moveProjectCard(new MoveProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectCardPayloadResponseProjection.moveProjectCard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0) + 1);
            this.moveProjectColumn(new MoveProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MoveProjectColumnPayloadResponseProjection.moveProjectColumn", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0) + 1);
            this.removeAssigneesFromAssignable(new RemoveAssigneesFromAssignablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveAssigneesFromAssignablePayloadResponseProjection.removeAssigneesFromAssignable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0) + 1);
            this.removeLabelsFromLabelable(new RemoveLabelsFromLabelablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveLabelsFromLabelablePayloadResponseProjection.removeLabelsFromLabelable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0) + 1);
            this.removeOutsideCollaborator(new RemoveOutsideCollaboratorPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveOutsideCollaboratorPayloadResponseProjection.removeOutsideCollaborator", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0) + 1);
            this.removeReaction(new RemoveReactionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveReactionPayloadResponseProjection.removeReaction", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0) + 1);
            this.removeStar(new RemoveStarPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RemoveStarPayloadResponseProjection.removeStar", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0) + 1);
            this.reopenIssue(new ReopenIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenIssuePayloadResponseProjection.reopenIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0) + 1);
            this.reopenPullRequest(new ReopenPullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ReopenPullRequestPayloadResponseProjection.reopenPullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0) + 1);
            this.requestReviews(new RequestReviewsPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RequestReviewsPayloadResponseProjection.requestReviews", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0) + 1);
            this.resolveReviewThread(new ResolveReviewThreadPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ResolveReviewThreadPayloadResponseProjection.resolveReviewThread", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0) + 1);
            this.submitPullRequestReview(new SubmitPullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SubmitPullRequestReviewPayloadResponseProjection.submitPullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0) + 1);
            this.unlinkRepositoryFromProject(new UnlinkRepositoryFromProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlinkRepositoryFromProjectPayloadResponseProjection.unlinkRepositoryFromProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0) + 1);
            this.unlockLockable(new UnlockLockablePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnlockLockablePayloadResponseProjection.unlockLockable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0) + 1);
            this.unmarkIssueAsDuplicate(new UnmarkIssueAsDuplicatePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnmarkIssueAsDuplicatePayloadResponseProjection.unmarkIssueAsDuplicate", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0) + 1);
            this.unresolveReviewThread(new UnresolveReviewThreadPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UnresolveReviewThreadPayloadResponseProjection.unresolveReviewThread", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0) + 1);
            this.updateBranchProtectionRule(new UpdateBranchProtectionRulePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateBranchProtectionRulePayloadResponseProjection.updateBranchProtectionRule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0) + 1);
            this.updateIssue(new UpdateIssuePayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssuePayloadResponseProjection.updateIssue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0) + 1);
            this.updateIssueComment(new UpdateIssueCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateIssueCommentPayloadResponseProjection.updateIssueComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0) + 1);
            this.updateProject(new UpdateProjectPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectPayloadResponseProjection.updateProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0) + 1);
            this.updateProjectCard(new UpdateProjectCardPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectCardPayloadResponseProjection.updateProjectCard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0) + 1);
            this.updateProjectColumn(new UpdateProjectColumnPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateProjectColumnPayloadResponseProjection.updateProjectColumn", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0) + 1);
            this.updatePullRequest(new UpdatePullRequestPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestPayloadResponseProjection.updatePullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0) + 1);
            this.updatePullRequestReview(new UpdatePullRequestReviewPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewPayloadResponseProjection.updatePullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0) + 1);
            this.updatePullRequestReviewComment(new UpdatePullRequestReviewCommentPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdatePullRequestReviewCommentPayloadResponseProjection.updatePullRequestReviewComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0) + 1);
            this.updateRef(new UpdateRefPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRefPayloadResponseProjection.updateRef", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0) + 1);
            this.updateRepository(new UpdateRepositoryPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateRepositoryPayloadResponseProjection.updateRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0) + 1);
            this.updateSubscription(new UpdateSubscriptionPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateSubscriptionPayloadResponseProjection.updateSubscription", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0) + 1);
            this.updateTopics(new UpdateTopicsPayloadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UpdateTopicsPayloadResponseProjection.updateTopics", 0)));
        }
        this.typename();
        return this;
    }

    public MutationResponseProjection acceptTopicSuggestion(AcceptTopicSuggestionPayloadResponseProjection subProjection) {
        return acceptTopicSuggestion((String)null, subProjection);
    }

    public MutationResponseProjection acceptTopicSuggestion(String alias, AcceptTopicSuggestionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("acceptTopicSuggestion").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection acceptTopicSuggestion(MutationAcceptTopicSuggestionParametrizedInput input, AcceptTopicSuggestionPayloadResponseProjection subProjection) {
        return acceptTopicSuggestion(null, input, subProjection);
    }

    public MutationResponseProjection acceptTopicSuggestion(String alias, MutationAcceptTopicSuggestionParametrizedInput input, AcceptTopicSuggestionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("acceptTopicSuggestion").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addAssigneesToAssignable(AddAssigneesToAssignablePayloadResponseProjection subProjection) {
        return addAssigneesToAssignable((String)null, subProjection);
    }

    public MutationResponseProjection addAssigneesToAssignable(String alias, AddAssigneesToAssignablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addAssigneesToAssignable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addAssigneesToAssignable(MutationAddAssigneesToAssignableParametrizedInput input, AddAssigneesToAssignablePayloadResponseProjection subProjection) {
        return addAssigneesToAssignable(null, input, subProjection);
    }

    public MutationResponseProjection addAssigneesToAssignable(String alias, MutationAddAssigneesToAssignableParametrizedInput input, AddAssigneesToAssignablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addAssigneesToAssignable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addComment(AddCommentPayloadResponseProjection subProjection) {
        return addComment((String)null, subProjection);
    }

    public MutationResponseProjection addComment(String alias, AddCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addComment(MutationAddCommentParametrizedInput input, AddCommentPayloadResponseProjection subProjection) {
        return addComment(null, input, subProjection);
    }

    public MutationResponseProjection addComment(String alias, MutationAddCommentParametrizedInput input, AddCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addLabelsToLabelable(AddLabelsToLabelablePayloadResponseProjection subProjection) {
        return addLabelsToLabelable((String)null, subProjection);
    }

    public MutationResponseProjection addLabelsToLabelable(String alias, AddLabelsToLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addLabelsToLabelable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addLabelsToLabelable(MutationAddLabelsToLabelableParametrizedInput input, AddLabelsToLabelablePayloadResponseProjection subProjection) {
        return addLabelsToLabelable(null, input, subProjection);
    }

    public MutationResponseProjection addLabelsToLabelable(String alias, MutationAddLabelsToLabelableParametrizedInput input, AddLabelsToLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addLabelsToLabelable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addProjectCard(AddProjectCardPayloadResponseProjection subProjection) {
        return addProjectCard((String)null, subProjection);
    }

    public MutationResponseProjection addProjectCard(String alias, AddProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addProjectCard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addProjectCard(MutationAddProjectCardParametrizedInput input, AddProjectCardPayloadResponseProjection subProjection) {
        return addProjectCard(null, input, subProjection);
    }

    public MutationResponseProjection addProjectCard(String alias, MutationAddProjectCardParametrizedInput input, AddProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addProjectCard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addProjectColumn(AddProjectColumnPayloadResponseProjection subProjection) {
        return addProjectColumn((String)null, subProjection);
    }

    public MutationResponseProjection addProjectColumn(String alias, AddProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addProjectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addProjectColumn(MutationAddProjectColumnParametrizedInput input, AddProjectColumnPayloadResponseProjection subProjection) {
        return addProjectColumn(null, input, subProjection);
    }

    public MutationResponseProjection addProjectColumn(String alias, MutationAddProjectColumnParametrizedInput input, AddProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addProjectColumn").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addPullRequestReview(AddPullRequestReviewPayloadResponseProjection subProjection) {
        return addPullRequestReview((String)null, subProjection);
    }

    public MutationResponseProjection addPullRequestReview(String alias, AddPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addPullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addPullRequestReview(MutationAddPullRequestReviewParametrizedInput input, AddPullRequestReviewPayloadResponseProjection subProjection) {
        return addPullRequestReview(null, input, subProjection);
    }

    public MutationResponseProjection addPullRequestReview(String alias, MutationAddPullRequestReviewParametrizedInput input, AddPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addPullRequestReview").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addPullRequestReviewComment(AddPullRequestReviewCommentPayloadResponseProjection subProjection) {
        return addPullRequestReviewComment((String)null, subProjection);
    }

    public MutationResponseProjection addPullRequestReviewComment(String alias, AddPullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addPullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addPullRequestReviewComment(MutationAddPullRequestReviewCommentParametrizedInput input, AddPullRequestReviewCommentPayloadResponseProjection subProjection) {
        return addPullRequestReviewComment(null, input, subProjection);
    }

    public MutationResponseProjection addPullRequestReviewComment(String alias, MutationAddPullRequestReviewCommentParametrizedInput input, AddPullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addPullRequestReviewComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addReaction(AddReactionPayloadResponseProjection subProjection) {
        return addReaction((String)null, subProjection);
    }

    public MutationResponseProjection addReaction(String alias, AddReactionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addReaction").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addReaction(MutationAddReactionParametrizedInput input, AddReactionPayloadResponseProjection subProjection) {
        return addReaction(null, input, subProjection);
    }

    public MutationResponseProjection addReaction(String alias, MutationAddReactionParametrizedInput input, AddReactionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addReaction").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addStar(AddStarPayloadResponseProjection subProjection) {
        return addStar((String)null, subProjection);
    }

    public MutationResponseProjection addStar(String alias, AddStarPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addStar").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addStar(MutationAddStarParametrizedInput input, AddStarPayloadResponseProjection subProjection) {
        return addStar(null, input, subProjection);
    }

    public MutationResponseProjection addStar(String alias, MutationAddStarParametrizedInput input, AddStarPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addStar").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection changeUserStatus(ChangeUserStatusPayloadResponseProjection subProjection) {
        return changeUserStatus((String)null, subProjection);
    }

    public MutationResponseProjection changeUserStatus(String alias, ChangeUserStatusPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("changeUserStatus").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection changeUserStatus(MutationChangeUserStatusParametrizedInput input, ChangeUserStatusPayloadResponseProjection subProjection) {
        return changeUserStatus(null, input, subProjection);
    }

    public MutationResponseProjection changeUserStatus(String alias, MutationChangeUserStatusParametrizedInput input, ChangeUserStatusPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("changeUserStatus").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection clearLabelsFromLabelable(ClearLabelsFromLabelablePayloadResponseProjection subProjection) {
        return clearLabelsFromLabelable((String)null, subProjection);
    }

    public MutationResponseProjection clearLabelsFromLabelable(String alias, ClearLabelsFromLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("clearLabelsFromLabelable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection clearLabelsFromLabelable(MutationClearLabelsFromLabelableParametrizedInput input, ClearLabelsFromLabelablePayloadResponseProjection subProjection) {
        return clearLabelsFromLabelable(null, input, subProjection);
    }

    public MutationResponseProjection clearLabelsFromLabelable(String alias, MutationClearLabelsFromLabelableParametrizedInput input, ClearLabelsFromLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("clearLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection cloneProject(CloneProjectPayloadResponseProjection subProjection) {
        return cloneProject((String)null, subProjection);
    }

    public MutationResponseProjection cloneProject(String alias, CloneProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cloneProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection cloneProject(MutationCloneProjectParametrizedInput input, CloneProjectPayloadResponseProjection subProjection) {
        return cloneProject(null, input, subProjection);
    }

    public MutationResponseProjection cloneProject(String alias, MutationCloneProjectParametrizedInput input, CloneProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cloneProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection cloneTemplateRepository(CloneTemplateRepositoryPayloadResponseProjection subProjection) {
        return cloneTemplateRepository((String)null, subProjection);
    }

    public MutationResponseProjection cloneTemplateRepository(String alias, CloneTemplateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cloneTemplateRepository").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection cloneTemplateRepository(MutationCloneTemplateRepositoryParametrizedInput input, CloneTemplateRepositoryPayloadResponseProjection subProjection) {
        return cloneTemplateRepository(null, input, subProjection);
    }

    public MutationResponseProjection cloneTemplateRepository(String alias, MutationCloneTemplateRepositoryParametrizedInput input, CloneTemplateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cloneTemplateRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection closeIssue(CloseIssuePayloadResponseProjection subProjection) {
        return closeIssue((String)null, subProjection);
    }

    public MutationResponseProjection closeIssue(String alias, CloseIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closeIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection closeIssue(MutationCloseIssueParametrizedInput input, CloseIssuePayloadResponseProjection subProjection) {
        return closeIssue(null, input, subProjection);
    }

    public MutationResponseProjection closeIssue(String alias, MutationCloseIssueParametrizedInput input, CloseIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closeIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection closePullRequest(ClosePullRequestPayloadResponseProjection subProjection) {
        return closePullRequest((String)null, subProjection);
    }

    public MutationResponseProjection closePullRequest(String alias, ClosePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closePullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection closePullRequest(MutationClosePullRequestParametrizedInput input, ClosePullRequestPayloadResponseProjection subProjection) {
        return closePullRequest(null, input, subProjection);
    }

    public MutationResponseProjection closePullRequest(String alias, MutationClosePullRequestParametrizedInput input, ClosePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closePullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection convertProjectCardNoteToIssue(ConvertProjectCardNoteToIssuePayloadResponseProjection subProjection) {
        return convertProjectCardNoteToIssue((String)null, subProjection);
    }

    public MutationResponseProjection convertProjectCardNoteToIssue(String alias, ConvertProjectCardNoteToIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection convertProjectCardNoteToIssue(MutationConvertProjectCardNoteToIssueParametrizedInput input, ConvertProjectCardNoteToIssuePayloadResponseProjection subProjection) {
        return convertProjectCardNoteToIssue(null, input, subProjection);
    }

    public MutationResponseProjection convertProjectCardNoteToIssue(String alias, MutationConvertProjectCardNoteToIssueParametrizedInput input, ConvertProjectCardNoteToIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("convertProjectCardNoteToIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createBranchProtectionRule(CreateBranchProtectionRulePayloadResponseProjection subProjection) {
        return createBranchProtectionRule((String)null, subProjection);
    }

    public MutationResponseProjection createBranchProtectionRule(String alias, CreateBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createBranchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createBranchProtectionRule(MutationCreateBranchProtectionRuleParametrizedInput input, CreateBranchProtectionRulePayloadResponseProjection subProjection) {
        return createBranchProtectionRule(null, input, subProjection);
    }

    public MutationResponseProjection createBranchProtectionRule(String alias, MutationCreateBranchProtectionRuleParametrizedInput input, CreateBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createBranchProtectionRule").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createIssue(CreateIssuePayloadResponseProjection subProjection) {
        return createIssue((String)null, subProjection);
    }

    public MutationResponseProjection createIssue(String alias, CreateIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createIssue(MutationCreateIssueParametrizedInput input, CreateIssuePayloadResponseProjection subProjection) {
        return createIssue(null, input, subProjection);
    }

    public MutationResponseProjection createIssue(String alias, MutationCreateIssueParametrizedInput input, CreateIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createProject(CreateProjectPayloadResponseProjection subProjection) {
        return createProject((String)null, subProjection);
    }

    public MutationResponseProjection createProject(String alias, CreateProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createProject(MutationCreateProjectParametrizedInput input, CreateProjectPayloadResponseProjection subProjection) {
        return createProject(null, input, subProjection);
    }

    public MutationResponseProjection createProject(String alias, MutationCreateProjectParametrizedInput input, CreateProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createPullRequest(CreatePullRequestPayloadResponseProjection subProjection) {
        return createPullRequest((String)null, subProjection);
    }

    public MutationResponseProjection createPullRequest(String alias, CreatePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createPullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createPullRequest(MutationCreatePullRequestParametrizedInput input, CreatePullRequestPayloadResponseProjection subProjection) {
        return createPullRequest(null, input, subProjection);
    }

    public MutationResponseProjection createPullRequest(String alias, MutationCreatePullRequestParametrizedInput input, CreatePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createPullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRef(CreateRefPayloadResponseProjection subProjection) {
        return createRef((String)null, subProjection);
    }

    public MutationResponseProjection createRef(String alias, CreateRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRef").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRef(MutationCreateRefParametrizedInput input, CreateRefPayloadResponseProjection subProjection) {
        return createRef(null, input, subProjection);
    }

    public MutationResponseProjection createRef(String alias, MutationCreateRefParametrizedInput input, CreateRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRef").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRepository(CreateRepositoryPayloadResponseProjection subProjection) {
        return createRepository((String)null, subProjection);
    }

    public MutationResponseProjection createRepository(String alias, CreateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRepository").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRepository(MutationCreateRepositoryParametrizedInput input, CreateRepositoryPayloadResponseProjection subProjection) {
        return createRepository(null, input, subProjection);
    }

    public MutationResponseProjection createRepository(String alias, MutationCreateRepositoryParametrizedInput input, CreateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection declineTopicSuggestion(DeclineTopicSuggestionPayloadResponseProjection subProjection) {
        return declineTopicSuggestion((String)null, subProjection);
    }

    public MutationResponseProjection declineTopicSuggestion(String alias, DeclineTopicSuggestionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("declineTopicSuggestion").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection declineTopicSuggestion(MutationDeclineTopicSuggestionParametrizedInput input, DeclineTopicSuggestionPayloadResponseProjection subProjection) {
        return declineTopicSuggestion(null, input, subProjection);
    }

    public MutationResponseProjection declineTopicSuggestion(String alias, MutationDeclineTopicSuggestionParametrizedInput input, DeclineTopicSuggestionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("declineTopicSuggestion").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteBranchProtectionRule(DeleteBranchProtectionRulePayloadResponseProjection subProjection) {
        return deleteBranchProtectionRule((String)null, subProjection);
    }

    public MutationResponseProjection deleteBranchProtectionRule(String alias, DeleteBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteBranchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteBranchProtectionRule(MutationDeleteBranchProtectionRuleParametrizedInput input, DeleteBranchProtectionRulePayloadResponseProjection subProjection) {
        return deleteBranchProtectionRule(null, input, subProjection);
    }

    public MutationResponseProjection deleteBranchProtectionRule(String alias, MutationDeleteBranchProtectionRuleParametrizedInput input, DeleteBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteBranchProtectionRule").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteIssue(DeleteIssuePayloadResponseProjection subProjection) {
        return deleteIssue((String)null, subProjection);
    }

    public MutationResponseProjection deleteIssue(String alias, DeleteIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteIssue(MutationDeleteIssueParametrizedInput input, DeleteIssuePayloadResponseProjection subProjection) {
        return deleteIssue(null, input, subProjection);
    }

    public MutationResponseProjection deleteIssue(String alias, MutationDeleteIssueParametrizedInput input, DeleteIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteIssueComment(DeleteIssueCommentPayloadResponseProjection subProjection) {
        return deleteIssueComment((String)null, subProjection);
    }

    public MutationResponseProjection deleteIssueComment(String alias, DeleteIssueCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteIssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteIssueComment(MutationDeleteIssueCommentParametrizedInput input, DeleteIssueCommentPayloadResponseProjection subProjection) {
        return deleteIssueComment(null, input, subProjection);
    }

    public MutationResponseProjection deleteIssueComment(String alias, MutationDeleteIssueCommentParametrizedInput input, DeleteIssueCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteIssueComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProject(DeleteProjectPayloadResponseProjection subProjection) {
        return deleteProject((String)null, subProjection);
    }

    public MutationResponseProjection deleteProject(String alias, DeleteProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProject(MutationDeleteProjectParametrizedInput input, DeleteProjectPayloadResponseProjection subProjection) {
        return deleteProject(null, input, subProjection);
    }

    public MutationResponseProjection deleteProject(String alias, MutationDeleteProjectParametrizedInput input, DeleteProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProjectCard(DeleteProjectCardPayloadResponseProjection subProjection) {
        return deleteProjectCard((String)null, subProjection);
    }

    public MutationResponseProjection deleteProjectCard(String alias, DeleteProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProjectCard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProjectCard(MutationDeleteProjectCardParametrizedInput input, DeleteProjectCardPayloadResponseProjection subProjection) {
        return deleteProjectCard(null, input, subProjection);
    }

    public MutationResponseProjection deleteProjectCard(String alias, MutationDeleteProjectCardParametrizedInput input, DeleteProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProjectCard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProjectColumn(DeleteProjectColumnPayloadResponseProjection subProjection) {
        return deleteProjectColumn((String)null, subProjection);
    }

    public MutationResponseProjection deleteProjectColumn(String alias, DeleteProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProjectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProjectColumn(MutationDeleteProjectColumnParametrizedInput input, DeleteProjectColumnPayloadResponseProjection subProjection) {
        return deleteProjectColumn(null, input, subProjection);
    }

    public MutationResponseProjection deleteProjectColumn(String alias, MutationDeleteProjectColumnParametrizedInput input, DeleteProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteProjectColumn").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deletePullRequestReview(DeletePullRequestReviewPayloadResponseProjection subProjection) {
        return deletePullRequestReview((String)null, subProjection);
    }

    public MutationResponseProjection deletePullRequestReview(String alias, DeletePullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deletePullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deletePullRequestReview(MutationDeletePullRequestReviewParametrizedInput input, DeletePullRequestReviewPayloadResponseProjection subProjection) {
        return deletePullRequestReview(null, input, subProjection);
    }

    public MutationResponseProjection deletePullRequestReview(String alias, MutationDeletePullRequestReviewParametrizedInput input, DeletePullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deletePullRequestReview").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deletePullRequestReviewComment(DeletePullRequestReviewCommentPayloadResponseProjection subProjection) {
        return deletePullRequestReviewComment((String)null, subProjection);
    }

    public MutationResponseProjection deletePullRequestReviewComment(String alias, DeletePullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deletePullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deletePullRequestReviewComment(MutationDeletePullRequestReviewCommentParametrizedInput input, DeletePullRequestReviewCommentPayloadResponseProjection subProjection) {
        return deletePullRequestReviewComment(null, input, subProjection);
    }

    public MutationResponseProjection deletePullRequestReviewComment(String alias, MutationDeletePullRequestReviewCommentParametrizedInput input, DeletePullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deletePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteRef(DeleteRefPayloadResponseProjection subProjection) {
        return deleteRef((String)null, subProjection);
    }

    public MutationResponseProjection deleteRef(String alias, DeleteRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteRef").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteRef(MutationDeleteRefParametrizedInput input, DeleteRefPayloadResponseProjection subProjection) {
        return deleteRef(null, input, subProjection);
    }

    public MutationResponseProjection deleteRef(String alias, MutationDeleteRefParametrizedInput input, DeleteRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deleteRef").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection dismissPullRequestReview(DismissPullRequestReviewPayloadResponseProjection subProjection) {
        return dismissPullRequestReview((String)null, subProjection);
    }

    public MutationResponseProjection dismissPullRequestReview(String alias, DismissPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dismissPullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection dismissPullRequestReview(MutationDismissPullRequestReviewParametrizedInput input, DismissPullRequestReviewPayloadResponseProjection subProjection) {
        return dismissPullRequestReview(null, input, subProjection);
    }

    public MutationResponseProjection dismissPullRequestReview(String alias, MutationDismissPullRequestReviewParametrizedInput input, DismissPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dismissPullRequestReview").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection linkRepositoryToProject(LinkRepositoryToProjectPayloadResponseProjection subProjection) {
        return linkRepositoryToProject((String)null, subProjection);
    }

    public MutationResponseProjection linkRepositoryToProject(String alias, LinkRepositoryToProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkRepositoryToProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection linkRepositoryToProject(MutationLinkRepositoryToProjectParametrizedInput input, LinkRepositoryToProjectPayloadResponseProjection subProjection) {
        return linkRepositoryToProject(null, input, subProjection);
    }

    public MutationResponseProjection linkRepositoryToProject(String alias, MutationLinkRepositoryToProjectParametrizedInput input, LinkRepositoryToProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkRepositoryToProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection lockLockable(LockLockablePayloadResponseProjection subProjection) {
        return lockLockable((String)null, subProjection);
    }

    public MutationResponseProjection lockLockable(String alias, LockLockablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lockLockable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection lockLockable(MutationLockLockableParametrizedInput input, LockLockablePayloadResponseProjection subProjection) {
        return lockLockable(null, input, subProjection);
    }

    public MutationResponseProjection lockLockable(String alias, MutationLockLockableParametrizedInput input, LockLockablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lockLockable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection mergeBranch(MergeBranchPayloadResponseProjection subProjection) {
        return mergeBranch((String)null, subProjection);
    }

    public MutationResponseProjection mergeBranch(String alias, MergeBranchPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergeBranch").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection mergeBranch(MutationMergeBranchParametrizedInput input, MergeBranchPayloadResponseProjection subProjection) {
        return mergeBranch(null, input, subProjection);
    }

    public MutationResponseProjection mergeBranch(String alias, MutationMergeBranchParametrizedInput input, MergeBranchPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergeBranch").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection mergePullRequest(MergePullRequestPayloadResponseProjection subProjection) {
        return mergePullRequest((String)null, subProjection);
    }

    public MutationResponseProjection mergePullRequest(String alias, MergePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergePullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection mergePullRequest(MutationMergePullRequestParametrizedInput input, MergePullRequestPayloadResponseProjection subProjection) {
        return mergePullRequest(null, input, subProjection);
    }

    public MutationResponseProjection mergePullRequest(String alias, MutationMergePullRequestParametrizedInput input, MergePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergePullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection moveProjectCard(MoveProjectCardPayloadResponseProjection subProjection) {
        return moveProjectCard((String)null, subProjection);
    }

    public MutationResponseProjection moveProjectCard(String alias, MoveProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveProjectCard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection moveProjectCard(MutationMoveProjectCardParametrizedInput input, MoveProjectCardPayloadResponseProjection subProjection) {
        return moveProjectCard(null, input, subProjection);
    }

    public MutationResponseProjection moveProjectCard(String alias, MutationMoveProjectCardParametrizedInput input, MoveProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveProjectCard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection moveProjectColumn(MoveProjectColumnPayloadResponseProjection subProjection) {
        return moveProjectColumn((String)null, subProjection);
    }

    public MutationResponseProjection moveProjectColumn(String alias, MoveProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveProjectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection moveProjectColumn(MutationMoveProjectColumnParametrizedInput input, MoveProjectColumnPayloadResponseProjection subProjection) {
        return moveProjectColumn(null, input, subProjection);
    }

    public MutationResponseProjection moveProjectColumn(String alias, MutationMoveProjectColumnParametrizedInput input, MoveProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveProjectColumn").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeAssigneesFromAssignable(RemoveAssigneesFromAssignablePayloadResponseProjection subProjection) {
        return removeAssigneesFromAssignable((String)null, subProjection);
    }

    public MutationResponseProjection removeAssigneesFromAssignable(String alias, RemoveAssigneesFromAssignablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeAssigneesFromAssignable(MutationRemoveAssigneesFromAssignableParametrizedInput input, RemoveAssigneesFromAssignablePayloadResponseProjection subProjection) {
        return removeAssigneesFromAssignable(null, input, subProjection);
    }

    public MutationResponseProjection removeAssigneesFromAssignable(String alias, MutationRemoveAssigneesFromAssignableParametrizedInput input, RemoveAssigneesFromAssignablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeAssigneesFromAssignable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeLabelsFromLabelable(RemoveLabelsFromLabelablePayloadResponseProjection subProjection) {
        return removeLabelsFromLabelable((String)null, subProjection);
    }

    public MutationResponseProjection removeLabelsFromLabelable(String alias, RemoveLabelsFromLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeLabelsFromLabelable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeLabelsFromLabelable(MutationRemoveLabelsFromLabelableParametrizedInput input, RemoveLabelsFromLabelablePayloadResponseProjection subProjection) {
        return removeLabelsFromLabelable(null, input, subProjection);
    }

    public MutationResponseProjection removeLabelsFromLabelable(String alias, MutationRemoveLabelsFromLabelableParametrizedInput input, RemoveLabelsFromLabelablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeLabelsFromLabelable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeOutsideCollaborator(RemoveOutsideCollaboratorPayloadResponseProjection subProjection) {
        return removeOutsideCollaborator((String)null, subProjection);
    }

    public MutationResponseProjection removeOutsideCollaborator(String alias, RemoveOutsideCollaboratorPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeOutsideCollaborator").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeOutsideCollaborator(MutationRemoveOutsideCollaboratorParametrizedInput input, RemoveOutsideCollaboratorPayloadResponseProjection subProjection) {
        return removeOutsideCollaborator(null, input, subProjection);
    }

    public MutationResponseProjection removeOutsideCollaborator(String alias, MutationRemoveOutsideCollaboratorParametrizedInput input, RemoveOutsideCollaboratorPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeOutsideCollaborator").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeReaction(RemoveReactionPayloadResponseProjection subProjection) {
        return removeReaction((String)null, subProjection);
    }

    public MutationResponseProjection removeReaction(String alias, RemoveReactionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeReaction").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeReaction(MutationRemoveReactionParametrizedInput input, RemoveReactionPayloadResponseProjection subProjection) {
        return removeReaction(null, input, subProjection);
    }

    public MutationResponseProjection removeReaction(String alias, MutationRemoveReactionParametrizedInput input, RemoveReactionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeReaction").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeStar(RemoveStarPayloadResponseProjection subProjection) {
        return removeStar((String)null, subProjection);
    }

    public MutationResponseProjection removeStar(String alias, RemoveStarPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeStar").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeStar(MutationRemoveStarParametrizedInput input, RemoveStarPayloadResponseProjection subProjection) {
        return removeStar(null, input, subProjection);
    }

    public MutationResponseProjection removeStar(String alias, MutationRemoveStarParametrizedInput input, RemoveStarPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removeStar").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection reopenIssue(ReopenIssuePayloadResponseProjection subProjection) {
        return reopenIssue((String)null, subProjection);
    }

    public MutationResponseProjection reopenIssue(String alias, ReopenIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reopenIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection reopenIssue(MutationReopenIssueParametrizedInput input, ReopenIssuePayloadResponseProjection subProjection) {
        return reopenIssue(null, input, subProjection);
    }

    public MutationResponseProjection reopenIssue(String alias, MutationReopenIssueParametrizedInput input, ReopenIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reopenIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection reopenPullRequest(ReopenPullRequestPayloadResponseProjection subProjection) {
        return reopenPullRequest((String)null, subProjection);
    }

    public MutationResponseProjection reopenPullRequest(String alias, ReopenPullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reopenPullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection reopenPullRequest(MutationReopenPullRequestParametrizedInput input, ReopenPullRequestPayloadResponseProjection subProjection) {
        return reopenPullRequest(null, input, subProjection);
    }

    public MutationResponseProjection reopenPullRequest(String alias, MutationReopenPullRequestParametrizedInput input, ReopenPullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reopenPullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection requestReviews(RequestReviewsPayloadResponseProjection subProjection) {
        return requestReviews((String)null, subProjection);
    }

    public MutationResponseProjection requestReviews(String alias, RequestReviewsPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestReviews").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection requestReviews(MutationRequestReviewsParametrizedInput input, RequestReviewsPayloadResponseProjection subProjection) {
        return requestReviews(null, input, subProjection);
    }

    public MutationResponseProjection requestReviews(String alias, MutationRequestReviewsParametrizedInput input, RequestReviewsPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestReviews").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection resolveReviewThread(ResolveReviewThreadPayloadResponseProjection subProjection) {
        return resolveReviewThread((String)null, subProjection);
    }

    public MutationResponseProjection resolveReviewThread(String alias, ResolveReviewThreadPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resolveReviewThread").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection resolveReviewThread(MutationResolveReviewThreadParametrizedInput input, ResolveReviewThreadPayloadResponseProjection subProjection) {
        return resolveReviewThread(null, input, subProjection);
    }

    public MutationResponseProjection resolveReviewThread(String alias, MutationResolveReviewThreadParametrizedInput input, ResolveReviewThreadPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resolveReviewThread").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitPullRequestReview(SubmitPullRequestReviewPayloadResponseProjection subProjection) {
        return submitPullRequestReview((String)null, subProjection);
    }

    public MutationResponseProjection submitPullRequestReview(String alias, SubmitPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitPullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitPullRequestReview(MutationSubmitPullRequestReviewParametrizedInput input, SubmitPullRequestReviewPayloadResponseProjection subProjection) {
        return submitPullRequestReview(null, input, subProjection);
    }

    public MutationResponseProjection submitPullRequestReview(String alias, MutationSubmitPullRequestReviewParametrizedInput input, SubmitPullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitPullRequestReview").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unlinkRepositoryFromProject(UnlinkRepositoryFromProjectPayloadResponseProjection subProjection) {
        return unlinkRepositoryFromProject((String)null, subProjection);
    }

    public MutationResponseProjection unlinkRepositoryFromProject(String alias, UnlinkRepositoryFromProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unlinkRepositoryFromProject(MutationUnlinkRepositoryFromProjectParametrizedInput input, UnlinkRepositoryFromProjectPayloadResponseProjection subProjection) {
        return unlinkRepositoryFromProject(null, input, subProjection);
    }

    public MutationResponseProjection unlinkRepositoryFromProject(String alias, MutationUnlinkRepositoryFromProjectParametrizedInput input, UnlinkRepositoryFromProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unlinkRepositoryFromProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unlockLockable(UnlockLockablePayloadResponseProjection subProjection) {
        return unlockLockable((String)null, subProjection);
    }

    public MutationResponseProjection unlockLockable(String alias, UnlockLockablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unlockLockable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unlockLockable(MutationUnlockLockableParametrizedInput input, UnlockLockablePayloadResponseProjection subProjection) {
        return unlockLockable(null, input, subProjection);
    }

    public MutationResponseProjection unlockLockable(String alias, MutationUnlockLockableParametrizedInput input, UnlockLockablePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unlockLockable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unmarkIssueAsDuplicate(UnmarkIssueAsDuplicatePayloadResponseProjection subProjection) {
        return unmarkIssueAsDuplicate((String)null, subProjection);
    }

    public MutationResponseProjection unmarkIssueAsDuplicate(String alias, UnmarkIssueAsDuplicatePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unmarkIssueAsDuplicate(MutationUnmarkIssueAsDuplicateParametrizedInput input, UnmarkIssueAsDuplicatePayloadResponseProjection subProjection) {
        return unmarkIssueAsDuplicate(null, input, subProjection);
    }

    public MutationResponseProjection unmarkIssueAsDuplicate(String alias, MutationUnmarkIssueAsDuplicateParametrizedInput input, UnmarkIssueAsDuplicatePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unmarkIssueAsDuplicate").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unresolveReviewThread(UnresolveReviewThreadPayloadResponseProjection subProjection) {
        return unresolveReviewThread((String)null, subProjection);
    }

    public MutationResponseProjection unresolveReviewThread(String alias, UnresolveReviewThreadPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unresolveReviewThread").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection unresolveReviewThread(MutationUnresolveReviewThreadParametrizedInput input, UnresolveReviewThreadPayloadResponseProjection subProjection) {
        return unresolveReviewThread(null, input, subProjection);
    }

    public MutationResponseProjection unresolveReviewThread(String alias, MutationUnresolveReviewThreadParametrizedInput input, UnresolveReviewThreadPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unresolveReviewThread").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateBranchProtectionRule(UpdateBranchProtectionRulePayloadResponseProjection subProjection) {
        return updateBranchProtectionRule((String)null, subProjection);
    }

    public MutationResponseProjection updateBranchProtectionRule(String alias, UpdateBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateBranchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateBranchProtectionRule(MutationUpdateBranchProtectionRuleParametrizedInput input, UpdateBranchProtectionRulePayloadResponseProjection subProjection) {
        return updateBranchProtectionRule(null, input, subProjection);
    }

    public MutationResponseProjection updateBranchProtectionRule(String alias, MutationUpdateBranchProtectionRuleParametrizedInput input, UpdateBranchProtectionRulePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateBranchProtectionRule").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateIssue(UpdateIssuePayloadResponseProjection subProjection) {
        return updateIssue((String)null, subProjection);
    }

    public MutationResponseProjection updateIssue(String alias, UpdateIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateIssue").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateIssue(MutationUpdateIssueParametrizedInput input, UpdateIssuePayloadResponseProjection subProjection) {
        return updateIssue(null, input, subProjection);
    }

    public MutationResponseProjection updateIssue(String alias, MutationUpdateIssueParametrizedInput input, UpdateIssuePayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateIssue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateIssueComment(UpdateIssueCommentPayloadResponseProjection subProjection) {
        return updateIssueComment((String)null, subProjection);
    }

    public MutationResponseProjection updateIssueComment(String alias, UpdateIssueCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateIssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateIssueComment(MutationUpdateIssueCommentParametrizedInput input, UpdateIssueCommentPayloadResponseProjection subProjection) {
        return updateIssueComment(null, input, subProjection);
    }

    public MutationResponseProjection updateIssueComment(String alias, MutationUpdateIssueCommentParametrizedInput input, UpdateIssueCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateIssueComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProject(UpdateProjectPayloadResponseProjection subProjection) {
        return updateProject((String)null, subProjection);
    }

    public MutationResponseProjection updateProject(String alias, UpdateProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProject(MutationUpdateProjectParametrizedInput input, UpdateProjectPayloadResponseProjection subProjection) {
        return updateProject(null, input, subProjection);
    }

    public MutationResponseProjection updateProject(String alias, MutationUpdateProjectParametrizedInput input, UpdateProjectPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProjectCard(UpdateProjectCardPayloadResponseProjection subProjection) {
        return updateProjectCard((String)null, subProjection);
    }

    public MutationResponseProjection updateProjectCard(String alias, UpdateProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectCard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProjectCard(MutationUpdateProjectCardParametrizedInput input, UpdateProjectCardPayloadResponseProjection subProjection) {
        return updateProjectCard(null, input, subProjection);
    }

    public MutationResponseProjection updateProjectCard(String alias, MutationUpdateProjectCardParametrizedInput input, UpdateProjectCardPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectCard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProjectColumn(UpdateProjectColumnPayloadResponseProjection subProjection) {
        return updateProjectColumn((String)null, subProjection);
    }

    public MutationResponseProjection updateProjectColumn(String alias, UpdateProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProjectColumn(MutationUpdateProjectColumnParametrizedInput input, UpdateProjectColumnPayloadResponseProjection subProjection) {
        return updateProjectColumn(null, input, subProjection);
    }

    public MutationResponseProjection updateProjectColumn(String alias, MutationUpdateProjectColumnParametrizedInput input, UpdateProjectColumnPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectColumn").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequest(UpdatePullRequestPayloadResponseProjection subProjection) {
        return updatePullRequest((String)null, subProjection);
    }

    public MutationResponseProjection updatePullRequest(String alias, UpdatePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequest(MutationUpdatePullRequestParametrizedInput input, UpdatePullRequestPayloadResponseProjection subProjection) {
        return updatePullRequest(null, input, subProjection);
    }

    public MutationResponseProjection updatePullRequest(String alias, MutationUpdatePullRequestParametrizedInput input, UpdatePullRequestPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequestReview(UpdatePullRequestReviewPayloadResponseProjection subProjection) {
        return updatePullRequestReview((String)null, subProjection);
    }

    public MutationResponseProjection updatePullRequestReview(String alias, UpdatePullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequestReview(MutationUpdatePullRequestReviewParametrizedInput input, UpdatePullRequestReviewPayloadResponseProjection subProjection) {
        return updatePullRequestReview(null, input, subProjection);
    }

    public MutationResponseProjection updatePullRequestReview(String alias, MutationUpdatePullRequestReviewParametrizedInput input, UpdatePullRequestReviewPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequestReview").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequestReviewComment(UpdatePullRequestReviewCommentPayloadResponseProjection subProjection) {
        return updatePullRequestReviewComment((String)null, subProjection);
    }

    public MutationResponseProjection updatePullRequestReviewComment(String alias, UpdatePullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updatePullRequestReviewComment(MutationUpdatePullRequestReviewCommentParametrizedInput input, UpdatePullRequestReviewCommentPayloadResponseProjection subProjection) {
        return updatePullRequestReviewComment(null, input, subProjection);
    }

    public MutationResponseProjection updatePullRequestReviewComment(String alias, MutationUpdatePullRequestReviewCommentParametrizedInput input, UpdatePullRequestReviewCommentPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updatePullRequestReviewComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRef(UpdateRefPayloadResponseProjection subProjection) {
        return updateRef((String)null, subProjection);
    }

    public MutationResponseProjection updateRef(String alias, UpdateRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRef").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRef(MutationUpdateRefParametrizedInput input, UpdateRefPayloadResponseProjection subProjection) {
        return updateRef(null, input, subProjection);
    }

    public MutationResponseProjection updateRef(String alias, MutationUpdateRefParametrizedInput input, UpdateRefPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRef").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRepository(UpdateRepositoryPayloadResponseProjection subProjection) {
        return updateRepository((String)null, subProjection);
    }

    public MutationResponseProjection updateRepository(String alias, UpdateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRepository").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRepository(MutationUpdateRepositoryParametrizedInput input, UpdateRepositoryPayloadResponseProjection subProjection) {
        return updateRepository(null, input, subProjection);
    }

    public MutationResponseProjection updateRepository(String alias, MutationUpdateRepositoryParametrizedInput input, UpdateRepositoryPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateSubscription(UpdateSubscriptionPayloadResponseProjection subProjection) {
        return updateSubscription((String)null, subProjection);
    }

    public MutationResponseProjection updateSubscription(String alias, UpdateSubscriptionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateSubscription").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateSubscription(MutationUpdateSubscriptionParametrizedInput input, UpdateSubscriptionPayloadResponseProjection subProjection) {
        return updateSubscription(null, input, subProjection);
    }

    public MutationResponseProjection updateSubscription(String alias, MutationUpdateSubscriptionParametrizedInput input, UpdateSubscriptionPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateSubscription").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTopics(UpdateTopicsPayloadResponseProjection subProjection) {
        return updateTopics((String)null, subProjection);
    }

    public MutationResponseProjection updateTopics(String alias, UpdateTopicsPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTopics").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTopics(MutationUpdateTopicsParametrizedInput input, UpdateTopicsPayloadResponseProjection subProjection) {
        return updateTopics(null, input, subProjection);
    }

    public MutationResponseProjection updateTopics(String alias, MutationUpdateTopicsParametrizedInput input, UpdateTopicsPayloadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTopics").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection typename() {
        return typename(null);
    }

    public MutationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MutationResponseProjection that = (MutationResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
