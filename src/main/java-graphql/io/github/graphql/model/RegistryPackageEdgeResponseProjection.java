package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageEdgeResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageEdgeResponseProjection() {
    }

    @Override
    public RegistryPackageEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) + 1);
            this.node(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RegistryPackageEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RegistryPackageEdgeResponseProjection node(RegistryPackageResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RegistryPackageEdgeResponseProjection node(String alias, RegistryPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageEdgeResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
