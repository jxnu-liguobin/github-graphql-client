package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
