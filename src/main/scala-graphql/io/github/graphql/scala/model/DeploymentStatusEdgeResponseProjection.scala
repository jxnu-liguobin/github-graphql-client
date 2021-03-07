package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentStatusEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeploymentStatusEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentStatusEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentStatusEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) + 1)
            this.node(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): DeploymentStatusEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): DeploymentStatusEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: DeploymentStatusResponseProjection): DeploymentStatusEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: DeploymentStatusResponseProjection): DeploymentStatusEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeploymentStatusEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentStatusEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[DeploymentStatusEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
