package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectEdgeResponseProjection.ProjectResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) + 1)
            this.node(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ProjectEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ProjectEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ProjectResponseProjection): ProjectEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ProjectResponseProjection): ProjectEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProjectEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
