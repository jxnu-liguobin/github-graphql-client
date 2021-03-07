package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageDependencyEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageDependencyEdgeResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageDependencyEdgeResponseProjection() {
    }

    @Override
    public RegistryPackageDependencyEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageDependencyEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) + 1);
            this.node(new RegistryPackageDependencyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageDependencyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RegistryPackageDependencyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RegistryPackageDependencyEdgeResponseProjection node(RegistryPackageDependencyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RegistryPackageDependencyEdgeResponseProjection node(String alias, RegistryPackageDependencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageDependencyEdgeResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageDependencyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
