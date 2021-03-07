package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationMemberEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class OrganizationMemberEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationMemberEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationMemberEdgeResponseProjection = {
        this.cursor()
        this.hasTwoFactorEnabled()
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.role()
        this.typename()
        this
    }

    def cursor(): OrganizationMemberEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): OrganizationMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def hasTwoFactorEnabled(): OrganizationMemberEdgeResponseProjection = {
        hasTwoFactorEnabled(null.asInstanceOf[String])
    }

    def hasTwoFactorEnabled(alias: String): OrganizationMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("hasTwoFactorEnabled").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): OrganizationMemberEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): OrganizationMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def role(): OrganizationMemberEdgeResponseProjection = {
        role(null.asInstanceOf[String])
    }

    def role(alias: String): OrganizationMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("role").alias(alias))
        this
    }

    def typename(): OrganizationMemberEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}