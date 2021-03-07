package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistCommentEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class GistCommentEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistCommentEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistCommentEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentEdgeResponseProjection.GistCommentResponseProjection.node"] = projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) + 1
            this.node(GistCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): GistCommentEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): GistCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: GistCommentResponseProjection): GistCommentEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: GistCommentResponseProjection): GistCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): GistCommentEdgeResponseProjection = typename(null)

    fun typename(alias: String?): GistCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
