package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestCommit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestCommitResponseProjection extends GraphQLResponseProjection {

    public PullRequestCommitResponseProjection() {
    }

    @Override
    public PullRequestCommitResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestCommitResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public PullRequestCommitResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public PullRequestCommitResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitResponseProjection id() {
        return id(null);
    }

    public PullRequestCommitResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestCommitResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestCommitResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public PullRequestCommitResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public PullRequestCommitResponseProjection url() {
        return url(null);
    }

    public PullRequestCommitResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public PullRequestCommitResponseProjection typename() {
        return typename(null);
    }

    public PullRequestCommitResponseProjection typename(String alias) {
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
        final PullRequestCommitResponseProjection that = (PullRequestCommitResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
