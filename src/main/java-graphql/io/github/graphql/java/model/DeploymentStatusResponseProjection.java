package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeploymentStatus
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeploymentStatusResponseProjection extends GraphQLResponseProjection {

    public DeploymentStatusResponseProjection() {
    }

    @Override
    public DeploymentStatusResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentStatusResponseProjection all$(int maxDepth) {
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) + 1);
            this.deployment(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0)));
        }
        this.description();
        this.environmentUrl();
        this.id();
        this.logUrl();
        this.state();
        this.updatedAt();
        this.typename();
        return this;
    }

    public DeploymentStatusResponseProjection createdAt() {
        return createdAt(null);
    }

    public DeploymentStatusResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public DeploymentStatusResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusResponseProjection deployment(DeploymentResponseProjection subProjection) {
        return deployment(null, subProjection);
    }

    public DeploymentStatusResponseProjection deployment(String alias, DeploymentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployment").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusResponseProjection description() {
        return description(null);
    }

    public DeploymentStatusResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection environmentUrl() {
        return environmentUrl(null);
    }

    public DeploymentStatusResponseProjection environmentUrl(String alias) {
        fields.add(new GraphQLResponseField("environmentUrl").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection id() {
        return id(null);
    }

    public DeploymentStatusResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection logUrl() {
        return logUrl(null);
    }

    public DeploymentStatusResponseProjection logUrl(String alias) {
        fields.add(new GraphQLResponseField("logUrl").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection state() {
        return state(null);
    }

    public DeploymentStatusResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public DeploymentStatusResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public DeploymentStatusResponseProjection typename() {
        return typename(null);
    }

    public DeploymentStatusResponseProjection typename(String alias) {
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
        final DeploymentStatusResponseProjection that = (DeploymentStatusResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
