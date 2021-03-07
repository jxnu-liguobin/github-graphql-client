package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedPullRequestReviewContributionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatedPullRequestReviewContributionEdgeResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestReviewContributionEdgeResponseProjection() {
    }

    @Override
    public CreatedPullRequestReviewContributionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestReviewContributionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) + 1);
            this.node(new CreatedPullRequestReviewContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection node(CreatedPullRequestReviewContributionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection node(String alias, CreatedPullRequestReviewContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestReviewContributionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
