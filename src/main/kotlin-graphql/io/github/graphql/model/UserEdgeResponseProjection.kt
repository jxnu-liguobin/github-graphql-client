package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UserEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["UserEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): UserEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): UserEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): UserEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): UserEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UserEdgeResponseProjection = typename(null)

    fun typename(alias: String?): UserEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
