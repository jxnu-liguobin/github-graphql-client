package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamRepositoryConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TeamRepositoryConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamRepositoryConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamRepositoryConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0) + 1
            this.edges(TeamRepositoryEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1
            this.nodes(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: TeamRepositoryEdgeResponseProjection): TeamRepositoryConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: TeamRepositoryEdgeResponseProjection): TeamRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RepositoryResponseProjection): TeamRepositoryConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RepositoryResponseProjection): TeamRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): TeamRepositoryConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): TeamRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): TeamRepositoryConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): TeamRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): TeamRepositoryConnectionResponseProjection = typename(null)

    fun typename(alias: String?): TeamRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
