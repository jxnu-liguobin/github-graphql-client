package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Contribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionResponseProjection = {
        this.isRestricted()
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def isRestricted(): ContributionResponseProjection = {
        isRestricted(null.asInstanceOf[String])
    }

    def isRestricted(alias: String): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias))
        this
    }

    def occurredAt(): ContributionResponseProjection = {
        occurredAt(null.asInstanceOf[String])
    }

    def occurredAt(alias: String): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias))
        this
    }

    def resourcePath(): ContributionResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): ContributionResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): ContributionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): ContributionResponseProjection = {
        onRestrictedContribution(null.asInstanceOf[String], subProjection)
    }

    def onRestrictedContribution(alias: String, subProjection: RestrictedContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedPullRequestReviewContribution(subProjection: CreatedPullRequestReviewContributionResponseProjection): ContributionResponseProjection = {
        onCreatedPullRequestReviewContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedPullRequestReviewContribution(alias: String, subProjection: CreatedPullRequestReviewContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestReviewContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedRepositoryContribution(subProjection: CreatedRepositoryContributionResponseProjection): ContributionResponseProjection = {
        onCreatedRepositoryContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedRepositoryContribution(alias: String, subProjection: CreatedRepositoryContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedCommitContribution(subProjection: CreatedCommitContributionResponseProjection): ContributionResponseProjection = {
        onCreatedCommitContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedCommitContribution(alias: String, subProjection: CreatedCommitContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedCommitContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedIssueContribution(subProjection: CreatedIssueContributionResponseProjection): ContributionResponseProjection = {
        onCreatedIssueContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedIssueContribution(alias: String, subProjection: CreatedIssueContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection))
        this
    }

    def onJoinedGitHubContribution(subProjection: JoinedGitHubContributionResponseProjection): ContributionResponseProjection = {
        onJoinedGitHubContribution(null.asInstanceOf[String], subProjection)
    }

    def onJoinedGitHubContribution(alias: String, subProjection: JoinedGitHubContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on JoinedGitHubContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): ContributionResponseProjection = {
        onCreatedPullRequestContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedPullRequestContribution(alias: String, subProjection: CreatedPullRequestContributionResponseProjection): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection))
        this
    }

    def typename(): ContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
