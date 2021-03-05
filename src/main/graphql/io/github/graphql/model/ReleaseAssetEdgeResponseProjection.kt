package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseAssetEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReleaseAssetEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseAssetEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseAssetEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) + 1
            this.node(ReleaseAssetResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ReleaseAssetEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReleaseAssetEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ReleaseAssetResponseProjection): ReleaseAssetEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ReleaseAssetResponseProjection): ReleaseAssetEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReleaseAssetEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseAssetEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
