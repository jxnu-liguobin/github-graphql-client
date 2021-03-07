package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdatePullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdatePullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdatePullRequestReviewPayloadResponseProjection() {
    }

    @Override
    public UpdatePullRequestReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdatePullRequestReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        this.typename();
        return this;
    }

    public UpdatePullRequestReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdatePullRequestReviewPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdatePullRequestReviewPayloadResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public UpdatePullRequestReviewPayloadResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatePullRequestReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdatePullRequestReviewPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
