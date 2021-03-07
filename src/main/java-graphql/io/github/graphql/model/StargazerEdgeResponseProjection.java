package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for StargazerEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class StargazerEdgeResponseProjection extends GraphQLResponseProjection {

    public StargazerEdgeResponseProjection() {
    }

    @Override
    public StargazerEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StargazerEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.starredAt();
        this.typename();
        return this;
    }

    public StargazerEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public StargazerEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public StargazerEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public StargazerEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public StargazerEdgeResponseProjection starredAt() {
        return starredAt(null);
    }

    public StargazerEdgeResponseProjection starredAt(String alias) {
        fields.add(new GraphQLResponseField("starredAt").alias(alias));
        return this;
    }

    public StargazerEdgeResponseProjection typename() {
        return typename(null);
    }

    public StargazerEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
