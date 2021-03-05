package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamMemberConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamMemberConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamMemberConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamMemberConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0) + 1
            this.edges(TeamMemberEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["TeamMemberConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: TeamMemberEdgeResponseProjection): TeamMemberConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: TeamMemberEdgeResponseProjection): TeamMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): TeamMemberConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): TeamMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): TeamMemberConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): TeamMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): TeamMemberConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): TeamMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): TeamMemberConnectionResponseProjection = typename(null)

    fun typename(alias: String?): TeamMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
