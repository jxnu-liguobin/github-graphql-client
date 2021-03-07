package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RepositoryNode
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryNodeResponseProjection extends GraphQLResponseProjection {

    public RepositoryNodeResponseProjection() {
    }

    @Override
    public RepositoryNodeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryNodeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryNodeResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public RepositoryNodeResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public RepositoryNodeResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public RepositoryNodeResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public RepositoryNodeResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onCommitCommentThread(CommitCommentThreadResponseProjection subProjection) {
        return onCommitCommentThread(null, subProjection);
    }

    public RepositoryNodeResponseProjection onCommitCommentThread(String alias, CommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public RepositoryNodeResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public RepositoryNodeResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public RepositoryNodeResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection onPullRequestCommitCommentThread(PullRequestCommitCommentThreadResponseProjection subProjection) {
        return onPullRequestCommitCommentThread(null, subProjection);
    }

    public RepositoryNodeResponseProjection onPullRequestCommitCommentThread(String alias, PullRequestCommitCommentThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryNodeResponseProjection typename() {
        return typename(null);
    }

    public RepositoryNodeResponseProjection typename(String alias) {
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
        final RepositoryNodeResponseProjection that = (RepositoryNodeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
