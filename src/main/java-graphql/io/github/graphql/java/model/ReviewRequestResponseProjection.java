package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReviewRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewRequestResponseProjection extends GraphQLResponseProjection {

    public ReviewRequestResponseProjection() {
    }

    @Override
    public ReviewRequestResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewRequestResponseProjection all$(int maxDepth) {
        this.databaseId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1);
            this.requestedReviewer(new RequestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewRequestResponseProjection databaseId() {
        return databaseId(null);
    }

    public ReviewRequestResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ReviewRequestResponseProjection id() {
        return id(null);
    }

    public ReviewRequestResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewRequestResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReviewRequestResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestResponseProjection requestedReviewer(RequestedReviewerResponseProjection subProjection) {
        return requestedReviewer(null, subProjection);
    }

    public ReviewRequestResponseProjection requestedReviewer(String alias, RequestedReviewerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestResponseProjection typename() {
        return typename(null);
    }

    public ReviewRequestResponseProjection typename(String alias) {
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
        final ReviewRequestResponseProjection that = (ReviewRequestResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
