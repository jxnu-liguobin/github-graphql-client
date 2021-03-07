package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarketplaceListingEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): MarketplaceListingEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): MarketplaceListingEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) + 1)
            this.node(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): MarketplaceListingEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): MarketplaceListingEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: MarketplaceListingResponseProjection): MarketplaceListingEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: MarketplaceListingResponseProjection): MarketplaceListingEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): MarketplaceListingEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MarketplaceListingEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
