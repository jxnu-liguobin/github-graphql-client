package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for OrganizationIdentityProvider
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationIdentityProviderResponseProjection extends GraphQLResponseProjection {

    public OrganizationIdentityProviderResponseProjection() {
    }

    @Override
    public OrganizationIdentityProviderResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationIdentityProviderResponseProjection all$(int maxDepth) {
        this.digestMethod();
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0) + 1);
            this.externalIdentities(new ExternalIdentityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.ExternalIdentityConnectionResponseProjection.externalIdentities", 0)));
        }
        this.id();
        this.idpCertificate();
        this.issuer();
        if (projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationIdentityProviderResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        this.signatureMethod();
        this.ssoUrl();
        this.typename();
        return this;
    }

    public OrganizationIdentityProviderResponseProjection digestMethod() {
        return digestMethod(null);
    }

    public OrganizationIdentityProviderResponseProjection digestMethod(String alias) {
        fields.add(new GraphQLResponseField("digestMethod").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection externalIdentities(ExternalIdentityConnectionResponseProjection subProjection) {
        return externalIdentities((String)null, subProjection);
    }

    public OrganizationIdentityProviderResponseProjection externalIdentities(String alias, ExternalIdentityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("externalIdentities").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection externalIdentities(OrganizationIdentityProviderExternalIdentitiesParametrizedInput input, ExternalIdentityConnectionResponseProjection subProjection) {
        return externalIdentities(null, input, subProjection);
    }

    public OrganizationIdentityProviderResponseProjection externalIdentities(String alias, OrganizationIdentityProviderExternalIdentitiesParametrizedInput input, ExternalIdentityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("externalIdentities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection id() {
        return id(null);
    }

    public OrganizationIdentityProviderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection idpCertificate() {
        return idpCertificate(null);
    }

    public OrganizationIdentityProviderResponseProjection idpCertificate(String alias) {
        fields.add(new GraphQLResponseField("idpCertificate").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection issuer() {
        return issuer(null);
    }

    public OrganizationIdentityProviderResponseProjection issuer(String alias) {
        fields.add(new GraphQLResponseField("issuer").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization(null, subProjection);
    }

    public OrganizationIdentityProviderResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection signatureMethod() {
        return signatureMethod(null);
    }

    public OrganizationIdentityProviderResponseProjection signatureMethod(String alias) {
        fields.add(new GraphQLResponseField("signatureMethod").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection ssoUrl() {
        return ssoUrl(null);
    }

    public OrganizationIdentityProviderResponseProjection ssoUrl(String alias) {
        fields.add(new GraphQLResponseField("ssoUrl").alias(alias));
        return this;
    }

    public OrganizationIdentityProviderResponseProjection typename() {
        return typename(null);
    }

    public OrganizationIdentityProviderResponseProjection typename(String alias) {
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
        final OrganizationIdentityProviderResponseProjection that = (OrganizationIdentityProviderResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
