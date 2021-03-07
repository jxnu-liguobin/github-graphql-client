package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Label
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LabelResponseProjection extends GraphQLResponseProjection {

    public LabelResponseProjection() {
    }

    @Override
    public LabelResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LabelResponseProjection all$(int maxDepth) {
        this.color();
        this.createdAt();
        this.description();
        this.id();
        this.isDefault();
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1);
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0)));
        }
        this.name();
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1);
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public LabelResponseProjection color() {
        return color(null);
    }

    public LabelResponseProjection color(String alias) {
        fields.add(new GraphQLResponseField("color").alias(alias));
        return this;
    }

    public LabelResponseProjection createdAt() {
        return createdAt(null);
    }

    public LabelResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public LabelResponseProjection description() {
        return description(null);
    }

    public LabelResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public LabelResponseProjection id() {
        return id(null);
    }

    public LabelResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LabelResponseProjection isDefault() {
        return isDefault(null);
    }

    public LabelResponseProjection isDefault(String alias) {
        fields.add(new GraphQLResponseField("isDefault").alias(alias));
        return this;
    }

    public LabelResponseProjection issues(IssueConnectionResponseProjection subProjection) {
        return issues((String)null, subProjection);
    }

    public LabelResponseProjection issues(String alias, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection));
        return this;
    }

    public LabelResponseProjection issues(LabelIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        return issues(null, input, subProjection);
    }

    public LabelResponseProjection issues(String alias, LabelIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LabelResponseProjection name() {
        return name(null);
    }

    public LabelResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LabelResponseProjection pullRequests(PullRequestConnectionResponseProjection subProjection) {
        return pullRequests((String)null, subProjection);
    }

    public LabelResponseProjection pullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public LabelResponseProjection pullRequests(LabelPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return pullRequests(null, input, subProjection);
    }

    public LabelResponseProjection pullRequests(String alias, LabelPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LabelResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public LabelResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public LabelResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public LabelResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public LabelResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public LabelResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public LabelResponseProjection url() {
        return url(null);
    }

    public LabelResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public LabelResponseProjection typename() {
        return typename(null);
    }

    public LabelResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
