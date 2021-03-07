package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedPullRequestReviewContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedPullRequestReviewContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestReviewContributionResponseProjection() {
    }

    @Override
    public CreatedPullRequestReviewContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestReviewContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public CreatedPullRequestReviewContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public CreatedPullRequestReviewContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public CreatedPullRequestReviewContributionResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public CreatedPullRequestReviewContributionResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CreatedPullRequestReviewContributionResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CreatedPullRequestReviewContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection url() {
        return url(null);
    }

    public CreatedPullRequestReviewContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public CreatedPullRequestReviewContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestReviewContributionResponseProjection typename(String alias) {
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
        final CreatedPullRequestReviewContributionResponseProjection that = (CreatedPullRequestReviewContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
