package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for OrganizationEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationEdgeResponseProjection extends GraphQLResponseProjection {

    public OrganizationEdgeResponseProjection() {
    }

    @Override
    public OrganizationEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) + 1);
            this.node(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public OrganizationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrganizationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrganizationEdgeResponseProjection node(OrganizationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrganizationEdgeResponseProjection node(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrganizationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
