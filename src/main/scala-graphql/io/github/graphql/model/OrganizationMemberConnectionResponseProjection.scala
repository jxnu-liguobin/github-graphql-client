package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationMemberConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationMemberConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationMemberConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationMemberConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) + 1)
            this.edges(new OrganizationMemberEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: OrganizationMemberEdgeResponseProjection): OrganizationMemberConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: OrganizationMemberEdgeResponseProjection): OrganizationMemberConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): OrganizationMemberConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): OrganizationMemberConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): OrganizationMemberConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): OrganizationMemberConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): OrganizationMemberConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): OrganizationMemberConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): OrganizationMemberConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationMemberConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
