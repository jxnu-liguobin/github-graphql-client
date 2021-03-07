package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MilestoneConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MilestoneConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MilestoneConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MilestoneConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) + 1
            this.edges(MilestoneEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) + 1
            this.nodes(MilestoneResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: MilestoneEdgeResponseProjection): MilestoneConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: MilestoneEdgeResponseProjection): MilestoneConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: MilestoneResponseProjection): MilestoneConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: MilestoneResponseProjection): MilestoneConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): MilestoneConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): MilestoneConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): MilestoneConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): MilestoneConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): MilestoneConnectionResponseProjection = typename(null)

    fun typename(alias: String?): MilestoneConnectionResponseProjection {
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
        val that = other as MilestoneConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
