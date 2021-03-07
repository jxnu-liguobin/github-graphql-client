package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AppEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AppEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AppEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AppEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["AppEdgeResponseProjection.AppResponseProjection.node"] = projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) + 1
            this.node(AppResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): AppEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): AppEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: AppResponseProjection): AppEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: AppResponseProjection): AppEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AppEdgeResponseProjection = typename(null)

    fun typename(alias: String?): AppEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
