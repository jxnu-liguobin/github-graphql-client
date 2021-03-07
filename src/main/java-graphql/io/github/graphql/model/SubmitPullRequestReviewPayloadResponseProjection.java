package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SubmitPullRequestReviewPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SubmitPullRequestReviewPayloadResponseProjection extends GraphQLResponseProjection {

    public SubmitPullRequestReviewPayloadResponseProjection() {
    }

    @Override
    public SubmitPullRequestReviewPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SubmitPullRequestReviewPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubmitPullRequestReviewPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        this.typename();
        return this;
    }

    public SubmitPullRequestReviewPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public SubmitPullRequestReviewPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public SubmitPullRequestReviewPayloadResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public SubmitPullRequestReviewPayloadResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public SubmitPullRequestReviewPayloadResponseProjection typename() {
        return typename(null);
    }

    public SubmitPullRequestReviewPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
