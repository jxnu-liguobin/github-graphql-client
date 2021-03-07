package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeploymentEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentEdgeResponseProjection.DeploymentResponseProjection.node"] = projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) + 1
            this.node(DeploymentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): DeploymentEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): DeploymentEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: DeploymentResponseProjection): DeploymentEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: DeploymentResponseProjection): DeploymentEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeploymentEdgeResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentEdgeResponseProjection {
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
        val that = other as DeploymentEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
