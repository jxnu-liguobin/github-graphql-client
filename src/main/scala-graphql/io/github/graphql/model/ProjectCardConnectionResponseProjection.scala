package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCardConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectCardConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectCardConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectCardConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) + 1)
            this.nodes(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ProjectCardEdgeResponseProjection): ProjectCardConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ProjectCardEdgeResponseProjection): ProjectCardConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ProjectCardResponseProjection): ProjectCardConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ProjectCardResponseProjection): ProjectCardConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ProjectCardConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ProjectCardConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ProjectCardConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ProjectCardConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ProjectCardConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectCardConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
