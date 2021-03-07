package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewThreadEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReviewThreadEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewThreadEdgeResponseProjection() {
    }

    @Override
    public PullRequestReviewThreadEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewThreadEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) + 1);
            this.node(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestReviewThreadEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestReviewThreadEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestReviewThreadEdgeResponseProjection node(PullRequestReviewThreadResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestReviewThreadEdgeResponseProjection node(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewThreadEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
