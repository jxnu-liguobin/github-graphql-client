package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["TeamEdgeResponseProjection.TeamResponseProjection.node"] = projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) + 1
            this.node(TeamResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): TeamEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): TeamEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: TeamResponseProjection): TeamEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: TeamResponseProjection): TeamEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): TeamEdgeResponseProjection = typename(null)

    fun typename(alias: String?): TeamEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
