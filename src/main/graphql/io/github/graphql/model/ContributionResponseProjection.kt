package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Contribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): ContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): ContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): ContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): ContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun resourcePath(): ContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): ContributionResponseProjection = url(null)

    fun url(alias: String?): ContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): ContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): ContributionResponseProjection = onRestrictedContribution(null, subProjection)

    fun onRestrictedContribution(alias: String?, subProjection: RestrictedContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedPullRequestReviewContribution(subProjection: CreatedPullRequestReviewContributionResponseProjection): ContributionResponseProjection = onCreatedPullRequestReviewContribution(null, subProjection)

    fun onCreatedPullRequestReviewContribution(alias: String?, subProjection: CreatedPullRequestReviewContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedPullRequestReviewContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedRepositoryContribution(subProjection: CreatedRepositoryContributionResponseProjection): ContributionResponseProjection = onCreatedRepositoryContribution(null, subProjection)

    fun onCreatedRepositoryContribution(alias: String?, subProjection: CreatedRepositoryContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedCommitContribution(subProjection: CreatedCommitContributionResponseProjection): ContributionResponseProjection = onCreatedCommitContribution(null, subProjection)

    fun onCreatedCommitContribution(alias: String?, subProjection: CreatedCommitContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedCommitContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedIssueContribution(subProjection: CreatedIssueContributionResponseProjection): ContributionResponseProjection = onCreatedIssueContribution(null, subProjection)

    fun onCreatedIssueContribution(alias: String?, subProjection: CreatedIssueContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onJoinedGitHubContribution(subProjection: JoinedGitHubContributionResponseProjection): ContributionResponseProjection = onJoinedGitHubContribution(null, subProjection)

    fun onJoinedGitHubContribution(alias: String?, subProjection: JoinedGitHubContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on JoinedGitHubContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): ContributionResponseProjection = onCreatedPullRequestContribution(null, subProjection)

    fun onCreatedPullRequestContribution(alias: String?, subProjection: CreatedPullRequestContributionResponseProjection): ContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ContributionResponseProjection = typename(null)

    fun typename(alias: String?): ContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
