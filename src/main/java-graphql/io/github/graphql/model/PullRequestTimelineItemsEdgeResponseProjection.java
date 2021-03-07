package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestTimelineItemsEdgeResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineItemsEdgeResponseProjection() {
    }

    @Override
    public PullRequestTimelineItemsEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineItemsEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0) + 1);
            this.node(new PullRequestTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsEdgeResponseProjection.PullRequestTimelineItemsResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestTimelineItemsEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PullRequestTimelineItemsEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PullRequestTimelineItemsEdgeResponseProjection node(PullRequestTimelineItemsResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PullRequestTimelineItemsEdgeResponseProjection node(String alias, PullRequestTimelineItemsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsEdgeResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineItemsEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
