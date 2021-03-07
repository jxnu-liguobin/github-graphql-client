package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueTimelineItemsEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTimelineItemsEdgeResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineItemsEdgeResponseProjection() {
    }

    @Override
    public IssueTimelineItemsEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineItemsEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0) + 1);
            this.node(new IssueTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsEdgeResponseProjection.IssueTimelineItemsResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public IssueTimelineItemsEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public IssueTimelineItemsEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public IssueTimelineItemsEdgeResponseProjection node(IssueTimelineItemsResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public IssueTimelineItemsEdgeResponseProjection node(String alias, IssueTimelineItemsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsEdgeResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineItemsEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
