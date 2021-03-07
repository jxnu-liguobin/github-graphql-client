package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueTimelineItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTimelineItemEdgeResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineItemEdgeResponseProjection() {
    }

    @Override
    public IssueTimelineItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) + 1);
            this.node(new IssueTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public IssueTimelineItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public IssueTimelineItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public IssueTimelineItemEdgeResponseProjection node(IssueTimelineItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public IssueTimelineItemEdgeResponseProjection node(String alias, IssueTimelineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
