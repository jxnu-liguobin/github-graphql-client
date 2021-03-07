package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ContributionsCollectionTO(
    val contributionCalendar: ContributionCalendarTO,
    val contributionYears: List<Int>,
    val doesEndInCurrentMonth: Boolean,
    val earliestRestrictedContributionDate: String?,
    val endedAt: String,
    val firstIssueContribution: CreatedIssueOrRestrictedContributionTO?,
    val firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO?,
    val firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO?,
    val hasActivityInThePast: Boolean,
    val hasAnyContributions: Boolean,
    val hasAnyRestrictedContributions: Boolean,
    val isSingleDay: Boolean,
    val joinedGitHubContribution: JoinedGitHubContributionTO?,
    val latestRestrictedContributionDate: String?,
    val mostRecentCollectionWithActivity: ContributionsCollectionTO?,
    val mostRecentCollectionWithoutActivity: ContributionsCollectionTO?,
    val popularIssueContribution: CreatedIssueContributionTO?,
    val popularPullRequestContribution: CreatedPullRequestContributionTO?,
    val restrictedContributionsCount: Int,
    val startedAt: String,
    val totalCommitContributions: Int,
    val totalPullRequestReviewContributions: Int,
    val totalRepositoriesWithContributedCommits: Int,
    val totalRepositoriesWithContributedPullRequestReviews: Int,
    val user: UserTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("contributionCalendar: " + GraphQLRequestSerializer.getEntry(contributionCalendar))
        joiner.add("contributionYears: " + GraphQLRequestSerializer.getEntry(contributionYears))
        joiner.add("doesEndInCurrentMonth: " + GraphQLRequestSerializer.getEntry(doesEndInCurrentMonth))
        if (earliestRestrictedContributionDate != null) {
            joiner.add("earliestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(earliestRestrictedContributionDate))
        }
        joiner.add("endedAt: " + GraphQLRequestSerializer.getEntry(endedAt))
        if (firstIssueContribution != null) {
            joiner.add("firstIssueContribution: " + GraphQLRequestSerializer.getEntry(firstIssueContribution))
        }
        if (firstPullRequestContribution != null) {
            joiner.add("firstPullRequestContribution: " + GraphQLRequestSerializer.getEntry(firstPullRequestContribution))
        }
        if (firstRepositoryContribution != null) {
            joiner.add("firstRepositoryContribution: " + GraphQLRequestSerializer.getEntry(firstRepositoryContribution))
        }
        joiner.add("hasActivityInThePast: " + GraphQLRequestSerializer.getEntry(hasActivityInThePast))
        joiner.add("hasAnyContributions: " + GraphQLRequestSerializer.getEntry(hasAnyContributions))
        joiner.add("hasAnyRestrictedContributions: " + GraphQLRequestSerializer.getEntry(hasAnyRestrictedContributions))
        joiner.add("isSingleDay: " + GraphQLRequestSerializer.getEntry(isSingleDay))
        if (joinedGitHubContribution != null) {
            joiner.add("joinedGitHubContribution: " + GraphQLRequestSerializer.getEntry(joinedGitHubContribution))
        }
        if (latestRestrictedContributionDate != null) {
            joiner.add("latestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(latestRestrictedContributionDate))
        }
        if (mostRecentCollectionWithActivity != null) {
            joiner.add("mostRecentCollectionWithActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithActivity))
        }
        if (mostRecentCollectionWithoutActivity != null) {
            joiner.add("mostRecentCollectionWithoutActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithoutActivity))
        }
        if (popularIssueContribution != null) {
            joiner.add("popularIssueContribution: " + GraphQLRequestSerializer.getEntry(popularIssueContribution))
        }
        if (popularPullRequestContribution != null) {
            joiner.add("popularPullRequestContribution: " + GraphQLRequestSerializer.getEntry(popularPullRequestContribution))
        }
        joiner.add("restrictedContributionsCount: " + GraphQLRequestSerializer.getEntry(restrictedContributionsCount))
        joiner.add("startedAt: " + GraphQLRequestSerializer.getEntry(startedAt))
        joiner.add("totalCommitContributions: " + GraphQLRequestSerializer.getEntry(totalCommitContributions))
        joiner.add("totalPullRequestReviewContributions: " + GraphQLRequestSerializer.getEntry(totalPullRequestReviewContributions))
        joiner.add("totalRepositoriesWithContributedCommits: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedCommits))
        joiner.add("totalRepositoriesWithContributedPullRequestReviews: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedPullRequestReviews))
        joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        return joiner.toString()
    }

    class Builder {

        private lateinit var contributionCalendar: ContributionCalendarTO
        private lateinit var contributionYears: List<Int>
        private var doesEndInCurrentMonth: Boolean = false
        private var earliestRestrictedContributionDate: String? = null
        private lateinit var endedAt: String
        private var firstIssueContribution: CreatedIssueOrRestrictedContributionTO? = null
        private var firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO? = null
        private var firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO? = null
        private var hasActivityInThePast: Boolean = false
        private var hasAnyContributions: Boolean = false
        private var hasAnyRestrictedContributions: Boolean = false
        private var isSingleDay: Boolean = false
        private var joinedGitHubContribution: JoinedGitHubContributionTO? = null
        private var latestRestrictedContributionDate: String? = null
        private var mostRecentCollectionWithActivity: ContributionsCollectionTO? = null
        private var mostRecentCollectionWithoutActivity: ContributionsCollectionTO? = null
        private var popularIssueContribution: CreatedIssueContributionTO? = null
        private var popularPullRequestContribution: CreatedPullRequestContributionTO? = null
        private var restrictedContributionsCount: Int = 0
        private lateinit var startedAt: String
        private var totalCommitContributions: Int = 0
        private var totalPullRequestReviewContributions: Int = 0
        private var totalRepositoriesWithContributedCommits: Int = 0
        private var totalRepositoriesWithContributedPullRequestReviews: Int = 0
        private lateinit var user: UserTO

        fun setContributionCalendar(contributionCalendar: ContributionCalendarTO): Builder {
            this.contributionCalendar = contributionCalendar
            return this
        }

        fun setContributionYears(contributionYears: List<Int>): Builder {
            this.contributionYears = contributionYears
            return this
        }

        fun setDoesEndInCurrentMonth(doesEndInCurrentMonth: Boolean): Builder {
            this.doesEndInCurrentMonth = doesEndInCurrentMonth
            return this
        }

        fun setEarliestRestrictedContributionDate(earliestRestrictedContributionDate: String?): Builder {
            this.earliestRestrictedContributionDate = earliestRestrictedContributionDate
            return this
        }

        fun setEndedAt(endedAt: String): Builder {
            this.endedAt = endedAt
            return this
        }

        fun setFirstIssueContribution(firstIssueContribution: CreatedIssueOrRestrictedContributionTO?): Builder {
            this.firstIssueContribution = firstIssueContribution
            return this
        }

        fun setFirstPullRequestContribution(firstPullRequestContribution: CreatedPullRequestOrRestrictedContributionTO?): Builder {
            this.firstPullRequestContribution = firstPullRequestContribution
            return this
        }

        fun setFirstRepositoryContribution(firstRepositoryContribution: CreatedRepositoryOrRestrictedContributionTO?): Builder {
            this.firstRepositoryContribution = firstRepositoryContribution
            return this
        }

        fun setHasActivityInThePast(hasActivityInThePast: Boolean): Builder {
            this.hasActivityInThePast = hasActivityInThePast
            return this
        }

        fun setHasAnyContributions(hasAnyContributions: Boolean): Builder {
            this.hasAnyContributions = hasAnyContributions
            return this
        }

        fun setHasAnyRestrictedContributions(hasAnyRestrictedContributions: Boolean): Builder {
            this.hasAnyRestrictedContributions = hasAnyRestrictedContributions
            return this
        }

        fun setIsSingleDay(isSingleDay: Boolean): Builder {
            this.isSingleDay = isSingleDay
            return this
        }

        fun setJoinedGitHubContribution(joinedGitHubContribution: JoinedGitHubContributionTO?): Builder {
            this.joinedGitHubContribution = joinedGitHubContribution
            return this
        }

        fun setLatestRestrictedContributionDate(latestRestrictedContributionDate: String?): Builder {
            this.latestRestrictedContributionDate = latestRestrictedContributionDate
            return this
        }

        fun setMostRecentCollectionWithActivity(mostRecentCollectionWithActivity: ContributionsCollectionTO?): Builder {
            this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity
            return this
        }

        fun setMostRecentCollectionWithoutActivity(mostRecentCollectionWithoutActivity: ContributionsCollectionTO?): Builder {
            this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity
            return this
        }

        fun setPopularIssueContribution(popularIssueContribution: CreatedIssueContributionTO?): Builder {
            this.popularIssueContribution = popularIssueContribution
            return this
        }

        fun setPopularPullRequestContribution(popularPullRequestContribution: CreatedPullRequestContributionTO?): Builder {
            this.popularPullRequestContribution = popularPullRequestContribution
            return this
        }

        fun setRestrictedContributionsCount(restrictedContributionsCount: Int): Builder {
            this.restrictedContributionsCount = restrictedContributionsCount
            return this
        }

        fun setStartedAt(startedAt: String): Builder {
            this.startedAt = startedAt
            return this
        }

        fun setTotalCommitContributions(totalCommitContributions: Int): Builder {
            this.totalCommitContributions = totalCommitContributions
            return this
        }

        fun setTotalPullRequestReviewContributions(totalPullRequestReviewContributions: Int): Builder {
            this.totalPullRequestReviewContributions = totalPullRequestReviewContributions
            return this
        }

        fun setTotalRepositoriesWithContributedCommits(totalRepositoriesWithContributedCommits: Int): Builder {
            this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits
            return this
        }

        fun setTotalRepositoriesWithContributedPullRequestReviews(totalRepositoriesWithContributedPullRequestReviews: Int): Builder {
            this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews
            return this
        }

        fun setUser(user: UserTO): Builder {
            this.user = user
            return this
        }

        fun build(): ContributionsCollectionTO {
            return ContributionsCollectionTO(contributionCalendar, contributionYears, doesEndInCurrentMonth, earliestRestrictedContributionDate, endedAt, firstIssueContribution, firstPullRequestContribution, firstRepositoryContribution, hasActivityInThePast, hasAnyContributions, hasAnyRestrictedContributions, isSingleDay, joinedGitHubContribution, latestRestrictedContributionDate, mostRecentCollectionWithActivity, mostRecentCollectionWithoutActivity, popularIssueContribution, popularPullRequestContribution, restrictedContributionsCount, startedAt, totalCommitContributions, totalPullRequestReviewContributions, totalRepositoriesWithContributedCommits, totalRepositoriesWithContributedPullRequestReviews, user)
        }
    }
}
