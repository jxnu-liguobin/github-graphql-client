package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReleaseEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseEdgeResponseProjection.ReleaseResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) + 1
            this.node(ReleaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ReleaseEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReleaseEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ReleaseResponseProjection): ReleaseEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ReleaseResponseProjection): ReleaseEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReleaseEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
