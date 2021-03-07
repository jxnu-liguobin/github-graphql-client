package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageTagConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageTagConnectionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageTagConnectionResponseProjection() {
    }

    @Override
    public RegistryPackageTagConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageTagConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RegistryPackageTagEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) + 1);
            this.nodes(new RegistryPackageTagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RegistryPackageTagConnectionResponseProjection edges(RegistryPackageTagEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RegistryPackageTagConnectionResponseProjection edges(String alias, RegistryPackageTagEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageTagConnectionResponseProjection nodes(RegistryPackageTagResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RegistryPackageTagConnectionResponseProjection nodes(String alias, RegistryPackageTagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageTagConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RegistryPackageTagConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageTagConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegistryPackageTagConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegistryPackageTagConnectionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageTagConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
