package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
