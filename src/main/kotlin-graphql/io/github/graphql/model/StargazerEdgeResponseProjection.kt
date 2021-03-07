package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StargazerEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
