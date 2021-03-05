package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarketplaceListingConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceListingConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MarketplaceListingConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MarketplaceListingConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0) + 1
            this.edges(MarketplaceListingEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0) + 1
            this.nodes(MarketplaceListingResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.MarketplaceListingResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: MarketplaceListingEdgeResponseProjection): MarketplaceListingConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: MarketplaceListingEdgeResponseProjection): MarketplaceListingConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: MarketplaceListingResponseProjection): MarketplaceListingConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: MarketplaceListingResponseProjection): MarketplaceListingConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): MarketplaceListingConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): MarketplaceListingConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): MarketplaceListingConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): MarketplaceListingConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): MarketplaceListingConnectionResponseProjection = typename(null)

    fun typename(alias: String?): MarketplaceListingConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
