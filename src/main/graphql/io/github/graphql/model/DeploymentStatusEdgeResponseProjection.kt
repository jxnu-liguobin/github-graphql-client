package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentStatusEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeploymentStatusEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentStatusEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentStatusEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node"] = projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) + 1
            this.node(DeploymentStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): DeploymentStatusEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): DeploymentStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: DeploymentStatusResponseProjection): DeploymentStatusEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: DeploymentStatusResponseProjection): DeploymentStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeploymentStatusEdgeResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentStatusEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
