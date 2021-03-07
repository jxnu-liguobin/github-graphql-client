package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestContributionsByRepositoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestContributionsByRepositoryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) + 1)
            this.contributions(new CreatedPullRequestContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def contributions(subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], subProjection)
    }

    def contributions(alias: String, subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        this
    }

    def contributions(input: PullRequestContributionsByRepositoryContributionsParametrizedInput,subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], input, subProjection)
    }

    def contributions(alias: String, input: PullRequestContributionsByRepositoryContributionsParametrizedInput , subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestContributionsByRepositoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
