package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReviewRequestedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewRequestedEventResponseProjection extends GraphQLResponseProjection {

    public ReviewRequestedEventResponseProjection() {
    }

    @Override
    public ReviewRequestedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewRequestedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1);
            this.requestedReviewer(new RequestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewRequestedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReviewRequestedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReviewRequestedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReviewRequestedEventResponseProjection id() {
        return id(null);
    }

    public ReviewRequestedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewRequestedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReviewRequestedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestedEventResponseProjection requestedReviewer(RequestedReviewerResponseProjection subProjection) {
        return requestedReviewer(null, subProjection);
    }

    public ReviewRequestedEventResponseProjection requestedReviewer(String alias, RequestedReviewerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestedEventResponseProjection typename() {
        return typename(null);
    }

    public ReviewRequestedEventResponseProjection typename(String alias) {
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
        final ReviewRequestedEventResponseProjection that = (ReviewRequestedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
