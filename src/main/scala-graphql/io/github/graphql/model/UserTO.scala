package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UserTO(
    bio: String,
    @javax.validation.constraints.NotNull
    bioHTML: String,
    company: String,
    @javax.validation.constraints.NotNull
    companyHTML: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val email: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isBountyHunter: Boolean,
    isCampusExpert: Boolean,
    isDeveloperProgramMember: Boolean,
    isEmployee: Boolean,
    isHireable: Boolean,
    isSiteAdmin: Boolean,
    isViewer: Boolean,
    @javax.validation.constraints.NotNull
    override val itemShowcase: ProfileItemShowcaseTO,
    override val location: String,
    @javax.validation.constraints.NotNull
    override val login: String,
    override val name: String,
    override val pinnedItemsRemaining: Int,
    @javax.validation.constraints.NotNull
    override val projectsResourcePath: String,
    @javax.validation.constraints.NotNull
    override val projectsUrl: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    status: UserStatusTO,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    override val viewerCanChangePinnedItems: Boolean,
    override val viewerCanCreateProjects: Boolean,
    viewerCanFollow: Boolean,
    viewerIsFollowing: Boolean,
    override val websiteUrl: String
) extends AssigneeTO with SearchResultItemTO with ReviewDismissalAllowanceActorTO with CollectionItemContentTO with RequestedReviewerTO with PushAllowanceActorTO with RegistryPackageOwnerTO with SponsorableTO with ProjectOwnerTO with UniformResourceLocatableTO with RegistryPackageSearchTO with RepositoryOwnerTO with NodeTO with ProfileOwnerTO with ActorTO {

    override def toString(): String = {
        Seq(
            if (bio != null) "bio: " + GraphQLRequestSerializer.getEntry(bio) else "",
            if (bioHTML != null) "bioHTML: " + GraphQLRequestSerializer.getEntry(bioHTML) else "",
            if (company != null) "company: " + GraphQLRequestSerializer.getEntry(company) else "",
            if (companyHTML != null) "companyHTML: " + GraphQLRequestSerializer.getEntry(companyHTML) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (email != null) "email: " + GraphQLRequestSerializer.getEntry(email) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isBountyHunter: " + GraphQLRequestSerializer.getEntry(isBountyHunter),
            "isCampusExpert: " + GraphQLRequestSerializer.getEntry(isCampusExpert),
            "isDeveloperProgramMember: " + GraphQLRequestSerializer.getEntry(isDeveloperProgramMember),
            "isEmployee: " + GraphQLRequestSerializer.getEntry(isEmployee),
            "isHireable: " + GraphQLRequestSerializer.getEntry(isHireable),
            "isSiteAdmin: " + GraphQLRequestSerializer.getEntry(isSiteAdmin),
            "isViewer: " + GraphQLRequestSerializer.getEntry(isViewer),
            if (itemShowcase != null) "itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase) else "",
            if (location != null) "location: " + GraphQLRequestSerializer.getEntry(location) else "",
            if (login != null) "login: " + GraphQLRequestSerializer.getEntry(login) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            "pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining),
            if (projectsResourcePath != null) "projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath) else "",
            if (projectsUrl != null) "projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (status != null) "status: " + GraphQLRequestSerializer.getEntry(status) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems),
            "viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects),
            "viewerCanFollow: " + GraphQLRequestSerializer.getEntry(viewerCanFollow),
            "viewerIsFollowing: " + GraphQLRequestSerializer.getEntry(viewerIsFollowing),
            if (websiteUrl != null) "websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UserTO {

    def builder(): UserTO.Builder = new Builder()

    class Builder {

        private var bio: String = _
        private var bioHTML: String = _
        private var company: String = _
        private var companyHTML: String = _
        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var email: String = _
        private var id: String = _
        private var isBountyHunter: Boolean = _
        private var isCampusExpert: Boolean = _
        private var isDeveloperProgramMember: Boolean = _
        private var isEmployee: Boolean = _
        private var isHireable: Boolean = _
        private var isSiteAdmin: Boolean = _
        private var isViewer: Boolean = _
        private var itemShowcase: ProfileItemShowcaseTO = _
        private var location: String = _
        private var login: String = _
        private var name: String = _
        private var pinnedItemsRemaining: Int = _
        private var projectsResourcePath: String = _
        private var projectsUrl: String = _
        private var resourcePath: String = _
        private var status: UserStatusTO = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanChangePinnedItems: Boolean = _
        private var viewerCanCreateProjects: Boolean = _
        private var viewerCanFollow: Boolean = _
        private var viewerIsFollowing: Boolean = _
        private var websiteUrl: String = _

        def setBio(bio: String): Builder = {
            this.bio = bio
            this
        }

        def setBioHTML(bioHTML: String): Builder = {
            this.bioHTML = bioHTML
            this
        }

        def setCompany(company: String): Builder = {
            this.company = company
            this
        }

        def setCompanyHTML(companyHTML: String): Builder = {
            this.companyHTML = companyHTML
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
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

        def setIsBountyHunter(isBountyHunter: Boolean): Builder = {
            this.isBountyHunter = isBountyHunter
            this
        }

        def setIsCampusExpert(isCampusExpert: Boolean): Builder = {
            this.isCampusExpert = isCampusExpert
            this
        }

        def setIsDeveloperProgramMember(isDeveloperProgramMember: Boolean): Builder = {
            this.isDeveloperProgramMember = isDeveloperProgramMember
            this
        }

        def setIsEmployee(isEmployee: Boolean): Builder = {
            this.isEmployee = isEmployee
            this
        }

        def setIsHireable(isHireable: Boolean): Builder = {
            this.isHireable = isHireable
            this
        }

        def setIsSiteAdmin(isSiteAdmin: Boolean): Builder = {
            this.isSiteAdmin = isSiteAdmin
            this
        }

        def setIsViewer(isViewer: Boolean): Builder = {
            this.isViewer = isViewer
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

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setStatus(status: UserStatusTO): Builder = {
            this.status = status
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
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

        def setViewerCanFollow(viewerCanFollow: Boolean): Builder = {
            this.viewerCanFollow = viewerCanFollow
            this
        }

        def setViewerIsFollowing(viewerIsFollowing: Boolean): Builder = {
            this.viewerIsFollowing = viewerIsFollowing
            this
        }

        def setWebsiteUrl(websiteUrl: String): Builder = {
            this.websiteUrl = websiteUrl
            this
        }

        def build(): UserTO = new UserTO(bio, bioHTML, company, companyHTML, createdAt, databaseId, email, id, isBountyHunter, isCampusExpert, isDeveloperProgramMember, isEmployee, isHireable, isSiteAdmin, isViewer, itemShowcase, location, login, name, pinnedItemsRemaining, projectsResourcePath, projectsUrl, resourcePath, status, updatedAt, url, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanFollow, viewerIsFollowing, websiteUrl)

    }
}
