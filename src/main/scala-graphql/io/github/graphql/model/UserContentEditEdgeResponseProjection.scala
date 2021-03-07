package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserContentEditEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UserContentEditEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserContentEditEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserContentEditEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) + 1)
            this.node(new UserContentEditResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): UserContentEditEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): UserContentEditEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserContentEditResponseProjection): UserContentEditEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserContentEditResponseProjection): UserContentEditEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): UserContentEditEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserContentEditEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
