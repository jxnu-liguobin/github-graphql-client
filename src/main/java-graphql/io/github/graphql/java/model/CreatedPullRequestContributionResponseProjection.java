package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedPullRequestContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedPullRequestContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestContributionResponseProjection() {
    }

    @Override
    public CreatedPullRequestContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedPullRequestContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public CreatedPullRequestContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public CreatedPullRequestContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public CreatedPullRequestContributionResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CreatedPullRequestContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection url() {
        return url(null);
    }

    public CreatedPullRequestContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public CreatedPullRequestContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestContributionResponseProjection typename(String alias) {
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
        final CreatedPullRequestContributionResponseProjection that = (CreatedPullRequestContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
