package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PushAllowanceEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PushAllowanceEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PushAllowanceEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) + 1
            this.node(PushAllowanceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PushAllowanceEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PushAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PushAllowanceResponseProjection): PushAllowanceEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PushAllowanceResponseProjection): PushAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PushAllowanceEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PushAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
