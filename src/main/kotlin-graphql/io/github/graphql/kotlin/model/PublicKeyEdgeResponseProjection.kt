package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PublicKeyEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PublicKeyEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PublicKeyEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PublicKeyEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) + 1
            this.node(PublicKeyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PublicKeyEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PublicKeyEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PublicKeyResponseProjection): PublicKeyEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PublicKeyResponseProjection): PublicKeyEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PublicKeyEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PublicKeyEdgeResponseProjection {
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
        val that = other as PublicKeyEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
