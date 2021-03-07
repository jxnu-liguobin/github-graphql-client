package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class OrganizationEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) + 1)
            this.node(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): OrganizationEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): OrganizationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: OrganizationResponseProjection): OrganizationEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: OrganizationResponseProjection): OrganizationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): OrganizationEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
