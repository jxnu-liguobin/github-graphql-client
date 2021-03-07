package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserResponseProjection extends GraphQLResponseProjection {

    public UserResponseProjection() {
    }

    @Override
    public UserResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserResponseProjection all$(int maxDepth) {
        this.anyPinnableItems();
        this.avatarUrl();
        this.bio();
        this.bioHTML();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1);
            this.commitComments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)));
        }
        this.company();
        this.companyHTML();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) + 1);
            this.contributionsCollection(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.email();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.FollowerConnectionResponseProjection.followers", projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) + 1);
            this.followers(new FollowerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.FollowingConnectionResponseProjection.following", projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) + 1);
            this.following(new FollowingConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistResponseProjection.gist", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) + 1);
            this.gist(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) + 1);
            this.gistComments(new GistCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistConnectionResponseProjection.gists", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) + 1);
            this.gists(new GistConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0)));
        }
        this.id();
        this.isBountyHunter();
        this.isCampusExpert();
        this.isDeveloperProgramMember();
        this.isEmployee();
        this.isHireable();
        this.isSiteAdmin();
        this.isViewer();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0) + 1);
            this.issueComments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1);
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1);
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)));
        }
        this.location();
        this.login();
        this.name();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) + 1);
            this.organizations(new OrganizationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1);
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1);
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)));
        }
        this.pinnedItemsRemaining();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1);
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1);
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0)));
        }
        this.projectsResourcePath();
        this.projectsUrl();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) + 1);
            this.publicKeys(new PublicKeyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1);
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1);
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1);
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1);
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) + 1);
            this.repositoriesContributedTo(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) + 1);
            this.savedReplies(new SavedReplyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1);
            this.sponsorshipsAsMaintainer(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1);
            this.sponsorshipsAsSponsor(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) + 1);
            this.starredRepositories(new StarredRepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.UserStatusResponseProjection.status", projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) + 1);
            this.status(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0)));
        }
        this.updatedAt();
        this.url();
        this.viewerCanChangePinnedItems();
        this.viewerCanCreateProjects();
        this.viewerCanFollow();
        this.viewerIsFollowing();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.watching", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) + 1);
            this.watching(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0)));
        }
        this.websiteUrl();
        this.typename();
        return this;
    }

    public UserResponseProjection anyPinnableItems() {
        return anyPinnableItems((String)null);
    }

    public UserResponseProjection anyPinnableItems(String alias) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias));
        return this;
    }

    public UserResponseProjection anyPinnableItems(UserAnyPinnableItemsParametrizedInput input) {
        return anyPinnableItems(null, input);
    }

    public UserResponseProjection anyPinnableItems(String alias, UserAnyPinnableItemsParametrizedInput input) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input));
        return this;
    }

    public UserResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public UserResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public UserResponseProjection avatarUrl(UserAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public UserResponseProjection avatarUrl(String alias, UserAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public UserResponseProjection bio() {
        return bio(null);
    }

    public UserResponseProjection bio(String alias) {
        fields.add(new GraphQLResponseField("bio").alias(alias));
        return this;
    }

    public UserResponseProjection bioHTML() {
        return bioHTML(null);
    }

    public UserResponseProjection bioHTML(String alias) {
        fields.add(new GraphQLResponseField("bioHTML").alias(alias));
        return this;
    }

    public UserResponseProjection commitComments(CommitCommentConnectionResponseProjection subProjection) {
        return commitComments((String)null, subProjection);
    }

    public UserResponseProjection commitComments(String alias, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection commitComments(UserCommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        return commitComments(null, input, subProjection);
    }

    public UserResponseProjection commitComments(String alias, UserCommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection company() {
        return company(null);
    }

    public UserResponseProjection company(String alias) {
        fields.add(new GraphQLResponseField("company").alias(alias));
        return this;
    }

    public UserResponseProjection companyHTML() {
        return companyHTML(null);
    }

    public UserResponseProjection companyHTML(String alias) {
        fields.add(new GraphQLResponseField("companyHTML").alias(alias));
        return this;
    }

    public UserResponseProjection contributionsCollection(ContributionsCollectionResponseProjection subProjection) {
        return contributionsCollection((String)null, subProjection);
    }

    public UserResponseProjection contributionsCollection(String alias, ContributionsCollectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributionsCollection").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection contributionsCollection(UserContributionsCollectionParametrizedInput input, ContributionsCollectionResponseProjection subProjection) {
        return contributionsCollection(null, input, subProjection);
    }

    public UserResponseProjection contributionsCollection(String alias, UserContributionsCollectionParametrizedInput input, ContributionsCollectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributionsCollection").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserResponseProjection databaseId() {
        return databaseId(null);
    }

    public UserResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public UserResponseProjection email() {
        return email(null);
    }

    public UserResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public UserResponseProjection followers(FollowerConnectionResponseProjection subProjection) {
        return followers((String)null, subProjection);
    }

    public UserResponseProjection followers(String alias, FollowerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("followers").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection followers(UserFollowersParametrizedInput input, FollowerConnectionResponseProjection subProjection) {
        return followers(null, input, subProjection);
    }

    public UserResponseProjection followers(String alias, UserFollowersParametrizedInput input, FollowerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("followers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection following(FollowingConnectionResponseProjection subProjection) {
        return following((String)null, subProjection);
    }

    public UserResponseProjection following(String alias, FollowingConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("following").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection following(UserFollowingParametrizedInput input, FollowingConnectionResponseProjection subProjection) {
        return following(null, input, subProjection);
    }

    public UserResponseProjection following(String alias, UserFollowingParametrizedInput input, FollowingConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("following").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection gist(GistResponseProjection subProjection) {
        return gist((String)null, subProjection);
    }

    public UserResponseProjection gist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gist").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection gist(UserGistParametrizedInput input, GistResponseProjection subProjection) {
        return gist(null, input, subProjection);
    }

    public UserResponseProjection gist(String alias, UserGistParametrizedInput input, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gist").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection gistComments(GistCommentConnectionResponseProjection subProjection) {
        return gistComments((String)null, subProjection);
    }

    public UserResponseProjection gistComments(String alias, GistCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gistComments").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection gistComments(UserGistCommentsParametrizedInput input, GistCommentConnectionResponseProjection subProjection) {
        return gistComments(null, input, subProjection);
    }

    public UserResponseProjection gistComments(String alias, UserGistCommentsParametrizedInput input, GistCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gistComments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection gists(GistConnectionResponseProjection subProjection) {
        return gists((String)null, subProjection);
    }

    public UserResponseProjection gists(String alias, GistConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gists").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection gists(UserGistsParametrizedInput input, GistConnectionResponseProjection subProjection) {
        return gists(null, input, subProjection);
    }

    public UserResponseProjection gists(String alias, UserGistsParametrizedInput input, GistConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gists").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection id() {
        return id(null);
    }

    public UserResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserResponseProjection isBountyHunter() {
        return isBountyHunter(null);
    }

    public UserResponseProjection isBountyHunter(String alias) {
        fields.add(new GraphQLResponseField("isBountyHunter").alias(alias));
        return this;
    }

    public UserResponseProjection isCampusExpert() {
        return isCampusExpert(null);
    }

    public UserResponseProjection isCampusExpert(String alias) {
        fields.add(new GraphQLResponseField("isCampusExpert").alias(alias));
        return this;
    }

    public UserResponseProjection isDeveloperProgramMember() {
        return isDeveloperProgramMember(null);
    }

    public UserResponseProjection isDeveloperProgramMember(String alias) {
        fields.add(new GraphQLResponseField("isDeveloperProgramMember").alias(alias));
        return this;
    }

    public UserResponseProjection isEmployee() {
        return isEmployee(null);
    }

    public UserResponseProjection isEmployee(String alias) {
        fields.add(new GraphQLResponseField("isEmployee").alias(alias));
        return this;
    }

    public UserResponseProjection isHireable() {
        return isHireable(null);
    }

    public UserResponseProjection isHireable(String alias) {
        fields.add(new GraphQLResponseField("isHireable").alias(alias));
        return this;
    }

    public UserResponseProjection isSiteAdmin() {
        return isSiteAdmin(null);
    }

    public UserResponseProjection isSiteAdmin(String alias) {
        fields.add(new GraphQLResponseField("isSiteAdmin").alias(alias));
        return this;
    }

    public UserResponseProjection isViewer() {
        return isViewer(null);
    }

    public UserResponseProjection isViewer(String alias) {
        fields.add(new GraphQLResponseField("isViewer").alias(alias));
        return this;
    }

    public UserResponseProjection issueComments(IssueCommentConnectionResponseProjection subProjection) {
        return issueComments((String)null, subProjection);
    }

    public UserResponseProjection issueComments(String alias, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueComments").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection issueComments(UserIssueCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        return issueComments(null, input, subProjection);
    }

    public UserResponseProjection issueComments(String alias, UserIssueCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueComments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection issues(IssueConnectionResponseProjection subProjection) {
        return issues((String)null, subProjection);
    }

    public UserResponseProjection issues(String alias, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection issues(UserIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        return issues(null, input, subProjection);
    }

    public UserResponseProjection issues(String alias, UserIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection itemShowcase(ProfileItemShowcaseResponseProjection subProjection) {
        return itemShowcase(null, subProjection);
    }

    public UserResponseProjection itemShowcase(String alias, ProfileItemShowcaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection location() {
        return location(null);
    }

    public UserResponseProjection location(String alias) {
        fields.add(new GraphQLResponseField("location").alias(alias));
        return this;
    }

    public UserResponseProjection login() {
        return login(null);
    }

    public UserResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public UserResponseProjection name() {
        return name(null);
    }

    public UserResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization((String)null, subProjection);
    }

    public UserResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection organization(UserOrganizationParametrizedInput input, OrganizationResponseProjection subProjection) {
        return organization(null, input, subProjection);
    }

    public UserResponseProjection organization(String alias, UserOrganizationParametrizedInput input, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection organizations(OrganizationConnectionResponseProjection subProjection) {
        return organizations((String)null, subProjection);
    }

    public UserResponseProjection organizations(String alias, OrganizationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organizations").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection organizations(UserOrganizationsParametrizedInput input, OrganizationConnectionResponseProjection subProjection) {
        return organizations(null, input, subProjection);
    }

    public UserResponseProjection organizations(String alias, UserOrganizationsParametrizedInput input, OrganizationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organizations").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnableItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems((String)null, subProjection);
    }

    public UserResponseProjection pinnableItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnableItems(UserPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems(null, input, subProjection);
    }

    public UserResponseProjection pinnableItems(String alias, UserPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnedItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems((String)null, subProjection);
    }

    public UserResponseProjection pinnedItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnedItems(UserPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems(null, input, subProjection);
    }

    public UserResponseProjection pinnedItems(String alias, UserPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnedItemsRemaining() {
        return pinnedItemsRemaining(null);
    }

    public UserResponseProjection pinnedItemsRemaining(String alias) {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias));
        return this;
    }

    @Deprecated
    public UserResponseProjection pinnedRepositories(RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories((String)null, subProjection);
    }

    public UserResponseProjection pinnedRepositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection pinnedRepositories(UserPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories(null, input, subProjection);
    }

    public UserResponseProjection pinnedRepositories(String alias, UserPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection project(ProjectResponseProjection subProjection) {
        return project((String)null, subProjection);
    }

    public UserResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection project(UserProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return project(null, input, subProjection);
    }

    public UserResponseProjection project(String alias, UserProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection projects(ProjectConnectionResponseProjection subProjection) {
        return projects((String)null, subProjection);
    }

    public UserResponseProjection projects(String alias, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection projects(UserProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        return projects(null, input, subProjection);
    }

    public UserResponseProjection projects(String alias, UserProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection projectsResourcePath() {
        return projectsResourcePath(null);
    }

    public UserResponseProjection projectsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias));
        return this;
    }

    public UserResponseProjection projectsUrl() {
        return projectsUrl(null);
    }

    public UserResponseProjection projectsUrl(String alias) {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias));
        return this;
    }

    public UserResponseProjection publicKeys(PublicKeyConnectionResponseProjection subProjection) {
        return publicKeys((String)null, subProjection);
    }

    public UserResponseProjection publicKeys(String alias, PublicKeyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("publicKeys").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection publicKeys(UserPublicKeysParametrizedInput input, PublicKeyConnectionResponseProjection subProjection) {
        return publicKeys(null, input, subProjection);
    }

    public UserResponseProjection publicKeys(String alias, UserPublicKeysParametrizedInput input, PublicKeyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("publicKeys").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection pullRequests(PullRequestConnectionResponseProjection subProjection) {
        return pullRequests((String)null, subProjection);
    }

    public UserResponseProjection pullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection pullRequests(UserPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return pullRequests(null, input, subProjection);
    }

    public UserResponseProjection pullRequests(String alias, UserPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection registryPackages(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages((String)null, subProjection);
    }

    public UserResponseProjection registryPackages(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection registryPackages(UserRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages(null, input, subProjection);
    }

    public UserResponseProjection registryPackages(String alias, UserRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection registryPackagesForQuery(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery((String)null, subProjection);
    }

    public UserResponseProjection registryPackagesForQuery(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection registryPackagesForQuery(UserRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery(null, input, subProjection);
    }

    public UserResponseProjection registryPackagesForQuery(String alias, UserRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection repositories(RepositoryConnectionResponseProjection subProjection) {
        return repositories((String)null, subProjection);
    }

    public UserResponseProjection repositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection repositories(UserRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return repositories(null, input, subProjection);
    }

    public UserResponseProjection repositories(String alias, UserRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection repositoriesContributedTo(RepositoryConnectionResponseProjection subProjection) {
        return repositoriesContributedTo((String)null, subProjection);
    }

    public UserResponseProjection repositoriesContributedTo(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoriesContributedTo").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection repositoriesContributedTo(UserRepositoriesContributedToParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return repositoriesContributedTo(null, input, subProjection);
    }

    public UserResponseProjection repositoriesContributedTo(String alias, UserRepositoriesContributedToParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoriesContributedTo").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository((String)null, subProjection);
    }

    public UserResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection repository(UserRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        return repository(null, input, subProjection);
    }

    public UserResponseProjection repository(String alias, UserRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public UserResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public UserResponseProjection savedReplies(SavedReplyConnectionResponseProjection subProjection) {
        return savedReplies((String)null, subProjection);
    }

    public UserResponseProjection savedReplies(String alias, SavedReplyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("savedReplies").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection savedReplies(UserSavedRepliesParametrizedInput input, SavedReplyConnectionResponseProjection subProjection) {
        return savedReplies(null, input, subProjection);
    }

    public UserResponseProjection savedReplies(String alias, UserSavedRepliesParametrizedInput input, SavedReplyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("savedReplies").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection sponsorshipsAsMaintainer(SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsMaintainer((String)null, subProjection);
    }

    public UserResponseProjection sponsorshipsAsMaintainer(String alias, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection sponsorshipsAsMaintainer(UserSponsorshipsAsMaintainerParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsMaintainer(null, input, subProjection);
    }

    public UserResponseProjection sponsorshipsAsMaintainer(String alias, UserSponsorshipsAsMaintainerParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection sponsorshipsAsSponsor(SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsSponsor((String)null, subProjection);
    }

    public UserResponseProjection sponsorshipsAsSponsor(String alias, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection sponsorshipsAsSponsor(UserSponsorshipsAsSponsorParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsSponsor(null, input, subProjection);
    }

    public UserResponseProjection sponsorshipsAsSponsor(String alias, UserSponsorshipsAsSponsorParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection starredRepositories(StarredRepositoryConnectionResponseProjection subProjection) {
        return starredRepositories((String)null, subProjection);
    }

    public UserResponseProjection starredRepositories(String alias, StarredRepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("starredRepositories").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection starredRepositories(UserStarredRepositoriesParametrizedInput input, StarredRepositoryConnectionResponseProjection subProjection) {
        return starredRepositories(null, input, subProjection);
    }

    public UserResponseProjection starredRepositories(String alias, UserStarredRepositoriesParametrizedInput input, StarredRepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("starredRepositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection status(UserStatusResponseProjection subProjection) {
        return status(null, subProjection);
    }

    public UserResponseProjection status(String alias, UserStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public UserResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public UserResponseProjection url() {
        return url(null);
    }

    public UserResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public UserResponseProjection viewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems(null);
    }

    public UserResponseProjection viewerCanChangePinnedItems(String alias) {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias));
        return this;
    }

    public UserResponseProjection viewerCanCreateProjects() {
        return viewerCanCreateProjects(null);
    }

    public UserResponseProjection viewerCanCreateProjects(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias));
        return this;
    }

    public UserResponseProjection viewerCanFollow() {
        return viewerCanFollow(null);
    }

    public UserResponseProjection viewerCanFollow(String alias) {
        fields.add(new GraphQLResponseField("viewerCanFollow").alias(alias));
        return this;
    }

    public UserResponseProjection viewerIsFollowing() {
        return viewerIsFollowing(null);
    }

    public UserResponseProjection viewerIsFollowing(String alias) {
        fields.add(new GraphQLResponseField("viewerIsFollowing").alias(alias));
        return this;
    }

    public UserResponseProjection watching(RepositoryConnectionResponseProjection subProjection) {
        return watching((String)null, subProjection);
    }

    public UserResponseProjection watching(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("watching").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection watching(UserWatchingParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return watching(null, input, subProjection);
    }

    public UserResponseProjection watching(String alias, UserWatchingParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("watching").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public UserResponseProjection websiteUrl() {
        return websiteUrl(null);
    }

    public UserResponseProjection websiteUrl(String alias) {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias));
        return this;
    }

    public UserResponseProjection typename() {
        return typename(null);
    }

    public UserResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UserResponseProjection that = (UserResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
