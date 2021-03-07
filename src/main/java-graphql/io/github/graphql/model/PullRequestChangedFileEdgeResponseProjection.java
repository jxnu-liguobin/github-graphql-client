package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestChangedFileEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestChangedFileEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestChangedFileEdgeResponseProjection() {
    }

    @Override
    public PullRequestChangedFileEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestChangedFileEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) + 1);
            this.node(new PullRequestChangedFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestChangedFileEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestChangedFileEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestChangedFileEdgeResponseProjection node(PullRequestChangedFileResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestChangedFileEdgeResponseProjection node(String alias, PullRequestChangedFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestChangedFileEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestChangedFileEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
