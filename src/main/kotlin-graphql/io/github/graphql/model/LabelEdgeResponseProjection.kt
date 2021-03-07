package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LabelEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class LabelEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LabelEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LabelEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["LabelEdgeResponseProjection.LabelResponseProjection.node"] = projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) + 1
            this.node(LabelResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): LabelEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): LabelEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: LabelResponseProjection): LabelEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: LabelResponseProjection): LabelEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LabelEdgeResponseProjection = typename(null)

    fun typename(alias: String?): LabelEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
