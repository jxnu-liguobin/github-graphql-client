package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedRepositoryContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedRepositoryContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedRepositoryContributionResponseProjection() {
    }

    @Override
    public CreatedRepositoryContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedRepositoryContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedRepositoryContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public CreatedRepositoryContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public CreatedRepositoryContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CreatedRepositoryContributionResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CreatedRepositoryContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection url() {
        return url(null);
    }

    public CreatedRepositoryContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public CreatedRepositoryContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedRepositoryContributionResponseProjection typename(String alias) {
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
        final CreatedRepositoryContributionResponseProjection that = (CreatedRepositoryContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
