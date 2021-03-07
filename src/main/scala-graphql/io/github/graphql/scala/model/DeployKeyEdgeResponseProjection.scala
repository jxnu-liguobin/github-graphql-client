package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeployKeyEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeployKeyEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeployKeyEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeployKeyEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) + 1)
            this.node(new DeployKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): DeployKeyEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): DeployKeyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: DeployKeyResponseProjection): DeployKeyEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: DeployKeyResponseProjection): DeployKeyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeployKeyEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeployKeyEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[DeployKeyEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
