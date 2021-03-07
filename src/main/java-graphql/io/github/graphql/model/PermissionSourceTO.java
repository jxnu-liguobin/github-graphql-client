package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
