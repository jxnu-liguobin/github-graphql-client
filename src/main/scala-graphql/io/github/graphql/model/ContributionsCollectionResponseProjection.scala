package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionsCollection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ContributionsCollectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionsCollectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionsCollectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) + 1)
            this.commitContributionsByRepository(new CommitContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) + 1)
            this.contributionCalendar(new ContributionCalendarResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0)))
        }
        this.contributionYears()
        this.doesEndInCurrentMonth()
        this.earliestRestrictedContributionDate()
        this.endedAt()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) + 1)
            this.firstIssueContribution(new CreatedIssueOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) + 1)
            this.firstPullRequestContribution(new CreatedPullRequestOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) + 1)
            this.firstRepositoryContribution(new CreatedRepositoryOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0)))
        }
        this.hasActivityInThePast()
        this.hasAnyContributions()
        this.hasAnyRestrictedContributions()
        this.isSingleDay()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) + 1)
            this.issueContributions(new CreatedIssueContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) + 1)
            this.issueContributionsByRepository(new IssueContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) + 1)
            this.joinedGitHubContribution(new JoinedGitHubContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0)))
        }
        this.latestRestrictedContributionDate()
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) + 1)
            this.mostRecentCollectionWithActivity(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) + 1)
            this.mostRecentCollectionWithoutActivity(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) + 1)
            this.popularIssueContribution(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) + 1)
            this.popularPullRequestContribution(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) + 1)
            this.pullRequestContributions(new CreatedPullRequestContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) + 1)
            this.pullRequestContributionsByRepository(new PullRequestContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) + 1)
            this.pullRequestReviewContributions(new CreatedPullRequestReviewContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) + 1)
            this.pullRequestReviewContributionsByRepository(new PullRequestReviewContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) + 1)
            this.repositoryContributions(new CreatedRepositoryContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0)))
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
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def commitContributionsByRepository(subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        commitContributionsByRepository(null.asInstanceOf[String], subProjection)
    }

    def commitContributionsByRepository(alias: String, subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("commitContributionsByRepository").alias(alias).projection(subProjection))
        this
    }

    def commitContributionsByRepository(input: ContributionsCollectionCommitContributionsByRepositoryParametrizedInput,subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        commitContributionsByRepository(null.asInstanceOf[String], input, subProjection)
    }

    def commitContributionsByRepository(alias: String, input: ContributionsCollectionCommitContributionsByRepositoryParametrizedInput , subProjection: CommitContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("commitContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def contributionCalendar(subProjection: ContributionCalendarResponseProjection): ContributionsCollectionResponseProjection = {
        contributionCalendar(null.asInstanceOf[String], subProjection)
    }

    def contributionCalendar(alias: String, subProjection: ContributionCalendarResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("contributionCalendar").alias(alias).projection(subProjection))
        this
    }

    def contributionYears(): ContributionsCollectionResponseProjection = {
        contributionYears(null.asInstanceOf[String])
    }

    def contributionYears(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("contributionYears").alias(alias))
        this
    }

    def doesEndInCurrentMonth(): ContributionsCollectionResponseProjection = {
        doesEndInCurrentMonth(null.asInstanceOf[String])
    }

    def doesEndInCurrentMonth(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("doesEndInCurrentMonth").alias(alias))
        this
    }

    def earliestRestrictedContributionDate(): ContributionsCollectionResponseProjection = {
        earliestRestrictedContributionDate(null.asInstanceOf[String])
    }

    def earliestRestrictedContributionDate(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("earliestRestrictedContributionDate").alias(alias))
        this
    }

    def endedAt(): ContributionsCollectionResponseProjection = {
        endedAt(null.asInstanceOf[String])
    }

    def endedAt(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("endedAt").alias(alias))
        this
    }

    def firstIssueContribution(subProjection: CreatedIssueOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        firstIssueContribution(null.asInstanceOf[String], subProjection)
    }

    def firstIssueContribution(alias: String, subProjection: CreatedIssueOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("firstIssueContribution").alias(alias).projection(subProjection))
        this
    }

    def firstPullRequestContribution(subProjection: CreatedPullRequestOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        firstPullRequestContribution(null.asInstanceOf[String], subProjection)
    }

    def firstPullRequestContribution(alias: String, subProjection: CreatedPullRequestOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("firstPullRequestContribution").alias(alias).projection(subProjection))
        this
    }

    def firstRepositoryContribution(subProjection: CreatedRepositoryOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        firstRepositoryContribution(null.asInstanceOf[String], subProjection)
    }

    def firstRepositoryContribution(alias: String, subProjection: CreatedRepositoryOrRestrictedContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("firstRepositoryContribution").alias(alias).projection(subProjection))
        this
    }

    def hasActivityInThePast(): ContributionsCollectionResponseProjection = {
        hasActivityInThePast(null.asInstanceOf[String])
    }

    def hasActivityInThePast(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("hasActivityInThePast").alias(alias))
        this
    }

    def hasAnyContributions(): ContributionsCollectionResponseProjection = {
        hasAnyContributions(null.asInstanceOf[String])
    }

    def hasAnyContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("hasAnyContributions").alias(alias))
        this
    }

    def hasAnyRestrictedContributions(): ContributionsCollectionResponseProjection = {
        hasAnyRestrictedContributions(null.asInstanceOf[String])
    }

    def hasAnyRestrictedContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("hasAnyRestrictedContributions").alias(alias))
        this
    }

    def isSingleDay(): ContributionsCollectionResponseProjection = {
        isSingleDay(null.asInstanceOf[String])
    }

    def isSingleDay(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("isSingleDay").alias(alias))
        this
    }

    def issueContributions(subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        issueContributions(null.asInstanceOf[String], subProjection)
    }

    def issueContributions(alias: String, subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("issueContributions").alias(alias).projection(subProjection))
        this
    }

    def issueContributions(input: ContributionsCollectionIssueContributionsParametrizedInput,subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        issueContributions(null.asInstanceOf[String], input, subProjection)
    }

    def issueContributions(alias: String, input: ContributionsCollectionIssueContributionsParametrizedInput , subProjection: CreatedIssueContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("issueContributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def issueContributionsByRepository(subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        issueContributionsByRepository(null.asInstanceOf[String], subProjection)
    }

    def issueContributionsByRepository(alias: String, subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("issueContributionsByRepository").alias(alias).projection(subProjection))
        this
    }

    def issueContributionsByRepository(input: ContributionsCollectionIssueContributionsByRepositoryParametrizedInput,subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        issueContributionsByRepository(null.asInstanceOf[String], input, subProjection)
    }

    def issueContributionsByRepository(alias: String, input: ContributionsCollectionIssueContributionsByRepositoryParametrizedInput , subProjection: IssueContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("issueContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def joinedGitHubContribution(subProjection: JoinedGitHubContributionResponseProjection): ContributionsCollectionResponseProjection = {
        joinedGitHubContribution(null.asInstanceOf[String], subProjection)
    }

    def joinedGitHubContribution(alias: String, subProjection: JoinedGitHubContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("joinedGitHubContribution").alias(alias).projection(subProjection))
        this
    }

    def latestRestrictedContributionDate(): ContributionsCollectionResponseProjection = {
        latestRestrictedContributionDate(null.asInstanceOf[String])
    }

    def latestRestrictedContributionDate(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("latestRestrictedContributionDate").alias(alias))
        this
    }

    def mostRecentCollectionWithActivity(subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = {
        mostRecentCollectionWithActivity(null.asInstanceOf[String], subProjection)
    }

    def mostRecentCollectionWithActivity(alias: String, subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("mostRecentCollectionWithActivity").alias(alias).projection(subProjection))
        this
    }

    def mostRecentCollectionWithoutActivity(subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = {
        mostRecentCollectionWithoutActivity(null.asInstanceOf[String], subProjection)
    }

    def mostRecentCollectionWithoutActivity(alias: String, subProjection: ContributionsCollectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("mostRecentCollectionWithoutActivity").alias(alias).projection(subProjection))
        this
    }

    def popularIssueContribution(subProjection: CreatedIssueContributionResponseProjection): ContributionsCollectionResponseProjection = {
        popularIssueContribution(null.asInstanceOf[String], subProjection)
    }

    def popularIssueContribution(alias: String, subProjection: CreatedIssueContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("popularIssueContribution").alias(alias).projection(subProjection))
        this
    }

    def popularPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): ContributionsCollectionResponseProjection = {
        popularPullRequestContribution(null.asInstanceOf[String], subProjection)
    }

    def popularPullRequestContribution(alias: String, subProjection: CreatedPullRequestContributionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("popularPullRequestContribution").alias(alias).projection(subProjection))
        this
    }

    def pullRequestContributions(subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestContributions(null.asInstanceOf[String], subProjection)
    }

    def pullRequestContributions(alias: String, subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestContributions").alias(alias).projection(subProjection))
        this
    }

    def pullRequestContributions(input: ContributionsCollectionPullRequestContributionsParametrizedInput,subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestContributions(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequestContributions(alias: String, input: ContributionsCollectionPullRequestContributionsParametrizedInput , subProjection: CreatedPullRequestContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestContributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pullRequestContributionsByRepository(subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestContributionsByRepository(null.asInstanceOf[String], subProjection)
    }

    def pullRequestContributionsByRepository(alias: String, subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).projection(subProjection))
        this
    }

    def pullRequestContributionsByRepository(input: ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput,subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestContributionsByRepository(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequestContributionsByRepository(alias: String, input: ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput , subProjection: PullRequestContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pullRequestReviewContributions(subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestReviewContributions(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReviewContributions(alias: String, subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReviewContributions").alias(alias).projection(subProjection))
        this
    }

    def pullRequestReviewContributions(input: ContributionsCollectionPullRequestReviewContributionsParametrizedInput,subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestReviewContributions(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequestReviewContributions(alias: String, input: ContributionsCollectionPullRequestReviewContributionsParametrizedInput , subProjection: CreatedPullRequestReviewContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReviewContributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pullRequestReviewContributionsByRepository(subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestReviewContributionsByRepository(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReviewContributionsByRepository(alias: String, subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).projection(subProjection))
        this
    }

    def pullRequestReviewContributionsByRepository(input: ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput,subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        pullRequestReviewContributionsByRepository(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequestReviewContributionsByRepository(alias: String, input: ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput , subProjection: PullRequestReviewContributionsByRepositoryResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositoryContributions(subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        repositoryContributions(null.asInstanceOf[String], subProjection)
    }

    def repositoryContributions(alias: String, subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryContributions").alias(alias).projection(subProjection))
        this
    }

    def repositoryContributions(input: ContributionsCollectionRepositoryContributionsParametrizedInput,subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        repositoryContributions(null.asInstanceOf[String], input, subProjection)
    }

    def repositoryContributions(alias: String, input: ContributionsCollectionRepositoryContributionsParametrizedInput , subProjection: CreatedRepositoryContributionConnectionResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryContributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def restrictedContributionsCount(): ContributionsCollectionResponseProjection = {
        restrictedContributionsCount(null.asInstanceOf[String])
    }

    def restrictedContributionsCount(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("restrictedContributionsCount").alias(alias))
        this
    }

    def startedAt(): ContributionsCollectionResponseProjection = {
        startedAt(null.asInstanceOf[String])
    }

    def startedAt(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("startedAt").alias(alias))
        this
    }

    def totalCommitContributions(): ContributionsCollectionResponseProjection = {
        totalCommitContributions(null.asInstanceOf[String])
    }

    def totalCommitContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCommitContributions").alias(alias))
        this
    }

    def totalIssueContributions(): ContributionsCollectionResponseProjection = {
        totalIssueContributions(null.asInstanceOf[String])
    }

    def totalIssueContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalIssueContributions").alias(alias))
        this
    }

    def totalIssueContributions(input: ContributionsCollectionTotalIssueContributionsParametrizedInput): ContributionsCollectionResponseProjection = {
        totalIssueContributions(null.asInstanceOf[String], input)
    }

    def totalIssueContributions(alias: String, input: ContributionsCollectionTotalIssueContributionsParametrizedInput ): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalIssueContributions").alias(alias).parameters(input))
        this
    }

    def totalPullRequestContributions(): ContributionsCollectionResponseProjection = {
        totalPullRequestContributions(null.asInstanceOf[String])
    }

    def totalPullRequestContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalPullRequestContributions").alias(alias))
        this
    }

    def totalPullRequestContributions(input: ContributionsCollectionTotalPullRequestContributionsParametrizedInput): ContributionsCollectionResponseProjection = {
        totalPullRequestContributions(null.asInstanceOf[String], input)
    }

    def totalPullRequestContributions(alias: String, input: ContributionsCollectionTotalPullRequestContributionsParametrizedInput ): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalPullRequestContributions").alias(alias).parameters(input))
        this
    }

    def totalPullRequestReviewContributions(): ContributionsCollectionResponseProjection = {
        totalPullRequestReviewContributions(null.asInstanceOf[String])
    }

    def totalPullRequestReviewContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalPullRequestReviewContributions").alias(alias))
        this
    }

    def totalRepositoriesWithContributedCommits(): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedCommits(null.asInstanceOf[String])
    }

    def totalRepositoriesWithContributedCommits(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedCommits").alias(alias))
        this
    }

    def totalRepositoriesWithContributedIssues(): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedIssues(null.asInstanceOf[String])
    }

    def totalRepositoriesWithContributedIssues(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias))
        this
    }

    def totalRepositoriesWithContributedIssues(input: ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedIssues(null.asInstanceOf[String], input)
    }

    def totalRepositoriesWithContributedIssues(alias: String, input: ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput ): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias).parameters(input))
        this
    }

    def totalRepositoriesWithContributedPullRequestReviews(): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedPullRequestReviews(null.asInstanceOf[String])
    }

    def totalRepositoriesWithContributedPullRequestReviews(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequestReviews").alias(alias))
        this
    }

    def totalRepositoriesWithContributedPullRequests(): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedPullRequests(null.asInstanceOf[String])
    }

    def totalRepositoriesWithContributedPullRequests(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias))
        this
    }

    def totalRepositoriesWithContributedPullRequests(input: ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput): ContributionsCollectionResponseProjection = {
        totalRepositoriesWithContributedPullRequests(null.asInstanceOf[String], input)
    }

    def totalRepositoriesWithContributedPullRequests(alias: String, input: ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput ): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias).parameters(input))
        this
    }

    def totalRepositoryContributions(): ContributionsCollectionResponseProjection = {
        totalRepositoryContributions(null.asInstanceOf[String])
    }

    def totalRepositoryContributions(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoryContributions").alias(alias))
        this
    }

    def totalRepositoryContributions(input: ContributionsCollectionTotalRepositoryContributionsParametrizedInput): ContributionsCollectionResponseProjection = {
        totalRepositoryContributions(null.asInstanceOf[String], input)
    }

    def totalRepositoryContributions(alias: String, input: ContributionsCollectionTotalRepositoryContributionsParametrizedInput ): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalRepositoryContributions").alias(alias).parameters(input))
        this
    }

    def user(subProjection: UserResponseProjection): ContributionsCollectionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): ContributionsCollectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionsCollectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
