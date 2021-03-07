package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReviewContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewContributionsByRepositoryResponseProjection() {
    }

    @Override
    public PullRequestReviewContributionsByRepositoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewContributionsByRepositoryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) + 1);
            this.contributions(new CreatedPullRequestReviewContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection contributions(CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        return contributions((String)null, subProjection);
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection contributions(String alias, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection contributions(PullRequestReviewContributionsByRepositoryContributionsParametrizedInput input, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        return contributions(null, input, subProjection);
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection contributions(String alias, PullRequestReviewContributionsByRepositoryContributionsParametrizedInput input, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewContributionsByRepositoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
