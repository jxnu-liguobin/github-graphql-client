package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Organization
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class OrganizationResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationResponseProjection {
        this.anyPinnableItems()
        this.avatarUrl()
        this.databaseId()
        this.description()
        this.email()
        this.id()
        this.isVerified()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1
            this.itemShowcase(ProfileItemShowcaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1
            this.memberStatuses(UserStatusConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) + 1
            this.membersWithRole(OrganizationMemberConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0)))
        }
        this.name()
        this.newTeamResourcePath()
        this.newTeamUrl()
        this.organizationBillingEmail()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) + 1
            this.pendingMembers(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1
            this.pinnableItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1
            this.pinnedItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1
            this.pinnedRepositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.ProjectConnectionResponseProjection.projects"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1
            this.projects(ProjectConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1
            this.registryPackages(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1
            this.registryPackagesForQuery(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1
            this.repositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.requiresTwoFactorAuthentication()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) + 1
            this.samlIdentityProvider(OrganizationIdentityProviderResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.TeamResponseProjection.team"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) + 1
            this.team(TeamResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationResponseProjection.TeamConnectionResponseProjection.teams"] = projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) + 1
            this.teams(TeamConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0)))
        }
        this.teamsResourcePath()
        this.teamsUrl()
        this.url()
        this.viewerCanAdminister()
        this.viewerCanChangePinnedItems()
        this.viewerCanCreateProjects()
        this.viewerCanCreateRepositories()
        this.viewerCanCreateTeams()
        this.viewerIsAMember()
        this.websiteUrl()
        this.typename()
        return this
    }

    fun anyPinnableItems(): OrganizationResponseProjection = anyPinnableItems(null)

    fun anyPinnableItems(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias))
        return this
    }

    fun anyPinnableItems(input: OrganizationAnyPinnableItemsParametrizedInput): OrganizationResponseProjection = anyPinnableItems(null, input)

    fun anyPinnableItems(alias: String?, input: OrganizationAnyPinnableItemsParametrizedInput): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        return this
    }

    fun avatarUrl(): OrganizationResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: OrganizationAvatarUrlParametrizedInput): OrganizationResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: OrganizationAvatarUrlParametrizedInput): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun databaseId(): OrganizationResponseProjection = databaseId(null)

    fun databaseId(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun description(): OrganizationResponseProjection = description(null)

    fun description(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun email(): OrganizationResponseProjection = email(null)

    fun email(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun id(): OrganizationResponseProjection = id(null)

    fun id(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isVerified(): OrganizationResponseProjection = isVerified(null)

    fun isVerified(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("isVerified").alias(alias))
        return this
    }

    fun itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): OrganizationResponseProjection = itemShowcase(null, subProjection)

    fun itemShowcase(alias: String?, subProjection: ProfileItemShowcaseResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        return this
    }

    fun location(): OrganizationResponseProjection = location(null)

    fun location(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("location").alias(alias))
        return this
    }

    fun login(): OrganizationResponseProjection = login(null)

    fun login(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun memberStatuses(subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = memberStatuses(null, subProjection)

    fun memberStatuses(alias: String?, subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        return this
    }

    fun memberStatuses(input: OrganizationMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = memberStatuses(null, input, subProjection)

    fun memberStatuses(alias: String?, input: OrganizationMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun membersWithRole(subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = membersWithRole(null, subProjection)

    fun membersWithRole(alias: String?, subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("membersWithRole").alias(alias).projection(subProjection))
        return this
    }

    fun membersWithRole(input: OrganizationMembersWithRoleParametrizedInput, subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = membersWithRole(null, input, subProjection)

    fun membersWithRole(alias: String?, input: OrganizationMembersWithRoleParametrizedInput, subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("membersWithRole").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun name(): OrganizationResponseProjection = name(null)

    fun name(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun newTeamResourcePath(): OrganizationResponseProjection = newTeamResourcePath(null)

    fun newTeamResourcePath(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("newTeamResourcePath").alias(alias))
        return this
    }

    fun newTeamUrl(): OrganizationResponseProjection = newTeamUrl(null)

    fun newTeamUrl(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("newTeamUrl").alias(alias))
        return this
    }

    fun organizationBillingEmail(): OrganizationResponseProjection = organizationBillingEmail(null)

    fun organizationBillingEmail(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("organizationBillingEmail").alias(alias))
        return this
    }

    fun pendingMembers(subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = pendingMembers(null, subProjection)

    fun pendingMembers(alias: String?, subProjection: UserConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pendingMembers").alias(alias).projection(subProjection))
        return this
    }

    fun pendingMembers(input: OrganizationPendingMembersParametrizedInput, subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = pendingMembers(null, input, subProjection)

    fun pendingMembers(alias: String?, input: OrganizationPendingMembersParametrizedInput, subProjection: UserConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pendingMembers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnableItems(subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = pinnableItems(null, subProjection)

    fun pinnableItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnableItems(input: OrganizationPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = pinnableItems(null, input, subProjection)

    fun pinnableItems(alias: String?, input: OrganizationPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItems(subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = pinnedItems(null, subProjection)

    fun pinnedItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedItems(input: OrganizationPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = pinnedItems(null, input, subProjection)

    fun pinnedItems(alias: String?, input: OrganizationPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItemsRemaining(): OrganizationResponseProjection = pinnedItemsRemaining(null)

    fun pinnedItemsRemaining(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        return this
    }

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    fun pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = pinnedRepositories(null, subProjection)

    fun pinnedRepositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedRepositories(input: OrganizationPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = pinnedRepositories(null, input, subProjection)

    fun pinnedRepositories(alias: String?, input: OrganizationPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): OrganizationResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun project(input: OrganizationProjectParametrizedInput, subProjection: ProjectResponseProjection): OrganizationResponseProjection = project(null, input, subProjection)

    fun project(alias: String?, input: OrganizationProjectParametrizedInput, subProjection: ProjectResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projects(subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = projects(null, subProjection)

    fun projects(alias: String?, subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).projection(subProjection))
        return this
    }

    fun projects(input: OrganizationProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = projects(null, input, subProjection)

    fun projects(alias: String?, input: OrganizationProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projectsResourcePath(): OrganizationResponseProjection = projectsResourcePath(null)

    fun projectsResourcePath(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("projectsResourcePath").alias(alias))
        return this
    }

    fun projectsUrl(): OrganizationResponseProjection = projectsUrl(null)

    fun projectsUrl(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("projectsUrl").alias(alias))
        return this
    }

    fun registryPackages(subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = registryPackages(null, subProjection)

    fun registryPackages(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackages(input: OrganizationRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = registryPackages(null, input, subProjection)

    fun registryPackages(alias: String?, input: OrganizationRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = registryPackagesForQuery(null, subProjection)

    fun registryPackagesForQuery(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackagesForQuery(input: OrganizationRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = registryPackagesForQuery(null, input, subProjection)

    fun registryPackagesForQuery(alias: String?, input: OrganizationRegistryPackagesForQueryParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositories(subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = repositories(null, subProjection)

    fun repositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        return this
    }

    fun repositories(input: OrganizationRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = repositories(null, input, subProjection)

    fun repositories(alias: String?, input: OrganizationRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): OrganizationResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun repository(input: OrganizationRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): OrganizationResponseProjection = repository(null, input, subProjection)

    fun repository(alias: String?, input: OrganizationRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun requiresTwoFactorAuthentication(): OrganizationResponseProjection = requiresTwoFactorAuthentication(null)

    fun requiresTwoFactorAuthentication(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("requiresTwoFactorAuthentication").alias(alias))
        return this
    }

    fun resourcePath(): OrganizationResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun samlIdentityProvider(subProjection: OrganizationIdentityProviderResponseProjection): OrganizationResponseProjection = samlIdentityProvider(null, subProjection)

    fun samlIdentityProvider(alias: String?, subProjection: OrganizationIdentityProviderResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("samlIdentityProvider").alias(alias).projection(subProjection))
        return this
    }

    fun team(subProjection: TeamResponseProjection): OrganizationResponseProjection = team(null, subProjection)

    fun team(alias: String?, subProjection: TeamResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("team").alias(alias).projection(subProjection))
        return this
    }

    fun team(input: OrganizationTeamParametrizedInput, subProjection: TeamResponseProjection): OrganizationResponseProjection = team(null, input, subProjection)

    fun team(alias: String?, input: OrganizationTeamParametrizedInput, subProjection: TeamResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("team").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun teams(subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = teams(null, subProjection)

    fun teams(alias: String?, subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("teams").alias(alias).projection(subProjection))
        return this
    }

    fun teams(input: OrganizationTeamsParametrizedInput, subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = teams(null, input, subProjection)

    fun teams(alias: String?, input: OrganizationTeamsParametrizedInput, subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("teams").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun teamsResourcePath(): OrganizationResponseProjection = teamsResourcePath(null)

    fun teamsResourcePath(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("teamsResourcePath").alias(alias))
        return this
    }

    fun teamsUrl(): OrganizationResponseProjection = teamsUrl(null)

    fun teamsUrl(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("teamsUrl").alias(alias))
        return this
    }

    fun url(): OrganizationResponseProjection = url(null)

    fun url(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanAdminister(): OrganizationResponseProjection = viewerCanAdminister(null)

    fun viewerCanAdminister(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerCanAdminister").alias(alias))
        return this
    }

    fun viewerCanChangePinnedItems(): OrganizationResponseProjection = viewerCanChangePinnedItems(null)

    fun viewerCanChangePinnedItems(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        return this
    }

    fun viewerCanCreateProjects(): OrganizationResponseProjection = viewerCanCreateProjects(null)

    fun viewerCanCreateProjects(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        return this
    }

    fun viewerCanCreateRepositories(): OrganizationResponseProjection = viewerCanCreateRepositories(null)

    fun viewerCanCreateRepositories(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateRepositories").alias(alias))
        return this
    }

    fun viewerCanCreateTeams(): OrganizationResponseProjection = viewerCanCreateTeams(null)

    fun viewerCanCreateTeams(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateTeams").alias(alias))
        return this
    }

    fun viewerIsAMember(): OrganizationResponseProjection = viewerIsAMember(null)

    fun viewerIsAMember(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("viewerIsAMember").alias(alias))
        return this
    }

    fun websiteUrl(): OrganizationResponseProjection = websiteUrl(null)

    fun websiteUrl(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("websiteUrl").alias(alias))
        return this
    }

    fun typename(): OrganizationResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
