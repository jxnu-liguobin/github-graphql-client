package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PinnableItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PinnableItemEdgeResponseProjection extends GraphQLResponseProjection {

    public PinnableItemEdgeResponseProjection() {
    }

    @Override
    public PinnableItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PinnableItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) + 1);
            this.node(new PinnableItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PinnableItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PinnableItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PinnableItemEdgeResponseProjection node(PinnableItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PinnableItemEdgeResponseProjection node(String alias, PinnableItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public PinnableItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
