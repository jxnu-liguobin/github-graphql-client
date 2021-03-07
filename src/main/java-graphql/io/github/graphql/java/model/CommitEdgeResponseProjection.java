package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CommitEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CommitEdgeResponseProjection extends GraphQLResponseProjection {

    public CommitEdgeResponseProjection() {
    }

    @Override
    public CommitEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitEdgeResponseProjection.CommitResponseProjection.node", projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) + 1);
            this.node(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CommitEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CommitEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CommitEdgeResponseProjection node(CommitResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CommitEdgeResponseProjection node(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CommitEdgeResponseProjection typename() {
        return typename(null);
    }

    public CommitEdgeResponseProjection typename(String alias) {
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
        final CommitEdgeResponseProjection that = (CommitEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
