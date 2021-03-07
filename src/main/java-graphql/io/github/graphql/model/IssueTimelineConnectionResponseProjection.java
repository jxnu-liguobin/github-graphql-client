package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueTimelineConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTimelineConnectionResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineConnectionResponseProjection() {
    }

    @Override
    public IssueTimelineConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new IssueTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0) + 1);
            this.nodes(new IssueTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.IssueTimelineItemResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public IssueTimelineConnectionResponseProjection edges(IssueTimelineItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public IssueTimelineConnectionResponseProjection edges(String alias, IssueTimelineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineConnectionResponseProjection nodes(IssueTimelineItemResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public IssueTimelineConnectionResponseProjection nodes(String alias, IssueTimelineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public IssueTimelineConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public IssueTimelineConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public IssueTimelineConnectionResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
