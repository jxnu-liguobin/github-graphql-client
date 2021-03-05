package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestContributionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedPullRequestContributionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestContributionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestContributionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) + 1
            this.edges(CreatedPullRequestContributionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) + 1
            this.nodes(CreatedPullRequestContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CreatedPullRequestContributionEdgeResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CreatedPullRequestContributionEdgeResponseProjection): CreatedPullRequestContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CreatedPullRequestContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CreatedPullRequestContributionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CreatedPullRequestContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CreatedPullRequestContributionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
