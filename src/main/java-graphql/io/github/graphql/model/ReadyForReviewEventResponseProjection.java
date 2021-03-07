package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReadyForReviewEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReadyForReviewEventResponseProjection extends GraphQLResponseProjection {

    public ReadyForReviewEventResponseProjection() {
    }

    @Override
    public ReadyForReviewEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReadyForReviewEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReadyForReviewEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReadyForReviewEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReadyForReviewEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public ReadyForReviewEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReadyForReviewEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReadyForReviewEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReadyForReviewEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReadyForReviewEventResponseProjection id() {
        return id(null);
    }

    public ReadyForReviewEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReadyForReviewEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReadyForReviewEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReadyForReviewEventResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ReadyForReviewEventResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ReadyForReviewEventResponseProjection url() {
        return url(null);
    }

    public ReadyForReviewEventResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ReadyForReviewEventResponseProjection typename() {
        return typename(null);
    }

    public ReadyForReviewEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
