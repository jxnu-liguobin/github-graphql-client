package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationMemberEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private Boolean hasTwoFactorEnabled;
    private UserTO node;
    private OrganizationMemberRoleTO role;

    public OrganizationMemberEdgeTO() {
    }

    public OrganizationMemberEdgeTO(String cursor, Boolean hasTwoFactorEnabled, UserTO node, OrganizationMemberRoleTO role) {
        this.cursor = cursor;
        this.hasTwoFactorEnabled = hasTwoFactorEnabled;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }

    public Boolean getHasTwoFactorEnabled() {
        return hasTwoFactorEnabled;
    }

    public UserTO getNode() {
        return node;
    }

    public OrganizationMemberRoleTO getRole() {
        return role;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final OrganizationMemberEdgeTO that = (OrganizationMemberEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(hasTwoFactorEnabled, that.hasTwoFactorEnabled)
            && Objects.equals(node, that.node)
            && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, hasTwoFactorEnabled, node, role);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (hasTwoFactorEnabled != null) {
            joiner.add("hasTwoFactorEnabled: " + GraphQLRequestSerializer.getEntry(hasTwoFactorEnabled));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

    public static OrganizationMemberEdgeTO.Builder builder() {
        return new OrganizationMemberEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private Boolean hasTwoFactorEnabled;
        private UserTO node;
        private OrganizationMemberRoleTO role;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setHasTwoFactorEnabled(Boolean hasTwoFactorEnabled) {
            this.hasTwoFactorEnabled = hasTwoFactorEnabled;
            return this;
        }

        public Builder setNode(UserTO node) {
            this.node = node;
            return this;
        }

        public Builder setRole(OrganizationMemberRoleTO role) {
            this.role = role;
            return this;
        }


        public OrganizationMemberEdgeTO build() {
            return new OrganizationMemberEdgeTO(cursor, hasTwoFactorEnabled, node, role);
        }

    }
}
