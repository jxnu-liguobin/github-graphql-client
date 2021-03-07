package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BaseRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BaseRefForcePushedEventResponseProjection extends GraphQLResponseProjection {

    public BaseRefForcePushedEventResponseProjection() {
    }

    @Override
    public BaseRefForcePushedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BaseRefForcePushedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1);
            this.afterCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1);
            this.beforeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public BaseRefForcePushedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public BaseRefForcePushedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection afterCommit(CommitResponseProjection subProjection) {
        return afterCommit(null, subProjection);
    }

    public BaseRefForcePushedEventResponseProjection afterCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("afterCommit").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection beforeCommit(CommitResponseProjection subProjection) {
        return beforeCommit(null, subProjection);
    }

    public BaseRefForcePushedEventResponseProjection beforeCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public BaseRefForcePushedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection id() {
        return id(null);
    }

    public BaseRefForcePushedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public BaseRefForcePushedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public BaseRefForcePushedEventResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefForcePushedEventResponseProjection typename() {
        return typename(null);
    }

    public BaseRefForcePushedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
