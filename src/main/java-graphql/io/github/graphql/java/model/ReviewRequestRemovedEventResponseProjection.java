package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReviewRequestRemovedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewRequestRemovedEventResponseProjection extends GraphQLResponseProjection {

    public ReviewRequestRemovedEventResponseProjection() {
    }

    @Override
    public ReviewRequestRemovedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewRequestRemovedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1);
            this.requestedReviewer(new RequestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReviewRequestRemovedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReviewRequestRemovedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection id() {
        return id(null);
    }

    public ReviewRequestRemovedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReviewRequestRemovedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection requestedReviewer(RequestedReviewerResponseProjection subProjection) {
        return requestedReviewer(null, subProjection);
    }

    public ReviewRequestRemovedEventResponseProjection requestedReviewer(String alias, RequestedReviewerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestRemovedEventResponseProjection typename() {
        return typename(null);
    }

    public ReviewRequestRemovedEventResponseProjection typename(String alias) {
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
        final ReviewRequestRemovedEventResponseProjection that = (ReviewRequestRemovedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
