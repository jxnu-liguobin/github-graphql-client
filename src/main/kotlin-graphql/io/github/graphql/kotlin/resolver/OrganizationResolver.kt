package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Organization
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface OrganizationResolver {

    @Throws(Exception::class)
    fun anyPinnableItems(organizationTO: OrganizationTO, type: PinnableItemTypeTO?): Boolean

    @Throws(Exception::class)
    fun avatarUrl(organizationTO: OrganizationTO, size: Int?): String

    @Throws(Exception::class)
    fun memberStatuses(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: UserStatusOrderTO?): UserStatusConnectionTO

    @Throws(Exception::class)
    fun membersWithRole(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?): OrganizationMemberConnectionTO

    @Throws(Exception::class)
    fun pendingMembers(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun pinnableItems(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

    @Throws(Exception::class)
    fun pinnedItems(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @Throws(Exception::class)
    fun pinnedRepositories(organizationTO: OrganizationTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun project(organizationTO: OrganizationTO, number: Int): ProjectTO?

    @Throws(Exception::class)
    fun projects(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ProjectOrderTO?, search: String?, states: List<ProjectStateTO>?): ProjectConnectionTO

    @Throws(Exception::class)
    fun registryPackages(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, name: String?, names: List<String?>?, packageType: RegistryPackageTypeTO?, publicOnly: Boolean?, registryPackageType: String?, repositoryId: String?): RegistryPackageConnectionTO

    @Throws(Exception::class)
    fun registryPackagesForQuery(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, packageType: RegistryPackageTypeTO?, query: String?): RegistryPackageConnectionTO

    @Throws(Exception::class)
    fun repositories(organizationTO: OrganizationTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isFork: Boolean?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun repository(organizationTO: OrganizationTO, name: String): RepositoryTO?

    @Throws(Exception::class)
    fun team(organizationTO: OrganizationTO, slug: String): TeamTO?

    @Throws(Exception::class)
    fun teams(organizationTO: OrganizationTO, after: String?, before: String?, first: Int?, last: Int?, ldapMapped: Boolean?, orderBy: TeamOrderTO?, privacy: TeamPrivacyTO?, query: String?, role: TeamRoleTO?, rootTeamsOnly: Boolean?, userLogins: List<String>?): TeamConnectionTO

}
