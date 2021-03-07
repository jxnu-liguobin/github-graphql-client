package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for StarredRepositoryEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class StarredRepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    public StarredRepositoryEdgeResponseProjection() {
    }

    @Override
    public StarredRepositoryEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StarredRepositoryEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1);
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)));
        }
        this.starredAt();
        this.typename();
        return this;
    }

    public StarredRepositoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public StarredRepositoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public StarredRepositoryEdgeResponseProjection node(RepositoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public StarredRepositoryEdgeResponseProjection node(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public StarredRepositoryEdgeResponseProjection starredAt() {
        return starredAt(null);
    }

    public StarredRepositoryEdgeResponseProjection starredAt(String alias) {
        fields.add(new GraphQLResponseField("starredAt").alias(alias));
        return this;
    }

    public StarredRepositoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public StarredRepositoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
