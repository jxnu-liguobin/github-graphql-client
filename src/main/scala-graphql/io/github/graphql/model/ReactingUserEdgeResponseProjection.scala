package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactingUserEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactingUserEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactingUserEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactingUserEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.reactedAt()
        this.typename()
        this
    }

    def cursor(): ReactingUserEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReactingUserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): ReactingUserEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): ReactingUserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def reactedAt(): ReactingUserEdgeResponseProjection = {
        reactedAt(null.asInstanceOf[String])
    }

    def reactedAt(alias: String): ReactingUserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("reactedAt").alias(alias))
        this
    }

    def typename(): ReactingUserEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactingUserEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
