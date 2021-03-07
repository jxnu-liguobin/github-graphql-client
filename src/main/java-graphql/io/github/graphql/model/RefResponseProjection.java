package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Ref
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RefResponseProjection extends GraphQLResponseProjection {

    public RefResponseProjection() {
    }

    @Override
    public RefResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1);
            this.associatedPullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)));
        }
        this.id();
        this.name();
        this.prefix();
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.GitObjectResponseProjection.target", projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) + 1);
            this.target(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0)));
        }
        this.typename();
        return this;
    }

    public RefResponseProjection associatedPullRequests(PullRequestConnectionResponseProjection subProjection) {
        return associatedPullRequests((String)null, subProjection);
    }

    public RefResponseProjection associatedPullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public RefResponseProjection associatedPullRequests(RefAssociatedPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return associatedPullRequests(null, input, subProjection);
    }

    public RefResponseProjection associatedPullRequests(String alias, RefAssociatedPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RefResponseProjection id() {
        return id(null);
    }

    public RefResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RefResponseProjection name() {
        return name(null);
    }

    public RefResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RefResponseProjection prefix() {
        return prefix(null);
    }

    public RefResponseProjection prefix(String alias) {
        fields.add(new GraphQLResponseField("prefix").alias(alias));
        return this;
    }

    public RefResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public RefResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public RefResponseProjection target(GitObjectResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public RefResponseProjection target(String alias, GitObjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public RefResponseProjection typename() {
        return typename(null);
    }

    public RefResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
