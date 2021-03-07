package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Organization
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class OrganizationResponseProjection extends GraphQLResponseProjection {

    override def all$(): OrganizationResponseProjection = all$(3)

    override def all$(maxDepth: Int): OrganizationResponseProjection = {
        this.anyPinnableItems()
        this.avatarUrl()
        this.databaseId()
        this.description()
        this.email()
        this.id()
        this.isVerified()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1)
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1)
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) + 1)
            this.membersWithRole(new OrganizationMemberConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0)))
        }
        this.name()
        this.newTeamResourcePath()
        this.newTeamUrl()
        this.organizationBillingEmail()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) + 1)
            this.pendingMembers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1)
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1)
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1)
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1)
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1)
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1)
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1)
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.requiresTwoFactorAuthentication()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) + 1)
            this.samlIdentityProvider(new OrganizationIdentityProviderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.TeamResponseProjection.team", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) + 1)
            this.team(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) + 1)
            this.teams(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0)))
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
        this
    }

    def anyPinnableItems(): OrganizationResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String])
    }

    def anyPinnableItems(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias))
        this
    }

    def anyPinnableItems(input: OrganizationAnyPinnableItemsParametrizedInput): OrganizationResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String], input)
    }

    def anyPinnableItems(alias: String, input: OrganizationAnyPinnableItemsParametrizedInput ): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        this
    }

    def avatarUrl(): OrganizationResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: OrganizationAvatarUrlParametrizedInput): OrganizationResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: OrganizationAvatarUrlParametrizedInput ): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def databaseId(): OrganizationResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def description(): OrganizationResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def email(): OrganizationResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def id(): OrganizationResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isVerified(): OrganizationResponseProjection = {
        isVerified(null.asInstanceOf[String])
    }

    def isVerified(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("isVerified").alias(alias))
        this
    }

    def itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): OrganizationResponseProjection = {
        itemShowcase(null.asInstanceOf[String], subProjection)
    }

    def itemShowcase(alias: String, subProjection: ProfileItemShowcaseResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        this
    }

    def location(): OrganizationResponseProjection = {
        location(null.asInstanceOf[String])
    }

    def location(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("location").alias(alias))
        this
    }

    def login(): OrganizationResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def memberStatuses(subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = {
        memberStatuses(null.asInstanceOf[String], subProjection)
    }

    def memberStatuses(alias: String, subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        this
    }

    def memberStatuses(input: OrganizationMemberStatusesParametrizedInput,subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = {
        memberStatuses(null.asInstanceOf[String], input, subProjection)
    }

    def memberStatuses(alias: String, input: OrganizationMemberStatusesParametrizedInput , subProjection: UserStatusConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def membersWithRole(subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = {
        membersWithRole(null.asInstanceOf[String], subProjection)
    }

    def membersWithRole(alias: String, subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("membersWithRole").alias(alias).projection(subProjection))
        this
    }

    def membersWithRole(input: OrganizationMembersWithRoleParametrizedInput,subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = {
        membersWithRole(null.asInstanceOf[String], input, subProjection)
    }

    def membersWithRole(alias: String, input: OrganizationMembersWithRoleParametrizedInput , subProjection: OrganizationMemberConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("membersWithRole").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def name(): OrganizationResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def newTeamResourcePath(): OrganizationResponseProjection = {
        newTeamResourcePath(null.asInstanceOf[String])
    }

    def newTeamResourcePath(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("newTeamResourcePath").alias(alias))
        this
    }

    def newTeamUrl(): OrganizationResponseProjection = {
        newTeamUrl(null.asInstanceOf[String])
    }

    def newTeamUrl(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("newTeamUrl").alias(alias))
        this
    }

    def organizationBillingEmail(): OrganizationResponseProjection = {
        organizationBillingEmail(null.asInstanceOf[String])
    }

    def organizationBillingEmail(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("organizationBillingEmail").alias(alias))
        this
    }

    def pendingMembers(subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = {
        pendingMembers(null.asInstanceOf[String], subProjection)
    }

    def pendingMembers(alias: String, subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pendingMembers").alias(alias).projection(subProjection))
        this
    }

    def pendingMembers(input: OrganizationPendingMembersParametrizedInput,subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = {
        pendingMembers(null.asInstanceOf[String], input, subProjection)
    }

    def pendingMembers(alias: String, input: OrganizationPendingMembersParametrizedInput , subProjection: UserConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pendingMembers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnableItems(subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        pinnableItems(null.asInstanceOf[String], subProjection)
    }

    def pinnableItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        this
    }

    def pinnableItems(input: OrganizationPinnableItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        pinnableItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnableItems(alias: String, input: OrganizationPinnableItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItems(subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        pinnedItems(null.asInstanceOf[String], subProjection)
    }

    def pinnedItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        this
    }

    def pinnedItems(input: OrganizationPinnedItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        pinnedItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedItems(alias: String, input: OrganizationPinnedItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItemsRemaining(): OrganizationResponseProjection = {
        pinnedItemsRemaining(null.asInstanceOf[String])
    }

    def pinnedItemsRemaining(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        this
    }

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    def pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], subProjection)
    }

    def pinnedRepositories(alias: String, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        this
    }

    def pinnedRepositories(input: OrganizationPinnedRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedRepositories(alias: String, input: OrganizationPinnedRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def project(subProjection: ProjectResponseProjection): OrganizationResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def project(input: OrganizationProjectParametrizedInput,subProjection: ProjectResponseProjection): OrganizationResponseProjection = {
        project(null.asInstanceOf[String], input, subProjection)
    }

    def project(alias: String, input: OrganizationProjectParametrizedInput , subProjection: ProjectResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projects(subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = {
        projects(null.asInstanceOf[String], subProjection)
    }

    def projects(alias: String, subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection))
        this
    }

    def projects(input: OrganizationProjectsParametrizedInput,subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = {
        projects(null.asInstanceOf[String], input, subProjection)
    }

    def projects(alias: String, input: OrganizationProjectsParametrizedInput , subProjection: ProjectConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projectsResourcePath(): OrganizationResponseProjection = {
        projectsResourcePath(null.asInstanceOf[String])
    }

    def projectsResourcePath(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias))
        this
    }

    def projectsUrl(): OrganizationResponseProjection = {
        projectsUrl(null.asInstanceOf[String])
    }

    def projectsUrl(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias))
        this
    }

    def registryPackages(subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        registryPackages(null.asInstanceOf[String], subProjection)
    }

    def registryPackages(alias: String, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        this
    }

    def registryPackages(input: OrganizationRegistryPackagesParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        registryPackages(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackages(alias: String, input: OrganizationRegistryPackagesParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def registryPackagesForQuery(subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], subProjection)
    }

    def registryPackagesForQuery(alias: String, subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection))
        this
    }

    def registryPackagesForQuery(input: OrganizationRegistryPackagesForQueryParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        registryPackagesForQuery(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackagesForQuery(alias: String, input: OrganizationRegistryPackagesForQueryParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositories(subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        repositories(null.asInstanceOf[String], subProjection)
    }

    def repositories(alias: String, subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        this
    }

    def repositories(input: OrganizationRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        repositories(null.asInstanceOf[String], input, subProjection)
    }

    def repositories(alias: String, input: OrganizationRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): OrganizationResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def repository(input: OrganizationRepositoryParametrizedInput,subProjection: RepositoryResponseProjection): OrganizationResponseProjection = {
        repository(null.asInstanceOf[String], input, subProjection)
    }

    def repository(alias: String, input: OrganizationRepositoryParametrizedInput , subProjection: RepositoryResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def requiresTwoFactorAuthentication(): OrganizationResponseProjection = {
        requiresTwoFactorAuthentication(null.asInstanceOf[String])
    }

    def requiresTwoFactorAuthentication(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("requiresTwoFactorAuthentication").alias(alias))
        this
    }

    def resourcePath(): OrganizationResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def samlIdentityProvider(subProjection: OrganizationIdentityProviderResponseProjection): OrganizationResponseProjection = {
        samlIdentityProvider(null.asInstanceOf[String], subProjection)
    }

    def samlIdentityProvider(alias: String, subProjection: OrganizationIdentityProviderResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("samlIdentityProvider").alias(alias).projection(subProjection))
        this
    }

    def team(subProjection: TeamResponseProjection): OrganizationResponseProjection = {
        team(null.asInstanceOf[String], subProjection)
    }

    def team(alias: String, subProjection: TeamResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("team").alias(alias).projection(subProjection))
        this
    }

    def team(input: OrganizationTeamParametrizedInput,subProjection: TeamResponseProjection): OrganizationResponseProjection = {
        team(null.asInstanceOf[String], input, subProjection)
    }

    def team(alias: String, input: OrganizationTeamParametrizedInput , subProjection: TeamResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("team").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def teams(subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = {
        teams(null.asInstanceOf[String], subProjection)
    }

    def teams(alias: String, subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("teams").alias(alias).projection(subProjection))
        this
    }

    def teams(input: OrganizationTeamsParametrizedInput,subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = {
        teams(null.asInstanceOf[String], input, subProjection)
    }

    def teams(alias: String, input: OrganizationTeamsParametrizedInput , subProjection: TeamConnectionResponseProjection): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("teams").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def teamsResourcePath(): OrganizationResponseProjection = {
        teamsResourcePath(null.asInstanceOf[String])
    }

    def teamsResourcePath(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("teamsResourcePath").alias(alias))
        this
    }

    def teamsUrl(): OrganizationResponseProjection = {
        teamsUrl(null.asInstanceOf[String])
    }

    def teamsUrl(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("teamsUrl").alias(alias))
        this
    }

    def url(): OrganizationResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanAdminister(): OrganizationResponseProjection = {
        viewerCanAdminister(null.asInstanceOf[String])
    }

    def viewerCanAdminister(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias))
        this
    }

    def viewerCanChangePinnedItems(): OrganizationResponseProjection = {
        viewerCanChangePinnedItems(null.asInstanceOf[String])
    }

    def viewerCanChangePinnedItems(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        this
    }

    def viewerCanCreateProjects(): OrganizationResponseProjection = {
        viewerCanCreateProjects(null.asInstanceOf[String])
    }

    def viewerCanCreateProjects(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        this
    }

    def viewerCanCreateRepositories(): OrganizationResponseProjection = {
        viewerCanCreateRepositories(null.asInstanceOf[String])
    }

    def viewerCanCreateRepositories(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateRepositories").alias(alias))
        this
    }

    def viewerCanCreateTeams(): OrganizationResponseProjection = {
        viewerCanCreateTeams(null.asInstanceOf[String])
    }

    def viewerCanCreateTeams(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateTeams").alias(alias))
        this
    }

    def viewerIsAMember(): OrganizationResponseProjection = {
        viewerIsAMember(null.asInstanceOf[String])
    }

    def viewerIsAMember(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("viewerIsAMember").alias(alias))
        this
    }

    def websiteUrl(): OrganizationResponseProjection = {
        websiteUrl(null.asInstanceOf[String])
    }

    def websiteUrl(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias))
        this
    }

    def typename(): OrganizationResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): OrganizationResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[OrganizationResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
