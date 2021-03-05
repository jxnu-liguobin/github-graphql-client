package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationEdgeResponseProjection.OrganizationResponseProjection.node"] = projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) + 1
            this.node(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): OrganizationEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): OrganizationEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: OrganizationResponseProjection): OrganizationEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: OrganizationResponseProjection): OrganizationEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): OrganizationEdgeResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
