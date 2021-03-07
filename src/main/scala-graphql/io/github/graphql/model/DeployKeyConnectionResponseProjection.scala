package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeployKeyConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeployKeyConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeployKeyConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeployKeyConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) + 1)
            this.edges(new DeployKeyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) + 1)
            this.nodes(new DeployKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: DeployKeyEdgeResponseProjection): DeployKeyConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: DeployKeyEdgeResponseProjection): DeployKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: DeployKeyResponseProjection): DeployKeyConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: DeployKeyResponseProjection): DeployKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): DeployKeyConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): DeployKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): DeployKeyConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): DeployKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): DeployKeyConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeployKeyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
