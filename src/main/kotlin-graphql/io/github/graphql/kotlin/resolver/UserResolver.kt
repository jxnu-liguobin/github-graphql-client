package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface UserResolver {

    @Throws(Exception::class)
    fun anyPinnableItems(userTO: UserTO, type: PinnableItemTypeTO?): Boolean

    @Throws(Exception::class)
    fun avatarUrl(userTO: UserTO, size: Int?): String

    @Throws(Exception::class)
    fun commitComments(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

    @Throws(Exception::class)
    fun contributionsCollection(userTO: UserTO, from: String?, organizationID: String?, to: String?): ContributionsCollectionTO

    @Throws(Exception::class)
    fun followers(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): FollowerConnectionTO

    @Throws(Exception::class)
    fun following(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): FollowingConnectionTO

    @Throws(Exception::class)
    fun gist(userTO: UserTO, name: String): GistTO?

    @Throws(Exception::class)
    fun gistComments(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): GistCommentConnectionTO

    @Throws(Exception::class)
    fun gists(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: GistOrderTO?, privacy: GistPrivacyTO?): GistConnectionTO

    @Throws(Exception::class)
    fun issueComments(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): IssueCommentConnectionTO

    @Throws(Exception::class)
    fun issues(userTO: UserTO, after: String?, before: String?, filterBy: IssueFiltersTO?, first: Int?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<IssueStateTO>?): IssueConnectionTO

    @Throws(Exception::class)
    fun organization(userTO: UserTO, login: String): OrganizationTO?

    @Throws(Exception::class)
    fun organizations(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): OrganizationConnectionTO

    @Throws(Exception::class)
    fun pinnableItems(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

    @Throws(Exception::class)
    fun pinnedItems(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @Throws(Exception::class)
    fun pinnedRepositories(userTO: UserTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun project(userTO: UserTO, number: Int): ProjectTO?

    @Throws(Exception::class)
    fun projects(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ProjectOrderTO?, search: String?, states: List<ProjectStateTO>?): ProjectConnectionTO

    @Throws(Exception::class)
    fun publicKeys(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?): PublicKeyConnectionTO

    @Throws(Exception::class)
    fun pullRequests(userTO: UserTO, after: String?, baseRefName: String?, before: String?, first: Int?, headRefName: String?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<PullRequestStateTO>?): PullRequestConnectionTO

    @Throws(Exception::class)
    fun registryPackages(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, name: String?, names: List<String?>?, packageType: RegistryPackageTypeTO?, publicOnly: Boolean?, registryPackageType: String?, repositoryId: String?): RegistryPackageConnectionTO

    @Throws(Exception::class)
    fun registryPackagesForQuery(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, packageType: RegistryPackageTypeTO?, query: String?): RegistryPackageConnectionTO

    @Throws(Exception::class)
    fun repositories(userTO: UserTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isFork: Boolean?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun repositoriesContributedTo(userTO: UserTO, after: String?, before: String?, contributionTypes: List<RepositoryContributionTypeTO?>?, first: Int?, includeUserRepositories: Boolean?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun repository(userTO: UserTO, name: String): RepositoryTO?

    @Throws(Exception::class)
    fun savedReplies(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: SavedReplyOrderTO?): SavedReplyConnectionTO?

    @Throws(Exception::class)
    fun sponsorshipsAsMaintainer(userTO: UserTO, after: String?, before: String?, first: Int?, includePrivate: Boolean?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

    @Throws(Exception::class)
    fun sponsorshipsAsSponsor(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

    @Throws(Exception::class)
    fun starredRepositories(userTO: UserTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?, ownedByViewer: Boolean?): StarredRepositoryConnectionTO

    @Throws(Exception::class)
    fun watching(userTO: UserTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

}
