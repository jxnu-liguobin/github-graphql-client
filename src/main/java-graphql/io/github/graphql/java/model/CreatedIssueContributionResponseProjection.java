package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedIssueContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedIssueContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedIssueContributionResponseProjection() {
    }

    @Override
    public CreatedIssueContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedIssueContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.occurredAt();
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedIssueContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public CreatedIssueContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public CreatedIssueContributionResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public CreatedIssueContributionResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public CreatedIssueContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public CreatedIssueContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CreatedIssueContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CreatedIssueContributionResponseProjection url() {
        return url(null);
    }

    public CreatedIssueContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CreatedIssueContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public CreatedIssueContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedIssueContributionResponseProjection typename(String alias) {
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
        final CreatedIssueContributionResponseProjection that = (CreatedIssueContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
