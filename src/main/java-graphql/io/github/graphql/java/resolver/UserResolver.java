package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface UserResolver {

    boolean anyPinnableItems(UserTO userTO, PinnableItemTypeTO type) throws Exception;

    @javax.validation.constraints.NotNull
    String avatarUrl(UserTO userTO, Integer size) throws Exception;

    @javax.validation.constraints.NotNull
    CommitCommentConnectionTO commitComments(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ContributionsCollectionTO contributionsCollection(UserTO userTO, String from, String organizationID, String to) throws Exception;

    @javax.validation.constraints.NotNull
    FollowerConnectionTO followers(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    FollowingConnectionTO following(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    GistTO gist(UserTO userTO, String name) throws Exception;

    @javax.validation.constraints.NotNull
    GistCommentConnectionTO gistComments(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    GistConnectionTO gists(UserTO userTO, String after, String before, Integer first, Integer last, GistOrderTO orderBy, GistPrivacyTO privacy) throws Exception;

    @javax.validation.constraints.NotNull
    IssueCommentConnectionTO issueComments(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    IssueConnectionTO issues(UserTO userTO, String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) throws Exception;

    OrganizationTO organization(UserTO userTO, String login) throws Exception;

    @javax.validation.constraints.NotNull
    OrganizationConnectionTO organizations(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnableItems(UserTO userTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnedItems(UserTO userTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @Deprecated
    @javax.validation.constraints.NotNull
    RepositoryConnectionTO pinnedRepositories(UserTO userTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    ProjectTO project(UserTO userTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectConnectionTO projects(UserTO userTO, String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) throws Exception;

    @javax.validation.constraints.NotNull
    PublicKeyConnectionTO publicKeys(UserTO userTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO pullRequests(UserTO userTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackages(UserTO userTO, String after, String before, Integer first, Integer last, String name, java.util.List<String> names, RegistryPackageTypeTO packageType, Boolean publicOnly, String registryPackageType, String repositoryId) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackagesForQuery(UserTO userTO, String after, String before, Integer first, Integer last, RegistryPackageTypeTO packageType, String query) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO repositories(UserTO userTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isFork, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO repositoriesContributedTo(UserTO userTO, String after, String before, java.util.List<RepositoryContributionTypeTO> contributionTypes, Integer first, Boolean includeUserRepositories, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, RepositoryPrivacyTO privacy) throws Exception;

    RepositoryTO repository(UserTO userTO, String name) throws Exception;

    SavedReplyConnectionTO savedReplies(UserTO userTO, String after, String before, Integer first, Integer last, SavedReplyOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsMaintainer(UserTO userTO, String after, String before, Integer first, Boolean includePrivate, Integer last, SponsorshipOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsSponsor(UserTO userTO, String after, String before, Integer first, Integer last, SponsorshipOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    StarredRepositoryConnectionTO starredRepositories(UserTO userTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy, Boolean ownedByViewer) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO watching(UserTO userTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

}
