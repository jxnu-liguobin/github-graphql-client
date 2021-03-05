package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["GistConnectionResponseProjection.GistEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) + 1
            this.edges(GistEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["GistConnectionResponseProjection.GistResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) + 1
            this.nodes(GistResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: GistEdgeResponseProjection): GistConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: GistEdgeResponseProjection): GistConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: GistResponseProjection): GistConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: GistResponseProjection): GistConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): GistConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): GistConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): GistConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): GistConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): GistConnectionResponseProjection = typename(null)

    fun typename(alias: String?): GistConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
