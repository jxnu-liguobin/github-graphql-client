package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnableItemConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PinnableItemConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PinnableItemConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PinnableItemConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) + 1
            this.edges(PinnableItemEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) + 1
            this.nodes(PinnableItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PinnableItemEdgeResponseProjection): PinnableItemConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PinnableItemEdgeResponseProjection): PinnableItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PinnableItemResponseProjection): PinnableItemConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PinnableItemResponseProjection): PinnableItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PinnableItemConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PinnableItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PinnableItemConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PinnableItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PinnableItemConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PinnableItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
