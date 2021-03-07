package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for StargazerEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StargazerEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StargazerEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StargazerEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["StargazerEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.starredAt()
        this.typename()
        return this
    }

    fun cursor(): StargazerEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): StargazerEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): StargazerEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): StargazerEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun starredAt(): StargazerEdgeResponseProjection = starredAt(null)

    fun starredAt(alias: String?): StargazerEdgeResponseProjection {
        fields.add(GraphQLResponseField("starredAt").alias(alias))
        return this
    }

    fun typename(): StargazerEdgeResponseProjection = typename(null)

    fun typename(alias: String?): StargazerEdgeResponseProjection {
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
        val that = other as StargazerEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
