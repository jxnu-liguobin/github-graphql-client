package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewThreadResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewThreadResponseProjection() {
    }

    @Override
    public PullRequestReviewThreadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewThreadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new PullRequestReviewCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)));
        }
        this.id();
        this.isResolved();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) + 1);
            this.resolvedBy(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0)));
        }
        this.viewerCanResolve();
        this.viewerCanUnresolve();
        this.typename();
        return this;
    }

    public PullRequestReviewThreadResponseProjection comments(PullRequestReviewCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public PullRequestReviewThreadResponseProjection comments(String alias, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadResponseProjection comments(PullRequestReviewThreadCommentsParametrizedInput input, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public PullRequestReviewThreadResponseProjection comments(String alias, PullRequestReviewThreadCommentsParametrizedInput input, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadResponseProjection id() {
        return id(null);
    }

    public PullRequestReviewThreadResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestReviewThreadResponseProjection isResolved() {
        return isResolved(null);
    }

    public PullRequestReviewThreadResponseProjection isResolved(String alias) {
        fields.add(new GraphQLResponseField("isResolved").alias(alias));
        return this;
    }

    public PullRequestReviewThreadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestReviewThreadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestReviewThreadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadResponseProjection resolvedBy(UserResponseProjection subProjection) {
        return resolvedBy(null, subProjection);
    }

    public PullRequestReviewThreadResponseProjection resolvedBy(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resolvedBy").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadResponseProjection viewerCanResolve() {
        return viewerCanResolve(null);
    }

    public PullRequestReviewThreadResponseProjection viewerCanResolve(String alias) {
        fields.add(new GraphQLResponseField("viewerCanResolve").alias(alias));
        return this;
    }

    public PullRequestReviewThreadResponseProjection viewerCanUnresolve() {
        return viewerCanUnresolve(null);
    }

    public PullRequestReviewThreadResponseProjection viewerCanUnresolve(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUnresolve").alias(alias));
        return this;
    }

    public PullRequestReviewThreadResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewThreadResponseProjection typename(String alias) {
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
        final PullRequestReviewThreadResponseProjection that = (PullRequestReviewThreadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
