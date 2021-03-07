package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageOwnerResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageOwnerResponseProjection() {
    }

    @Override
    public RegistryPackageOwnerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageOwnerResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1);
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageOwnerResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageOwnerResponseProjection id() {
        return id(null);
    }

    public RegistryPackageOwnerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageOwnerResponseProjection registryPackages(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages((String)null, subProjection);
    }

    public RegistryPackageOwnerResponseProjection registryPackages(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageOwnerResponseProjection registryPackages(RegistryPackageOwnerRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages(null, input, subProjection);
    }

    public RegistryPackageOwnerResponseProjection registryPackages(String alias, RegistryPackageOwnerRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageOwnerResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public RegistryPackageOwnerResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageOwnerResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public RegistryPackageOwnerResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageOwnerResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public RegistryPackageOwnerResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageOwnerResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageOwnerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
