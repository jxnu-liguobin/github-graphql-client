package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Deletable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeletableResponseProjection extends GraphQLResponseProjection {

    public DeletableResponseProjection() {
    }

    @Override
    public DeletableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeletableResponseProjection all$(int maxDepth) {
        this.viewerCanDelete();
        this.typename();
        return this;
    }

    public DeletableResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public DeletableResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public DeletableResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public DeletableResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public DeletableResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public DeletableResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public DeletableResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public DeletableResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public DeletableResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public DeletableResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public DeletableResponseProjection onGistComment(GistCommentResponseProjection subProjection) {
        return onGistComment(null, subProjection);
    }

    public DeletableResponseProjection onGistComment(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection));
        return this;
    }

    public DeletableResponseProjection typename() {
        return typename(null);
    }

    public DeletableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
