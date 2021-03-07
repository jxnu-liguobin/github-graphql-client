package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedPullRequestReviewContributionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedPullRequestReviewContributionConnectionResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestReviewContributionConnectionResponseProjection() {
    }

    @Override
    public CreatedPullRequestReviewContributionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestReviewContributionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CreatedPullRequestReviewContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) + 1);
            this.nodes(new CreatedPullRequestReviewContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection edges(CreatedPullRequestReviewContributionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection edges(String alias, CreatedPullRequestReviewContributionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection nodes(CreatedPullRequestReviewContributionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection nodes(String alias, CreatedPullRequestReviewContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestReviewContributionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreatedPullRequestReviewContributionConnectionResponseProjection that = (CreatedPullRequestReviewContributionConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
