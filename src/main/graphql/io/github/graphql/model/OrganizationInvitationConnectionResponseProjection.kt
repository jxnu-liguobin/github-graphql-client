package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationInvitationConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationInvitationConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationInvitationConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationInvitationConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) + 1
            this.edges(OrganizationInvitationEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) + 1
            this.nodes(OrganizationInvitationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: OrganizationInvitationEdgeResponseProjection): OrganizationInvitationConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: OrganizationInvitationEdgeResponseProjection): OrganizationInvitationConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: OrganizationInvitationResponseProjection): OrganizationInvitationConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): OrganizationInvitationConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): OrganizationInvitationConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): OrganizationInvitationConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): OrganizationInvitationConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): OrganizationInvitationConnectionResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationInvitationConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
