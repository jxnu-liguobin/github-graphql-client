package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserStatusEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UserStatusEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserStatusEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserStatusEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusEdgeResponseProjection.UserStatusResponseProjection.node"] = projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) + 1
            this.node(UserStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): UserStatusEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): UserStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserStatusResponseProjection): UserStatusEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserStatusResponseProjection): UserStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UserStatusEdgeResponseProjection = typename(null)

    fun typename(alias: String?): UserStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UserStatusEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
