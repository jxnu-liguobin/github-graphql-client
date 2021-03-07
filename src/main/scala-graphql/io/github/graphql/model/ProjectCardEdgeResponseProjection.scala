package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCardEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectCardEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectCardEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectCardEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) + 1)
            this.node(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ProjectCardEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ProjectCardEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ProjectCardResponseProjection): ProjectCardEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ProjectCardResponseProjection): ProjectCardEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProjectCardEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectCardEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
