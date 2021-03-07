package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for StarredRepositoryConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class StarredRepositoryConnectionResponseProjection extends GraphQLResponseProjection {

    public StarredRepositoryConnectionResponseProjection() {
    }

    @Override
    public StarredRepositoryConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StarredRepositoryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new StarredRepositoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1);
            this.nodes(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public StarredRepositoryConnectionResponseProjection edges(StarredRepositoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public StarredRepositoryConnectionResponseProjection edges(String alias, StarredRepositoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public StarredRepositoryConnectionResponseProjection nodes(RepositoryResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public StarredRepositoryConnectionResponseProjection nodes(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public StarredRepositoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public StarredRepositoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public StarredRepositoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public StarredRepositoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public StarredRepositoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public StarredRepositoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
