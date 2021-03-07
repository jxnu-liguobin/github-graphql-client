package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Contribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionResponseProjection extends GraphQLResponseProjection {

    public ContributionResponseProjection() {
    }

    @Override
    public ContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public ContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public ContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public ContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public ContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ContributionResponseProjection url() {
        return url(null);
    }

    public ContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onRestrictedContribution(RestrictedContributionResponseProjection subProjection) {
        return onRestrictedContribution(null, subProjection);
    }

    public ContributionResponseProjection onRestrictedContribution(String alias, RestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onCreatedPullRequestReviewContribution(CreatedPullRequestReviewContributionResponseProjection subProjection) {
        return onCreatedPullRequestReviewContribution(null, subProjection);
    }

    public ContributionResponseProjection onCreatedPullRequestReviewContribution(String alias, CreatedPullRequestReviewContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestReviewContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onCreatedRepositoryContribution(CreatedRepositoryContributionResponseProjection subProjection) {
        return onCreatedRepositoryContribution(null, subProjection);
    }

    public ContributionResponseProjection onCreatedRepositoryContribution(String alias, CreatedRepositoryContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onCreatedCommitContribution(CreatedCommitContributionResponseProjection subProjection) {
        return onCreatedCommitContribution(null, subProjection);
    }

    public ContributionResponseProjection onCreatedCommitContribution(String alias, CreatedCommitContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedCommitContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onCreatedIssueContribution(CreatedIssueContributionResponseProjection subProjection) {
        return onCreatedIssueContribution(null, subProjection);
    }

    public ContributionResponseProjection onCreatedIssueContribution(String alias, CreatedIssueContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onJoinedGitHubContribution(JoinedGitHubContributionResponseProjection subProjection) {
        return onJoinedGitHubContribution(null, subProjection);
    }

    public ContributionResponseProjection onJoinedGitHubContribution(String alias, JoinedGitHubContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on JoinedGitHubContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection onCreatedPullRequestContribution(CreatedPullRequestContributionResponseProjection subProjection) {
        return onCreatedPullRequestContribution(null, subProjection);
    }

    public ContributionResponseProjection onCreatedPullRequestContribution(String alias, CreatedPullRequestContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionResponseProjection typename() {
        return typename(null);
    }

    public ContributionResponseProjection typename(String alias) {
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
        final ContributionResponseProjection that = (ContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
