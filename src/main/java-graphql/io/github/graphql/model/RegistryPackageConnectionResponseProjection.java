package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageConnectionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageConnectionResponseProjection() {
    }

    @Override
    public RegistryPackageConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RegistryPackageEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) + 1);
            this.nodes(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RegistryPackageConnectionResponseProjection edges(RegistryPackageEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RegistryPackageConnectionResponseProjection edges(String alias, RegistryPackageEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageConnectionResponseProjection nodes(RegistryPackageResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RegistryPackageConnectionResponseProjection nodes(String alias, RegistryPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RegistryPackageConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegistryPackageConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegistryPackageConnectionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
