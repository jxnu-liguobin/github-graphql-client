package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestReviewContributionsByRepositoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewContributionsByRepositoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewContributionsByRepositoryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions"] = projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0) + 1
            this.contributions(CreatedPullRequestReviewContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun contributions(subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = contributions(null, subProjection)

    fun contributions(alias: String?, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        return this
    }

    fun contributions(input: PullRequestReviewContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = contributions(null, input, subProjection)

    fun contributions(alias: String?, input: PullRequestReviewContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestReviewContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestReviewContributionsByRepositoryResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
