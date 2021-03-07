package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PermissionSource
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PermissionSourceResponseProjection extends GraphQLResponseProjection {

    public PermissionSourceResponseProjection() {
    }

    @Override
    public PermissionSourceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PermissionSourceResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        this.permission();
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) + 1);
            this.source(new PermissionGranterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0)));
        }
        this.typename();
        return this;
    }

    public PermissionSourceResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization(null, subProjection);
    }

    public PermissionSourceResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSourceResponseProjection permission() {
        return permission(null);
    }

    public PermissionSourceResponseProjection permission(String alias) {
        fields.add(new GraphQLResponseField("permission").alias(alias));
        return this;
    }

    public PermissionSourceResponseProjection source(PermissionGranterResponseProjection subProjection) {
        return source(null, subProjection);
    }

    public PermissionSourceResponseProjection source(String alias, PermissionGranterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSourceResponseProjection typename() {
        return typename(null);
    }

    public PermissionSourceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
