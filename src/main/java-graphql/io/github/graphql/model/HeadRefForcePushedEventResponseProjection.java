package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for HeadRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class HeadRefForcePushedEventResponseProjection extends GraphQLResponseProjection {

    public HeadRefForcePushedEventResponseProjection() {
    }

    @Override
    public HeadRefForcePushedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public HeadRefForcePushedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1);
            this.afterCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1);
            this.beforeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public HeadRefForcePushedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public HeadRefForcePushedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection afterCommit(CommitResponseProjection subProjection) {
        return afterCommit(null, subProjection);
    }

    public HeadRefForcePushedEventResponseProjection afterCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("afterCommit").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection beforeCommit(CommitResponseProjection subProjection) {
        return beforeCommit(null, subProjection);
    }

    public HeadRefForcePushedEventResponseProjection beforeCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public HeadRefForcePushedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection id() {
        return id(null);
    }

    public HeadRefForcePushedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public HeadRefForcePushedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public HeadRefForcePushedEventResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefForcePushedEventResponseProjection typename() {
        return typename(null);
    }

    public HeadRefForcePushedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
