package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PermissionSourceTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrganizationTO organization;
    @javax.validation.constraints.NotNull
    private DefaultRepositoryPermissionFieldTO permission;
    @javax.validation.constraints.NotNull
    private PermissionGranterTO source;

    public PermissionSourceTO() {
    }

    public PermissionSourceTO(OrganizationTO organization, DefaultRepositoryPermissionFieldTO permission, PermissionGranterTO source) {
        this.organization = organization;
        this.permission = permission;
        this.source = source;
    }

    public OrganizationTO getOrganization() {
        return organization;
    }

    public DefaultRepositoryPermissionFieldTO getPermission() {
        return permission;
    }

    public PermissionGranterTO getSource() {
        return source;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PermissionSourceTO that = (PermissionSourceTO) obj;
        return Objects.equals(organization, that.organization)
            && Objects.equals(permission, that.permission)
            && Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, permission, source);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization));
        }
        if (permission != null) {
            joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission));
        }
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        return joiner.toString();
    }

    public static PermissionSourceTO.Builder builder() {
        return new PermissionSourceTO.Builder();
    }

    public static class Builder {

        private OrganizationTO organization;
        private DefaultRepositoryPermissionFieldTO permission;
        private PermissionGranterTO source;

        public Builder() {
        }

        public Builder setOrganization(OrganizationTO organization) {
            this.organization = organization;
            return this;
        }

        public Builder setPermission(DefaultRepositoryPermissionFieldTO permission) {
            this.permission = permission;
            return this;
        }

        public Builder setSource(PermissionGranterTO source) {
            this.source = source;
            return this;
        }


        public PermissionSourceTO build() {
            return new PermissionSourceTO(organization, permission, source);
        }

    }
}
