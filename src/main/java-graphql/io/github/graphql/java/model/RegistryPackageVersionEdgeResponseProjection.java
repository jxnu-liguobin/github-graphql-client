package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RegistryPackageVersionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionEdgeResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageVersionEdgeResponseProjection() {
    }

    @Override
    public RegistryPackageVersionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageVersionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) + 1);
            this.node(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageVersionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RegistryPackageVersionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RegistryPackageVersionEdgeResponseProjection node(RegistryPackageVersionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RegistryPackageVersionEdgeResponseProjection node(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionEdgeResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageVersionEdgeResponseProjection typename(String alias) {
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
        final RegistryPackageVersionEdgeResponseProjection that = (RegistryPackageVersionEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
