package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewRequestConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewRequestConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewRequestConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewRequestConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) + 1
            this.edges(ReviewRequestEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) + 1
            this.nodes(ReviewRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ReviewRequestEdgeResponseProjection): ReviewRequestConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReviewRequestEdgeResponseProjection): ReviewRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ReviewRequestResponseProjection): ReviewRequestConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ReviewRequestResponseProjection): ReviewRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReviewRequestConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReviewRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReviewRequestConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReviewRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ReviewRequestConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReviewRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
