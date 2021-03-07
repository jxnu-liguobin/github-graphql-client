package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ExternalIdentity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ExternalIdentityResponseProjection extends GraphQLResponseProjection {

    public ExternalIdentityResponseProjection() {
    }

    @Override
    public ExternalIdentityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalIdentityResponseProjection all$(int maxDepth) {
        this.guid();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0) + 1);
            this.organizationInvitation(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.OrganizationInvitationResponseProjection.organizationInvitation", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0) + 1);
            this.samlIdentity(new ExternalIdentitySamlAttributesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentitySamlAttributesResponseProjection.samlIdentity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0) + 1);
            this.scimIdentity(new ExternalIdentityScimAttributesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.ExternalIdentityScimAttributesResponseProjection.scimIdentity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ExternalIdentityResponseProjection guid() {
        return guid(null);
    }

    public ExternalIdentityResponseProjection guid(String alias) {
        fields.add(new GraphQLResponseField("guid").alias(alias));
        return this;
    }

    public ExternalIdentityResponseProjection id() {
        return id(null);
    }

    public ExternalIdentityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExternalIdentityResponseProjection organizationInvitation(OrganizationInvitationResponseProjection subProjection) {
        return organizationInvitation(null, subProjection);
    }

    public ExternalIdentityResponseProjection organizationInvitation(String alias, OrganizationInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organizationInvitation").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityResponseProjection samlIdentity(ExternalIdentitySamlAttributesResponseProjection subProjection) {
        return samlIdentity(null, subProjection);
    }

    public ExternalIdentityResponseProjection samlIdentity(String alias, ExternalIdentitySamlAttributesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("samlIdentity").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityResponseProjection scimIdentity(ExternalIdentityScimAttributesResponseProjection subProjection) {
        return scimIdentity(null, subProjection);
    }

    public ExternalIdentityResponseProjection scimIdentity(String alias, ExternalIdentityScimAttributesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("scimIdentity").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ExternalIdentityResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityResponseProjection typename() {
        return typename(null);
    }

    public ExternalIdentityResponseProjection typename(String alias) {
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
        final ExternalIdentityResponseProjection that = (ExternalIdentityResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
