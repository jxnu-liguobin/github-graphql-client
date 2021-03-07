package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RequestReviewsPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RequestReviewsPayloadResponseProjection extends GraphQLResponseProjection {

    public RequestReviewsPayloadResponseProjection() {
    }

    @Override
    public RequestReviewsPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RequestReviewsPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) + 1);
            this.requestedReviewersEdge(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0)));
        }
        this.typename();
        return this;
    }

    public RequestReviewsPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RequestReviewsPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RequestReviewsPayloadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public RequestReviewsPayloadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public RequestReviewsPayloadResponseProjection requestedReviewersEdge(UserEdgeResponseProjection subProjection) {
        return requestedReviewersEdge(null, subProjection);
    }

    public RequestReviewsPayloadResponseProjection requestedReviewersEdge(String alias, UserEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("requestedReviewersEdge").alias(alias).projection(subProjection));
        return this;
    }

    public RequestReviewsPayloadResponseProjection typename() {
        return typename(null);
    }

    public RequestReviewsPayloadResponseProjection typename(String alias) {
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
        final RequestReviewsPayloadResponseProjection that = (RequestReviewsPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
