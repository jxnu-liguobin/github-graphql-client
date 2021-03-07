package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedCommitContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedCommitContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedCommitContributionResponseProjection() {
    }

    @Override
    public CreatedCommitContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedCommitContributionResponseProjection all$(int maxDepth) {
        this.commitCount();
        this.isRestricted();
        this.occurredAt();
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedCommitContributionResponseProjection commitCount() {
        return commitCount(null);
    }

    public CreatedCommitContributionResponseProjection commitCount(String alias) {
        fields.add(new GraphQLResponseField("commitCount").alias(alias));
        return this;
    }

    public CreatedCommitContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public CreatedCommitContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public CreatedCommitContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public CreatedCommitContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public CreatedCommitContributionResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CreatedCommitContributionResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CreatedCommitContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CreatedCommitContributionResponseProjection url() {
        return url(null);
    }

    public CreatedCommitContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CreatedCommitContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public CreatedCommitContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedCommitContributionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
