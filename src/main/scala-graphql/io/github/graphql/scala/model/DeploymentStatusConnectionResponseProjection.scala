package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentStatusConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeploymentStatusConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentStatusConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentStatusConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) + 1)
            this.edges(new DeploymentStatusEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) + 1)
            this.nodes(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: DeploymentStatusEdgeResponseProjection): DeploymentStatusConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: DeploymentStatusEdgeResponseProjection): DeploymentStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: DeploymentStatusResponseProjection): DeploymentStatusConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: DeploymentStatusResponseProjection): DeploymentStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): DeploymentStatusConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): DeploymentStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): DeploymentStatusConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): DeploymentStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): DeploymentStatusConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentStatusConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[DeploymentStatusConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
