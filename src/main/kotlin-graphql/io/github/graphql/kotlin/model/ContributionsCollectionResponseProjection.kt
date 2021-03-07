package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ContributionsCollectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionsCollectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionsCollectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) + 1
            this.commitContributionsByRepository(CommitContributionsByRepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) + 1
            this.contributionCalendar(ContributionCalendarResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0)))
        }
        this.contributionYears()
        this.doesEndInCurrentMonth()
        this.earliestRestrictedContributionDate()
        this.endedAt()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) + 1
            this.firstIssueContribution(CreatedIssueOrRestrictedContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) + 1
            this.firstPullRequestContribution(CreatedPullRequestOrRestrictedContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) + 1
            this.firstRepositoryContribution(CreatedRepositoryOrRestrictedContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0)))
        }
        this.hasActivityInThePast()
        this.hasAnyContributions()
        this.hasAnyRestrictedContributions()
        this.isSingleDay()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) + 1
            this.issueContributions(CreatedIssueContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) + 1
            this.issueContributionsByRepository(IssueContributionsByRepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) + 1
            this.joinedGitHubContribution(JoinedGitHubContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0)))
        }
        this.latestRestrictedContributionDate()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) + 1
            this.mostRecentCollectionWithActivity(ContributionsCollectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) + 1
            this.mostRecentCollectionWithoutActivity(ContributionsCollectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) + 1
            this.popularIssueContribution(CreatedIssueContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) + 1
            this.popularPullRequestContribution(CreatedPullRequestContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) + 1
            this.pullRequestContributions(CreatedPullRequestContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) + 1
            this.pullRequestContributionsByRepository(PullRequestContributionsByRepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) + 1
            this.pullRequestReviewContributions(CreatedPullRequestReviewContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) + 1
            this.pullRequestReviewContributionsByRepository(PullRequestReviewContributionsByRepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) + 1
            this.repositoryContributions(CreatedRepositoryContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0)))
        }
        this.restrictedContributionsCount()
        this.startedAt()
        this.totalCommitContributions()
        this.totalIssueContributions()
        this.totalPullRequestContributions()
        this.totalPullRequestReviewContributions()
        this.totalRepositoriesWithContributedCommits()
        this.totalRepositoriesWithContributedIssues()
        this.totalRepositoriesWithContributedPullRequestReviews()
        this.totalRepositoriesWithContributedPullRequests()
        this.totalRepositoryContributions()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionsCollectionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun commitContributionsByRepository(subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = commitContributionsByRepository(null, subProjection)

    fun commitContributionsByRepository(alias: String?, subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("commitContributionsByRepository").alias(alias).projection(subProjection))
        return this
    }

    fun commitContributionsByRepository(input: ContributionsCollectionCommitContributionsByRepositoryParametrizedInput, subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = commitContributionsByRepository(null, input, subProjection)

    fun commitContributionsByRepository(alias: String?, input: ContributionsCollectionCommitContributionsByRepositoryParametrizedInput, subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("commitContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun contributionCalendar(subProjection: ContributionCalendarResponseProjection): ContributionsCollectionResponseProjection = contributionCalendar(null, subProjection)

    fun contributionCalendar(alias: String?, subProjection: ContributionCalendarResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("contributionCalendar").alias(alias).projection(subProjection))
        return this
    }

    fun contributionYears(): ContributionsCollectionResponseProjection = contributionYears(null)

    fun contributionYears(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("contributionYears").alias(alias))
        return this
    }

    fun doesEndInCurrentMonth(): ContributionsCollectionResponseProjection = doesEndInCurrentMonth(null)

    fun doesEndInCurrentMonth(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("doesEndInCurrentMonth").alias(alias))
        return this
    }

    fun earliestRestrictedContributionDate(): ContributionsCollectionResponseProjection = earliestRestrictedContributionDate(null)

    fun earliestRestrictedContributionDate(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("earliestRestrictedContributionDate").alias(alias))
        return this
    }

    fun endedAt(): ContributionsCollectionResponseProjection = endedAt(null)

    fun endedAt(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("endedAt").alias(alias))
        return this
    }

    fun firstIssueContribution(subProjection: CreatedIssueOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = firstIssueContribution(null, subProjection)

    fun firstIssueContribution(alias: String?, subProjection: CreatedIssueOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("firstIssueContribution").alias(alias).projection(subProjection))
        return this
    }

    fun firstPullRequestContribution(subProjection: CreatedPullRequestOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = firstPullRequestContribution(null, subProjection)

    fun firstPullRequestContribution(alias: String?, subProjection: CreatedPullRequestOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("firstPullRequestContribution").alias(alias).projection(subProjection))
        return this
    }

    fun firstRepositoryContribution(subProjection: CreatedRepositoryOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = firstRepositoryContribution(null, subProjection)

    fun firstRepositoryContribution(alias: String?, subProjection: CreatedRepositoryOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("firstRepositoryContribution").alias(alias).projection(subProjection))
        return this
    }

    fun hasActivityInThePast(): ContributionsCollectionResponseProjection = hasActivityInThePast(null)

    fun hasActivityInThePast(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("hasActivityInThePast").alias(alias))
        return this
    }

    fun hasAnyContributions(): ContributionsCollectionResponseProjection = hasAnyContributions(null)

    fun hasAnyContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("hasAnyContributions").alias(alias))
        return this
    }

    fun hasAnyRestrictedContributions(): ContributionsCollectionResponseProjection = hasAnyRestrictedContributions(null)

    fun hasAnyRestrictedContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("hasAnyRestrictedContributions").alias(alias))
        return this
    }

    fun isSingleDay(): ContributionsCollectionResponseProjection = isSingleDay(null)

    fun isSingleDay(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("isSingleDay").alias(alias))
        return this
    }

    fun issueContributions(subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = issueContributions(null, subProjection)

    fun issueContributions(alias: String?, subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("issueContributions").alias(alias).projection(subProjection))
        return this
    }

    fun issueContributions(input: ContributionsCollectionIssueContributionsParametrizedInput, subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = issueContributions(null, input, subProjection)

    fun issueContributions(alias: String?, input: ContributionsCollectionIssueContributionsParametrizedInput, subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("issueContributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun issueContributionsByRepository(subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = issueContributionsByRepository(null, subProjection)

    fun issueContributionsByRepository(alias: String?, subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("issueContributionsByRepository").alias(alias).projection(subProjection))
        return this
    }

    fun issueContributionsByRepository(input: ContributionsCollectionIssueContributionsByRepositoryParametrizedInput, subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = issueContributionsByRepository(null, input, subProjection)

    fun issueContributionsByRepository(alias: String?, input: ContributionsCollectionIssueContributionsByRepositoryParametrizedInput, subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("issueContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun joinedGitHubContribution(subProjection: JoinedGitHubContributionResponseProjection): ContributionsCollectionResponseProjection = joinedGitHubContribution(null, subProjection)

    fun joinedGitHubContribution(alias: String?, subProjection: JoinedGitHubContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("joinedGitHubContribution").alias(alias).projection(subProjection))
        return this
    }

    fun latestRestrictedContributionDate(): ContributionsCollectionResponseProjection = latestRestrictedContributionDate(null)

    fun latestRestrictedContributionDate(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("latestRestrictedContributionDate").alias(alias))
        return this
    }

    fun mostRecentCollectionWithActivity(subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = mostRecentCollectionWithActivity(null, subProjection)

    fun mostRecentCollectionWithActivity(alias: String?, subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("mostRecentCollectionWithActivity").alias(alias).projection(subProjection))
        return this
    }

    fun mostRecentCollectionWithoutActivity(subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = mostRecentCollectionWithoutActivity(null, subProjection)

    fun mostRecentCollectionWithoutActivity(alias: String?, subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("mostRecentCollectionWithoutActivity").alias(alias).projection(subProjection))
        return this
    }

    fun popularIssueContribution(subProjection: CreatedIssueContributionResponseProjection): ContributionsCollectionResponseProjection = popularIssueContribution(null, subProjection)

    fun popularIssueContribution(alias: String?, subProjection: CreatedIssueContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("popularIssueContribution").alias(alias).projection(subProjection))
        return this
    }

    fun popularPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): ContributionsCollectionResponseProjection = popularPullRequestContribution(null, subProjection)

    fun popularPullRequestContribution(alias: String?, subProjection: CreatedPullRequestContributionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("popularPullRequestContribution").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestContributions(subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = pullRequestContributions(null, subProjection)

    fun pullRequestContributions(alias: String?, subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestContributions").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestContributions(input: ContributionsCollectionPullRequestContributionsParametrizedInput, subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = pullRequestContributions(null, input, subProjection)

    fun pullRequestContributions(alias: String?, input: ContributionsCollectionPullRequestContributionsParametrizedInput, subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestContributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pullRequestContributionsByRepository(subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = pullRequestContributionsByRepository(null, subProjection)

    fun pullRequestContributionsByRepository(alias: String?, subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestContributionsByRepository(input: ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput, subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = pullRequestContributionsByRepository(null, input, subProjection)

    fun pullRequestContributionsByRepository(alias: String?, input: ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput, subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pullRequestReviewContributions(subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = pullRequestReviewContributions(null, subProjection)

    fun pullRequestReviewContributions(alias: String?, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReviewContributions").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestReviewContributions(input: ContributionsCollectionPullRequestReviewContributionsParametrizedInput, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = pullRequestReviewContributions(null, input, subProjection)

    fun pullRequestReviewContributions(alias: String?, input: ContributionsCollectionPullRequestReviewContributionsParametrizedInput, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReviewContributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pullRequestReviewContributionsByRepository(subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = pullRequestReviewContributionsByRepository(null, subProjection)

    fun pullRequestReviewContributionsByRepository(alias: String?, subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestReviewContributionsByRepository(input: ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput, subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = pullRequestReviewContributionsByRepository(null, input, subProjection)

    fun pullRequestReviewContributionsByRepository(alias: String?, input: ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput, subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositoryContributions(subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = repositoryContributions(null, subProjection)

    fun repositoryContributions(alias: String?, subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("repositoryContributions").alias(alias).projection(subProjection))
        return this
    }

    fun repositoryContributions(input: ContributionsCollectionRepositoryContributionsParametrizedInput, subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = repositoryContributions(null, input, subProjection)

    fun repositoryContributions(alias: String?, input: ContributionsCollectionRepositoryContributionsParametrizedInput, subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("repositoryContributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun restrictedContributionsCount(): ContributionsCollectionResponseProjection = restrictedContributionsCount(null)

    fun restrictedContributionsCount(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("restrictedContributionsCount").alias(alias))
        return this
    }

    fun startedAt(): ContributionsCollectionResponseProjection = startedAt(null)

    fun startedAt(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("startedAt").alias(alias))
        return this
    }

    fun totalCommitContributions(): ContributionsCollectionResponseProjection = totalCommitContributions(null)

    fun totalCommitContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalCommitContributions").alias(alias))
        return this
    }

    fun totalIssueContributions(): ContributionsCollectionResponseProjection = totalIssueContributions(null)

    fun totalIssueContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalIssueContributions").alias(alias))
        return this
    }

    fun totalIssueContributions(input: ContributionsCollectionTotalIssueContributionsParametrizedInput): ContributionsCollectionResponseProjection = totalIssueContributions(null, input)

    fun totalIssueContributions(alias: String?, input: ContributionsCollectionTotalIssueContributionsParametrizedInput): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalIssueContributions").alias(alias).parameters(input))
        return this
    }

    fun totalPullRequestContributions(): ContributionsCollectionResponseProjection = totalPullRequestContributions(null)

    fun totalPullRequestContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalPullRequestContributions").alias(alias))
        return this
    }

    fun totalPullRequestContributions(input: ContributionsCollectionTotalPullRequestContributionsParametrizedInput): ContributionsCollectionResponseProjection = totalPullRequestContributions(null, input)

    fun totalPullRequestContributions(alias: String?, input: ContributionsCollectionTotalPullRequestContributionsParametrizedInput): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalPullRequestContributions").alias(alias).parameters(input))
        return this
    }

    fun totalPullRequestReviewContributions(): ContributionsCollectionResponseProjection = totalPullRequestReviewContributions(null)

    fun totalPullRequestReviewContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalPullRequestReviewContributions").alias(alias))
        return this
    }

    fun totalRepositoriesWithContributedCommits(): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedCommits(null)

    fun totalRepositoriesWithContributedCommits(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedCommits").alias(alias))
        return this
    }

    fun totalRepositoriesWithContributedIssues(): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedIssues(null)

    fun totalRepositoriesWithContributedIssues(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias))
        return this
    }

    fun totalRepositoriesWithContributedIssues(input: ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedIssues(null, input)

    fun totalRepositoriesWithContributedIssues(alias: String?, input: ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias).parameters(input))
        return this
    }

    fun totalRepositoriesWithContributedPullRequestReviews(): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedPullRequestReviews(null)

    fun totalRepositoriesWithContributedPullRequestReviews(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedPullRequestReviews").alias(alias))
        return this
    }

    fun totalRepositoriesWithContributedPullRequests(): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedPullRequests(null)

    fun totalRepositoriesWithContributedPullRequests(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias))
        return this
    }

    fun totalRepositoriesWithContributedPullRequests(input: ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput): ContributionsCollectionResponseProjection = totalRepositoriesWithContributedPullRequests(null, input)

    fun totalRepositoriesWithContributedPullRequests(alias: String?, input: ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias).parameters(input))
        return this
    }

    fun totalRepositoryContributions(): ContributionsCollectionResponseProjection = totalRepositoryContributions(null)

    fun totalRepositoryContributions(alias: String?): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoryContributions").alias(alias))
        return this
    }

    fun totalRepositoryContributions(input: ContributionsCollectionTotalRepositoryContributionsParametrizedInput): ContributionsCollectionResponseProjection = totalRepositoryContributions(null, input)

    fun totalRepositoryContributions(alias: String?, input: ContributionsCollectionTotalRepositoryContributionsParametrizedInput): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("totalRepositoryContributions").alias(alias).parameters(input))
        return this
    }

    fun user(subProjection: UserResponseProjection): ContributionsCollectionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): ContributionsCollectionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ContributionsCollectionResponseProjection = typename(null)

    fun typename(alias: String?): ContributionsCollectionResponseProjection {
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
        val that = other as ContributionsCollectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
