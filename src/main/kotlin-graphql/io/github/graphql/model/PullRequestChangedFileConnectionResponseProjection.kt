package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestChangedFileConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestChangedFileConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestChangedFileConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestChangedFileConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestChangedFileEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestChangedFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestChangedFileEdgeResponseProjection): PullRequestChangedFileConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestChangedFileEdgeResponseProjection): PullRequestChangedFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestChangedFileConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestChangedFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestChangedFileConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestChangedFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestChangedFileConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestChangedFileConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
