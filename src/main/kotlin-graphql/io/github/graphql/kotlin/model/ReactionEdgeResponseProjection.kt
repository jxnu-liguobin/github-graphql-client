package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReactionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReactionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionEdgeResponseProjection.ReactionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) + 1
            this.node(ReactionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ReactionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReactionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ReactionResponseProjection): ReactionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ReactionResponseProjection): ReactionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReactionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReactionEdgeResponseProjection {
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
        val that = other as ReactionEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
