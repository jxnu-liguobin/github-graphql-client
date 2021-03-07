package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestReviewContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedPullRequestReviewContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestReviewContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestReviewContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): CreatedPullRequestReviewContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): CreatedPullRequestReviewContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): CreatedPullRequestReviewContributionResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): CreatedPullRequestReviewContributionResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CreatedPullRequestReviewContributionResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CreatedPullRequestReviewContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CreatedPullRequestReviewContributionResponseProjection = url(null)

    fun url(alias: String?): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): CreatedPullRequestReviewContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedPullRequestReviewContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestReviewContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
