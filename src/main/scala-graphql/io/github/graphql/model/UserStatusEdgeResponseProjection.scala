package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserStatusEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UserStatusEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserStatusEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserStatusEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) + 1)
            this.node(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): UserStatusEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): UserStatusEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserStatusResponseProjection): UserStatusEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserStatusResponseProjection): UserStatusEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): UserStatusEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserStatusEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
