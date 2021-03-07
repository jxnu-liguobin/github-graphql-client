package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewDismissalAllowanceEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewDismissalAllowanceEdgeResponseProjection extends GraphQLResponseProjection {

    public ReviewDismissalAllowanceEdgeResponseProjection() {
    }

    @Override
    public ReviewDismissalAllowanceEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewDismissalAllowanceEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) + 1);
            this.node(new ReviewDismissalAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewDismissalAllowanceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReviewDismissalAllowanceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReviewDismissalAllowanceEdgeResponseProjection node(ReviewDismissalAllowanceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReviewDismissalAllowanceEdgeResponseProjection node(String alias, ReviewDismissalAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReviewDismissalAllowanceEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
