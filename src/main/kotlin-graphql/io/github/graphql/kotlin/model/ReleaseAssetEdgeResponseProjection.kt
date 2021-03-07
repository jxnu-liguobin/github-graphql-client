package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReleaseAssetEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReleaseAssetEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
