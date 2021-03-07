package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewDismissalAllowanceConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewDismissalAllowanceConnectionResponseProjection extends GraphQLResponseProjection {

    public ReviewDismissalAllowanceConnectionResponseProjection() {
    }

    @Override
    public ReviewDismissalAllowanceConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewDismissalAllowanceConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReviewDismissalAllowanceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) + 1);
            this.nodes(new ReviewDismissalAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ReviewDismissalAllowanceConnectionResponseProjection edges(ReviewDismissalAllowanceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReviewDismissalAllowanceConnectionResponseProjection edges(String alias, ReviewDismissalAllowanceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceConnectionResponseProjection nodes(ReviewDismissalAllowanceResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReviewDismissalAllowanceConnectionResponseProjection nodes(String alias, ReviewDismissalAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReviewDismissalAllowanceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReviewDismissalAllowanceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReviewDismissalAllowanceConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReviewDismissalAllowanceConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
