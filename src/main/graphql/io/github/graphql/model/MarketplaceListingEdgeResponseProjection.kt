package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarketplaceListingEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceListingEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MarketplaceListingEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MarketplaceListingEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node"] = projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0) + 1
            this.node(MarketplaceListingResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingEdgeResponseProjection.MarketplaceListingResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): MarketplaceListingEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): MarketplaceListingEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: MarketplaceListingResponseProjection): MarketplaceListingEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: MarketplaceListingResponseProjection): MarketplaceListingEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MarketplaceListingEdgeResponseProjection = typename(null)

    fun typename(alias: String?): MarketplaceListingEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
