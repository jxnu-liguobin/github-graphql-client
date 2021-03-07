package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryCollaboratorEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryCollaboratorEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryCollaboratorEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryCollaboratorEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) + 1)
            this.permissionSources(new PermissionSourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RepositoryCollaboratorEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RepositoryCollaboratorEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): RepositoryCollaboratorEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): RepositoryCollaboratorEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def permission(): RepositoryCollaboratorEdgeResponseProjection = {
        permission(null.asInstanceOf[String])
    }

    def permission(alias: String): RepositoryCollaboratorEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("permission").alias(alias))
        this
    }

    def permissionSources(subProjection: PermissionSourceResponseProjection): RepositoryCollaboratorEdgeResponseProjection = {
        permissionSources(null.asInstanceOf[String], subProjection)
    }

    def permissionSources(alias: String, subProjection: PermissionSourceResponseProjection): RepositoryCollaboratorEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("permissionSources").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryCollaboratorEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryCollaboratorEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RepositoryCollaboratorEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
