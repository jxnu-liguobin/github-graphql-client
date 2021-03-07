package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UniformResourceLocatable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UniformResourceLocatableResponseProjection extends GraphQLResponseProjection {

    public UniformResourceLocatableResponseProjection() {
    }

    @Override
    public UniformResourceLocatableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UniformResourceLocatableResponseProjection all$(int maxDepth) {
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public UniformResourceLocatableResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public UniformResourceLocatableResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public UniformResourceLocatableResponseProjection url() {
        return url(null);
    }

    public UniformResourceLocatableResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public UniformResourceLocatableResponseProjection onGist(GistResponseProjection subProjection) {
        return onGist(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onGist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onMilestone(MilestoneResponseProjection subProjection) {
        return onMilestone(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onMilestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onBot(BotResponseProjection subProjection) {
        return onBot(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onBot(String alias, BotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onClosedEvent(ClosedEventResponseProjection subProjection) {
        return onClosedEvent(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onClosedEvent(String alias, ClosedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onCrossReferencedEvent(CrossReferencedEventResponseProjection subProjection) {
        return onCrossReferencedEvent(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onCrossReferencedEvent(String alias, CrossReferencedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onPullRequestCommit(PullRequestCommitResponseProjection subProjection) {
        return onPullRequestCommit(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onPullRequestCommit(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onRepositoryTopic(RepositoryTopicResponseProjection subProjection) {
        return onRepositoryTopic(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onRepositoryTopic(String alias, RepositoryTopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onReviewDismissedEvent(ReviewDismissedEventResponseProjection subProjection) {
        return onReviewDismissedEvent(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onReviewDismissedEvent(String alias, ReviewDismissedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onMannequin(MannequinResponseProjection subProjection) {
        return onMannequin(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onMannequin(String alias, MannequinResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onReadyForReviewEvent(ReadyForReviewEventResponseProjection subProjection) {
        return onReadyForReviewEvent(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onReadyForReviewEvent(String alias, ReadyForReviewEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onMergedEvent(MergedEventResponseProjection subProjection) {
        return onMergedEvent(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onMergedEvent(String alias, MergedEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection onRelease(ReleaseResponseProjection subProjection) {
        return onRelease(null, subProjection);
    }

    public UniformResourceLocatableResponseProjection onRelease(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Release").alias(alias).projection(subProjection));
        return this;
    }

    public UniformResourceLocatableResponseProjection typename() {
        return typename(null);
    }

    public UniformResourceLocatableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
