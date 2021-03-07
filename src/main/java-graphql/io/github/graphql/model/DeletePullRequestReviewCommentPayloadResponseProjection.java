package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeletePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeletePullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public DeletePullRequestReviewCommentPayloadResponseProjection() {
    }

    @Override
    public DeletePullRequestReviewCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeletePullRequestReviewCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeletePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        this.typename();
        return this;
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeletePullRequestReviewCommentPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
