package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestResponseProjection extends GraphQLResponseProjection {

    public PullRequestResponseProjection() {
    }

    @Override
    public PullRequestResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestResponseProjection all$(int maxDepth) {
        this.activeLockReason();
        this.additions();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1);
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RefResponseProjection.baseRef", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) + 1);
            this.baseRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0)));
        }
        this.baseRefName();
        this.baseRefOid();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) + 1);
            this.baseRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0)));
        }
        this.body();
        this.bodyHTML();
        this.bodyText();
        this.changedFiles();
        this.closed();
        this.closedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) + 1);
            this.commits(new PullRequestCommitConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0)));
        }
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        this.deletions();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) + 1);
            this.files(new PullRequestChangedFileConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RefResponseProjection.headRef", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) + 1);
            this.headRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0)));
        }
        this.headRefName();
        this.headRefOid();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) + 1);
            this.headRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) + 1);
            this.headRepositoryOwner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.isCrossRepository();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1);
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0)));
        }
        this.lastEditedAt();
        this.locked();
        this.maintainerCanModify();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1);
            this.mergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0)));
        }
        this.mergeable();
        this.merged();
        this.mergedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.mergedBy", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) + 1);
            this.mergedBy(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) + 1);
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0)));
        }
        this.number();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserConnectionResponseProjection.participants", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) + 1);
            this.participants(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0)));
        }
        this.permalink();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) + 1);
            this.potentialMergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1);
            this.projectCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)));
        }
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.revertResourcePath();
        this.revertUrl();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) + 1);
            this.reviewRequests(new ReviewRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) + 1);
            this.reviewThreads(new PullRequestReviewThreadConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) + 1);
            this.reviews(new PullRequestReviewConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0)));
        }
        this.state();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) + 1);
            this.suggestedReviewers(new SuggestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) + 1);
            this.timeline(new PullRequestTimelineConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1);
            this.timelineItems(new PullRequestTimelineItemsConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0)));
        }
        this.title();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerCanApplySuggestion();
        this.viewerCanReact();
        this.viewerCanSubscribe();
        this.viewerCanUpdate();
        this.viewerCannotUpdateReasons();
        this.viewerDidAuthor();
        this.viewerSubscription();
        this.typename();
        return this;
    }

    public PullRequestResponseProjection activeLockReason() {
        return activeLockReason(null);
    }

    public PullRequestResponseProjection activeLockReason(String alias) {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias));
        return this;
    }

    public PullRequestResponseProjection additions() {
        return additions(null);
    }

    public PullRequestResponseProjection additions(String alias) {
        fields.add(new GraphQLResponseField("additions").alias(alias));
        return this;
    }

    public PullRequestResponseProjection assignees(UserConnectionResponseProjection subProjection) {
        return assignees((String)null, subProjection);
    }

    public PullRequestResponseProjection assignees(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection assignees(PullRequestAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return assignees(null, input, subProjection);
    }

    public PullRequestResponseProjection assignees(String alias, PullRequestAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public PullRequestResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public PullRequestResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public PullRequestResponseProjection baseRef(RefResponseProjection subProjection) {
        return baseRef(null, subProjection);
    }

    public PullRequestResponseProjection baseRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("baseRef").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection baseRefName() {
        return baseRefName(null);
    }

    public PullRequestResponseProjection baseRefName(String alias) {
        fields.add(new GraphQLResponseField("baseRefName").alias(alias));
        return this;
    }

    public PullRequestResponseProjection baseRefOid() {
        return baseRefOid(null);
    }

    public PullRequestResponseProjection baseRefOid(String alias) {
        fields.add(new GraphQLResponseField("baseRefOid").alias(alias));
        return this;
    }

    public PullRequestResponseProjection baseRepository(RepositoryResponseProjection subProjection) {
        return baseRepository(null, subProjection);
    }

    public PullRequestResponseProjection baseRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("baseRepository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection body() {
        return body(null);
    }

    public PullRequestResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public PullRequestResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public PullRequestResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public PullRequestResponseProjection bodyText() {
        return bodyText(null);
    }

    public PullRequestResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public PullRequestResponseProjection changedFiles() {
        return changedFiles(null);
    }

    public PullRequestResponseProjection changedFiles(String alias) {
        fields.add(new GraphQLResponseField("changedFiles").alias(alias));
        return this;
    }

    public PullRequestResponseProjection closed() {
        return closed(null);
    }

    public PullRequestResponseProjection closed(String alias) {
        fields.add(new GraphQLResponseField("closed").alias(alias));
        return this;
    }

    public PullRequestResponseProjection closedAt() {
        return closedAt(null);
    }

    public PullRequestResponseProjection closedAt(String alias) {
        fields.add(new GraphQLResponseField("closedAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection comments(IssueCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public PullRequestResponseProjection comments(String alias, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection comments(PullRequestCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public PullRequestResponseProjection comments(String alias, PullRequestCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection commits(PullRequestCommitConnectionResponseProjection subProjection) {
        return commits((String)null, subProjection);
    }

    public PullRequestResponseProjection commits(String alias, PullRequestCommitConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commits").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection commits(PullRequestCommitsParametrizedInput input, PullRequestCommitConnectionResponseProjection subProjection) {
        return commits(null, input, subProjection);
    }

    public PullRequestResponseProjection commits(String alias, PullRequestCommitsParametrizedInput input, PullRequestCommitConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection createdAt() {
        return createdAt(null);
    }

    public PullRequestResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public PullRequestResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public PullRequestResponseProjection databaseId() {
        return databaseId(null);
    }

    public PullRequestResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public PullRequestResponseProjection deletions() {
        return deletions(null);
    }

    public PullRequestResponseProjection deletions(String alias) {
        fields.add(new GraphQLResponseField("deletions").alias(alias));
        return this;
    }

    public PullRequestResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public PullRequestResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection files(PullRequestChangedFileConnectionResponseProjection subProjection) {
        return files((String)null, subProjection);
    }

    public PullRequestResponseProjection files(String alias, PullRequestChangedFileConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection files(PullRequestFilesParametrizedInput input, PullRequestChangedFileConnectionResponseProjection subProjection) {
        return files(null, input, subProjection);
    }

    public PullRequestResponseProjection files(String alias, PullRequestFilesParametrizedInput input, PullRequestChangedFileConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection headRef(RefResponseProjection subProjection) {
        return headRef(null, subProjection);
    }

    public PullRequestResponseProjection headRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("headRef").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection headRefName() {
        return headRefName(null);
    }

    public PullRequestResponseProjection headRefName(String alias) {
        fields.add(new GraphQLResponseField("headRefName").alias(alias));
        return this;
    }

    public PullRequestResponseProjection headRefOid() {
        return headRefOid(null);
    }

    public PullRequestResponseProjection headRefOid(String alias) {
        fields.add(new GraphQLResponseField("headRefOid").alias(alias));
        return this;
    }

    public PullRequestResponseProjection headRepository(RepositoryResponseProjection subProjection) {
        return headRepository(null, subProjection);
    }

    public PullRequestResponseProjection headRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("headRepository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection headRepositoryOwner(RepositoryOwnerResponseProjection subProjection) {
        return headRepositoryOwner(null, subProjection);
    }

    public PullRequestResponseProjection headRepositoryOwner(String alias, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("headRepositoryOwner").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection id() {
        return id(null);
    }

    public PullRequestResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public PullRequestResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public PullRequestResponseProjection isCrossRepository() {
        return isCrossRepository(null);
    }

    public PullRequestResponseProjection isCrossRepository(String alias) {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias));
        return this;
    }

    public PullRequestResponseProjection labels(LabelConnectionResponseProjection subProjection) {
        return labels((String)null, subProjection);
    }

    public PullRequestResponseProjection labels(String alias, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection labels(PullRequestLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        return labels(null, input, subProjection);
    }

    public PullRequestResponseProjection labels(String alias, PullRequestLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public PullRequestResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection locked() {
        return locked(null);
    }

    public PullRequestResponseProjection locked(String alias) {
        fields.add(new GraphQLResponseField("locked").alias(alias));
        return this;
    }

    public PullRequestResponseProjection maintainerCanModify() {
        return maintainerCanModify(null);
    }

    public PullRequestResponseProjection maintainerCanModify(String alias) {
        fields.add(new GraphQLResponseField("maintainerCanModify").alias(alias));
        return this;
    }

    public PullRequestResponseProjection mergeCommit(CommitResponseProjection subProjection) {
        return mergeCommit(null, subProjection);
    }

    public PullRequestResponseProjection mergeCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection mergeable() {
        return mergeable(null);
    }

    public PullRequestResponseProjection mergeable(String alias) {
        fields.add(new GraphQLResponseField("mergeable").alias(alias));
        return this;
    }

    public PullRequestResponseProjection merged() {
        return merged(null);
    }

    public PullRequestResponseProjection merged(String alias) {
        fields.add(new GraphQLResponseField("merged").alias(alias));
        return this;
    }

    public PullRequestResponseProjection mergedAt() {
        return mergedAt(null);
    }

    public PullRequestResponseProjection mergedAt(String alias) {
        fields.add(new GraphQLResponseField("mergedAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection mergedBy(ActorResponseProjection subProjection) {
        return mergedBy(null, subProjection);
    }

    public PullRequestResponseProjection mergedBy(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergedBy").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection milestone(MilestoneResponseProjection subProjection) {
        return milestone(null, subProjection);
    }

    public PullRequestResponseProjection milestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection number() {
        return number(null);
    }

    public PullRequestResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public PullRequestResponseProjection participants(UserConnectionResponseProjection subProjection) {
        return participants((String)null, subProjection);
    }

    public PullRequestResponseProjection participants(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("participants").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection participants(PullRequestParticipantsParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return participants(null, input, subProjection);
    }

    public PullRequestResponseProjection participants(String alias, PullRequestParticipantsParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection permalink() {
        return permalink(null);
    }

    public PullRequestResponseProjection permalink(String alias) {
        fields.add(new GraphQLResponseField("permalink").alias(alias));
        return this;
    }

    public PullRequestResponseProjection potentialMergeCommit(CommitResponseProjection subProjection) {
        return potentialMergeCommit(null, subProjection);
    }

    public PullRequestResponseProjection potentialMergeCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("potentialMergeCommit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection projectCards(ProjectCardConnectionResponseProjection subProjection) {
        return projectCards((String)null, subProjection);
    }

    public PullRequestResponseProjection projectCards(String alias, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection projectCards(PullRequestProjectCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        return projectCards(null, input, subProjection);
    }

    public PullRequestResponseProjection projectCards(String alias, PullRequestProjectCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public PullRequestResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public PullRequestResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public PullRequestResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reactions(PullRequestReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public PullRequestResponseProjection reactions(String alias, PullRequestReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public PullRequestResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public PullRequestResponseProjection revertResourcePath() {
        return revertResourcePath(null);
    }

    public PullRequestResponseProjection revertResourcePath(String alias) {
        fields.add(new GraphQLResponseField("revertResourcePath").alias(alias));
        return this;
    }

    public PullRequestResponseProjection revertUrl() {
        return revertUrl(null);
    }

    public PullRequestResponseProjection revertUrl(String alias) {
        fields.add(new GraphQLResponseField("revertUrl").alias(alias));
        return this;
    }

    public PullRequestResponseProjection reviewRequests(ReviewRequestConnectionResponseProjection subProjection) {
        return reviewRequests((String)null, subProjection);
    }

    public PullRequestResponseProjection reviewRequests(String alias, ReviewRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewRequests").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reviewRequests(PullRequestReviewRequestsParametrizedInput input, ReviewRequestConnectionResponseProjection subProjection) {
        return reviewRequests(null, input, subProjection);
    }

    public PullRequestResponseProjection reviewRequests(String alias, PullRequestReviewRequestsParametrizedInput input, ReviewRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reviewThreads(PullRequestReviewThreadConnectionResponseProjection subProjection) {
        return reviewThreads((String)null, subProjection);
    }

    public PullRequestResponseProjection reviewThreads(String alias, PullRequestReviewThreadConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewThreads").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reviewThreads(PullRequestReviewThreadsParametrizedInput input, PullRequestReviewThreadConnectionResponseProjection subProjection) {
        return reviewThreads(null, input, subProjection);
    }

    public PullRequestResponseProjection reviewThreads(String alias, PullRequestReviewThreadsParametrizedInput input, PullRequestReviewThreadConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewThreads").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reviews(PullRequestReviewConnectionResponseProjection subProjection) {
        return reviews((String)null, subProjection);
    }

    public PullRequestResponseProjection reviews(String alias, PullRequestReviewConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviews").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection reviews(PullRequestReviewsParametrizedInput input, PullRequestReviewConnectionResponseProjection subProjection) {
        return reviews(null, input, subProjection);
    }

    public PullRequestResponseProjection reviews(String alias, PullRequestReviewsParametrizedInput input, PullRequestReviewConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviews").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection state() {
        return state(null);
    }

    public PullRequestResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public PullRequestResponseProjection suggestedReviewers(SuggestedReviewerResponseProjection subProjection) {
        return suggestedReviewers(null, subProjection);
    }

    public PullRequestResponseProjection suggestedReviewers(String alias, SuggestedReviewerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("suggestedReviewers").alias(alias).projection(subProjection));
        return this;
    }

    @Deprecated
    public PullRequestResponseProjection timeline(PullRequestTimelineConnectionResponseProjection subProjection) {
        return timeline((String)null, subProjection);
    }

    public PullRequestResponseProjection timeline(String alias, PullRequestTimelineConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timeline").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection timeline(PullRequestTimelineParametrizedInput input, PullRequestTimelineConnectionResponseProjection subProjection) {
        return timeline(null, input, subProjection);
    }

    public PullRequestResponseProjection timeline(String alias, PullRequestTimelineParametrizedInput input, PullRequestTimelineConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection timelineItems(PullRequestTimelineItemsConnectionResponseProjection subProjection) {
        return timelineItems((String)null, subProjection);
    }

    public PullRequestResponseProjection timelineItems(String alias, PullRequestTimelineItemsConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection timelineItems(PullRequestTimelineItemsParametrizedInput input, PullRequestTimelineItemsConnectionResponseProjection subProjection) {
        return timelineItems(null, input, subProjection);
    }

    public PullRequestResponseProjection timelineItems(String alias, PullRequestTimelineItemsParametrizedInput input, PullRequestTimelineItemsConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection title() {
        return title(null);
    }

    public PullRequestResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public PullRequestResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public PullRequestResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public PullRequestResponseProjection url() {
        return url(null);
    }

    public PullRequestResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public PullRequestResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public PullRequestResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection userContentEdits(PullRequestUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public PullRequestResponseProjection userContentEdits(String alias, PullRequestUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestResponseProjection viewerCanApplySuggestion() {
        return viewerCanApplySuggestion(null);
    }

    public PullRequestResponseProjection viewerCanApplySuggestion(String alias) {
        fields.add(new GraphQLResponseField("viewerCanApplySuggestion").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public PullRequestResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public PullRequestResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public PullRequestResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public PullRequestResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public PullRequestResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public PullRequestResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public PullRequestResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public PullRequestResponseProjection typename() {
        return typename(null);
    }

    public PullRequestResponseProjection typename(String alias) {
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
        final PullRequestResponseProjection that = (PullRequestResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
