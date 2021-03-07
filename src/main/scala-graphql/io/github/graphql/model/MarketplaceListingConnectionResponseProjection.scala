package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarketplaceListingConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): MarketplaceListingConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): MarketplaceListingConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) + 1)
            this.edges(new MarketplaceListingEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) + 1)
            this.nodes(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: MarketplaceListingEdgeResponseProjection): MarketplaceListingConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: MarketplaceListingEdgeResponseProjection): MarketplaceListingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: MarketplaceListingResponseProjection): MarketplaceListingConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: MarketplaceListingResponseProjection): MarketplaceListingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): MarketplaceListingConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): MarketplaceListingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): MarketplaceListingConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): MarketplaceListingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): MarketplaceListingConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MarketplaceListingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
