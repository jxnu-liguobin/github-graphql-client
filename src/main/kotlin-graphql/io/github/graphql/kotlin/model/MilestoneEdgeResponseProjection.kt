package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MilestoneEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MilestoneEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MilestoneEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MilestoneEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneEdgeResponseProjection.MilestoneResponseProjection.node"] = projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) + 1
            this.node(MilestoneResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): MilestoneEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): MilestoneEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: MilestoneResponseProjection): MilestoneEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: MilestoneResponseProjection): MilestoneEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MilestoneEdgeResponseProjection = typename(null)

    fun typename(alias: String?): MilestoneEdgeResponseProjection {
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
        val that = other as MilestoneEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
