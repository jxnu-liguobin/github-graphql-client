package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TeamConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): TeamConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): TeamConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) + 1)
            this.edges(new TeamEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.TeamResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) + 1)
            this.nodes(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: TeamEdgeResponseProjection): TeamConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: TeamEdgeResponseProjection): TeamConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: TeamResponseProjection): TeamConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: TeamResponseProjection): TeamConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): TeamConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): TeamConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): TeamConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): TeamConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): TeamConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TeamConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
