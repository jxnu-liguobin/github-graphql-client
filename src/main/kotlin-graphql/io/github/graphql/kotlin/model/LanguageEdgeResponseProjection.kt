package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LanguageEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LanguageEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LanguageEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LanguageEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["LanguageEdgeResponseProjection.LanguageResponseProjection.node"] = projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) + 1
            this.node(LanguageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0)))
        }
        this.size()
        this.typename()
        return this
    }

    fun cursor(): LanguageEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): LanguageEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: LanguageResponseProjection): LanguageEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: LanguageResponseProjection): LanguageEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun size(): LanguageEdgeResponseProjection = size(null)

    fun size(alias: String?): LanguageEdgeResponseProjection {
        fields.add(GraphQLResponseField("size").alias(alias))
        return this
    }

    fun typename(): LanguageEdgeResponseProjection = typename(null)

    fun typename(alias: String?): LanguageEdgeResponseProjection {
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
        val that = other as LanguageEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
