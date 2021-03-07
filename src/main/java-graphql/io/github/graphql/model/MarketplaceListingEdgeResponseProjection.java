package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MarketplaceListingEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MarketplaceListingEdgeResponseProjection extends GraphQLResponseProjection {

    public MarketplaceListingEdgeResponseProjection() {
    }

    @Override
    public MarketplaceListingEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MarketplaceListingEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) + 1);
            this.node(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public MarketplaceListingEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public MarketplaceListingEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public MarketplaceListingEdgeResponseProjection node(MarketplaceListingResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public MarketplaceListingEdgeResponseProjection node(String alias, MarketplaceListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingEdgeResponseProjection typename() {
        return typename(null);
    }

    public MarketplaceListingEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
