package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageFileConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageFileConnectionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageFileConnectionResponseProjection() {
    }

    @Override
    public RegistryPackageFileConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageFileConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RegistryPackageFileEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) + 1);
            this.nodes(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RegistryPackageFileConnectionResponseProjection edges(RegistryPackageFileEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RegistryPackageFileConnectionResponseProjection edges(String alias, RegistryPackageFileEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageFileConnectionResponseProjection nodes(RegistryPackageFileResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RegistryPackageFileConnectionResponseProjection nodes(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageFileConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RegistryPackageFileConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageFileConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegistryPackageFileConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegistryPackageFileConnectionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageFileConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
