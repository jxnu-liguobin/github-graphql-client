package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StargazerEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StargazerEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): StargazerEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): StargazerEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.starredAt()
        this.typename()
        this
    }

    def cursor(): StargazerEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): StargazerEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): StargazerEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): StargazerEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def starredAt(): StargazerEdgeResponseProjection = {
        starredAt(null.asInstanceOf[String])
    }

    def starredAt(alias: String): StargazerEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("starredAt").alias(alias))
        this
    }

    def typename(): StargazerEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StargazerEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
