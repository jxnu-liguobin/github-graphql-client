package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectColumnEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ProjectColumnEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectColumnEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectColumnEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) + 1)
            this.node(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ProjectColumnEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ProjectColumnEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ProjectColumnResponseProjection): ProjectColumnEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ProjectColumnResponseProjection): ProjectColumnEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProjectColumnEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectColumnEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[ProjectColumnEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
