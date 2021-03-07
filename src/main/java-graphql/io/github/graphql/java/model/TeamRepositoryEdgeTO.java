package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamRepositoryEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private RepositoryTO node;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionTO permission;

    public TeamRepositoryEdgeTO() {
    }

    public TeamRepositoryEdgeTO(String cursor, RepositoryTO node, RepositoryPermissionTO permission) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
    }

    public String getCursor() {
        return cursor;
    }

    public RepositoryTO getNode() {
        return node;
    }

    public RepositoryPermissionTO getPermission() {
        return permission;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TeamRepositoryEdgeTO that = (TeamRepositoryEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(node, that.node)
            && Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, node, permission);
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
        return joiner.toString();
    }

    public static TeamRepositoryEdgeTO.Builder builder() {
        return new TeamRepositoryEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private RepositoryTO node;
        private RepositoryPermissionTO permission;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(RepositoryTO node) {
            this.node = node;
            return this;
        }

        public Builder setPermission(RepositoryPermissionTO permission) {
            this.permission = permission;
            return this;
        }


        public TeamRepositoryEdgeTO build() {
            return new TeamRepositoryEdgeTO(cursor, node, permission);
        }

    }
}
