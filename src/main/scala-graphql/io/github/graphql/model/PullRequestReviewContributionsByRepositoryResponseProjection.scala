package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestReviewContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewContributionsByRepositoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewContributionsByRepositoryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) + 1)
            this.contributions(new CreatedPullRequestReviewContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def contributions(subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], subProjection)
    }

    def contributions(alias: String, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        this
    }

    def contributions(input: PullRequestReviewContributionsByRepositoryContributionsParametrizedInput,subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], input, subProjection)
    }

    def contributions(alias: String, input: PullRequestReviewContributionsByRepositoryContributionsParametrizedInput , subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestReviewContributionsByRepositoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
