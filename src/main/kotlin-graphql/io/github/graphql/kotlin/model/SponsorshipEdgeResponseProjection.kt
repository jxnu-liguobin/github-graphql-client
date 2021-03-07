package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SponsorshipEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SponsorshipEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SponsorshipEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SponsorshipEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node"] = projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) + 1
            this.node(SponsorshipResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): SponsorshipEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): SponsorshipEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: SponsorshipResponseProjection): SponsorshipEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: SponsorshipResponseProjection): SponsorshipEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SponsorshipEdgeResponseProjection = typename(null)

    fun typename(alias: String?): SponsorshipEdgeResponseProjection {
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
        val that = other as SponsorshipEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
