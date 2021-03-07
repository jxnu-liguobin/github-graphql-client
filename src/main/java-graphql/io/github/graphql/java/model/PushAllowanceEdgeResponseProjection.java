package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PushAllowanceEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PushAllowanceEdgeResponseProjection extends GraphQLResponseProjection {

    public PushAllowanceEdgeResponseProjection() {
    }

    @Override
    public PushAllowanceEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PushAllowanceEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) + 1);
            this.node(new PushAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PushAllowanceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PushAllowanceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PushAllowanceEdgeResponseProjection node(PushAllowanceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PushAllowanceEdgeResponseProjection node(String alias, PushAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceEdgeResponseProjection typename() {
        return typename(null);
    }

    public PushAllowanceEdgeResponseProjection typename(String alias) {
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
        final PushAllowanceEdgeResponseProjection that = (PushAllowanceEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
