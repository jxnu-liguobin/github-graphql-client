package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryCollaboratorEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserTO node;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionTO permission;
    @javax.validation.constraints.NotNull
    private java.util.List<PermissionSourceTO> permissionSources;

    public RepositoryCollaboratorEdgeTO() {
    }

    public RepositoryCollaboratorEdgeTO(String cursor, UserTO node, RepositoryPermissionTO permission, java.util.List<PermissionSourceTO> permissionSources) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
        this.permissionSources = permissionSources;
    }

    public String getCursor() {
        return cursor;
    }

    public UserTO getNode() {
        return node;
    }

    public RepositoryPermissionTO getPermission() {
        return permission;
    }

    public java.util.List<PermissionSourceTO> getPermissionSources() {
        return permissionSources;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryCollaboratorEdgeTO that = (RepositoryCollaboratorEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(node, that.node)
            && Objects.equals(permission, that.permission)
            && Objects.equals(permissionSources, that.permissionSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, node, permission, permissionSources);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (permission != null) {
            joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission));
        }
        if (permissionSources != null) {
            joiner.add("permissionSources: " + GraphQLRequestSerializer.getEntry(permissionSources));
        }
        return joiner.toString();
    }

    public static RepositoryCollaboratorEdgeTO.Builder builder() {
        return new RepositoryCollaboratorEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private UserTO node;
        private RepositoryPermissionTO permission;
        private java.util.List<PermissionSourceTO> permissionSources;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(UserTO node) {
            this.node = node;
            return this;
        }

        public Builder setPermission(RepositoryPermissionTO permission) {
            this.permission = permission;
            return this;
        }

        public Builder setPermissionSources(java.util.List<PermissionSourceTO> permissionSources) {
            this.permissionSources = permissionSources;
            return this;
        }


        public RepositoryCollaboratorEdgeTO build() {
            return new RepositoryCollaboratorEdgeTO(cursor, node, permission, permissionSources);
        }

    }
}
