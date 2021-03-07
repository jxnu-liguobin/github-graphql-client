package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TeamConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) + 1
            this.edges(TeamEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["TeamConnectionResponseProjection.TeamResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) + 1
            this.nodes(TeamResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: TeamEdgeResponseProjection): TeamConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: TeamEdgeResponseProjection): TeamConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: TeamResponseProjection): TeamConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: TeamResponseProjection): TeamConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): TeamConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): TeamConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): TeamConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): TeamConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): TeamConnectionResponseProjection = typename(null)

    fun typename(alias: String?): TeamConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
