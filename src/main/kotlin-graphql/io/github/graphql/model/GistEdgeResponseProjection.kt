package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class GistEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["GistEdgeResponseProjection.GistResponseProjection.node"] = projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) + 1
            this.node(GistResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): GistEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): GistEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: GistResponseProjection): GistEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: GistResponseProjection): GistEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): GistEdgeResponseProjection = typename(null)

    fun typename(alias: String?): GistEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
