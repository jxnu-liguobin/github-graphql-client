package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeletePullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeletePullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    public DeletePullRequestReviewPayloadResponseProjection() {
    }

    @Override
    public DeletePullRequestReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeletePullRequestReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeletePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        this.typename();
        return this;
    }

    public DeletePullRequestReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeletePullRequestReviewPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeletePullRequestReviewPayloadResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public DeletePullRequestReviewPayloadResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public DeletePullRequestReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeletePullRequestReviewPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
