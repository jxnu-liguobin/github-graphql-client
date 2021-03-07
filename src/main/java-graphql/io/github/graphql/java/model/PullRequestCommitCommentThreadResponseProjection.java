package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestCommitCommentThreadResponseProjection extends GraphQLResponseProjection {

    public PullRequestCommitCommentThreadResponseProjection() {
    }

    @Override
    public PullRequestCommitCommentThreadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestCommitCommentThreadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.id();
        this.path();
        this.position();
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection comments(CommitCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public PullRequestCommitCommentThreadResponseProjection comments(String alias, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection comments(PullRequestCommitCommentThreadCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public PullRequestCommitCommentThreadResponseProjection comments(String alias, PullRequestCommitCommentThreadCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public PullRequestCommitCommentThreadResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection id() {
        return id(null);
    }

    public PullRequestCommitCommentThreadResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection path() {
        return path(null);
    }

    public PullRequestCommitCommentThreadResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection position() {
        return position(null);
    }

    public PullRequestCommitCommentThreadResponseProjection position(String alias) {
        fields.add(new GraphQLResponseField("position").alias(alias));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestCommitCommentThreadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestCommitCommentThreadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitCommentThreadResponseProjection typename() {
        return typename(null);
    }

    public PullRequestCommitCommentThreadResponseProjection typename(String alias) {
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
        final PullRequestCommitCommentThreadResponseProjection that = (PullRequestCommitCommentThreadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
