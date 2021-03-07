package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import PinnableItemTypeTO._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import RepositoryPrivacyTO._
import Seq[ProjectStateTO]._
import RegistryPackageTypeTO._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import TeamPrivacyTO._
import TeamRoleTO._

/**
 * Resolver for Organization
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait OrganizationResolver {

    @throws[Exception]
    def anyPinnableItems(organizationTO: OrganizationTO, `type`: PinnableItemTypeTO): Boolean

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(organizationTO: OrganizationTO, size: Option[Int]): String

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def memberStatuses(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: UserStatusOrderTO): UserStatusConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def membersWithRole(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int]): OrganizationMemberConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pendingMembers(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnableItems(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedItems(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedRepositories(organizationTO: OrganizationTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def project(organizationTO: OrganizationTO, number: Int): ProjectTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projects(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ProjectOrderTO, search: String, states: Seq[ProjectStateTO]): ProjectConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackages(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], name: String, names: Seq[String], packageType: RegistryPackageTypeTO, publicOnly: Option[Boolean], registryPackageType: String, repositoryId: String): RegistryPackageConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackagesForQuery(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], packageType: RegistryPackageTypeTO, query: String): RegistryPackageConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositories(organizationTO: OrganizationTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isFork: Option[Boolean], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def repository(organizationTO: OrganizationTO, name: String): RepositoryTO

    @throws[Exception]
    def team(organizationTO: OrganizationTO, slug: String): TeamTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def teams(organizationTO: OrganizationTO, after: String, before: String, first: Option[Int], last: Option[Int], ldapMapped: Option[Boolean], orderBy: TeamOrderTO, privacy: TeamPrivacyTO, query: String, role: TeamRoleTO, rootTeamsOnly: Option[Boolean], userLogins: Seq[String]): TeamConnectionTO

}
