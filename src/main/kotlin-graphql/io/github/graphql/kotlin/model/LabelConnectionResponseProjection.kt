package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LabelConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LabelConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LabelConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LabelConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) + 1
            this.edges(LabelEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["LabelConnectionResponseProjection.LabelResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) + 1
            this.nodes(LabelResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: LabelEdgeResponseProjection): LabelConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: LabelEdgeResponseProjection): LabelConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: LabelResponseProjection): LabelConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: LabelResponseProjection): LabelConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): LabelConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): LabelConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): LabelConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): LabelConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): LabelConnectionResponseProjection = typename(null)

    fun typename(alias: String?): LabelConnectionResponseProjection {
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
        val that = other as LabelConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
