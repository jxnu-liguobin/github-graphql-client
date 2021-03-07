package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    public RepositoryEdgeResponseProjection() {
    }

    @Override
    public RepositoryEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1);
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RepositoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RepositoryEdgeResponseProjection node(RepositoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RepositoryEdgeResponseProjection node(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public RepositoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
