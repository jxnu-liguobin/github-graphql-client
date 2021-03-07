package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestReviewContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedPullRequestReviewContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestReviewContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestReviewContributionResponseProjection = {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def isRestricted(): CreatedPullRequestReviewContributionResponseProjection = {
        isRestricted(null.asInstanceOf[String])
    }

    def isRestricted(alias: String): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias))
        this
    }

    def occurredAt(): CreatedPullRequestReviewContributionResponseProjection = {
        occurredAt(null.asInstanceOf[String])
    }

    def occurredAt(alias: String): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CreatedPullRequestReviewContributionResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): CreatedPullRequestReviewContributionResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedPullRequestReviewContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestReviewContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
