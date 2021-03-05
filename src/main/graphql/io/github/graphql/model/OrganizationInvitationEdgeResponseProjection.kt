package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationInvitationEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationInvitationEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationInvitationEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationInvitationEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) + 1
            this.node(OrganizationInvitationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): OrganizationInvitationEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): OrganizationInvitationEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): OrganizationInvitationEdgeResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationInvitationEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
