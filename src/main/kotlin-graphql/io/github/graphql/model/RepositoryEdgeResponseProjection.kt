package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RepositoryEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryEdgeResponseProjection.RepositoryResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1
            this.node(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RepositoryEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RepositoryResponseProjection): RepositoryEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RepositoryResponseProjection): RepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
