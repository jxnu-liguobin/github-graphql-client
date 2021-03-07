package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ContributionsCollectionTO(
    @javax.validation.constraints.NotNull
    contributionCalendar: ContributionCalendarTO,
    contributionYears: Seq[Int],
    doesEndInCurrentMonth: Boolean,
    earliestRestrictedContributionDate: String,
    @javax.validation.constraints.NotNull
    endedAt: String,
    firstIssueContribution: CreatedIssueOrRestrictedContributionTO,
    firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO,
    firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO,
    hasActivityInThePast: Boolean,
    hasAnyContributions: Boolean,
    hasAnyRestrictedContributions: Boolean,
    isSingleDay: Boolean,
    joinedGitHubContribution: JoinedGitHubContributionTO,
    latestRestrictedContributionDate: String,
    mostRecentCollectionWithActivity: ContributionsCollectionTO,
    mostRecentCollectionWithoutActivity: ContributionsCollectionTO,
    popularIssueContribution: CreatedIssueContributionTO,
    popularPullRequestContribution: CreatedPullRequestContributionTO,
    restrictedContributionsCount: Int,
    @javax.validation.constraints.NotNull
    startedAt: String,
    totalCommitContributions: Int,
    totalPullRequestReviewContributions: Int,
    totalRepositoriesWithContributedCommits: Int,
    totalRepositoriesWithContributedPullRequestReviews: Int,
    @javax.validation.constraints.NotNull
    user: UserTO
) {

    override def toString(): String = {
        Seq(
            if (contributionCalendar != null) "contributionCalendar: " + GraphQLRequestSerializer.getEntry(contributionCalendar) else "",
            if (contributionYears != null) "contributionYears: " + GraphQLRequestSerializer.getEntry(contributionYears.asJava) else "",
            "doesEndInCurrentMonth: " + GraphQLRequestSerializer.getEntry(doesEndInCurrentMonth),
            if (earliestRestrictedContributionDate != null) "earliestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(earliestRestrictedContributionDate) else "",
            if (endedAt != null) "endedAt: " + GraphQLRequestSerializer.getEntry(endedAt) else "",
            if (firstIssueContribution != null) "firstIssueContribution: " + GraphQLRequestSerializer.getEntry(firstIssueContribution) else "",
            if (firstPullRequestContribution != null) "firstPullRequestContribution: " + GraphQLRequestSerializer.getEntry(firstPullRequestContribution) else "",
            if (firstRepositoryContribution != null) "firstRepositoryContribution: " + GraphQLRequestSerializer.getEntry(firstRepositoryContribution) else "",
            "hasActivityInThePast: " + GraphQLRequestSerializer.getEntry(hasActivityInThePast),
            "hasAnyContributions: " + GraphQLRequestSerializer.getEntry(hasAnyContributions),
            "hasAnyRestrictedContributions: " + GraphQLRequestSerializer.getEntry(hasAnyRestrictedContributions),
            "isSingleDay: " + GraphQLRequestSerializer.getEntry(isSingleDay),
            if (joinedGitHubContribution != null) "joinedGitHubContribution: " + GraphQLRequestSerializer.getEntry(joinedGitHubContribution) else "",
            if (latestRestrictedContributionDate != null) "latestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(latestRestrictedContributionDate) else "",
            if (mostRecentCollectionWithActivity != null) "mostRecentCollectionWithActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithActivity) else "",
            if (mostRecentCollectionWithoutActivity != null) "mostRecentCollectionWithoutActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithoutActivity) else "",
            if (popularIssueContribution != null) "popularIssueContribution: " + GraphQLRequestSerializer.getEntry(popularIssueContribution) else "",
            if (popularPullRequestContribution != null) "popularPullRequestContribution: " + GraphQLRequestSerializer.getEntry(popularPullRequestContribution) else "",
            "restrictedContributionsCount: " + GraphQLRequestSerializer.getEntry(restrictedContributionsCount),
            if (startedAt != null) "startedAt: " + GraphQLRequestSerializer.getEntry(startedAt) else "",
            "totalCommitContributions: " + GraphQLRequestSerializer.getEntry(totalCommitContributions),
            "totalPullRequestReviewContributions: " + GraphQLRequestSerializer.getEntry(totalPullRequestReviewContributions),
            "totalRepositoriesWithContributedCommits: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedCommits),
            "totalRepositoriesWithContributedPullRequestReviews: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedPullRequestReviews),
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ContributionsCollectionTO {

    def builder(): ContributionsCollectionTO.Builder = new Builder()

    class Builder {

        private var contributionCalendar: ContributionCalendarTO = _
        private var contributionYears: Seq[Int] = _
        private var doesEndInCurrentMonth: Boolean = _
        private var earliestRestrictedContributionDate: String = _
        private var endedAt: String = _
        private var firstIssueContribution: CreatedIssueOrRestrictedContributionTO = _
        private var firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO = _
        private var firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO = _
        private var hasActivityInThePast: Boolean = _
        private var hasAnyContributions: Boolean = _
        private var hasAnyRestrictedContributions: Boolean = _
        private var isSingleDay: Boolean = _
        private var joinedGitHubContribution: JoinedGitHubContributionTO = _
        private var latestRestrictedContributionDate: String = _
        private var mostRecentCollectionWithActivity: ContributionsCollectionTO = _
        private var mostRecentCollectionWithoutActivity: ContributionsCollectionTO = _
        private var popularIssueContribution: CreatedIssueContributionTO = _
        private var popularPullRequestContribution: CreatedPullRequestContributionTO = _
        private var restrictedContributionsCount: Int = _
        private var startedAt: String = _
        private var totalCommitContributions: Int = _
        private var totalPullRequestReviewContributions: Int = _
        private var totalRepositoriesWithContributedCommits: Int = _
        private var totalRepositoriesWithContributedPullRequestReviews: Int = _
        private var user: UserTO = _

        def setContributionCalendar(contributionCalendar: ContributionCalendarTO): Builder = {
            this.contributionCalendar = contributionCalendar
            this
        }

        def setContributionYears(contributionYears: Seq[Int]): Builder = {
            this.contributionYears = contributionYears
            this
        }

        def setDoesEndInCurrentMonth(doesEndInCurrentMonth: Boolean): Builder = {
            this.doesEndInCurrentMonth = doesEndInCurrentMonth
            this
        }

        def setEarliestRestrictedContributionDate(earliestRestrictedContributionDate: String): Builder = {
            this.earliestRestrictedContributionDate = earliestRestrictedContributionDate
            this
        }

        def setEndedAt(endedAt: String): Builder = {
            this.endedAt = endedAt
            this
        }

        def setFirstIssueContribution(firstIssueContribution: CreatedIssueOrRestrictedContributionTO): Builder = {
            this.firstIssueContribution = firstIssueContribution
            this
        }

        def setFirstPullRequestContribution(firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO): Builder = {
            this.firstPullRequestContribution = firstPullRequestContribution
            this
        }

        def setFirstRepositoryContribution(firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO): Builder = {
            this.firstRepositoryContribution = firstRepositoryContribution
            this
        }

        def setHasActivityInThePast(hasActivityInThePast: Boolean): Builder = {
            this.hasActivityInThePast = hasActivityInThePast
            this
        }

        def setHasAnyContributions(hasAnyContributions: Boolean): Builder = {
            this.hasAnyContributions = hasAnyContributions
            this
        }

        def setHasAnyRestrictedContributions(hasAnyRestrictedContributions: Boolean): Builder = {
            this.hasAnyRestrictedContributions = hasAnyRestrictedContributions
            this
        }

        def setIsSingleDay(isSingleDay: Boolean): Builder = {
            this.isSingleDay = isSingleDay
            this
        }

        def setJoinedGitHubContribution(joinedGitHubContribution: JoinedGitHubContributionTO): Builder = {
            this.joinedGitHubContribution = joinedGitHubContribution
            this
        }

        def setLatestRestrictedContributionDate(latestRestrictedContributionDate: String): Builder = {
            this.latestRestrictedContributionDate = latestRestrictedContributionDate
            this
        }

        def setMostRecentCollectionWithActivity(mostRecentCollectionWithActivity: ContributionsCollectionTO): Builder = {
            this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity
            this
        }

        def setMostRecentCollectionWithoutActivity(mostRecentCollectionWithoutActivity: ContributionsCollectionTO): Builder = {
            this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity
            this
        }

        def setPopularIssueContribution(popularIssueContribution: CreatedIssueContributionTO): Builder = {
            this.popularIssueContribution = popularIssueContribution
            this
        }

        def setPopularPullRequestContribution(popularPullRequestContribution: CreatedPullRequestContributionTO): Builder = {
            this.popularPullRequestContribution = popularPullRequestContribution
            this
        }

        def setRestrictedContributionsCount(restrictedContributionsCount: Int): Builder = {
            this.restrictedContributionsCount = restrictedContributionsCount
            this
        }

        def setStartedAt(startedAt: String): Builder = {
            this.startedAt = startedAt
            this
        }

        def setTotalCommitContributions(totalCommitContributions: Int): Builder = {
            this.totalCommitContributions = totalCommitContributions
            this
        }

        def setTotalPullRequestReviewContributions(totalPullRequestReviewContributions: Int): Builder = {
            this.totalPullRequestReviewContributions = totalPullRequestReviewContributions
            this
        }

        def setTotalRepositoriesWithContributedCommits(totalRepositoriesWithContributedCommits: Int): Builder = {
            this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits
            this
        }

        def setTotalRepositoriesWithContributedPullRequestReviews(totalRepositoriesWithContributedPullRequestReviews: Int): Builder = {
            this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews
            this
        }

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): ContributionsCollectionTO = new ContributionsCollectionTO(contributionCalendar, contributionYears, doesEndInCurrentMonth, earliestRestrictedContributionDate, endedAt, firstIssueContribution, firstPullRequestContribution, firstRepositoryContribution, hasActivityInThePast, hasAnyContributions, hasAnyRestrictedContributions, isSingleDay, joinedGitHubContribution, latestRestrictedContributionDate, mostRecentCollectionWithActivity, mostRecentCollectionWithoutActivity, popularIssueContribution, popularPullRequestContribution, restrictedContributionsCount, startedAt, totalCommitContributions, totalPullRequestReviewContributions, totalRepositoriesWithContributedCommits, totalRepositoriesWithContributedPullRequestReviews, user)

    }
}
