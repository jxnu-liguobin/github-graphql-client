package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SponsorshipConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SponsorshipConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SponsorshipConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SponsorshipConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) + 1
            this.edges(SponsorshipEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) + 1
            this.nodes(SponsorshipResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: SponsorshipEdgeResponseProjection): SponsorshipConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: SponsorshipEdgeResponseProjection): SponsorshipConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: SponsorshipResponseProjection): SponsorshipConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: SponsorshipResponseProjection): SponsorshipConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): SponsorshipConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): SponsorshipConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): SponsorshipConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): SponsorshipConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): SponsorshipConnectionResponseProjection = typename(null)

    fun typename(alias: String?): SponsorshipConnectionResponseProjection {
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
        val that = other as SponsorshipConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
