package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewCommentEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestReviewCommentEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewCommentEdgeResponseProjection() {
    }

    @Override
    public PullRequestReviewCommentEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewCommentEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) + 1);
            this.node(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestReviewCommentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestReviewCommentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestReviewCommentEdgeResponseProjection node(PullRequestReviewCommentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestReviewCommentEdgeResponseProjection node(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewCommentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}