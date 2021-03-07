package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TeamEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): TeamEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): TeamEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamEdgeResponseProjection.TeamResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) + 1)
            this.node(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): TeamEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): TeamEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: TeamResponseProjection): TeamEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: TeamResponseProjection): TeamEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): TeamEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TeamEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
