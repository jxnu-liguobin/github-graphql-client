package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamRepositoryEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TeamRepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): TeamRepositoryEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): TeamRepositoryEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1)
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.permission()
        this.typename()
        this
    }

    def cursor(): TeamRepositoryEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): TeamRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RepositoryResponseProjection): TeamRepositoryEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RepositoryResponseProjection): TeamRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def permission(): TeamRepositoryEdgeResponseProjection = {
        permission(null.asInstanceOf[String])
    }

    def permission(alias: String): TeamRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("permission").alias(alias))
        this
    }

    def typename(): TeamRepositoryEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TeamRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
