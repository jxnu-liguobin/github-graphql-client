package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeploymentEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) + 1)
            this.node(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): DeploymentEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): DeploymentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: DeploymentResponseProjection): DeploymentEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: DeploymentResponseProjection): DeploymentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeploymentEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}