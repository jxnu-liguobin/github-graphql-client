package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UserResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserResponseProjection {
        this.anyPinnableItems()
        this.avatarUrl()
        this.bio()
        this.bioHTML()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1
            this.commitComments(CommitCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)))
        }
        this.company()
        this.companyHTML()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0) + 1
            this.contributionsCollection(ContributionsCollectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ContributionsCollectionResponseProjection.contributionsCollection", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.email()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.FollowerConnectionResponseProjection.followers"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0) + 1
            this.followers(FollowerConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowerConnectionResponseProjection.followers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.FollowingConnectionResponseProjection.following"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0) + 1
            this.following(FollowingConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FollowingConnectionResponseProjection.following", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.GistResponseProjection.gist"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0) + 1
            this.gist(GistResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistResponseProjection.gist", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.GistCommentConnectionResponseProjection.gistComments"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0) + 1
            this.gistComments(GistCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistCommentConnectionResponseProjection.gistComments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.GistConnectionResponseProjection.gists"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0) + 1
            this.gists(GistConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.GistConnectionResponseProjection.gists", 0)))
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
            projectionDepthOnFields["UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0) + 1
            this.issueComments(IssueCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueCommentConnectionResponseProjection.issueComments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.IssueConnectionResponseProjection.issues"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1
            this.issues(IssueConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1
            this.itemShowcase(ProfileItemShowcaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        this.name()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.OrganizationConnectionResponseProjection.organizations"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0) + 1
            this.organizations(OrganizationConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationConnectionResponseProjection.organizations", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1
            this.pinnableItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1
            this.pinnedItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1
            this.pinnedRepositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.ProjectConnectionResponseProjection.projects"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1
            this.projects(ProjectConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0) + 1
            this.publicKeys(PublicKeyConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PublicKeyConnectionResponseProjection.publicKeys", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1
            this.pullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1
            this.registryPackages(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1
            this.registryPackagesForQuery(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RepositoryConnectionResponseProjection.repositories"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1
            this.repositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0) + 1
            this.repositoriesContributedTo(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.repositoriesContributedTo", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0) + 1
            this.savedReplies(SavedReplyConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SavedReplyConnectionResponseProjection.savedReplies", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1
            this.sponsorshipsAsMaintainer(SponsorshipConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1
            this.sponsorshipsAsSponsor(SponsorshipConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0) + 1
            this.starredRepositories(StarredRepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.StarredRepositoryConnectionResponseProjection.starredRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.UserStatusResponseProjection.status"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0) + 1
            this.status(UserStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UserStatusResponseProjection.status", 0)))
        }
        this.updatedAt()
        this.url()
        this.viewerCanChangePinnedItems()
        this.viewerCanCreateProjects()
        this.viewerCanFollow()
        this.viewerIsFollowing()
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) <= maxDepth) {
            projectionDepthOnFields["UserResponseProjection.RepositoryConnectionResponseProjection.watching"] = projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0) + 1
            this.watching(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.RepositoryConnectionResponseProjection.watching", 0)))
        }
        this.websiteUrl()
        this.typename()
        return this
    }

    fun anyPinnableItems(): UserResponseProjection = anyPinnableItems(null)

    fun anyPinnableItems(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias))
        return this
    }

    fun anyPinnableItems(input: UserAnyPinnableItemsParametrizedInput): UserResponseProjection = anyPinnableItems(null, input)

    fun anyPinnableItems(alias: String?, input: UserAnyPinnableItemsParametrizedInput): UserResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        return this
    }

    fun avatarUrl(): UserResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: UserAvatarUrlParametrizedInput): UserResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: UserAvatarUrlParametrizedInput): UserResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun bio(): UserResponseProjection = bio(null)

    fun bio(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("bio").alias(alias))
        return this
    }

    fun bioHTML(): UserResponseProjection = bioHTML(null)

    fun bioHTML(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("bioHTML").alias(alias))
        return this
    }

    fun commitComments(subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = commitComments(null, subProjection)

    fun commitComments(alias: String?, subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("commitComments").alias(alias).projection(subProjection))
        return this
    }

    fun commitComments(input: UserCommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection = commitComments(null, input, subProjection)

    fun commitComments(alias: String?, input: UserCommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun company(): UserResponseProjection = company(null)

    fun company(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("company").alias(alias))
        return this
    }

    fun companyHTML(): UserResponseProjection = companyHTML(null)

    fun companyHTML(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("companyHTML").alias(alias))
        return this
    }

    fun contributionsCollection(subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = contributionsCollection(null, subProjection)

    fun contributionsCollection(alias: String?, subProjection: ContributionsCollectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("contributionsCollection").alias(alias).projection(subProjection))
        return this
    }

    fun contributionsCollection(input: UserContributionsCollectionParametrizedInput, subProjection: ContributionsCollectionResponseProjection): UserResponseProjection = contributionsCollection(null, input, subProjection)

    fun contributionsCollection(alias: String?, input: UserContributionsCollectionParametrizedInput, subProjection: ContributionsCollectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("contributionsCollection").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): UserResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): UserResponseProjection = databaseId(null)

    fun databaseId(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun email(): UserResponseProjection = email(null)

    fun email(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun followers(subProjection: FollowerConnectionResponseProjection): UserResponseProjection = followers(null, subProjection)

    fun followers(alias: String?, subProjection: FollowerConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("followers").alias(alias).projection(subProjection))
        return this
    }

    fun followers(input: UserFollowersParametrizedInput, subProjection: FollowerConnectionResponseProjection): UserResponseProjection = followers(null, input, subProjection)

    fun followers(alias: String?, input: UserFollowersParametrizedInput, subProjection: FollowerConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("followers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun following(subProjection: FollowingConnectionResponseProjection): UserResponseProjection = following(null, subProjection)

    fun following(alias: String?, subProjection: FollowingConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("following").alias(alias).projection(subProjection))
        return this
    }

    fun following(input: UserFollowingParametrizedInput, subProjection: FollowingConnectionResponseProjection): UserResponseProjection = following(null, input, subProjection)

    fun following(alias: String?, input: UserFollowingParametrizedInput, subProjection: FollowingConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("following").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun gist(subProjection: GistResponseProjection): UserResponseProjection = gist(null, subProjection)

    fun gist(alias: String?, subProjection: GistResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gist").alias(alias).projection(subProjection))
        return this
    }

    fun gist(input: UserGistParametrizedInput, subProjection: GistResponseProjection): UserResponseProjection = gist(null, input, subProjection)

    fun gist(alias: String?, input: UserGistParametrizedInput, subProjection: GistResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gist").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun gistComments(subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = gistComments(null, subProjection)

    fun gistComments(alias: String?, subProjection: GistCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gistComments").alias(alias).projection(subProjection))
        return this
    }

    fun gistComments(input: UserGistCommentsParametrizedInput, subProjection: GistCommentConnectionResponseProjection): UserResponseProjection = gistComments(null, input, subProjection)

    fun gistComments(alias: String?, input: UserGistCommentsParametrizedInput, subProjection: GistCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gistComments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun gists(subProjection: GistConnectionResponseProjection): UserResponseProjection = gists(null, subProjection)

    fun gists(alias: String?, subProjection: GistConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gists").alias(alias).projection(subProjection))
        return this
    }

    fun gists(input: UserGistsParametrizedInput, subProjection: GistConnectionResponseProjection): UserResponseProjection = gists(null, input, subProjection)

    fun gists(alias: String?, input: UserGistsParametrizedInput, subProjection: GistConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("gists").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): UserResponseProjection = id(null)

    fun id(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isBountyHunter(): UserResponseProjection = isBountyHunter(null)

    fun isBountyHunter(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isBountyHunter").alias(alias))
        return this
    }

    fun isCampusExpert(): UserResponseProjection = isCampusExpert(null)

    fun isCampusExpert(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isCampusExpert").alias(alias))
        return this
    }

    fun isDeveloperProgramMember(): UserResponseProjection = isDeveloperProgramMember(null)

    fun isDeveloperProgramMember(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isDeveloperProgramMember").alias(alias))
        return this
    }

    fun isEmployee(): UserResponseProjection = isEmployee(null)

    fun isEmployee(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isEmployee").alias(alias))
        return this
    }

    fun isHireable(): UserResponseProjection = isHireable(null)

    fun isHireable(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isHireable").alias(alias))
        return this
    }

    fun isSiteAdmin(): UserResponseProjection = isSiteAdmin(null)

    fun isSiteAdmin(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isSiteAdmin").alias(alias))
        return this
    }

    fun isViewer(): UserResponseProjection = isViewer(null)

    fun isViewer(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("isViewer").alias(alias))
        return this
    }

    fun issueComments(subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = issueComments(null, subProjection)

    fun issueComments(alias: String?, subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("issueComments").alias(alias).projection(subProjection))
        return this
    }

    fun issueComments(input: UserIssueCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection = issueComments(null, input, subProjection)

    fun issueComments(alias: String?, input: UserIssueCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("issueComments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun issues(subProjection: IssueConnectionResponseProjection): UserResponseProjection = issues(null, subProjection)

    fun issues(alias: String?, subProjection: IssueConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).projection(subProjection))
        return this
    }

    fun issues(input: UserIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): UserResponseProjection = issues(null, input, subProjection)

    fun issues(alias: String?, input: UserIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): UserResponseProjection = itemShowcase(null, subProjection)

    fun itemShowcase(alias: String?, subProjection: ProfileItemShowcaseResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        return this
    }

    fun location(): UserResponseProjection = location(null)

    fun location(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("location").alias(alias))
        return this
    }

    fun login(): UserResponseProjection = login(null)

    fun login(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun name(): UserResponseProjection = name(null)

    fun name(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): UserResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun organization(input: UserOrganizationParametrizedInput, subProjection: OrganizationResponseProjection): UserResponseProjection = organization(null, input, subProjection)

    fun organization(alias: String?, input: UserOrganizationParametrizedInput, subProjection: OrganizationResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun organizations(subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = organizations(null, subProjection)

    fun organizations(alias: String?, subProjection: OrganizationConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("organizations").alias(alias).projection(subProjection))
        return this
    }

    fun organizations(input: UserOrganizationsParametrizedInput, subProjection: OrganizationConnectionResponseProjection): UserResponseProjection = organizations(null, input, subProjection)

    fun organizations(alias: String?, input: UserOrganizationsParametrizedInput, subProjection: OrganizationConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("organizations").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnableItems(subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = pinnableItems(null, subProjection)

    fun pinnableItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnableItems(input: UserPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = pinnableItems(null, input, subProjection)

    fun pinnableItems(alias: String?, input: UserPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItems(subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = pinnedItems(null, subProjection)

    fun pinnedItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedItems(input: UserPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection = pinnedItems(null, input, subProjection)

    fun pinnedItems(alias: String?, input: UserPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItemsRemaining(): UserResponseProjection = pinnedItemsRemaining(null)

    fun pinnedItemsRemaining(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        return this
    }

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    fun pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = pinnedRepositories(null, subProjection)

    fun pinnedRepositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedRepositories(input: UserPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = pinnedRepositories(null, input, subProjection)

    fun pinnedRepositories(alias: String?, input: UserPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): UserResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun project(input: UserProjectParametrizedInput, subProjection: ProjectResponseProjection): UserResponseProjection = project(null, input, subProjection)

    fun project(alias: String?, input: UserProjectParametrizedInput, subProjection: ProjectResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projects(subProjection: ProjectConnectionResponseProjection): UserResponseProjection = projects(null, subProjection)

    fun projects(alias: String?, subProjection: ProjectConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).projection(subProjection))
        return this
    }

    fun projects(input: UserProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): UserResponseProjection = projects(null, input, subProjection)

    fun projects(alias: String?, input: UserProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projectsResourcePath(): UserResponseProjection = projectsResourcePath(null)

    fun projectsResourcePath(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("projectsResourcePath").alias(alias))
        return this
    }

    fun projectsUrl(): UserResponseProjection = projectsUrl(null)

    fun projectsUrl(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("projectsUrl").alias(alias))
        return this
    }

    fun publicKeys(subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = publicKeys(null, subProjection)

    fun publicKeys(alias: String?, subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("publicKeys").alias(alias).projection(subProjection))
        return this
    }

    fun publicKeys(input: UserPublicKeysParametrizedInput, subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection = publicKeys(null, input, subProjection)

    fun publicKeys(alias: String?, input: UserPublicKeysParametrizedInput, subProjection: PublicKeyConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("publicKeys").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pullRequests(subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = pullRequests(null, subProjection)

    fun pullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequests(input: UserPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): UserResponseProjection = pullRequests(null, input, subProjection)

    fun pullRequests(alias: String?, input: UserPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun registryPackages(subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = registryPackages(null, subProjection)

    fun registryPackages(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackages(input: UserRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = registryPackages(null, input, subProjection)

    fun registryPackages(alias: String?, input: UserRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = registryPackagesForQuery(null, subProjection)

    fun registryPackagesForQuery(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackagesForQuery(input: UserRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection = registryPackagesForQuery(null, input, subProjection)

    fun registryPackagesForQuery(alias: String?, input: UserRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositories(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = repositories(null, subProjection)

    fun repositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        return this
    }

    fun repositories(input: UserRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = repositories(null, input, subProjection)

    fun repositories(alias: String?, input: UserRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositoriesContributedTo(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = repositoriesContributedTo(null, subProjection)

    fun repositoriesContributedTo(alias: String?, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repositoriesContributedTo").alias(alias).projection(subProjection))
        return this
    }

    fun repositoriesContributedTo(input: UserRepositoriesContributedToParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = repositoriesContributedTo(null, input, subProjection)

    fun repositoriesContributedTo(alias: String?, input: UserRepositoriesContributedToParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repositoriesContributedTo").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): UserResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun repository(input: UserRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): UserResponseProjection = repository(null, input, subProjection)

    fun repository(alias: String?, input: UserRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resourcePath(): UserResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun savedReplies(subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = savedReplies(null, subProjection)

    fun savedReplies(alias: String?, subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("savedReplies").alias(alias).projection(subProjection))
        return this
    }

    fun savedReplies(input: UserSavedRepliesParametrizedInput, subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection = savedReplies(null, input, subProjection)

    fun savedReplies(alias: String?, input: UserSavedRepliesParametrizedInput, subProjection: SavedReplyConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("savedReplies").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun sponsorshipsAsMaintainer(subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = sponsorshipsAsMaintainer(null, subProjection)

    fun sponsorshipsAsMaintainer(alias: String?, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection))
        return this
    }

    fun sponsorshipsAsMaintainer(input: UserSponsorshipsAsMaintainerParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = sponsorshipsAsMaintainer(null, input, subProjection)

    fun sponsorshipsAsMaintainer(alias: String?, input: UserSponsorshipsAsMaintainerParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun sponsorshipsAsSponsor(subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = sponsorshipsAsSponsor(null, subProjection)

    fun sponsorshipsAsSponsor(alias: String?, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection))
        return this
    }

    fun sponsorshipsAsSponsor(input: UserSponsorshipsAsSponsorParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection = sponsorshipsAsSponsor(null, input, subProjection)

    fun sponsorshipsAsSponsor(alias: String?, input: UserSponsorshipsAsSponsorParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun starredRepositories(subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = starredRepositories(null, subProjection)

    fun starredRepositories(alias: String?, subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("starredRepositories").alias(alias).projection(subProjection))
        return this
    }

    fun starredRepositories(input: UserStarredRepositoriesParametrizedInput, subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection = starredRepositories(null, input, subProjection)

    fun starredRepositories(alias: String?, input: UserStarredRepositoriesParametrizedInput, subProjection: StarredRepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("starredRepositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun status(subProjection: UserStatusResponseProjection): UserResponseProjection = status(null, subProjection)

    fun status(alias: String?, subProjection: UserStatusResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("status").alias(alias).projection(subProjection))
        return this
    }

    fun updatedAt(): UserResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): UserResponseProjection = url(null)

    fun url(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanChangePinnedItems(): UserResponseProjection = viewerCanChangePinnedItems(null)

    fun viewerCanChangePinnedItems(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        return this
    }

    fun viewerCanCreateProjects(): UserResponseProjection = viewerCanCreateProjects(null)

    fun viewerCanCreateProjects(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        return this
    }

    fun viewerCanFollow(): UserResponseProjection = viewerCanFollow(null)

    fun viewerCanFollow(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("viewerCanFollow").alias(alias))
        return this
    }

    fun viewerIsFollowing(): UserResponseProjection = viewerIsFollowing(null)

    fun viewerIsFollowing(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("viewerIsFollowing").alias(alias))
        return this
    }

    fun watching(subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = watching(null, subProjection)

    fun watching(alias: String?, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("watching").alias(alias).projection(subProjection))
        return this
    }

    fun watching(input: UserWatchingParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection = watching(null, input, subProjection)

    fun watching(alias: String?, input: UserWatchingParametrizedInput, subProjection: RepositoryConnectionResponseProjection): UserResponseProjection {
        fields.add(GraphQLResponseField("watching").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun websiteUrl(): UserResponseProjection = websiteUrl(null)

    fun websiteUrl(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("websiteUrl").alias(alias))
        return this
    }

    fun typename(): UserResponseProjection = typename(null)

    fun typename(alias: String?): UserResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UserResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
