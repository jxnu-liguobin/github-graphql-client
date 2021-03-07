package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for OrganizationInvitationConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class OrganizationInvitationConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationInvitationConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationInvitationConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) + 1)
            this.edges(new OrganizationInvitationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) + 1)
            this.nodes(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: OrganizationInvitationEdgeResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: OrganizationInvitationEdgeResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): OrganizationInvitationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): OrganizationInvitationConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): OrganizationInvitationConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): OrganizationInvitationConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationInvitationConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[OrganizationInvitationConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
