package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import PinnableItemTypeTO._
import GistPrivacyTO._
import Seq[IssueStateTO]._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import RepositoryPrivacyTO._
import Seq[ProjectStateTO]._
import Seq[PullRequestStateTO]._
import RegistryPackageTypeTO._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryContributionTypeTO]._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._

/**
 * Resolver for User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait UserResolver {

    @throws[Exception]
    def anyPinnableItems(userTO: UserTO, `type`: PinnableItemTypeTO): Boolean

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(userTO: UserTO, size: Option[Int]): String

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def commitComments(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): CommitCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def contributionsCollection(userTO: UserTO, from: String, organizationID: String, to: String): ContributionsCollectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def followers(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): FollowerConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def following(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): FollowingConnectionTO

    @throws[Exception]
    def gist(userTO: UserTO, name: String): GistTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def gistComments(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): GistCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def gists(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: GistOrderTO, privacy: GistPrivacyTO): GistConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issueComments(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): IssueCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issues(userTO: UserTO, after: String, before: String, filterBy: IssueFiltersTO, first: Option[Int], labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[IssueStateTO]): IssueConnectionTO

    @throws[Exception]
    def organization(userTO: UserTO, login: String): OrganizationTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def organizations(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): OrganizationConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnableItems(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedItems(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedRepositories(userTO: UserTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def project(userTO: UserTO, number: Int): ProjectTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projects(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ProjectOrderTO, search: String, states: Seq[ProjectStateTO]): ProjectConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def publicKeys(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int]): PublicKeyConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequests(userTO: UserTO, after: String, baseRefName: String, before: String, first: Option[Int], headRefName: String, labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[PullRequestStateTO]): PullRequestConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackages(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], name: String, names: Seq[String], packageType: RegistryPackageTypeTO, publicOnly: Option[Boolean], registryPackageType: String, repositoryId: String): RegistryPackageConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackagesForQuery(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], packageType: RegistryPackageTypeTO, query: String): RegistryPackageConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositories(userTO: UserTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isFork: Option[Boolean], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositoriesContributedTo(userTO: UserTO, after: String, before: String, contributionTypes: Seq[RepositoryContributionTypeTO], first: Option[Int], includeUserRepositories: Option[Boolean], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def repository(userTO: UserTO, name: String): RepositoryTO

    @throws[Exception]
    def savedReplies(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: SavedReplyOrderTO): SavedReplyConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def sponsorshipsAsMaintainer(userTO: UserTO, after: String, before: String, first: Option[Int], includePrivate: Option[Boolean], last: Option[Int], orderBy: SponsorshipOrderTO): SponsorshipConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def sponsorshipsAsSponsor(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: SponsorshipOrderTO): SponsorshipConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def starredRepositories(userTO: UserTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: StarOrderTO, ownedByViewer: Option[Boolean]): StarredRepositoryConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def watching(userTO: UserTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

}
