package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for OrganizationMemberEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationMemberEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationMemberEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationMemberEdgeResponseProjection {
        this.cursor()
        this.hasTwoFactorEnabled()
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationMemberEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.role()
        this.typename()
        return this
    }

    fun cursor(): OrganizationMemberEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): OrganizationMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun hasTwoFactorEnabled(): OrganizationMemberEdgeResponseProjection = hasTwoFactorEnabled(null)

    fun hasTwoFactorEnabled(alias: String?): OrganizationMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("hasTwoFactorEnabled").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): OrganizationMemberEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): OrganizationMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun role(): OrganizationMemberEdgeResponseProjection = role(null)

    fun role(alias: String?): OrganizationMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("role").alias(alias))
        return this
    }

    fun typename(): OrganizationMemberEdgeResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
