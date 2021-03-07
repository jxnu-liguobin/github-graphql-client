package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrganizationInvitation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationInvitationResponseProjection extends GraphQLResponseProjection {

    public OrganizationInvitationResponseProjection() {
    }

    @Override
    public OrganizationInvitationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationInvitationResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.email();
        this.id();
        this.invitationType();
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1);
            this.invitee(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.invitee", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1);
            this.inviter(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.UserResponseProjection.inviter", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        this.role();
        this.typename();
        return this;
    }

    public OrganizationInvitationResponseProjection createdAt() {
        return createdAt(null);
    }

    public OrganizationInvitationResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public OrganizationInvitationResponseProjection email() {
        return email(null);
    }

    public OrganizationInvitationResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public OrganizationInvitationResponseProjection id() {
        return id(null);
    }

    public OrganizationInvitationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrganizationInvitationResponseProjection invitationType() {
        return invitationType(null);
    }

    public OrganizationInvitationResponseProjection invitationType(String alias) {
        fields.add(new GraphQLResponseField("invitationType").alias(alias));
        return this;
    }

    public OrganizationInvitationResponseProjection invitee(UserResponseProjection subProjection) {
        return invitee(null, subProjection);
    }

    public OrganizationInvitationResponseProjection invitee(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("invitee").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationResponseProjection inviter(UserResponseProjection subProjection) {
        return inviter(null, subProjection);
    }

    public OrganizationInvitationResponseProjection inviter(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inviter").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization(null, subProjection);
    }

    public OrganizationInvitationResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationResponseProjection role() {
        return role(null);
    }

    public OrganizationInvitationResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public OrganizationInvitationResponseProjection typename() {
        return typename(null);
    }

    public OrganizationInvitationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
