package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrganizationInvitationConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class OrganizationInvitationConnectionResponseProjection extends GraphQLResponseProjection {

    public OrganizationInvitationConnectionResponseProjection() {
    }

    @Override
    public OrganizationInvitationConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationInvitationConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrganizationInvitationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0) + 1);
            this.nodes(new OrganizationInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.OrganizationInvitationResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationInvitationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public OrganizationInvitationConnectionResponseProjection edges(OrganizationInvitationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrganizationInvitationConnectionResponseProjection edges(String alias, OrganizationInvitationEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationConnectionResponseProjection nodes(OrganizationInvitationResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public OrganizationInvitationConnectionResponseProjection nodes(String alias, OrganizationInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrganizationInvitationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationInvitationConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public OrganizationInvitationConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public OrganizationInvitationConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrganizationInvitationConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
