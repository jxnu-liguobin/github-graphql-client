package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RepositoryCollaboratorEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryCollaboratorEdgeResponseProjection extends GraphQLResponseProjection {

    public RepositoryCollaboratorEdgeResponseProjection() {
    }

    @Override
    public RepositoryCollaboratorEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryCollaboratorEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.permission();
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0) + 1);
            this.permissionSources(new PermissionSourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorEdgeResponseProjection.PermissionSourceResponseProjection.permissionSources", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryCollaboratorEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RepositoryCollaboratorEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RepositoryCollaboratorEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RepositoryCollaboratorEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryCollaboratorEdgeResponseProjection permission() {
        return permission(null);
    }

    public RepositoryCollaboratorEdgeResponseProjection permission(String alias) {
        fields.add(new GraphQLResponseField("permission").alias(alias));
        return this;
    }

    public RepositoryCollaboratorEdgeResponseProjection permissionSources(PermissionSourceResponseProjection subProjection) {
        return permissionSources(null, subProjection);
    }

    public RepositoryCollaboratorEdgeResponseProjection permissionSources(String alias, PermissionSourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissionSources").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryCollaboratorEdgeResponseProjection typename() {
        return typename(null);
    }

    public RepositoryCollaboratorEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryCollaboratorEdgeResponseProjection that = (RepositoryCollaboratorEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
