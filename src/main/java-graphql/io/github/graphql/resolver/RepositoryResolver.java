package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RepositoryResolver {

    @javax.validation.constraints.NotNull
    UserConnectionTO assignableUsers(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    BranchProtectionRuleConnectionTO branchProtectionRules(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    RepositoryCollaboratorConnectionTO collaborators(RepositoryTO repositoryTO, CollaboratorAffiliationTO affiliation, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    CommitCommentConnectionTO commitComments(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    DeployKeyConnectionTO deployKeys(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    DeploymentConnectionTO deployments(RepositoryTO repositoryTO, String after, String before, java.util.List<String> environments, Integer first, Integer last, DeploymentOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO forks(RepositoryTO repositoryTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    IssueTO issue(RepositoryTO repositoryTO, int number) throws Exception;

    IssueOrPullRequestTO issueOrPullRequest(RepositoryTO repositoryTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    IssueConnectionTO issues(RepositoryTO repositoryTO, String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) throws Exception;

    LabelTO label(RepositoryTO repositoryTO, String name) throws Exception;

    LabelConnectionTO labels(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, String query) throws Exception;

    LanguageConnectionTO languages(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, LanguageOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    UserConnectionTO mentionableUsers(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    MilestoneTO milestone(RepositoryTO repositoryTO, int number) throws Exception;

    MilestoneConnectionTO milestones(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, MilestoneOrderTO orderBy, java.util.List<MilestoneStateTO> states) throws Exception;

    GitObjectTO object(RepositoryTO repositoryTO, String expression, String oid) throws Exception;

    ProjectTO project(RepositoryTO repositoryTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectConnectionTO projects(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) throws Exception;

    PullRequestTO pullRequest(RepositoryTO repositoryTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO pullRequests(RepositoryTO repositoryTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

    RefTO ref(RepositoryTO repositoryTO, String qualifiedName) throws Exception;

    RefConnectionTO refs(RepositoryTO repositoryTO, String after, String before, OrderDirectionTO direction, Integer first, Integer last, RefOrderTO orderBy, String refPrefix) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackages(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, String name, java.util.List<String> names, RegistryPackageTypeTO packageType, Boolean publicOnly, String registryPackageType, String repositoryId) throws Exception;

    ReleaseTO release(RepositoryTO repositoryTO, String tagName) throws Exception;

    @javax.validation.constraints.NotNull
    ReleaseConnectionTO releases(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, ReleaseOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryTopicConnectionTO repositoryTopics(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    String shortDescriptionHTML(RepositoryTO repositoryTO, Integer limit) throws Exception;

    @javax.validation.constraints.NotNull
    StargazerConnectionTO stargazers(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    UserConnectionTO watchers(RepositoryTO repositoryTO, String after, String before, Integer first, Integer last) throws Exception;

}
