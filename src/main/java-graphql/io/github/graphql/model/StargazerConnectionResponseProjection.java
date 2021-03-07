package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for StargazerConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class StargazerConnectionResponseProjection extends GraphQLResponseProjection {

    public StargazerConnectionResponseProjection() {
    }

    @Override
    public StargazerConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StargazerConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) + 1);
            this.edges(new StargazerEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public StargazerConnectionResponseProjection edges(StargazerEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public StargazerConnectionResponseProjection edges(String alias, StargazerEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public StargazerConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public StargazerConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public StargazerConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public StargazerConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public StargazerConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public StargazerConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public StargazerConnectionResponseProjection typename() {
        return typename(null);
    }

    public StargazerConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
