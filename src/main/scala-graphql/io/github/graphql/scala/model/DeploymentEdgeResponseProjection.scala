package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeploymentEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
