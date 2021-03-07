package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeploymentConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) + 1)
            this.edges(new DeploymentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) + 1)
            this.nodes(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: DeploymentEdgeResponseProjection): DeploymentConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: DeploymentEdgeResponseProjection): DeploymentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: DeploymentResponseProjection): DeploymentConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: DeploymentResponseProjection): DeploymentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): DeploymentConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): DeploymentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): DeploymentConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): DeploymentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): DeploymentConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
