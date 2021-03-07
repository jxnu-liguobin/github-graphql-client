package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ProjectEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) + 1)
            this.nodes(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ProjectEdgeResponseProjection): ProjectConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ProjectEdgeResponseProjection): ProjectConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ProjectResponseProjection): ProjectConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ProjectResponseProjection): ProjectConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ProjectConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ProjectConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ProjectConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ProjectConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ProjectConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
