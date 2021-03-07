package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RegistryPackageTag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageTagResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageTagResponseProjection() {
    }

    @Override
    public RegistryPackageTagResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageTagResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1);
            this.version(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageTagResponseProjection id() {
        return id(null);
    }

    public RegistryPackageTagResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageTagResponseProjection name() {
        return name(null);
    }

    public RegistryPackageTagResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RegistryPackageTagResponseProjection version(RegistryPackageVersionResponseProjection subProjection) {
        return version(null, subProjection);
    }

    public RegistryPackageTagResponseProjection version(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("version").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageTagResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageTagResponseProjection typename(String alias) {
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
        final RegistryPackageTagResponseProjection that = (RegistryPackageTagResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
