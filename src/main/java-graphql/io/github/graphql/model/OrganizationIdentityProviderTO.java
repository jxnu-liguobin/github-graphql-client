package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationIdentityProviderTO implements java.io.Serializable, NodeTO {

    private String digestMethod;
    @javax.validation.constraints.NotNull
    private String id;
    private String idpCertificate;
    private String issuer;
    private OrganizationTO organization;
    private String signatureMethod;
    private String ssoUrl;

    public OrganizationIdentityProviderTO() {
    }

    public OrganizationIdentityProviderTO(String digestMethod, String id, String idpCertificate, String issuer, OrganizationTO organization, String signatureMethod, String ssoUrl) {
        this.digestMethod = digestMethod;
        this.id = id;
        this.idpCertificate = idpCertificate;
        this.issuer = issuer;
        this.organization = organization;
        this.signatureMethod = signatureMethod;
        this.ssoUrl = ssoUrl;
    }

    public String getDigestMethod() {
        return digestMethod;
    }

    public String getId() {
        return id;
    }

    public String getIdpCertificate() {
        return idpCertificate;
    }

    public String getIssuer() {
        return issuer;
    }

    public OrganizationTO getOrganization() {
        return organization;
    }

    public String getSignatureMethod() {
        return signatureMethod;
    }

    public String getSsoUrl() {
        return ssoUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (digestMethod != null) {
            joiner.add("digestMethod: " + GraphQLRequestSerializer.getEntry(digestMethod));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (idpCertificate != null) {
            joiner.add("idpCertificate: " + GraphQLRequestSerializer.getEntry(idpCertificate));
        }
        if (issuer != null) {
            joiner.add("issuer: " + GraphQLRequestSerializer.getEntry(issuer));
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization));
        }
        if (signatureMethod != null) {
            joiner.add("signatureMethod: " + GraphQLRequestSerializer.getEntry(signatureMethod));
        }
        if (ssoUrl != null) {
            joiner.add("ssoUrl: " + GraphQLRequestSerializer.getEntry(ssoUrl));
        }
        return joiner.toString();
    }

    public static OrganizationIdentityProviderTO.Builder builder() {
        return new OrganizationIdentityProviderTO.Builder();
    }

    public static class Builder {

        private String digestMethod;
        private String id;
        private String idpCertificate;
        private String issuer;
        private OrganizationTO organization;
        private String signatureMethod;
        private String ssoUrl;

        public Builder() {
        }

        public Builder setDigestMethod(String digestMethod) {
            this.digestMethod = digestMethod;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIdpCertificate(String idpCertificate) {
            this.idpCertificate = idpCertificate;
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder setOrganization(OrganizationTO organization) {
            this.organization = organization;
            return this;
        }

        public Builder setSignatureMethod(String signatureMethod) {
            this.signatureMethod = signatureMethod;
            return this;
        }

        public Builder setSsoUrl(String ssoUrl) {
            this.ssoUrl = ssoUrl;
            return this;
        }


        public OrganizationIdentityProviderTO build() {
            return new OrganizationIdentityProviderTO(digestMethod, id, idpCertificate, issuer, organization, signatureMethod, ssoUrl);
        }

    }
}
