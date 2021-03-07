package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdatePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdatePullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdatePullRequestReviewCommentPayloadResponseProjection() {
    }

    @Override
    public UpdatePullRequestReviewCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdatePullRequestReviewCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) + 1);
            this.pullRequestReviewComment(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0)));
        }
        this.typename();
        return this;
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection pullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return pullRequestReviewComment(null, subProjection);
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection pullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdatePullRequestReviewCommentPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
