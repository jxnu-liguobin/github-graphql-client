package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationInvitationTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private OrganizationInvitationTypeTO invitationType;
    private UserTO invitee;
    @javax.validation.constraints.NotNull
    private UserTO inviter;
    @javax.validation.constraints.NotNull
    private OrganizationTO organization;
    @javax.validation.constraints.NotNull
    private OrganizationInvitationRoleTO role;

    public OrganizationInvitationTO() {
    }

    public OrganizationInvitationTO(String createdAt, String email, String id, OrganizationInvitationTypeTO invitationType, UserTO invitee, UserTO inviter, OrganizationTO organization, OrganizationInvitationRoleTO role) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.invitationType = invitationType;
        this.invitee = invitee;
        this.inviter = inviter;
        this.organization = organization;
        this.role = role;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public OrganizationInvitationTypeTO getInvitationType() {
        return invitationType;
    }

    public UserTO getInvitee() {
        return invitee;
    }

    public UserTO getInviter() {
        return inviter;
    }

    public OrganizationTO getOrganization() {
        return organization;
    }

    public OrganizationInvitationRoleTO getRole() {
        return role;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (invitationType != null) {
            joiner.add("invitationType: " + GraphQLRequestSerializer.getEntry(invitationType));
        }
        if (invitee != null) {
            joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee));
        }
        if (inviter != null) {
            joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter));
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

    public static OrganizationInvitationTO.Builder builder() {
        return new OrganizationInvitationTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String email;
        private String id;
        private OrganizationInvitationTypeTO invitationType;
        private UserTO invitee;
        private UserTO inviter;
        private OrganizationTO organization;
        private OrganizationInvitationRoleTO role;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInvitationType(OrganizationInvitationTypeTO invitationType) {
            this.invitationType = invitationType;
            return this;
        }

        public Builder setInvitee(UserTO invitee) {
            this.invitee = invitee;
            return this;
        }

        public Builder setInviter(UserTO inviter) {
            this.inviter = inviter;
            return this;
        }

        public Builder setOrganization(OrganizationTO organization) {
            this.organization = organization;
            return this;
        }

        public Builder setRole(OrganizationInvitationRoleTO role) {
            this.role = role;
            return this;
        }


        public OrganizationInvitationTO build() {
            return new OrganizationInvitationTO(createdAt, email, id, invitationType, invitee, inviter, organization, role);
        }

    }
}
