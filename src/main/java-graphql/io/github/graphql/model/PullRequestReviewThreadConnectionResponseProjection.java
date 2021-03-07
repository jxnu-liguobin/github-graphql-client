package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewThreadConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestReviewThreadConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewThreadConnectionResponseProjection() {
    }

    @Override
    public PullRequestReviewThreadConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewThreadConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestReviewThreadEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestReviewThreadConnectionResponseProjection edges(PullRequestReviewThreadEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestReviewThreadConnectionResponseProjection edges(String alias, PullRequestReviewThreadEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadConnectionResponseProjection nodes(PullRequestReviewThreadResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestReviewThreadConnectionResponseProjection nodes(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestReviewThreadConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewThreadConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestReviewThreadConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestReviewThreadConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewThreadConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
