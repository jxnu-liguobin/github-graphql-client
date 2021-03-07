package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Updatable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdatableResponseProjection extends GraphQLResponseProjection {

    public UpdatableResponseProjection() {
    }

    @Override
    public UpdatableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdatableResponseProjection all$(int maxDepth) {
        this.viewerCanUpdate();
        this.typename();
        return this;
    }

    public UpdatableResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public UpdatableResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public UpdatableResponseProjection onProject(ProjectResponseProjection subProjection) {
        return onProject(null, subProjection);
    }

    public UpdatableResponseProjection onProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public UpdatableResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public UpdatableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public UpdatableResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public UpdatableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public UpdatableResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public UpdatableResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection onGistComment(GistCommentResponseProjection subProjection) {
        return onGistComment(null, subProjection);
    }

    public UpdatableResponseProjection onGistComment(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableResponseProjection typename() {
        return typename(null);
    }

    public UpdatableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
