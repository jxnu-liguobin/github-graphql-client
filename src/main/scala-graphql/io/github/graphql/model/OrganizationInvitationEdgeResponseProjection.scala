package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationInvitationEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationInvitationEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationInvitationEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationInvitationEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) + 1)
            this.node(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): OrganizationInvitationEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): OrganizationInvitationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): OrganizationInvitationEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationInvitationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
