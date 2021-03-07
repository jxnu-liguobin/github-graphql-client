package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrganizationInvitationEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationInvitationEdgeResponseProjection extends GraphQLResponseProjection {

    public OrganizationInvitationEdgeResponseProjection() {
    }

    @Override
    public OrganizationInvitationEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationInvitationEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0) + 1);
            this.node(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationEdgeResponseProjection.OrganizationInvitationResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public OrganizationInvitationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrganizationInvitationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrganizationInvitationEdgeResponseProjection node(OrganizationInvitationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrganizationInvitationEdgeResponseProjection node(String alias, OrganizationInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrganizationInvitationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
