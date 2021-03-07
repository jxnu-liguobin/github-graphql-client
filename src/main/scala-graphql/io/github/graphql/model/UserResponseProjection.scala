package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UserResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserResponseProjection = {
        this.anyPinnableItems()
        this.avatarUrl()
        this.bio()
        this.bioHTML()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1)
            this.commitComments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)))
        }
        this.company()
        this.companyHTML()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) + 1)
            this.contributionsCollection(new ContributionsCollectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.email()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.FollowerConnectionResponseProjection.followers", projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) + 1)
            this.followers(new FollowerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.FollowingConnectionResponseProjection.following", projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) + 1)
            this.following(new FollowingConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistResponseProjection.gist", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) + 1)
            this.gist(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) + 1)
            this.gistComments(new GistCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.GistConnectionResponseProjection.gists", projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) + 1)
            this.gists(new GistConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0)))
        }
        this.id()
        this.isBountyHunter()
        this.isCampusExpert()
        this.isDeveloperProgramMember()
        this.isEmployee()
        this.isHireable()
        this.isSiteAdmin()
        this.isViewer()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0) + 1)
            this.issueComments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1)
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1)
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        this.name()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) + 1)
            this.organizations(new OrganizationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1)
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1)
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1)
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1)
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) + 1)
            this.publicKeys(new PublicKeyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1)
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1)
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1)
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1)
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) + 1)
            this.repositoriesContributedTo(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) + 1)
            this.savedReplies(new SavedReplyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1)
            this.sponsorshipsAsMaintainer(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1)
            this.sponsorshipsAsSponsor(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) + 1)
            this.starredRepositories(new StarredRepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.UserStatusResponseProjection.status", projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) + 1)
            this.status(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0)))
        }
        this.updatedAt()
        this.url()
        this.viewerCanChangePinnedItems()
        this.viewerCanCreateProjects()
        this.viewerCanFollow()
        this.viewerIsFollowing()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.RepositoryConnectionResponseProjection.watching", projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) + 1)
            this.watching(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0)))
        }
        this.websiteUrl()
        this.typename()
        this
    }

    def anyPinnableItems(): UserResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String])
    }

    def anyPinnableItems(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias))
        this
    }

    def anyPinnableItems(input: UserAnyPinnableItemsParametrizedInput): UserResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String], input)
    }

    def anyPinnableItems(alias: String, input: UserAnyPinnableItemsParametrizedInput ): UserResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        this
    }

    def avatarUrl(): UserResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: UserAvatarUrlParametrizedInput): UserResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: UserAvatarUrlParametrizedInput ): UserResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def bio(): UserResponseProjection = {
        bio(null.asInstanceOf[String])
    }

    def bio(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("bio").alias(alias))
        this
    }

    def bioHTML(): UserResponseProjection = {
        bioHTML(null.asInstanceOf[String])
    }

    def bioHTML(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("bioHTML").alias(alias))
        this
    }

    def commitComments(subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = {
        commitComments(null.asInstanceOf[String], subProjection)
    }

    def commitComments(alias: String, subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).projection(subProjection))
        this
    }

    def commitComments(input: UserCommitCommentsParametrizedInput,subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = {
        commitComments(null.asInstanceOf[String], input, subProjection)
    }

    def commitComments(alias: String, input: UserCommitCommentsParametrizedInput , subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def company(): UserResponseProjection = {
        company(null.asInstanceOf[String])
    }

    def company(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("company").alias(alias))
        this
    }

    def companyHTML(): UserResponseProjection = {
        companyHTML(null.asInstanceOf[String])
    }

    def companyHTML(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("companyHTML").alias(alias))
        this
    }

    def contributionsCollection(subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = {
        contributionsCollection(null.asInstanceOf[String], subProjection)
    }

    def contributionsCollection(alias: String, subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("contributionsCollection").alias(alias).projection(subProjection))
        this
    }

    def contributionsCollection(input: UserContributionsCollectionParametrizedInput,subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = {
        contributionsCollection(null.asInstanceOf[String], input, subProjection)
    }

    def contributionsCollection(alias: String, input: UserContributionsCollectionParametrizedInput , subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("contributionsCollection").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): UserResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): UserResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def email(): UserResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def followers(subProjection: FollowerConnectionResponseProjection): UserResponseProjection = {
        followers(null.asInstanceOf[String], subProjection)
    }

    def followers(alias: String, subProjection: FollowerConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("followers").alias(alias).projection(subProjection))
        this
    }

    def followers(input: UserFollowersParametrizedInput,subProjection: FollowerConnectionResponseProjection): UserResponseProjection = {
        followers(null.asInstanceOf[String], input, subProjection)
    }

    def followers(alias: String, input: UserFollowersParametrizedInput , subProjection: FollowerConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("followers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def following(subProjection: FollowingConnectionResponseProjection): UserResponseProjection = {
        following(null.asInstanceOf[String], subProjection)
    }

    def following(alias: String, subProjection: FollowingConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("following").alias(alias).projection(subProjection))
        this
    }

    def following(input: UserFollowingParametrizedInput,subProjection: FollowingConnectionResponseProjection): UserResponseProjection = {
        following(null.asInstanceOf[String], input, subProjection)
    }

    def following(alias: String, input: UserFollowingParametrizedInput , subProjection: FollowingConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("following").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def gist(subProjection: GistResponseProjection): UserResponseProjection = {
        gist(null.asInstanceOf[String], subProjection)
    }

    def gist(alias: String, subProjection: GistResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gist").alias(alias).projection(subProjection))
        this
    }

    def gist(input: UserGistParametrizedInput,subProjection: GistResponseProjection): UserResponseProjection = {
        gist(null.asInstanceOf[String], input, subProjection)
    }

    def gist(alias: String, input: UserGistParametrizedInput , subProjection: GistResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gist").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def gistComments(subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = {
        gistComments(null.asInstanceOf[String], subProjection)
    }

    def gistComments(alias: String, subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gistComments").alias(alias).projection(subProjection))
        this
    }

    def gistComments(input: UserGistCommentsParametrizedInput,subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = {
        gistComments(null.asInstanceOf[String], input, subProjection)
    }

    def gistComments(alias: String, input: UserGistCommentsParametrizedInput , subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gistComments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def gists(subProjection: GistConnectionResponseProjection): UserResponseProjection = {
        gists(null.asInstanceOf[String], subProjection)
    }

    def gists(alias: String, subProjection: GistConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gists").alias(alias).projection(subProjection))
        this
    }

    def gists(input: UserGistsParametrizedInput,subProjection: GistConnectionResponseProjection): UserResponseProjection = {
        gists(null.asInstanceOf[String], input, subProjection)
    }

    def gists(alias: String, input: UserGistsParametrizedInput , subProjection: GistConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("gists").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): UserResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isBountyHunter(): UserResponseProjection = {
        isBountyHunter(null.asInstanceOf[String])
    }

    def isBountyHunter(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isBountyHunter").alias(alias))
        this
    }

    def isCampusExpert(): UserResponseProjection = {
        isCampusExpert(null.asInstanceOf[String])
    }

    def isCampusExpert(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isCampusExpert").alias(alias))
        this
    }

    def isDeveloperProgramMember(): UserResponseProjection = {
        isDeveloperProgramMember(null.asInstanceOf[String])
    }

    def isDeveloperProgramMember(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isDeveloperProgramMember").alias(alias))
        this
    }

    def isEmployee(): UserResponseProjection = {
        isEmployee(null.asInstanceOf[String])
    }

    def isEmployee(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isEmployee").alias(alias))
        this
    }

    def isHireable(): UserResponseProjection = {
        isHireable(null.asInstanceOf[String])
    }

    def isHireable(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isHireable").alias(alias))
        this
    }

    def isSiteAdmin(): UserResponseProjection = {
        isSiteAdmin(null.asInstanceOf[String])
    }

    def isSiteAdmin(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isSiteAdmin").alias(alias))
        this
    }

    def isViewer(): UserResponseProjection = {
        isViewer(null.asInstanceOf[String])
    }

    def isViewer(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("isViewer").alias(alias))
        this
    }

    def issueComments(subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = {
        issueComments(null.asInstanceOf[String], subProjection)
    }

    def issueComments(alias: String, subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("issueComments").alias(alias).projection(subProjection))
        this
    }

    def issueComments(input: UserIssueCommentsParametrizedInput,subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = {
        issueComments(null.asInstanceOf[String], input, subProjection)
    }

    def issueComments(alias: String, input: UserIssueCommentsParametrizedInput , subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("issueComments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def issues(subProjection: IssueConnectionResponseProjection): UserResponseProjection = {
        issues(null.asInstanceOf[String], subProjection)
    }

    def issues(alias: String, subProjection: IssueConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection))
        this
    }

    def issues(input: UserIssuesParametrizedInput,subProjection: IssueConnectionResponseProjection): UserResponseProjection = {
        issues(null.asInstanceOf[String], input, subProjection)
    }

    def issues(alias: String, input: UserIssuesParametrizedInput , subProjection: IssueConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): UserResponseProjection = {
        itemShowcase(null.asInstanceOf[String], subProjection)
    }

    def itemShowcase(alias: String, subProjection: ProfileItemShowcaseResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        this
    }

    def location(): UserResponseProjection = {
        location(null.asInstanceOf[String])
    }

    def location(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("location").alias(alias))
        this
    }

    def login(): UserResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def name(): UserResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): UserResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def organization(input: UserOrganizationParametrizedInput,subProjection: OrganizationResponseProjection): UserResponseProjection = {
        organization(null.asInstanceOf[String], input, subProjection)
    }

    def organization(alias: String, input: UserOrganizationParametrizedInput , subProjection: OrganizationResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def organizations(subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = {
        organizations(null.asInstanceOf[String], subProjection)
    }

    def organizations(alias: String, subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("organizations").alias(alias).projection(subProjection))
        this
    }

    def organizations(input: UserOrganizationsParametrizedInput,subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = {
        organizations(null.asInstanceOf[String], input, subProjection)
    }

    def organizations(alias: String, input: UserOrganizationsParametrizedInput , subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("organizations").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnableItems(subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        pinnableItems(null.asInstanceOf[String], subProjection)
    }

    def pinnableItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        this
    }

    def pinnableItems(input: UserPinnableItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        pinnableItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnableItems(alias: String, input: UserPinnableItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItems(subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        pinnedItems(null.asInstanceOf[String], subProjection)
    }

    def pinnedItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        this
    }

    def pinnedItems(input: UserPinnedItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        pinnedItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedItems(alias: String, input: UserPinnedItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItemsRemaining(): UserResponseProjection = {
        pinnedItemsRemaining(null.asInstanceOf[String])
    }

    def pinnedItemsRemaining(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        this
    }

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    def pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], subProjection)
    }

    def pinnedRepositories(alias: String, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        this
    }

    def pinnedRepositories(input: UserPinnedRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedRepositories(alias: String, input: UserPinnedRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def project(subProjection: ProjectResponseProjection): UserResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def project(input: UserProjectParametrizedInput,subProjection: ProjectResponseProjection): UserResponseProjection = {
        project(null.asInstanceOf[String], input, subProjection)
    }

    def project(alias: String, input: UserProjectParametrizedInput , subProjection: ProjectResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projects(subProjection: ProjectConnectionResponseProjection): UserResponseProjection = {
        projects(null.asInstanceOf[String], subProjection)
    }

    def projects(alias: String, subProjection: ProjectConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection))
        this
    }

    def projects(input: UserProjectsParametrizedInput,subProjection: ProjectConnectionResponseProjection): UserResponseProjection = {
        projects(null.asInstanceOf[String], input, subProjection)
    }

    def projects(alias: String, input: UserProjectsParametrizedInput , subProjection: ProjectConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projectsResourcePath(): UserResponseProjection = {
        projectsResourcePath(null.asInstanceOf[String])
    }

    def projectsResourcePath(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias))
        this
    }

    def projectsUrl(): UserResponseProjection = {
        projectsUrl(null.asInstanceOf[String])
    }

    def projectsUrl(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias))
        this
    }

    def publicKeys(subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = {
        publicKeys(null.asInstanceOf[String], subProjection)
    }

    def publicKeys(alias: String, subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("publicKeys").alias(alias).projection(subProjection))
        this
    }

    def publicKeys(input: UserPublicKeysParametrizedInput,subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = {
        publicKeys(null.asInstanceOf[String], input, subProjection)
    }

    def publicKeys(alias: String, input: UserPublicKeysParametrizedInput , subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("publicKeys").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pullRequests(subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = {
        pullRequests(null.asInstanceOf[String], subProjection)
    }

    def pullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        this
    }

    def pullRequests(input: UserPullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = {
        pullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequests(alias: String, input: UserPullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def registryPackages(subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        registryPackages(null.asInstanceOf[String], subProjection)
    }

    def registryPackages(alias: String, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        this
    }

    def registryPackages(input: UserRegistryPackagesParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        registryPackages(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackages(alias: String, input: UserRegistryPackagesParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], subProjection)
    }

    def registryPackagesForQuery(alias: String, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        this
    }

    def registryPackagesForQuery(input: UserRegistryPackagesForQueryParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackagesForQuery(alias: String, input: UserRegistryPackagesForQueryParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositories(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        repositories(null.asInstanceOf[String], subProjection)
    }

    def repositories(alias: String, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        this
    }

    def repositories(input: UserRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        repositories(null.asInstanceOf[String], input, subProjection)
    }

    def repositories(alias: String, input: UserRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositoriesContributedTo(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        repositoriesContributedTo(null.asInstanceOf[String], subProjection)
    }

    def repositoriesContributedTo(alias: String, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repositoriesContributedTo").alias(alias).projection(subProjection))
        this
    }

    def repositoriesContributedTo(input: UserRepositoriesContributedToParametrizedInput,subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        repositoriesContributedTo(null.asInstanceOf[String], input, subProjection)
    }

    def repositoriesContributedTo(alias: String, input: UserRepositoriesContributedToParametrizedInput , subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repositoriesContributedTo").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): UserResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def repository(input: UserRepositoryParametrizedInput,subProjection: RepositoryResponseProjection): UserResponseProjection = {
        repository(null.asInstanceOf[String], input, subProjection)
    }

    def repository(alias: String, input: UserRepositoryParametrizedInput , subProjection: RepositoryResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resourcePath(): UserResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def savedReplies(subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = {
        savedReplies(null.asInstanceOf[String], subProjection)
    }

    def savedReplies(alias: String, subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("savedReplies").alias(alias).projection(subProjection))
        this
    }

    def savedReplies(input: UserSavedRepliesParametrizedInput,subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = {
        savedReplies(null.asInstanceOf[String], input, subProjection)
    }

    def savedReplies(alias: String, input: UserSavedRepliesParametrizedInput , subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("savedReplies").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def sponsorshipsAsMaintainer(subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        sponsorshipsAsMaintainer(null.asInstanceOf[String], subProjection)
    }

    def sponsorshipsAsMaintainer(alias: String, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection))
        this
    }

    def sponsorshipsAsMaintainer(input: UserSponsorshipsAsMaintainerParametrizedInput,subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        sponsorshipsAsMaintainer(null.asInstanceOf[String], input, subProjection)
    }

    def sponsorshipsAsMaintainer(alias: String, input: UserSponsorshipsAsMaintainerParametrizedInput , subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def sponsorshipsAsSponsor(subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        sponsorshipsAsSponsor(null.asInstanceOf[String], subProjection)
    }

    def sponsorshipsAsSponsor(alias: String, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection))
        this
    }

    def sponsorshipsAsSponsor(input: UserSponsorshipsAsSponsorParametrizedInput,subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        sponsorshipsAsSponsor(null.asInstanceOf[String], input, subProjection)
    }

    def sponsorshipsAsSponsor(alias: String, input: UserSponsorshipsAsSponsorParametrizedInput , subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def starredRepositories(subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = {
        starredRepositories(null.asInstanceOf[String], subProjection)
    }

    def starredRepositories(alias: String, subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("starredRepositories").alias(alias).projection(subProjection))
        this
    }

    def starredRepositories(input: UserStarredRepositoriesParametrizedInput,subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = {
        starredRepositories(null.asInstanceOf[String], input, subProjection)
    }

    def starredRepositories(alias: String, input: UserStarredRepositoriesParametrizedInput , subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("starredRepositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def status(subProjection: UserStatusResponseProjection): UserResponseProjection = {
        status(null.asInstanceOf[String], subProjection)
    }

    def status(alias: String, subProjection: UserStatusResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection))
        this
    }

    def updatedAt(): UserResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): UserResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanChangePinnedItems(): UserResponseProjection = {
        viewerCanChangePinnedItems(null.asInstanceOf[String])
    }

    def viewerCanChangePinnedItems(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        this
    }

    def viewerCanCreateProjects(): UserResponseProjection = {
        viewerCanCreateProjects(null.asInstanceOf[String])
    }

    def viewerCanCreateProjects(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        this
    }

    def viewerCanFollow(): UserResponseProjection = {
        viewerCanFollow(null.asInstanceOf[String])
    }

    def viewerCanFollow(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanFollow").alias(alias))
        this
    }

    def viewerIsFollowing(): UserResponseProjection = {
        viewerIsFollowing(null.asInstanceOf[String])
    }

    def viewerIsFollowing(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("viewerIsFollowing").alias(alias))
        this
    }

    def watching(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        watching(null.asInstanceOf[String], subProjection)
    }

    def watching(alias: String, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("watching").alias(alias).projection(subProjection))
        this
    }

    def watching(input: UserWatchingParametrizedInput,subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        watching(null.asInstanceOf[String], input, subProjection)
    }

    def watching(alias: String, input: UserWatchingParametrizedInput , subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = {
        fields.add(new GraphQLResponseField("watching").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def websiteUrl(): UserResponseProjection = {
        websiteUrl(null.asInstanceOf[String])
    }

    def websiteUrl(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias))
        this
    }

    def typename(): UserResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
