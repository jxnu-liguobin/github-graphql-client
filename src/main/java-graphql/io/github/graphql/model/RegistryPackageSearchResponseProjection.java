package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageSearch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageSearchResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageSearchResponseProjection() {
    }

    @Override
    public RegistryPackageSearchResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageSearchResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1);
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageSearchResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageSearchResponseProjection id() {
        return id(null);
    }

    public RegistryPackageSearchResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageSearchResponseProjection registryPackagesForQuery(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery((String)null, subProjection);
    }

    public RegistryPackageSearchResponseProjection registryPackagesForQuery(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageSearchResponseProjection registryPackagesForQuery(RegistryPackageSearchRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery(null, input, subProjection);
    }

    public RegistryPackageSearchResponseProjection registryPackagesForQuery(String alias, RegistryPackageSearchRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageSearchResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public RegistryPackageSearchResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageSearchResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public RegistryPackageSearchResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageSearchResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageSearchResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
