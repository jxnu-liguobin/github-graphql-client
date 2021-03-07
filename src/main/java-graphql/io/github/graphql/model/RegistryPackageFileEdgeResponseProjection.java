package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageFileEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageFileEdgeResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageFileEdgeResponseProjection() {
    }

    @Override
    public RegistryPackageFileEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageFileEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) + 1);
            this.node(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageFileEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RegistryPackageFileEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RegistryPackageFileEdgeResponseProjection node(RegistryPackageFileResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RegistryPackageFileEdgeResponseProjection node(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageFileEdgeResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageFileEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
