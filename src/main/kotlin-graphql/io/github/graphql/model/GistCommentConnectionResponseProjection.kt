package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistCommentConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class GistCommentConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistCommentConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistCommentConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) + 1
            this.edges(GistCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) + 1
            this.nodes(GistCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: GistCommentEdgeResponseProjection): GistCommentConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: GistCommentEdgeResponseProjection): GistCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: GistCommentResponseProjection): GistCommentConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: GistCommentResponseProjection): GistCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): GistCommentConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): GistCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): GistCommentConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): GistCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): GistCommentConnectionResponseProjection = typename(null)

    fun typename(alias: String?): GistCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
