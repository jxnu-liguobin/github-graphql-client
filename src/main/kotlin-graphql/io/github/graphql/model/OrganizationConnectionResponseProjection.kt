package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) + 1
            this.edges(OrganizationEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) + 1
            this.nodes(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: OrganizationEdgeResponseProjection): OrganizationConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: OrganizationEdgeResponseProjection): OrganizationConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: OrganizationResponseProjection): OrganizationConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: OrganizationResponseProjection): OrganizationConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): OrganizationConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): OrganizationConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): OrganizationConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): OrganizationConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): OrganizationConnectionResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
