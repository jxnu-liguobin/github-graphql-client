package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReactingUserEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReactingUserEdgeResponseProjection extends GraphQLResponseProjection {

    public ReactingUserEdgeResponseProjection() {
    }

    @Override
    public ReactingUserEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactingUserEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.reactedAt();
        this.typename();
        return this;
    }

    public ReactingUserEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReactingUserEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReactingUserEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReactingUserEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReactingUserEdgeResponseProjection reactedAt() {
        return reactedAt(null);
    }

    public ReactingUserEdgeResponseProjection reactedAt(String alias) {
        fields.add(new GraphQLResponseField("reactedAt").alias(alias));
        return this;
    }

    public ReactingUserEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReactingUserEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReactingUserEdgeResponseProjection that = (ReactingUserEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
