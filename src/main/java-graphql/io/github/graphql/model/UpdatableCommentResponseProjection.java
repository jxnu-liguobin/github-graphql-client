package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdatableComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdatableCommentResponseProjection extends GraphQLResponseProjection {

    public UpdatableCommentResponseProjection() {
    }

    @Override
    public UpdatableCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdatableCommentResponseProjection all$(int maxDepth) {
        this.viewerCannotUpdateReasons();
        this.typename();
        return this;
    }

    public UpdatableCommentResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public UpdatableCommentResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public UpdatableCommentResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public UpdatableCommentResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public UpdatableCommentResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public UpdatableCommentResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public UpdatableCommentResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public UpdatableCommentResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public UpdatableCommentResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection onGistComment(GistCommentResponseProjection subProjection) {
        return onGistComment(null, subProjection);
    }

    public UpdatableCommentResponseProjection onGistComment(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatableCommentResponseProjection typename() {
        return typename(null);
    }

    public UpdatableCommentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
