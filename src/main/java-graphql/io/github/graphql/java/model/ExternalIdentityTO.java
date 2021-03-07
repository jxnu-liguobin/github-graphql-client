package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ExternalIdentityTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String guid;
    @javax.validation.constraints.NotNull
    private String id;
    private OrganizationInvitationTO organizationInvitation;
    private ExternalIdentitySamlAttributesTO samlIdentity;
    private ExternalIdentityScimAttributesTO scimIdentity;
    private UserTO user;

    public ExternalIdentityTO() {
    }

    public ExternalIdentityTO(String guid, String id, OrganizationInvitationTO organizationInvitation, ExternalIdentitySamlAttributesTO samlIdentity, ExternalIdentityScimAttributesTO scimIdentity, UserTO user) {
        this.guid = guid;
        this.id = id;
        this.organizationInvitation = organizationInvitation;
        this.samlIdentity = samlIdentity;
        this.scimIdentity = scimIdentity;
        this.user = user;
    }

    public String getGuid() {
        return guid;
    }

    public String getId() {
        return id;
    }

    public OrganizationInvitationTO getOrganizationInvitation() {
        return organizationInvitation;
    }

    public ExternalIdentitySamlAttributesTO getSamlIdentity() {
        return samlIdentity;
    }

    public ExternalIdentityScimAttributesTO getScimIdentity() {
        return scimIdentity;
    }

    public UserTO getUser() {
        return user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ExternalIdentityTO that = (ExternalIdentityTO) obj;
        return Objects.equals(guid, that.guid)
            && Objects.equals(id, that.id)
            && Objects.equals(organizationInvitation, that.organizationInvitation)
            && Objects.equals(samlIdentity, that.samlIdentity)
            && Objects.equals(scimIdentity, that.scimIdentity)
            && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, id, organizationInvitation, samlIdentity, scimIdentity, user);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (organizationInvitation != null) {
            joiner.add("organizationInvitation: " + GraphQLRequestSerializer.getEntry(organizationInvitation));
        }
        if (samlIdentity != null) {
            joiner.add("samlIdentity: " + GraphQLRequestSerializer.getEntry(samlIdentity));
        }
        if (scimIdentity != null) {
            joiner.add("scimIdentity: " + GraphQLRequestSerializer.getEntry(scimIdentity));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static ExternalIdentityTO.Builder builder() {
        return new ExternalIdentityTO.Builder();
    }

    public static class Builder {

        private String guid;
        private String id;
        private OrganizationInvitationTO organizationInvitation;
        private ExternalIdentitySamlAttributesTO samlIdentity;
        private ExternalIdentityScimAttributesTO scimIdentity;
        private UserTO user;

        public Builder() {
        }

        public Builder setGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setOrganizationInvitation(OrganizationInvitationTO organizationInvitation) {
            this.organizationInvitation = organizationInvitation;
            return this;
        }

        public Builder setSamlIdentity(ExternalIdentitySamlAttributesTO samlIdentity) {
            this.samlIdentity = samlIdentity;
            return this;
        }

        public Builder setScimIdentity(ExternalIdentityScimAttributesTO scimIdentity) {
            this.scimIdentity = scimIdentity;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public ExternalIdentityTO build() {
            return new ExternalIdentityTO(guid, id, organizationInvitation, samlIdentity, scimIdentity, user);
        }

    }
}
