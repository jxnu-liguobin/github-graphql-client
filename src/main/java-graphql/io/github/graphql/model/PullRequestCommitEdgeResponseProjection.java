package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestCommitEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestCommitEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestCommitEdgeResponseProjection() {
    }

    @Override
    public PullRequestCommitEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestCommitEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) + 1);
            this.node(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestCommitEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestCommitEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestCommitEdgeResponseProjection node(PullRequestCommitResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestCommitEdgeResponseProjection node(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestCommitEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
