package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeployedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeployedEventResponseProjection extends GraphQLResponseProjection {

    public DeployedEventResponseProjection() {
    }

    @Override
    public DeployedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeployedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) + 1);
            this.deployment(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public DeployedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public DeployedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public DeployedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public DeployedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DeployedEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public DeployedEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public DeployedEventResponseProjection deployment(DeploymentResponseProjection subProjection) {
        return deployment(null, subProjection);
    }

    public DeployedEventResponseProjection deployment(String alias, DeploymentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployment").alias(alias).projection(subProjection));
        return this;
    }

    public DeployedEventResponseProjection id() {
        return id(null);
    }

    public DeployedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DeployedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public DeployedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public DeployedEventResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public DeployedEventResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public DeployedEventResponseProjection typename() {
        return typename(null);
    }

    public DeployedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
