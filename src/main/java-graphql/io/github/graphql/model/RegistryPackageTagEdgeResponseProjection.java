package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageTagEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageTagEdgeResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageTagEdgeResponseProjection() {
    }

    @Override
    public RegistryPackageTagEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageTagEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0) + 1);
            this.node(new RegistryPackageTagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageTagEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RegistryPackageTagEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RegistryPackageTagEdgeResponseProjection node(RegistryPackageTagResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RegistryPackageTagEdgeResponseProjection node(String alias, RegistryPackageTagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageTagEdgeResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageTagEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
