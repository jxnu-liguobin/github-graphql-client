package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RefEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RefEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RefEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RefEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RefEdgeResponseProjection.RefResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) + 1
            this.node(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RefEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RefEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RefResponseProjection): RefEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RefResponseProjection): RefEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RefEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RefEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
