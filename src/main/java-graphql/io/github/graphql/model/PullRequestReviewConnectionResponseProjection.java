package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReviewConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewConnectionResponseProjection() {
    }

    @Override
    public PullRequestReviewConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestReviewEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestReviewConnectionResponseProjection edges(PullRequestReviewEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestReviewConnectionResponseProjection edges(String alias, PullRequestReviewEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewConnectionResponseProjection nodes(PullRequestReviewResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestReviewConnectionResponseProjection nodes(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestReviewConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestReviewConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestReviewConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
