package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestReviewConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestReviewEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestReviewEdgeResponseProjection): PullRequestReviewConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestReviewEdgeResponseProjection): PullRequestReviewConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestReviewResponseProjection): PullRequestReviewConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestReviewResponseProjection): PullRequestReviewConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestReviewConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestReviewConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestReviewConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
