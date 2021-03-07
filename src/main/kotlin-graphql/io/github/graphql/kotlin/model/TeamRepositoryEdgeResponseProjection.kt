package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TeamRepositoryEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TeamRepositoryEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamRepositoryEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamRepositoryEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node"] = projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1
            this.node(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.permission()
        this.typename()
        return this
    }

    fun cursor(): TeamRepositoryEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): TeamRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RepositoryResponseProjection): TeamRepositoryEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RepositoryResponseProjection): TeamRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun permission(): TeamRepositoryEdgeResponseProjection = permission(null)

    fun permission(alias: String?): TeamRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("permission").alias(alias))
        return this
    }

    fun typename(): TeamRepositoryEdgeResponseProjection = typename(null)

    fun typename(alias: String?): TeamRepositoryEdgeResponseProjection {
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
        val that = other as TeamRepositoryEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
