package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectColumnConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectColumnConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectColumnConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectColumnConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) + 1)
            this.nodes(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ProjectColumnEdgeResponseProjection): ProjectColumnConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ProjectColumnEdgeResponseProjection): ProjectColumnConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ProjectColumnResponseProjection): ProjectColumnConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ProjectColumnResponseProjection): ProjectColumnConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ProjectColumnConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ProjectColumnConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ProjectColumnConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ProjectColumnConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ProjectColumnConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectColumnConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
