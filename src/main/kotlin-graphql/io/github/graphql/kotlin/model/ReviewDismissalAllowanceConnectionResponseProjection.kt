package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissalAllowanceConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReviewDismissalAllowanceConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissalAllowanceConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissalAllowanceConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) + 1
            this.edges(ReviewDismissalAllowanceEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) + 1
            this.nodes(ReviewDismissalAllowanceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ReviewDismissalAllowanceEdgeResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReviewDismissalAllowanceEdgeResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReviewDismissalAllowanceConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReviewDismissalAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ReviewDismissalAllowanceConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissalAllowanceConnectionResponseProjection {
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
        val that = other as ReviewDismissalAllowanceConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
