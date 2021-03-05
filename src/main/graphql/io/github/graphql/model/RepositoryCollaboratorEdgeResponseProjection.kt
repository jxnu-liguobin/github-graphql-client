package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryCollaboratorEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryCollaboratorEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryCollaboratorEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryCollaboratorEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources"] = projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) + 1
            this.permissionSources(PermissionSourceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RepositoryCollaboratorEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RepositoryCollaboratorEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): RepositoryCollaboratorEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): RepositoryCollaboratorEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun permission(): RepositoryCollaboratorEdgeResponseProjection = permission(null)

    fun permission(alias: String?): RepositoryCollaboratorEdgeResponseProjection {
        fields.add(GraphQLResponseField("permission").alias(alias))
        return this
    }

    fun permissionSources(subProjection: PermissionSourceResponseProjection): RepositoryCollaboratorEdgeResponseProjection = permissionSources(null, subProjection)

    fun permissionSources(alias: String?, subProjection: PermissionSourceResponseProjection): RepositoryCollaboratorEdgeResponseProjection {
        fields.add(GraphQLResponseField("permissionSources").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryCollaboratorEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryCollaboratorEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
