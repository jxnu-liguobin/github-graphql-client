package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Deployment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeploymentResponseProjection extends GraphQLResponseProjection {

    public DeploymentResponseProjection() {
    }

    @Override
    public DeploymentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.commitOid();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.databaseId();
        this.description();
        this.environment();
        this.id();
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) + 1);
            this.latestStatus(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0)));
        }
        this.payload();
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.state();
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) + 1);
            this.statuses(new DeploymentStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0)));
        }
        this.task();
        this.updatedAt();
        this.typename();
        return this;
    }

    public DeploymentResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public DeploymentResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection commitOid() {
        return commitOid(null);
    }

    public DeploymentResponseProjection commitOid(String alias) {
        fields.add(new GraphQLResponseField("commitOid").alias(alias));
        return this;
    }

    public DeploymentResponseProjection createdAt() {
        return createdAt(null);
    }

    public DeploymentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DeploymentResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public DeploymentResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection databaseId() {
        return databaseId(null);
    }

    public DeploymentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public DeploymentResponseProjection description() {
        return description(null);
    }

    public DeploymentResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public DeploymentResponseProjection environment() {
        return environment(null);
    }

    public DeploymentResponseProjection environment(String alias) {
        fields.add(new GraphQLResponseField("environment").alias(alias));
        return this;
    }

    public DeploymentResponseProjection id() {
        return id(null);
    }

    public DeploymentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DeploymentResponseProjection latestStatus(DeploymentStatusResponseProjection subProjection) {
        return latestStatus(null, subProjection);
    }

    public DeploymentResponseProjection latestStatus(String alias, DeploymentStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("latestStatus").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection payload() {
        return payload(null);
    }

    public DeploymentResponseProjection payload(String alias) {
        fields.add(new GraphQLResponseField("payload").alias(alias));
        return this;
    }

    public DeploymentResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public DeploymentResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public DeploymentResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection state() {
        return state(null);
    }

    public DeploymentResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public DeploymentResponseProjection statuses(DeploymentStatusConnectionResponseProjection subProjection) {
        return statuses((String)null, subProjection);
    }

    public DeploymentResponseProjection statuses(String alias, DeploymentStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("statuses").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection statuses(DeploymentStatusesParametrizedInput input, DeploymentStatusConnectionResponseProjection subProjection) {
        return statuses(null, input, subProjection);
    }

    public DeploymentResponseProjection statuses(String alias, DeploymentStatusesParametrizedInput input, DeploymentStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("statuses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DeploymentResponseProjection task() {
        return task(null);
    }

    public DeploymentResponseProjection task(String alias) {
        fields.add(new GraphQLResponseField("task").alias(alias));
        return this;
    }

    public DeploymentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public DeploymentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public DeploymentResponseProjection typename() {
        return typename(null);
    }

    public DeploymentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
