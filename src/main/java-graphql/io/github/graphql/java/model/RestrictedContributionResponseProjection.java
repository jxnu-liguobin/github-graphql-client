package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RestrictedContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RestrictedContributionResponseProjection extends GraphQLResponseProjection {

    public RestrictedContributionResponseProjection() {
    }

    @Override
    public RestrictedContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RestrictedContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("RestrictedContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public RestrictedContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public RestrictedContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public RestrictedContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public RestrictedContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public RestrictedContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public RestrictedContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public RestrictedContributionResponseProjection url() {
        return url(null);
    }

    public RestrictedContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RestrictedContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public RestrictedContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public RestrictedContributionResponseProjection typename() {
        return typename(null);
    }

    public RestrictedContributionResponseProjection typename(String alias) {
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
        final RestrictedContributionResponseProjection that = (RestrictedContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
