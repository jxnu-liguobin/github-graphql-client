package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UserEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): UserEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): UserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): UserEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): UserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): UserEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
