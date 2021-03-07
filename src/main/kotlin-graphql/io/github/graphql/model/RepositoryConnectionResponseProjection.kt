package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RepositoryConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) + 1
            this.edges(RepositoryEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1
            this.nodes(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.totalDiskUsage()
        this.typename()
        return this
    }

    fun edges(subProjection: RepositoryEdgeResponseProjection): RepositoryConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RepositoryEdgeResponseProjection): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RepositoryResponseProjection): RepositoryConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RepositoryResponseProjection): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RepositoryConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RepositoryConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun totalDiskUsage(): RepositoryConnectionResponseProjection = totalDiskUsage(null)

    fun totalDiskUsage(alias: String?): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalDiskUsage").alias(alias))
        return this
    }

    fun typename(): RepositoryConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
