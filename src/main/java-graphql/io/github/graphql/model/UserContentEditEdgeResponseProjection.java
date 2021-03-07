package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserContentEditEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserContentEditEdgeResponseProjection extends GraphQLResponseProjection {

    public UserContentEditEdgeResponseProjection() {
    }

    @Override
    public UserContentEditEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserContentEditEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0) + 1);
            this.node(new UserContentEditResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditEdgeResponseProjection.UserContentEditResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public UserContentEditEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserContentEditEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UserContentEditEdgeResponseProjection node(UserContentEditResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserContentEditEdgeResponseProjection node(String alias, UserContentEditResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditEdgeResponseProjection typename() {
        return typename(null);
    }

    public UserContentEditEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
