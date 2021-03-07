package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TeamRepositoryEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TeamRepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    public TeamRepositoryEdgeResponseProjection() {
    }

    @Override
    public TeamRepositoryEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamRepositoryEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1);
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)));
        }
        this.permission();
        this.typename();
        return this;
    }

    public TeamRepositoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public TeamRepositoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public TeamRepositoryEdgeResponseProjection node(RepositoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public TeamRepositoryEdgeResponseProjection node(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public TeamRepositoryEdgeResponseProjection permission() {
        return permission(null);
    }

    public TeamRepositoryEdgeResponseProjection permission(String alias) {
        fields.add(new GraphQLResponseField("permission").alias(alias));
        return this;
    }

    public TeamRepositoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public TeamRepositoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
