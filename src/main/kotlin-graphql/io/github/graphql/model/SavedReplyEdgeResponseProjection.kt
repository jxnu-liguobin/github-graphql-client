package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SavedReplyEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SavedReplyEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SavedReplyEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SavedReplyEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node"] = projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) + 1
            this.node(SavedReplyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): SavedReplyEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): SavedReplyEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: SavedReplyResponseProjection): SavedReplyEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: SavedReplyResponseProjection): SavedReplyEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SavedReplyEdgeResponseProjection = typename(null)

    fun typename(alias: String?): SavedReplyEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
