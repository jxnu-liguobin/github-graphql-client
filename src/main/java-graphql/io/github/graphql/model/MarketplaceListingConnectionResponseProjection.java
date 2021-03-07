package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MarketplaceListingConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MarketplaceListingConnectionResponseProjection extends GraphQLResponseProjection {

    public MarketplaceListingConnectionResponseProjection() {
    }

    @Override
    public MarketplaceListingConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MarketplaceListingConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) + 1);
            this.edges(new MarketplaceListingEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) + 1);
            this.nodes(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public MarketplaceListingConnectionResponseProjection edges(MarketplaceListingEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public MarketplaceListingConnectionResponseProjection edges(String alias, MarketplaceListingEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingConnectionResponseProjection nodes(MarketplaceListingResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public MarketplaceListingConnectionResponseProjection nodes(String alias, MarketplaceListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public MarketplaceListingConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public MarketplaceListingConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public MarketplaceListingConnectionResponseProjection typename() {
        return typename(null);
    }

    public MarketplaceListingConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
