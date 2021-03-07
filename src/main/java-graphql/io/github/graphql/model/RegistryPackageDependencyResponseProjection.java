package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageDependency
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageDependencyResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageDependencyResponseProjection() {
    }

    @Override
    public RegistryPackageDependencyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageDependencyResponseProjection all$(int maxDepth) {
        this.dependencyType();
        this.id();
        this.name();
        this.version();
        this.typename();
        return this;
    }

    public RegistryPackageDependencyResponseProjection dependencyType() {
        return dependencyType(null);
    }

    public RegistryPackageDependencyResponseProjection dependencyType(String alias) {
        fields.add(new GraphQLResponseField("dependencyType").alias(alias));
        return this;
    }

    public RegistryPackageDependencyResponseProjection id() {
        return id(null);
    }

    public RegistryPackageDependencyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageDependencyResponseProjection name() {
        return name(null);
    }

    public RegistryPackageDependencyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RegistryPackageDependencyResponseProjection version() {
        return version(null);
    }

    public RegistryPackageDependencyResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public RegistryPackageDependencyResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageDependencyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
