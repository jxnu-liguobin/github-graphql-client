package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class OrganizationTO(
    databaseId: Option[Int],
    description: String,
    override val email: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isVerified: Boolean,
    @javax.validation.constraints.NotNull
    override val itemShowcase: ProfileItemShowcaseTO,
    override val location: String,
    @javax.validation.constraints.NotNull
    override val login: String,
    override val name: String,
    @javax.validation.constraints.NotNull
    newTeamResourcePath: String,
    @javax.validation.constraints.NotNull
    newTeamUrl: String,
    organizationBillingEmail: String,
    override val pinnedItemsRemaining: Int,
    @javax.validation.constraints.NotNull
    override val projectsResourcePath: String,
    @javax.validation.constraints.NotNull
    override val projectsUrl: String,
    requiresTwoFactorAuthentication: Option[Boolean],
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    samlIdentityProvider: OrganizationIdentityProviderTO,
    @javax.validation.constraints.NotNull
    teamsResourcePath: String,
    @javax.validation.constraints.NotNull
    teamsUrl: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    viewerCanAdminister: Boolean,
    override val viewerCanChangePinnedItems: Boolean,
    override val viewerCanCreateProjects: Boolean,
    viewerCanCreateRepositories: Boolean,
    viewerCanCreateTeams: Boolean,
    viewerIsAMember: Boolean,
    override val websiteUrl: String
) extends AssigneeTO with SearchResultItemTO with CollectionItemContentTO with PermissionGranterTO with RegistryPackageOwnerTO with ProjectOwnerTO with UniformResourceLocatableTO with RegistryPackageSearchTO with RepositoryOwnerTO with NodeTO with ProfileOwnerTO with ActorTO with MemberStatusableTO {

    override def toString(): String = {
        Seq(
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (email != null) "email: " + GraphQLRequestSerializer.getEntry(email) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isVerified: " + GraphQLRequestSerializer.getEntry(isVerified),
            if (itemShowcase != null) "itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase) else "",
            if (location != null) "location: " + GraphQLRequestSerializer.getEntry(location) else "",
            if (login != null) "login: " + GraphQLRequestSerializer.getEntry(login) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (newTeamResourcePath != null) "newTeamResourcePath: " + GraphQLRequestSerializer.getEntry(newTeamResourcePath) else "",
            if (newTeamUrl != null) "newTeamUrl: " + GraphQLRequestSerializer.getEntry(newTeamUrl) else "",
            if (organizationBillingEmail != null) "organizationBillingEmail: " + GraphQLRequestSerializer.getEntry(organizationBillingEmail) else "",
            "pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining),
            if (projectsResourcePath != null) "projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath) else "",
            if (projectsUrl != null) "projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl) else "",
            if (requiresTwoFactorAuthentication.isDefined) "requiresTwoFactorAuthentication: " + GraphQLRequestSerializer.getEntry(requiresTwoFactorAuthentication.get) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (samlIdentityProvider != null) "samlIdentityProvider: " + GraphQLRequestSerializer.getEntry(samlIdentityProvider) else "",
            if (teamsResourcePath != null) "teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath) else "",
            if (teamsUrl != null) "teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister),
            "viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems),
            "viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects),
            "viewerCanCreateRepositories: " + GraphQLRequestSerializer.getEntry(viewerCanCreateRepositories),
            "viewerCanCreateTeams: " + GraphQLRequestSerializer.getEntry(viewerCanCreateTeams),
            "viewerIsAMember: " + GraphQLRequestSerializer.getEntry(viewerIsAMember),
            if (websiteUrl != null) "websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[OrganizationTO]
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(description, that.description) &&
        Objects.equals(email, that.email) &&
        Objects.equals(id, that.id) &&
        Objects.equals(isVerified, that.isVerified) &&
        Objects.equals(itemShowcase, that.itemShowcase) &&
        Objects.equals(location, that.location) &&
        Objects.equals(login, that.login) &&
        Objects.equals(name, that.name) &&
        Objects.equals(newTeamResourcePath, that.newTeamResourcePath) &&
        Objects.equals(newTeamUrl, that.newTeamUrl) &&
        Objects.equals(organizationBillingEmail, that.organizationBillingEmail) &&
        Objects.equals(pinnedItemsRemaining, that.pinnedItemsRemaining) &&
        Objects.equals(projectsResourcePath, that.projectsResourcePath) &&
        Objects.equals(projectsUrl, that.projectsUrl) &&
        Objects.equals(requiresTwoFactorAuthentication, that.requiresTwoFactorAuthentication) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(samlIdentityProvider, that.samlIdentityProvider) &&
        Objects.equals(teamsResourcePath, that.teamsResourcePath) &&
        Objects.equals(teamsUrl, that.teamsUrl) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerCanAdminister, that.viewerCanAdminister) &&
        Objects.equals(viewerCanChangePinnedItems, that.viewerCanChangePinnedItems) &&
        Objects.equals(viewerCanCreateProjects, that.viewerCanCreateProjects) &&
        Objects.equals(viewerCanCreateRepositories, that.viewerCanCreateRepositories) &&
        Objects.equals(viewerCanCreateTeams, that.viewerCanCreateTeams) &&
        Objects.equals(viewerIsAMember, that.viewerIsAMember) &&
        Objects.equals(websiteUrl, that.websiteUrl)
    }

    override def hashCode(): Int = {
        Objects.hash(databaseId, description, email, id, isVerified, itemShowcase, location, login, name, newTeamResourcePath, newTeamUrl, organizationBillingEmail, pinnedItemsRemaining, projectsResourcePath, projectsUrl, requiresTwoFactorAuthentication, resourcePath, samlIdentityProvider, teamsResourcePath, teamsUrl, url, viewerCanAdminister, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanCreateRepositories, viewerCanCreateTeams, viewerIsAMember, websiteUrl)
    }
}

object OrganizationTO {

    def builder(): OrganizationTO.Builder = new Builder()

    class Builder {

        private var databaseId: Option[Int] = _
        private var description: String = _
        private var email: String = _
        private var id: String = _
        private var isVerified: Boolean = _
        private var itemShowcase: ProfileItemShowcaseTO = _
        private var location: String = _
        private var login: String = _
        private var name: String = _
        private var newTeamResourcePath: String = _
        private var newTeamUrl: String = _
        private var organizationBillingEmail: String = _
        private var pinnedItemsRemaining: Int = _
        private var projectsResourcePath: String = _
        private var projectsUrl: String = _
        private var requiresTwoFactorAuthentication: Option[Boolean] = _
        private var resourcePath: String = _
        private var samlIdentityProvider: OrganizationIdentityProviderTO = _
        private var teamsResourcePath: String = _
        private var teamsUrl: String = _
        private var url: String = _
        private var viewerCanAdminister: Boolean = _
        private var viewerCanChangePinnedItems: Boolean = _
        private var viewerCanCreateProjects: Boolean = _
        private var viewerCanCreateRepositories: Boolean = _
        private var viewerCanCreateTeams: Boolean = _
        private var viewerIsAMember: Boolean = _
        private var websiteUrl: String = _

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setEmail(email: String): Builder = {
            this.email = email
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsVerified(isVerified: Boolean): Builder = {
            this.isVerified = isVerified
            this
        }

        def setItemShowcase(itemShowcase: ProfileItemShowcaseTO): Builder = {
            this.itemShowcase = itemShowcase
            this
        }

        def setLocation(location: String): Builder = {
            this.location = location
            this
        }

        def setLogin(login: String): Builder = {
            this.login = login
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNewTeamResourcePath(newTeamResourcePath: String): Builder = {
            this.newTeamResourcePath = newTeamResourcePath
            this
        }

        def setNewTeamUrl(newTeamUrl: String): Builder = {
            this.newTeamUrl = newTeamUrl
            this
        }

        def setOrganizationBillingEmail(organizationBillingEmail: String): Builder = {
            this.organizationBillingEmail = organizationBillingEmail
            this
        }

        def setPinnedItemsRemaining(pinnedItemsRemaining: Int): Builder = {
            this.pinnedItemsRemaining = pinnedItemsRemaining
            this
        }

        def setProjectsResourcePath(projectsResourcePath: String): Builder = {
            this.projectsResourcePath = projectsResourcePath
            this
        }

        def setProjectsUrl(projectsUrl: String): Builder = {
            this.projectsUrl = projectsUrl
            this
        }

        def setRequiresTwoFactorAuthentication(requiresTwoFactorAuthentication: Option[Boolean]): Builder = {
            this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSamlIdentityProvider(samlIdentityProvider: OrganizationIdentityProviderTO): Builder = {
            this.samlIdentityProvider = samlIdentityProvider
            this
        }

        def setTeamsResourcePath(teamsResourcePath: String): Builder = {
            this.teamsResourcePath = teamsResourcePath
            this
        }

        def setTeamsUrl(teamsUrl: String): Builder = {
            this.teamsUrl = teamsUrl
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def setViewerCanAdminister(viewerCanAdminister: Boolean): Builder = {
            this.viewerCanAdminister = viewerCanAdminister
            this
        }

        def setViewerCanChangePinnedItems(viewerCanChangePinnedItems: Boolean): Builder = {
            this.viewerCanChangePinnedItems = viewerCanChangePinnedItems
            this
        }

        def setViewerCanCreateProjects(viewerCanCreateProjects: Boolean): Builder = {
            this.viewerCanCreateProjects = viewerCanCreateProjects
            this
        }

        def setViewerCanCreateRepositories(viewerCanCreateRepositories: Boolean): Builder = {
            this.viewerCanCreateRepositories = viewerCanCreateRepositories
            this
        }

        def setViewerCanCreateTeams(viewerCanCreateTeams: Boolean): Builder = {
            this.viewerCanCreateTeams = viewerCanCreateTeams
            this
        }

        def setViewerIsAMember(viewerIsAMember: Boolean): Builder = {
            this.viewerIsAMember = viewerIsAMember
            this
        }

        def setWebsiteUrl(websiteUrl: String): Builder = {
            this.websiteUrl = websiteUrl
            this
        }

        def build(): OrganizationTO = new OrganizationTO(databaseId, description, email, id, isVerified, itemShowcase, location, login, name, newTeamResourcePath, newTeamUrl, organizationBillingEmail, pinnedItemsRemaining, projectsResourcePath, projectsUrl, requiresTwoFactorAuthentication, resourcePath, samlIdentityProvider, teamsResourcePath, teamsUrl, url, viewerCanAdminister, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanCreateRepositories, viewerCanCreateTeams, viewerIsAMember, websiteUrl)

    }
}
