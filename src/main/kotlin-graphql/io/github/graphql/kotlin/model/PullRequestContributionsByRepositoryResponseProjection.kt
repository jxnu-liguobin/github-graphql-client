package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestContributionsByRepositoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestContributionsByRepositoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestContributionsByRepositoryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions"] = projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) + 1
            this.contributions(CreatedPullRequestContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun contributions(subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = contributions(null, subProjection)

    fun contributions(alias: String?, subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        return this
    }

    fun contributions(input: PullRequestContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection = contributions(null, input, subProjection)

    fun contributions(alias: String?, input: PullRequestContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedPullRequestContributionConnectionResponseProjection): PullRequestContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestContributionsByRepositoryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestContributionsByRepositoryResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PullRequestContributionsByRepositoryResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
