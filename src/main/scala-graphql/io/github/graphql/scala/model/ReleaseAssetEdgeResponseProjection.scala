package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReleaseAssetEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReleaseAssetEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseAssetEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseAssetEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) + 1)
            this.node(new ReleaseAssetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ReleaseAssetEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReleaseAssetEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ReleaseAssetResponseProjection): ReleaseAssetEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ReleaseAssetResponseProjection): ReleaseAssetEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReleaseAssetEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseAssetEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReleaseAssetEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
