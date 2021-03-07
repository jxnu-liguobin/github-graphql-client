package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for JoinedGitHubContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class JoinedGitHubContributionResponseProjection extends GraphQLResponseProjection {

    public JoinedGitHubContributionResponseProjection() {
    }

    @Override
    public JoinedGitHubContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public JoinedGitHubContributionResponseProjection all$(int maxDepth) {
        this.isRestricted();
        this.occurredAt();
        this.resourcePath();
        this.url();
        if (projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public JoinedGitHubContributionResponseProjection isRestricted() {
        return isRestricted(null);
    }

    public JoinedGitHubContributionResponseProjection isRestricted(String alias) {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias));
        return this;
    }

    public JoinedGitHubContributionResponseProjection occurredAt() {
        return occurredAt(null);
    }

    public JoinedGitHubContributionResponseProjection occurredAt(String alias) {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias));
        return this;
    }

    public JoinedGitHubContributionResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public JoinedGitHubContributionResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public JoinedGitHubContributionResponseProjection url() {
        return url(null);
    }

    public JoinedGitHubContributionResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public JoinedGitHubContributionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public JoinedGitHubContributionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public JoinedGitHubContributionResponseProjection typename() {
        return typename(null);
    }

    public JoinedGitHubContributionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
