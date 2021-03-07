package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestTimelineItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestTimelineItemEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineItemEdgeResponseProjection() {
    }

    @Override
    public PullRequestTimelineItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) + 1);
            this.node(new PullRequestTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestTimelineItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestTimelineItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestTimelineItemEdgeResponseProjection node(PullRequestTimelineItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestTimelineItemEdgeResponseProjection node(String alias, PullRequestTimelineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
