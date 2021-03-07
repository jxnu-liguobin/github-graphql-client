package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedRepositoryContributionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedRepositoryContributionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedRepositoryContributionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedRepositoryContributionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) + 1
            this.edges(CreatedRepositoryContributionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) + 1
            this.nodes(CreatedRepositoryContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CreatedRepositoryContributionEdgeResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CreatedRepositoryContributionEdgeResponseProjection): CreatedRepositoryContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CreatedRepositoryContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CreatedRepositoryContributionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CreatedRepositoryContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CreatedRepositoryContributionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedRepositoryContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
