package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationTO(
    val databaseId: Int?,
    val description: String?,
    override
    val email: String?,
    override
    val id: String,
    val isVerified: Boolean,
    override
    val itemShowcase: ProfileItemShowcaseTO,
    override
    val location: String?,
    override
    val login: String,
    override
    val name: String?,
    val newTeamResourcePath: String,
    val newTeamUrl: String,
    val organizationBillingEmail: String?,
    override
    val pinnedItemsRemaining: Int,
    override
    val projectsResourcePath: String,
    override
    val projectsUrl: String,
    val requiresTwoFactorAuthentication: Boolean?,
    override
    val resourcePath: String,
    val samlIdentityProvider: OrganizationIdentityProviderTO?,
    val teamsResourcePath: String,
    val teamsUrl: String,
    override
    val url: String,
    val viewerCanAdminister: Boolean,
    override
    val viewerCanChangePinnedItems: Boolean,
    override
    val viewerCanCreateProjects: Boolean,
    val viewerCanCreateRepositories: Boolean,
    val viewerCanCreateTeams: Boolean,
    val viewerIsAMember: Boolean,
    override
    val websiteUrl: String?
) : AssigneeTO, SearchResultItemTO, CollectionItemContentTO, PermissionGranterTO, RegistryPackageOwnerTO, ProjectOwnerTO, UniformResourceLocatableTO, RegistryPackageSearchTO, RepositoryOwnerTO, NodeTO, ProfileOwnerTO, ActorTO, MemberStatusableTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isVerified: " + GraphQLRequestSerializer.getEntry(isVerified))
        joiner.add("itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase))
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location))
        }
        joiner.add("login: " + GraphQLRequestSerializer.getEntry(login))
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("newTeamResourcePath: " + GraphQLRequestSerializer.getEntry(newTeamResourcePath))
        joiner.add("newTeamUrl: " + GraphQLRequestSerializer.getEntry(newTeamUrl))
        if (organizationBillingEmail != null) {
            joiner.add("organizationBillingEmail: " + GraphQLRequestSerializer.getEntry(organizationBillingEmail))
        }
        joiner.add("pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining))
        joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath))
        joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl))
        if (requiresTwoFactorAuthentication != null) {
            joiner.add("requiresTwoFactorAuthentication: " + GraphQLRequestSerializer.getEntry(requiresTwoFactorAuthentication))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (samlIdentityProvider != null) {
            joiner.add("samlIdentityProvider: " + GraphQLRequestSerializer.getEntry(samlIdentityProvider))
        }
        joiner.add("teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath))
        joiner.add("teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister))
        joiner.add("viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems))
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects))
        joiner.add("viewerCanCreateRepositories: " + GraphQLRequestSerializer.getEntry(viewerCanCreateRepositories))
        joiner.add("viewerCanCreateTeams: " + GraphQLRequestSerializer.getEntry(viewerCanCreateTeams))
        joiner.add("viewerIsAMember: " + GraphQLRequestSerializer.getEntry(viewerIsAMember))
        if (websiteUrl != null) {
            joiner.add("websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl))
        }
        return joiner.toString()
    }

    class Builder {

        private var databaseId: Int? = null
        private var description: String? = null
        private var email: String? = null
        private lateinit var id: String
        private var isVerified: Boolean = false
        private lateinit var itemShowcase: ProfileItemShowcaseTO
        private var location: String? = null
        private lateinit var login: String
        private var name: String? = null
        private lateinit var newTeamResourcePath: String
        private lateinit var newTeamUrl: String
        private var organizationBillingEmail: String? = null
        private var pinnedItemsRemaining: Int = 0
        private lateinit var projectsResourcePath: String
        private lateinit var projectsUrl: String
        private var requiresTwoFactorAuthentication: Boolean? = null
        private lateinit var resourcePath: String
        private var samlIdentityProvider: OrganizationIdentityProviderTO? = null
        private lateinit var teamsResourcePath: String
        private lateinit var teamsUrl: String
        private lateinit var url: String
        private var viewerCanAdminister: Boolean = false
        private var viewerCanChangePinnedItems: Boolean = false
        private var viewerCanCreateProjects: Boolean = false
        private var viewerCanCreateRepositories: Boolean = false
        private var viewerCanCreateTeams: Boolean = false
        private var viewerIsAMember: Boolean = false
        private var websiteUrl: String? = null

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setEmail(email: String?): Builder {
            this.email = email
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsVerified(isVerified: Boolean): Builder {
            this.isVerified = isVerified
            return this
        }

        fun setItemShowcase(itemShowcase: ProfileItemShowcaseTO): Builder {
            this.itemShowcase = itemShowcase
            return this
        }

        fun setLocation(location: String?): Builder {
            this.location = location
            return this
        }

        fun setLogin(login: String): Builder {
            this.login = login
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setNewTeamResourcePath(newTeamResourcePath: String): Builder {
            this.newTeamResourcePath = newTeamResourcePath
            return this
        }

        fun setNewTeamUrl(newTeamUrl: String): Builder {
            this.newTeamUrl = newTeamUrl
            return this
        }

        fun setOrganizationBillingEmail(organizationBillingEmail: String?): Builder {
            this.organizationBillingEmail = organizationBillingEmail
            return this
        }

        fun setPinnedItemsRemaining(pinnedItemsRemaining: Int): Builder {
            this.pinnedItemsRemaining = pinnedItemsRemaining
            return this
        }

        fun setProjectsResourcePath(projectsResourcePath: String): Builder {
            this.projectsResourcePath = projectsResourcePath
            return this
        }

        fun setProjectsUrl(projectsUrl: String): Builder {
            this.projectsUrl = projectsUrl
            return this
        }

        fun setRequiresTwoFactorAuthentication(requiresTwoFactorAuthentication: Boolean?): Builder {
            this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSamlIdentityProvider(samlIdentityProvider: OrganizationIdentityProviderTO?): Builder {
            this.samlIdentityProvider = samlIdentityProvider
            return this
        }

        fun setTeamsResourcePath(teamsResourcePath: String): Builder {
            this.teamsResourcePath = teamsResourcePath
            return this
        }

        fun setTeamsUrl(teamsUrl: String): Builder {
            this.teamsUrl = teamsUrl
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setViewerCanAdminister(viewerCanAdminister: Boolean): Builder {
            this.viewerCanAdminister = viewerCanAdminister
            return this
        }

        fun setViewerCanChangePinnedItems(viewerCanChangePinnedItems: Boolean): Builder {
            this.viewerCanChangePinnedItems = viewerCanChangePinnedItems
            return this
        }

        fun setViewerCanCreateProjects(viewerCanCreateProjects: Boolean): Builder {
            this.viewerCanCreateProjects = viewerCanCreateProjects
            return this
        }

        fun setViewerCanCreateRepositories(viewerCanCreateRepositories: Boolean): Builder {
            this.viewerCanCreateRepositories = viewerCanCreateRepositories
            return this
        }

        fun setViewerCanCreateTeams(viewerCanCreateTeams: Boolean): Builder {
            this.viewerCanCreateTeams = viewerCanCreateTeams
            return this
        }

        fun setViewerIsAMember(viewerIsAMember: Boolean): Builder {
            this.viewerIsAMember = viewerIsAMember
            return this
        }

        fun setWebsiteUrl(websiteUrl: String?): Builder {
            this.websiteUrl = websiteUrl
            return this
        }

        fun build(): OrganizationTO {
            return OrganizationTO(databaseId, description, email, id, isVerified, itemShowcase, location, login, name, newTeamResourcePath, newTeamUrl, organizationBillingEmail, pinnedItemsRemaining, projectsResourcePath, projectsUrl, requiresTwoFactorAuthentication, resourcePath, samlIdentityProvider, teamsResourcePath, teamsUrl, url, viewerCanAdminister, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanCreateRepositories, viewerCanCreateTeams, viewerIsAMember, websiteUrl)
        }
    }
}
