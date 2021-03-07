package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddPullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    public AddPullRequestReviewPayloadResponseProjection() {
    }

    @Override
    public AddPullRequestReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddPullRequestReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0) + 1);
            this.reviewEdge(new PullRequestReviewEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewPayloadResponseProjection.PullRequestReviewEdgeResponseProjection.reviewEdge", 0)));
        }
        this.typename();
        return this;
    }

    public AddPullRequestReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddPullRequestReviewPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddPullRequestReviewPayloadResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public AddPullRequestReviewPayloadResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public AddPullRequestReviewPayloadResponseProjection reviewEdge(PullRequestReviewEdgeResponseProjection subProjection) {
        return reviewEdge(null, subProjection);
    }

    public AddPullRequestReviewPayloadResponseProjection reviewEdge(String alias, PullRequestReviewEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddPullRequestReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddPullRequestReviewPayloadResponseProjection typename(String alias) {
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
        final AddPullRequestReviewPayloadResponseProjection that = (AddPullRequestReviewPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
