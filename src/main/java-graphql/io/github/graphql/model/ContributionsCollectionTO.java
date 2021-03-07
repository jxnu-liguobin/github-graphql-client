package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionsCollectionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ContributionCalendarTO contributionCalendar;
    private java.util.List<Integer> contributionYears;
    private boolean doesEndInCurrentMonth;
    private String earliestRestrictedContributionDate;
    @javax.validation.constraints.NotNull
    private String endedAt;
    private CreatedIssueOrRestrictedContributionTO firstIssueContribution;
    private CreatedPullRequestOrRestrictedContributionTO firstPullRequestContribution;
    private CreatedRepositoryOrRestrictedContributionTO firstRepositoryContribution;
    private boolean hasActivityInThePast;
    private boolean hasAnyContributions;
    private boolean hasAnyRestrictedContributions;
    private boolean isSingleDay;
    private JoinedGitHubContributionTO joinedGitHubContribution;
    private String latestRestrictedContributionDate;
    private ContributionsCollectionTO mostRecentCollectionWithActivity;
    private ContributionsCollectionTO mostRecentCollectionWithoutActivity;
    private CreatedIssueContributionTO popularIssueContribution;
    private CreatedPullRequestContributionTO popularPullRequestContribution;
    private int restrictedContributionsCount;
    @javax.validation.constraints.NotNull
    private String startedAt;
    private int totalCommitContributions;
    private int totalPullRequestReviewContributions;
    private int totalRepositoriesWithContributedCommits;
    private int totalRepositoriesWithContributedPullRequestReviews;
    @javax.validation.constraints.NotNull
    private UserTO user;

    public ContributionsCollectionTO() {
    }

    public ContributionsCollectionTO(ContributionCalendarTO contributionCalendar, java.util.List<Integer> contributionYears, boolean doesEndInCurrentMonth, String earliestRestrictedContributionDate, String endedAt, CreatedIssueOrRestrictedContributionTO firstIssueContribution, CreatedPullRequestOrRestrictedContributionTO firstPullRequestContribution, CreatedRepositoryOrRestrictedContributionTO firstRepositoryContribution, boolean hasActivityInThePast, boolean hasAnyContributions, boolean hasAnyRestrictedContributions, boolean isSingleDay, JoinedGitHubContributionTO joinedGitHubContribution, String latestRestrictedContributionDate, ContributionsCollectionTO mostRecentCollectionWithActivity, ContributionsCollectionTO mostRecentCollectionWithoutActivity, CreatedIssueContributionTO popularIssueContribution, CreatedPullRequestContributionTO popularPullRequestContribution, int restrictedContributionsCount, String startedAt, int totalCommitContributions, int totalPullRequestReviewContributions, int totalRepositoriesWithContributedCommits, int totalRepositoriesWithContributedPullRequestReviews, UserTO user) {
        this.contributionCalendar = contributionCalendar;
        this.contributionYears = contributionYears;
        this.doesEndInCurrentMonth = doesEndInCurrentMonth;
        this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
        this.endedAt = endedAt;
        this.firstIssueContribution = firstIssueContribution;
        this.firstPullRequestContribution = firstPullRequestContribution;
        this.firstRepositoryContribution = firstRepositoryContribution;
        this.hasActivityInThePast = hasActivityInThePast;
        this.hasAnyContributions = hasAnyContributions;
        this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
        this.isSingleDay = isSingleDay;
        this.joinedGitHubContribution = joinedGitHubContribution;
        this.latestRestrictedContributionDate = latestRestrictedContributionDate;
        this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
        this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
        this.popularIssueContribution = popularIssueContribution;
        this.popularPullRequestContribution = popularPullRequestContribution;
        this.restrictedContributionsCount = restrictedContributionsCount;
        this.startedAt = startedAt;
        this.totalCommitContributions = totalCommitContributions;
        this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
        this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
        this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
        this.user = user;
    }

    public ContributionCalendarTO getContributionCalendar() {
        return contributionCalendar;
    }

    public java.util.List<Integer> getContributionYears() {
        return contributionYears;
    }

    public boolean getDoesEndInCurrentMonth() {
        return doesEndInCurrentMonth;
    }

    public String getEarliestRestrictedContributionDate() {
        return earliestRestrictedContributionDate;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public CreatedIssueOrRestrictedContributionTO getFirstIssueContribution() {
        return firstIssueContribution;
    }

    public CreatedPullRequestOrRestrictedContributionTO getFirstPullRequestContribution() {
        return firstPullRequestContribution;
    }

    public CreatedRepositoryOrRestrictedContributionTO getFirstRepositoryContribution() {
        return firstRepositoryContribution;
    }

    public boolean getHasActivityInThePast() {
        return hasActivityInThePast;
    }

    public boolean getHasAnyContributions() {
        return hasAnyContributions;
    }

    public boolean getHasAnyRestrictedContributions() {
        return hasAnyRestrictedContributions;
    }

    public boolean getIsSingleDay() {
        return isSingleDay;
    }

    public JoinedGitHubContributionTO getJoinedGitHubContribution() {
        return joinedGitHubContribution;
    }

    public String getLatestRestrictedContributionDate() {
        return latestRestrictedContributionDate;
    }

    public ContributionsCollectionTO getMostRecentCollectionWithActivity() {
        return mostRecentCollectionWithActivity;
    }

    public ContributionsCollectionTO getMostRecentCollectionWithoutActivity() {
        return mostRecentCollectionWithoutActivity;
    }

    public CreatedIssueContributionTO getPopularIssueContribution() {
        return popularIssueContribution;
    }

    public CreatedPullRequestContributionTO getPopularPullRequestContribution() {
        return popularPullRequestContribution;
    }

    public int getRestrictedContributionsCount() {
        return restrictedContributionsCount;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public int getTotalCommitContributions() {
        return totalCommitContributions;
    }

    public int getTotalPullRequestReviewContributions() {
        return totalPullRequestReviewContributions;
    }

    public int getTotalRepositoriesWithContributedCommits() {
        return totalRepositoriesWithContributedCommits;
    }

    public int getTotalRepositoriesWithContributedPullRequestReviews() {
        return totalRepositoriesWithContributedPullRequestReviews;
    }

    public UserTO getUser() {
        return user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (contributionCalendar != null) {
            joiner.add("contributionCalendar: " + GraphQLRequestSerializer.getEntry(contributionCalendar));
        }
        if (contributionYears != null) {
            joiner.add("contributionYears: " + GraphQLRequestSerializer.getEntry(contributionYears));
        }
        joiner.add("doesEndInCurrentMonth: " + GraphQLRequestSerializer.getEntry(doesEndInCurrentMonth));
        if (earliestRestrictedContributionDate != null) {
            joiner.add("earliestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(earliestRestrictedContributionDate));
        }
        if (endedAt != null) {
            joiner.add("endedAt: " + GraphQLRequestSerializer.getEntry(endedAt));
        }
        if (firstIssueContribution != null) {
            joiner.add("firstIssueContribution: " + GraphQLRequestSerializer.getEntry(firstIssueContribution));
        }
        if (firstPullRequestContribution != null) {
            joiner.add("firstPullRequestContribution: " + GraphQLRequestSerializer.getEntry(firstPullRequestContribution));
        }
        if (firstRepositoryContribution != null) {
            joiner.add("firstRepositoryContribution: " + GraphQLRequestSerializer.getEntry(firstRepositoryContribution));
        }
        joiner.add("hasActivityInThePast: " + GraphQLRequestSerializer.getEntry(hasActivityInThePast));
        joiner.add("hasAnyContributions: " + GraphQLRequestSerializer.getEntry(hasAnyContributions));
        joiner.add("hasAnyRestrictedContributions: " + GraphQLRequestSerializer.getEntry(hasAnyRestrictedContributions));
        joiner.add("isSingleDay: " + GraphQLRequestSerializer.getEntry(isSingleDay));
        if (joinedGitHubContribution != null) {
            joiner.add("joinedGitHubContribution: " + GraphQLRequestSerializer.getEntry(joinedGitHubContribution));
        }
        if (latestRestrictedContributionDate != null) {
            joiner.add("latestRestrictedContributionDate: " + GraphQLRequestSerializer.getEntry(latestRestrictedContributionDate));
        }
        if (mostRecentCollectionWithActivity != null) {
            joiner.add("mostRecentCollectionWithActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithActivity));
        }
        if (mostRecentCollectionWithoutActivity != null) {
            joiner.add("mostRecentCollectionWithoutActivity: " + GraphQLRequestSerializer.getEntry(mostRecentCollectionWithoutActivity));
        }
        if (popularIssueContribution != null) {
            joiner.add("popularIssueContribution: " + GraphQLRequestSerializer.getEntry(popularIssueContribution));
        }
        if (popularPullRequestContribution != null) {
            joiner.add("popularPullRequestContribution: " + GraphQLRequestSerializer.getEntry(popularPullRequestContribution));
        }
        joiner.add("restrictedContributionsCount: " + GraphQLRequestSerializer.getEntry(restrictedContributionsCount));
        if (startedAt != null) {
            joiner.add("startedAt: " + GraphQLRequestSerializer.getEntry(startedAt));
        }
        joiner.add("totalCommitContributions: " + GraphQLRequestSerializer.getEntry(totalCommitContributions));
        joiner.add("totalPullRequestReviewContributions: " + GraphQLRequestSerializer.getEntry(totalPullRequestReviewContributions));
        joiner.add("totalRepositoriesWithContributedCommits: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedCommits));
        joiner.add("totalRepositoriesWithContributedPullRequestReviews: " + GraphQLRequestSerializer.getEntry(totalRepositoriesWithContributedPullRequestReviews));
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static ContributionsCollectionTO.Builder builder() {
        return new ContributionsCollectionTO.Builder();
    }

    public static class Builder {

        private ContributionCalendarTO contributionCalendar;
        private java.util.List<Integer> contributionYears;
        private boolean doesEndInCurrentMonth;
        private String earliestRestrictedContributionDate;
        private String endedAt;
        private CreatedIssueOrRestrictedContributionTO firstIssueContribution;
        private CreatedPullRequestOrRestrictedContributionTO firstPullRequestContribution;
        private CreatedRepositoryOrRestrictedContributionTO firstRepositoryContribution;
        private boolean hasActivityInThePast;
        private boolean hasAnyContributions;
        private boolean hasAnyRestrictedContributions;
        private boolean isSingleDay;
        private JoinedGitHubContributionTO joinedGitHubContribution;
        private String latestRestrictedContributionDate;
        private ContributionsCollectionTO mostRecentCollectionWithActivity;
        private ContributionsCollectionTO mostRecentCollectionWithoutActivity;
        private CreatedIssueContributionTO popularIssueContribution;
        private CreatedPullRequestContributionTO popularPullRequestContribution;
        private int restrictedContributionsCount;
        private String startedAt;
        private int totalCommitContributions;
        private int totalPullRequestReviewContributions;
        private int totalRepositoriesWithContributedCommits;
        private int totalRepositoriesWithContributedPullRequestReviews;
        private UserTO user;

        public Builder() {
        }

        public Builder setContributionCalendar(ContributionCalendarTO contributionCalendar) {
            this.contributionCalendar = contributionCalendar;
            return this;
        }

        public Builder setContributionYears(java.util.List<Integer> contributionYears) {
            this.contributionYears = contributionYears;
            return this;
        }

        public Builder setDoesEndInCurrentMonth(boolean doesEndInCurrentMonth) {
            this.doesEndInCurrentMonth = doesEndInCurrentMonth;
            return this;
        }

        public Builder setEarliestRestrictedContributionDate(String earliestRestrictedContributionDate) {
            this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
            return this;
        }

        public Builder setEndedAt(String endedAt) {
            this.endedAt = endedAt;
            return this;
        }

        public Builder setFirstIssueContribution(CreatedIssueOrRestrictedContributionTO firstIssueContribution) {
            this.firstIssueContribution = firstIssueContribution;
            return this;
        }

        public Builder setFirstPullRequestContribution(CreatedPullRequestOrRestrictedContributionTO firstPullRequestContribution) {
            this.firstPullRequestContribution = firstPullRequestContribution;
            return this;
        }

        public Builder setFirstRepositoryContribution(CreatedRepositoryOrRestrictedContributionTO firstRepositoryContribution) {
            this.firstRepositoryContribution = firstRepositoryContribution;
            return this;
        }

        public Builder setHasActivityInThePast(boolean hasActivityInThePast) {
            this.hasActivityInThePast = hasActivityInThePast;
            return this;
        }

        public Builder setHasAnyContributions(boolean hasAnyContributions) {
            this.hasAnyContributions = hasAnyContributions;
            return this;
        }

        public Builder setHasAnyRestrictedContributions(boolean hasAnyRestrictedContributions) {
            this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
            return this;
        }

        public Builder setIsSingleDay(boolean isSingleDay) {
            this.isSingleDay = isSingleDay;
            return this;
        }

        public Builder setJoinedGitHubContribution(JoinedGitHubContributionTO joinedGitHubContribution) {
            this.joinedGitHubContribution = joinedGitHubContribution;
            return this;
        }

        public Builder setLatestRestrictedContributionDate(String latestRestrictedContributionDate) {
            this.latestRestrictedContributionDate = latestRestrictedContributionDate;
            return this;
        }

        public Builder setMostRecentCollectionWithActivity(ContributionsCollectionTO mostRecentCollectionWithActivity) {
            this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
            return this;
        }

        public Builder setMostRecentCollectionWithoutActivity(ContributionsCollectionTO mostRecentCollectionWithoutActivity) {
            this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
            return this;
        }

        public Builder setPopularIssueContribution(CreatedIssueContributionTO popularIssueContribution) {
            this.popularIssueContribution = popularIssueContribution;
            return this;
        }

        public Builder setPopularPullRequestContribution(CreatedPullRequestContributionTO popularPullRequestContribution) {
            this.popularPullRequestContribution = popularPullRequestContribution;
            return this;
        }

        public Builder setRestrictedContributionsCount(int restrictedContributionsCount) {
            this.restrictedContributionsCount = restrictedContributionsCount;
            return this;
        }

        public Builder setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder setTotalCommitContributions(int totalCommitContributions) {
            this.totalCommitContributions = totalCommitContributions;
            return this;
        }

        public Builder setTotalPullRequestReviewContributions(int totalPullRequestReviewContributions) {
            this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
            return this;
        }

        public Builder setTotalRepositoriesWithContributedCommits(int totalRepositoriesWithContributedCommits) {
            this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
            return this;
        }

        public Builder setTotalRepositoriesWithContributedPullRequestReviews(int totalRepositoriesWithContributedPullRequestReviews) {
            this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public ContributionsCollectionTO build() {
            return new ContributionsCollectionTO(contributionCalendar, contributionYears, doesEndInCurrentMonth, earliestRestrictedContributionDate, endedAt, firstIssueContribution, firstPullRequestContribution, firstRepositoryContribution, hasActivityInThePast, hasAnyContributions, hasAnyRestrictedContributions, isSingleDay, joinedGitHubContribution, latestRestrictedContributionDate, mostRecentCollectionWithActivity, mostRecentCollectionWithoutActivity, popularIssueContribution, popularPullRequestContribution, restrictedContributionsCount, startedAt, totalCommitContributions, totalPullRequestReviewContributions, totalRepositoriesWithContributedCommits, totalRepositoriesWithContributedPullRequestReviews, user);
        }

    }
}
