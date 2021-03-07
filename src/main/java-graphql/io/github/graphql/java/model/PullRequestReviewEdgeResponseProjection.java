package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestReviewEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewEdgeResponseProjection() {
    }

    @Override
    public PullRequestReviewEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) + 1);
            this.node(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestReviewEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestReviewEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestReviewEdgeResponseProjection node(PullRequestReviewResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestReviewEdgeResponseProjection node(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewEdgeResponseProjection typename(String alias) {
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
        final PullRequestReviewEdgeResponseProjection that = (PullRequestReviewEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
