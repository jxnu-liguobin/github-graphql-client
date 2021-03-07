package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) + 1)
            this.edges(new OrganizationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) + 1)
            this.nodes(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: OrganizationEdgeResponseProjection): OrganizationConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: OrganizationEdgeResponseProjection): OrganizationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: OrganizationResponseProjection): OrganizationConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: OrganizationResponseProjection): OrganizationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): OrganizationConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): OrganizationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): OrganizationConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): OrganizationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): OrganizationConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
