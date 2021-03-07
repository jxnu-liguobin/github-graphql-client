package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryConnectionResponseProjection extends GraphQLResponseProjection {

    public RepositoryConnectionResponseProjection() {
    }

    @Override
    public RepositoryConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RepositoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1);
            this.nodes(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.totalDiskUsage();
        this.typename();
        return this;
    }

    public RepositoryConnectionResponseProjection edges(RepositoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RepositoryConnectionResponseProjection edges(String alias, RepositoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryConnectionResponseProjection nodes(RepositoryResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RepositoryConnectionResponseProjection nodes(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RepositoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RepositoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RepositoryConnectionResponseProjection totalDiskUsage() {
        return totalDiskUsage(null);
    }

    public RepositoryConnectionResponseProjection totalDiskUsage(String alias) {
        fields.add(new GraphQLResponseField("totalDiskUsage").alias(alias));
        return this;
    }

    public RepositoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public RepositoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
