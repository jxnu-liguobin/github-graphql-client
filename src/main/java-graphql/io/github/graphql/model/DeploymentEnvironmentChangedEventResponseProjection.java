package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeploymentEnvironmentChangedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeploymentEnvironmentChangedEventResponseProjection extends GraphQLResponseProjection {

    public DeploymentEnvironmentChangedEventResponseProjection() {
    }

    @Override
    public DeploymentEnvironmentChangedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentEnvironmentChangedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) + 1);
            this.deploymentStatus(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public DeploymentEnvironmentChangedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public DeploymentEnvironmentChangedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection deploymentStatus(DeploymentStatusResponseProjection subProjection) {
        return deploymentStatus(null, subProjection);
    }

    public DeploymentEnvironmentChangedEventResponseProjection deploymentStatus(String alias, DeploymentStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deploymentStatus").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection id() {
        return id(null);
    }

    public DeploymentEnvironmentChangedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public DeploymentEnvironmentChangedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentEnvironmentChangedEventResponseProjection typename() {
        return typename(null);
    }

    public DeploymentEnvironmentChangedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
