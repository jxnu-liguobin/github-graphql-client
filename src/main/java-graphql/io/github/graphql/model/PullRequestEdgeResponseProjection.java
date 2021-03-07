package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestEdgeResponseProjection() {
    }

    @Override
    public PullRequestEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) + 1);
            this.node(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestEdgeResponseProjection node(PullRequestResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestEdgeResponseProjection node(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
