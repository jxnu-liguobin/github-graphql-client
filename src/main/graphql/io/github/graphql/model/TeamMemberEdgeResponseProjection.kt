package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TeamMemberEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamMemberEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamMemberEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamMemberEdgeResponseProjection {
        this.cursor()
        this.memberAccessResourcePath()
        this.memberAccessUrl()
        if (projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["TeamMemberEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.role()
        this.typename()
        return this
    }

    fun cursor(): TeamMemberEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun memberAccessResourcePath(): TeamMemberEdgeResponseProjection = memberAccessResourcePath(null)

    fun memberAccessResourcePath(alias: String?): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("memberAccessResourcePath").alias(alias))
        return this
    }

    fun memberAccessUrl(): TeamMemberEdgeResponseProjection = memberAccessUrl(null)

    fun memberAccessUrl(alias: String?): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("memberAccessUrl").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): TeamMemberEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun role(): TeamMemberEdgeResponseProjection = role(null)

    fun role(alias: String?): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("role").alias(alias))
        return this
    }

    fun typename(): TeamMemberEdgeResponseProjection = typename(null)

    fun typename(alias: String?): TeamMemberEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
