package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReactionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReactionEdgeResponseProjection extends GraphQLResponseProjection {

    public ReactionEdgeResponseProjection() {
    }

    @Override
    public ReactionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionEdgeResponseProjection.ReactionResponseProjection.node", projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0) + 1);
            this.node(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionEdgeResponseProjection.ReactionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReactionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReactionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReactionEdgeResponseProjection node(ReactionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReactionEdgeResponseProjection node(String alias, ReactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReactionEdgeResponseProjection typename(String alias) {
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
        final ReactionEdgeResponseProjection that = (ReactionEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
