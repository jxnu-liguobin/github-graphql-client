package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionsCollectionResponseProjection extends GraphQLResponseProjection {

    public ContributionsCollectionResponseProjection() {
    }

    @Override
    public ContributionsCollectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionsCollectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0) + 1);
            this.commitContributionsByRepository(new CommitContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CommitContributionsByRepositoryResponseProjection.commitContributionsByRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0) + 1);
            this.contributionCalendar(new ContributionCalendarResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionCalendarResponseProjection.contributionCalendar", 0)));
        }
        this.contributionYears();
        this.doesEndInCurrentMonth();
        this.earliestRestrictedContributionDate();
        this.endedAt();
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0) + 1);
            this.firstIssueContribution(new CreatedIssueOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueOrRestrictedContributionResponseProjection.firstIssueContribution", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0) + 1);
            this.firstPullRequestContribution(new CreatedPullRequestOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestOrRestrictedContributionResponseProjection.firstPullRequestContribution", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0) + 1);
            this.firstRepositoryContribution(new CreatedRepositoryOrRestrictedContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryOrRestrictedContributionResponseProjection.firstRepositoryContribution", 0)));
        }
        this.hasActivityInThePast();
        this.hasAnyContributions();
        this.hasAnyRestrictedContributions();
        this.isSingleDay();
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0) + 1);
            this.issueContributions(new CreatedIssueContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionConnectionResponseProjection.issueContributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0) + 1);
            this.issueContributionsByRepository(new IssueContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.IssueContributionsByRepositoryResponseProjection.issueContributionsByRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0) + 1);
            this.joinedGitHubContribution(new JoinedGitHubContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.JoinedGitHubContributionResponseProjection.joinedGitHubContribution", 0)));
        }
        this.latestRestrictedContributionDate();
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0) + 1);
            this.mostRecentCollectionWithActivity(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithActivity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0) + 1);
            this.mostRecentCollectionWithoutActivity(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.ContributionsCollectionResponseProjection.mostRecentCollectionWithoutActivity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0) + 1);
            this.popularIssueContribution(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedIssueContributionResponseProjection.popularIssueContribution", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0) + 1);
            this.popularPullRequestContribution(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionResponseProjection.popularPullRequestContribution", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0) + 1);
            this.pullRequestContributions(new CreatedPullRequestContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.pullRequestContributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0) + 1);
            this.pullRequestContributionsByRepository(new PullRequestContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestContributionsByRepositoryResponseProjection.pullRequestContributionsByRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0) + 1);
            this.pullRequestReviewContributions(new CreatedPullRequestReviewContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedPullRequestReviewContributionConnectionResponseProjection.pullRequestReviewContributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0) + 1);
            this.pullRequestReviewContributionsByRepository(new PullRequestReviewContributionsByRepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.PullRequestReviewContributionsByRepositoryResponseProjection.pullRequestReviewContributionsByRepository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0) + 1);
            this.repositoryContributions(new CreatedRepositoryContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.CreatedRepositoryContributionConnectionResponseProjection.repositoryContributions", 0)));
        }
        this.restrictedContributionsCount();
        this.startedAt();
        this.totalCommitContributions();
        this.totalIssueContributions();
        this.totalPullRequestContributions();
        this.totalPullRequestReviewContributions();
        this.totalRepositoriesWithContributedCommits();
        this.totalRepositoriesWithContributedIssues();
        this.totalRepositoriesWithContributedPullRequestReviews();
        this.totalRepositoriesWithContributedPullRequests();
        this.totalRepositoryContributions();
        if (projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionsCollectionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionsCollectionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ContributionsCollectionResponseProjection commitContributionsByRepository(CommitContributionsByRepositoryResponseProjection subProjection) {
        return commitContributionsByRepository((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection commitContributionsByRepository(String alias, CommitContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitContributionsByRepository").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection commitContributionsByRepository(ContributionsCollectionCommitContributionsByRepositoryParametrizedInput input, CommitContributionsByRepositoryResponseProjection subProjection) {
        return commitContributionsByRepository(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection commitContributionsByRepository(String alias, ContributionsCollectionCommitContributionsByRepositoryParametrizedInput input, CommitContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitContributionsByRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection contributionCalendar(ContributionCalendarResponseProjection subProjection) {
        return contributionCalendar(null, subProjection);
    }

    public ContributionsCollectionResponseProjection contributionCalendar(String alias, ContributionCalendarResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributionCalendar").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection contributionYears() {
        return contributionYears(null);
    }

    public ContributionsCollectionResponseProjection contributionYears(String alias) {
        fields.add(new GraphQLResponseField("contributionYears").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection doesEndInCurrentMonth() {
        return doesEndInCurrentMonth(null);
    }

    public ContributionsCollectionResponseProjection doesEndInCurrentMonth(String alias) {
        fields.add(new GraphQLResponseField("doesEndInCurrentMonth").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection earliestRestrictedContributionDate() {
        return earliestRestrictedContributionDate(null);
    }

    public ContributionsCollectionResponseProjection earliestRestrictedContributionDate(String alias) {
        fields.add(new GraphQLResponseField("earliestRestrictedContributionDate").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection endedAt() {
        return endedAt(null);
    }

    public ContributionsCollectionResponseProjection endedAt(String alias) {
        fields.add(new GraphQLResponseField("endedAt").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection firstIssueContribution(CreatedIssueOrRestrictedContributionResponseProjection subProjection) {
        return firstIssueContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection firstIssueContribution(String alias, CreatedIssueOrRestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("firstIssueContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection firstPullRequestContribution(CreatedPullRequestOrRestrictedContributionResponseProjection subProjection) {
        return firstPullRequestContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection firstPullRequestContribution(String alias, CreatedPullRequestOrRestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("firstPullRequestContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection firstRepositoryContribution(CreatedRepositoryOrRestrictedContributionResponseProjection subProjection) {
        return firstRepositoryContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection firstRepositoryContribution(String alias, CreatedRepositoryOrRestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("firstRepositoryContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection hasActivityInThePast() {
        return hasActivityInThePast(null);
    }

    public ContributionsCollectionResponseProjection hasActivityInThePast(String alias) {
        fields.add(new GraphQLResponseField("hasActivityInThePast").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection hasAnyContributions() {
        return hasAnyContributions(null);
    }

    public ContributionsCollectionResponseProjection hasAnyContributions(String alias) {
        fields.add(new GraphQLResponseField("hasAnyContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection hasAnyRestrictedContributions() {
        return hasAnyRestrictedContributions(null);
    }

    public ContributionsCollectionResponseProjection hasAnyRestrictedContributions(String alias) {
        fields.add(new GraphQLResponseField("hasAnyRestrictedContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection isSingleDay() {
        return isSingleDay(null);
    }

    public ContributionsCollectionResponseProjection isSingleDay(String alias) {
        fields.add(new GraphQLResponseField("isSingleDay").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection issueContributions(CreatedIssueContributionConnectionResponseProjection subProjection) {
        return issueContributions((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection issueContributions(String alias, CreatedIssueContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueContributions").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection issueContributions(ContributionsCollectionIssueContributionsParametrizedInput input, CreatedIssueContributionConnectionResponseProjection subProjection) {
        return issueContributions(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection issueContributions(String alias, ContributionsCollectionIssueContributionsParametrizedInput input, CreatedIssueContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueContributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection issueContributionsByRepository(IssueContributionsByRepositoryResponseProjection subProjection) {
        return issueContributionsByRepository((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection issueContributionsByRepository(String alias, IssueContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueContributionsByRepository").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection issueContributionsByRepository(ContributionsCollectionIssueContributionsByRepositoryParametrizedInput input, IssueContributionsByRepositoryResponseProjection subProjection) {
        return issueContributionsByRepository(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection issueContributionsByRepository(String alias, ContributionsCollectionIssueContributionsByRepositoryParametrizedInput input, IssueContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueContributionsByRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection joinedGitHubContribution(JoinedGitHubContributionResponseProjection subProjection) {
        return joinedGitHubContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection joinedGitHubContribution(String alias, JoinedGitHubContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("joinedGitHubContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection latestRestrictedContributionDate() {
        return latestRestrictedContributionDate(null);
    }

    public ContributionsCollectionResponseProjection latestRestrictedContributionDate(String alias) {
        fields.add(new GraphQLResponseField("latestRestrictedContributionDate").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection mostRecentCollectionWithActivity(ContributionsCollectionResponseProjection subProjection) {
        return mostRecentCollectionWithActivity(null, subProjection);
    }

    public ContributionsCollectionResponseProjection mostRecentCollectionWithActivity(String alias, ContributionsCollectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mostRecentCollectionWithActivity").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection mostRecentCollectionWithoutActivity(ContributionsCollectionResponseProjection subProjection) {
        return mostRecentCollectionWithoutActivity(null, subProjection);
    }

    public ContributionsCollectionResponseProjection mostRecentCollectionWithoutActivity(String alias, ContributionsCollectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mostRecentCollectionWithoutActivity").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection popularIssueContribution(CreatedIssueContributionResponseProjection subProjection) {
        return popularIssueContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection popularIssueContribution(String alias, CreatedIssueContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("popularIssueContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection popularPullRequestContribution(CreatedPullRequestContributionResponseProjection subProjection) {
        return popularPullRequestContribution(null, subProjection);
    }

    public ContributionsCollectionResponseProjection popularPullRequestContribution(String alias, CreatedPullRequestContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("popularPullRequestContribution").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestContributions(CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        return pullRequestContributions((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestContributions(String alias, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestContributions").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestContributions(ContributionsCollectionPullRequestContributionsParametrizedInput input, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        return pullRequestContributions(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestContributions(String alias, ContributionsCollectionPullRequestContributionsParametrizedInput input, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestContributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestContributionsByRepository(PullRequestContributionsByRepositoryResponseProjection subProjection) {
        return pullRequestContributionsByRepository((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestContributionsByRepository(String alias, PullRequestContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestContributionsByRepository(ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput input, PullRequestContributionsByRepositoryResponseProjection subProjection) {
        return pullRequestContributionsByRepository(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestContributionsByRepository(String alias, ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput input, PullRequestContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestContributionsByRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributions(CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        return pullRequestReviewContributions((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributions(String alias, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReviewContributions").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributions(ContributionsCollectionPullRequestReviewContributionsParametrizedInput input, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        return pullRequestReviewContributions(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributions(String alias, ContributionsCollectionPullRequestReviewContributionsParametrizedInput input, CreatedPullRequestReviewContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReviewContributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributionsByRepository(PullRequestReviewContributionsByRepositoryResponseProjection subProjection) {
        return pullRequestReviewContributionsByRepository((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributionsByRepository(String alias, PullRequestReviewContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributionsByRepository(ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput input, PullRequestReviewContributionsByRepositoryResponseProjection subProjection) {
        return pullRequestReviewContributionsByRepository(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection pullRequestReviewContributionsByRepository(String alias, ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput input, PullRequestReviewContributionsByRepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReviewContributionsByRepository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection repositoryContributions(CreatedRepositoryContributionConnectionResponseProjection subProjection) {
        return repositoryContributions((String)null, subProjection);
    }

    public ContributionsCollectionResponseProjection repositoryContributions(String alias, CreatedRepositoryContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryContributions").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection repositoryContributions(ContributionsCollectionRepositoryContributionsParametrizedInput input, CreatedRepositoryContributionConnectionResponseProjection subProjection) {
        return repositoryContributions(null, input, subProjection);
    }

    public ContributionsCollectionResponseProjection repositoryContributions(String alias, ContributionsCollectionRepositoryContributionsParametrizedInput input, CreatedRepositoryContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryContributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection restrictedContributionsCount() {
        return restrictedContributionsCount(null);
    }

    public ContributionsCollectionResponseProjection restrictedContributionsCount(String alias) {
        fields.add(new GraphQLResponseField("restrictedContributionsCount").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection startedAt() {
        return startedAt(null);
    }

    public ContributionsCollectionResponseProjection startedAt(String alias) {
        fields.add(new GraphQLResponseField("startedAt").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalCommitContributions() {
        return totalCommitContributions(null);
    }

    public ContributionsCollectionResponseProjection totalCommitContributions(String alias) {
        fields.add(new GraphQLResponseField("totalCommitContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalIssueContributions() {
        return totalIssueContributions((String)null);
    }

    public ContributionsCollectionResponseProjection totalIssueContributions(String alias) {
        fields.add(new GraphQLResponseField("totalIssueContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalIssueContributions(ContributionsCollectionTotalIssueContributionsParametrizedInput input) {
        return totalIssueContributions(null, input);
    }

    public ContributionsCollectionResponseProjection totalIssueContributions(String alias, ContributionsCollectionTotalIssueContributionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("totalIssueContributions").alias(alias).parameters(input));
        return this;
    }

    public ContributionsCollectionResponseProjection totalPullRequestContributions() {
        return totalPullRequestContributions((String)null);
    }

    public ContributionsCollectionResponseProjection totalPullRequestContributions(String alias) {
        fields.add(new GraphQLResponseField("totalPullRequestContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalPullRequestContributions(ContributionsCollectionTotalPullRequestContributionsParametrizedInput input) {
        return totalPullRequestContributions(null, input);
    }

    public ContributionsCollectionResponseProjection totalPullRequestContributions(String alias, ContributionsCollectionTotalPullRequestContributionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("totalPullRequestContributions").alias(alias).parameters(input));
        return this;
    }

    public ContributionsCollectionResponseProjection totalPullRequestReviewContributions() {
        return totalPullRequestReviewContributions(null);
    }

    public ContributionsCollectionResponseProjection totalPullRequestReviewContributions(String alias) {
        fields.add(new GraphQLResponseField("totalPullRequestReviewContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedCommits() {
        return totalRepositoriesWithContributedCommits(null);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedCommits(String alias) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedCommits").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedIssues() {
        return totalRepositoriesWithContributedIssues((String)null);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedIssues(String alias) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedIssues(ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput input) {
        return totalRepositoriesWithContributedIssues(null, input);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedIssues(String alias, ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput input) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedIssues").alias(alias).parameters(input));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequestReviews() {
        return totalRepositoriesWithContributedPullRequestReviews(null);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequestReviews(String alias) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequestReviews").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequests() {
        return totalRepositoriesWithContributedPullRequests((String)null);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequests(String alias) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequests(ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput input) {
        return totalRepositoriesWithContributedPullRequests(null, input);
    }

    public ContributionsCollectionResponseProjection totalRepositoriesWithContributedPullRequests(String alias, ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput input) {
        fields.add(new GraphQLResponseField("totalRepositoriesWithContributedPullRequests").alias(alias).parameters(input));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoryContributions() {
        return totalRepositoryContributions((String)null);
    }

    public ContributionsCollectionResponseProjection totalRepositoryContributions(String alias) {
        fields.add(new GraphQLResponseField("totalRepositoryContributions").alias(alias));
        return this;
    }

    public ContributionsCollectionResponseProjection totalRepositoryContributions(ContributionsCollectionTotalRepositoryContributionsParametrizedInput input) {
        return totalRepositoryContributions(null, input);
    }

    public ContributionsCollectionResponseProjection totalRepositoryContributions(String alias, ContributionsCollectionTotalRepositoryContributionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("totalRepositoryContributions").alias(alias).parameters(input));
        return this;
    }

    public ContributionsCollectionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ContributionsCollectionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionsCollectionResponseProjection typename() {
        return typename(null);
    }

    public ContributionsCollectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
