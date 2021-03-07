package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewRequestEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewRequestEdgeResponseProjection extends GraphQLResponseProjection {

    public ReviewRequestEdgeResponseProjection() {
    }

    @Override
    public ReviewRequestEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewRequestEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) + 1);
            this.node(new ReviewRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReviewRequestEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReviewRequestEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReviewRequestEdgeResponseProjection node(ReviewRequestResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReviewRequestEdgeResponseProjection node(String alias, ReviewRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReviewRequestEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
