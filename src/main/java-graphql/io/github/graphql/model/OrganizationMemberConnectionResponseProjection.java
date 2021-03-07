package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrganizationMemberConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationMemberConnectionResponseProjection extends GraphQLResponseProjection {

    public OrganizationMemberConnectionResponseProjection() {
    }

    @Override
    public OrganizationMemberConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationMemberConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrganizationMemberEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public OrganizationMemberConnectionResponseProjection edges(OrganizationMemberEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrganizationMemberConnectionResponseProjection edges(String alias, OrganizationMemberEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationMemberConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public OrganizationMemberConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationMemberConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrganizationMemberConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationMemberConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public OrganizationMemberConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public OrganizationMemberConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrganizationMemberConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
