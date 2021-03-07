package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReleaseConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReleaseConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) + 1
            this.edges(ReleaseEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) + 1
            this.nodes(ReleaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ReleaseEdgeResponseProjection): ReleaseConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReleaseEdgeResponseProjection): ReleaseConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ReleaseResponseProjection): ReleaseConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ReleaseResponseProjection): ReleaseConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReleaseConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReleaseConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReleaseConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReleaseConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ReleaseConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseConnectionResponseProjection {
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
        val that = other as ReleaseConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
