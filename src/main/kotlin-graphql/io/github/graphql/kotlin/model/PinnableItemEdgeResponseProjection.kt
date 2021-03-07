package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PinnableItemEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PinnableItemEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PinnableItemEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PinnableItemEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0) + 1
            this.node(PinnableItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemEdgeResponseProjection.PinnableItemResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PinnableItemEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PinnableItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PinnableItemResponseProjection): PinnableItemEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PinnableItemResponseProjection): PinnableItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PinnableItemEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PinnableItemEdgeResponseProjection {
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
        val that = other as PinnableItemEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
