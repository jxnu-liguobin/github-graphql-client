package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserContentEditEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserContentEditEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserContentEditEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserContentEditEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node"] = projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) + 1
            this.node(UserContentEditResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): UserContentEditEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): UserContentEditEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserContentEditResponseProjection): UserContentEditEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserContentEditResponseProjection): UserContentEditEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UserContentEditEdgeResponseProjection = typename(null)

    fun typename(alias: String?): UserContentEditEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
