package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserEdgeResponseProjection extends GraphQLResponseProjection {

    public UserEdgeResponseProjection() {
    }

    @Override
    public UserEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public UserEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UserEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserEdgeResponseProjection typename() {
        return typename(null);
    }

    public UserEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
