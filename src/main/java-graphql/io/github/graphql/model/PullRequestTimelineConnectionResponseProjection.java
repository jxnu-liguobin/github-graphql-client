package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestTimelineConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestTimelineConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineConnectionResponseProjection() {
    }

    @Override
    public PullRequestTimelineConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PullRequestTimelineItemResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestTimelineConnectionResponseProjection edges(PullRequestTimelineItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestTimelineConnectionResponseProjection edges(String alias, PullRequestTimelineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineConnectionResponseProjection nodes(PullRequestTimelineItemResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestTimelineConnectionResponseProjection nodes(String alias, PullRequestTimelineItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestTimelineConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestTimelineConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestTimelineConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
