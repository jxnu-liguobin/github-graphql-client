package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Milestone
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MilestoneResponseProjection extends GraphQLResponseProjection {

    public MilestoneResponseProjection() {
    }

    @Override
    public MilestoneResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MilestoneResponseProjection all$(int maxDepth) {
        this.closed();
        this.closedAt();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.description();
        this.dueOn();
        this.id();
        this.issuePrioritiesDebug();
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1);
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0)));
        }
        this.number();
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1);
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.state();
        this.title();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public MilestoneResponseProjection closed() {
        return closed(null);
    }

    public MilestoneResponseProjection closed(String alias) {
        fields.add(new GraphQLResponseField("closed").alias(alias));
        return this;
    }

    public MilestoneResponseProjection closedAt() {
        return closedAt(null);
    }

    public MilestoneResponseProjection closedAt(String alias) {
        fields.add(new GraphQLResponseField("closedAt").alias(alias));
        return this;
    }

    public MilestoneResponseProjection createdAt() {
        return createdAt(null);
    }

    public MilestoneResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MilestoneResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public MilestoneResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection description() {
        return description(null);
    }

    public MilestoneResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public MilestoneResponseProjection dueOn() {
        return dueOn(null);
    }

    public MilestoneResponseProjection dueOn(String alias) {
        fields.add(new GraphQLResponseField("dueOn").alias(alias));
        return this;
    }

    public MilestoneResponseProjection id() {
        return id(null);
    }

    public MilestoneResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MilestoneResponseProjection issuePrioritiesDebug() {
        return issuePrioritiesDebug(null);
    }

    public MilestoneResponseProjection issuePrioritiesDebug(String alias) {
        fields.add(new GraphQLResponseField("issuePrioritiesDebug").alias(alias));
        return this;
    }

    public MilestoneResponseProjection issues(IssueConnectionResponseProjection subProjection) {
        return issues((String)null, subProjection);
    }

    public MilestoneResponseProjection issues(String alias, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection issues(MilestoneIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        return issues(null, input, subProjection);
    }

    public MilestoneResponseProjection issues(String alias, MilestoneIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection number() {
        return number(null);
    }

    public MilestoneResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public MilestoneResponseProjection pullRequests(PullRequestConnectionResponseProjection subProjection) {
        return pullRequests((String)null, subProjection);
    }

    public MilestoneResponseProjection pullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection pullRequests(MilestonePullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return pullRequests(null, input, subProjection);
    }

    public MilestoneResponseProjection pullRequests(String alias, MilestonePullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public MilestoneResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public MilestoneResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public MilestoneResponseProjection state() {
        return state(null);
    }

    public MilestoneResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public MilestoneResponseProjection title() {
        return title(null);
    }

    public MilestoneResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public MilestoneResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public MilestoneResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public MilestoneResponseProjection url() {
        return url(null);
    }

    public MilestoneResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public MilestoneResponseProjection typename() {
        return typename(null);
    }

    public MilestoneResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
