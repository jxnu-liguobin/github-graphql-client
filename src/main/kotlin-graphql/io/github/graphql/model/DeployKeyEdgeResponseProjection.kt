package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeployKeyEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeployKeyEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeployKeyEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeployKeyEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node"] = projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) + 1
            this.node(DeployKeyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): DeployKeyEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): DeployKeyEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: DeployKeyResponseProjection): DeployKeyEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: DeployKeyResponseProjection): DeployKeyEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeployKeyEdgeResponseProjection = typename(null)

    fun typename(alias: String?): DeployKeyEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
