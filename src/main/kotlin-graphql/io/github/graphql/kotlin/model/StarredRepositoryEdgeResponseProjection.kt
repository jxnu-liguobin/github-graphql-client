package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for StarredRepositoryEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StarredRepositoryEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StarredRepositoryEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StarredRepositoryEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node"] = projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1
            this.node(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.starredAt()
        this.typename()
        return this
    }

    fun cursor(): StarredRepositoryEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): StarredRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RepositoryResponseProjection): StarredRepositoryEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RepositoryResponseProjection): StarredRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun starredAt(): StarredRepositoryEdgeResponseProjection = starredAt(null)

    fun starredAt(alias: String?): StarredRepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("starredAt").alias(alias))
        return this
    }

    fun typename(): StarredRepositoryEdgeResponseProjection = typename(null)

    fun typename(alias: String?): StarredRepositoryEdgeResponseProjection {
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
        val that = other as StarredRepositoryEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
