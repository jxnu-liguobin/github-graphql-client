package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UserTO(
    val bio: String?,
    val bioHTML: String,
    val company: String?,
    val companyHTML: String,
    val createdAt: String,
    val databaseId: Int?,
    override
    val email: String,
    override
    val id: String,
    val isBountyHunter: Boolean,
    val isCampusExpert: Boolean,
    val isDeveloperProgramMember: Boolean,
    val isEmployee: Boolean,
    val isHireable: Boolean,
    val isSiteAdmin: Boolean,
    val isViewer: Boolean,
    override
    val itemShowcase: ProfileItemShowcaseTO,
    override
    val location: String?,
    override
    val login: String,
    override
    val name: String?,
    override
    val pinnedItemsRemaining: Int,
    override
    val projectsResourcePath: String,
    override
    val projectsUrl: String,
    override
    val resourcePath: String,
    val status: UserStatusTO?,
    val updatedAt: String,
    override
    val url: String,
    override
    val viewerCanChangePinnedItems: Boolean,
    override
    val viewerCanCreateProjects: Boolean,
    val viewerCanFollow: Boolean,
    val viewerIsFollowing: Boolean,
    override
    val websiteUrl: String?
) : AssigneeTO, SearchResultItemTO, ReviewDismissalAllowanceActorTO, CollectionItemContentTO, RequestedReviewerTO, PushAllowanceActorTO, RegistryPackageOwnerTO, SponsorableTO, ProjectOwnerTO, UniformResourceLocatableTO, RegistryPackageSearchTO, RepositoryOwnerTO, NodeTO, ProfileOwnerTO, ActorTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (bio != null) {
            joiner.add("bio: " + GraphQLRequestSerializer.getEntry(bio))
        }
        joiner.add("bioHTML: " + GraphQLRequestSerializer.getEntry(bioHTML))
        if (company != null) {
            joiner.add("company: " + GraphQLRequestSerializer.getEntry(company))
        }
        joiner.add("companyHTML: " + GraphQLRequestSerializer.getEntry(companyHTML))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isBountyHunter: " + GraphQLRequestSerializer.getEntry(isBountyHunter))
        joiner.add("isCampusExpert: " + GraphQLRequestSerializer.getEntry(isCampusExpert))
        joiner.add("isDeveloperProgramMember: " + GraphQLRequestSerializer.getEntry(isDeveloperProgramMember))
        joiner.add("isEmployee: " + GraphQLRequestSerializer.getEntry(isEmployee))
        joiner.add("isHireable: " + GraphQLRequestSerializer.getEntry(isHireable))
        joiner.add("isSiteAdmin: " + GraphQLRequestSerializer.getEntry(isSiteAdmin))
        joiner.add("isViewer: " + GraphQLRequestSerializer.getEntry(isViewer))
        joiner.add("itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase))
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location))
        }
        joiner.add("login: " + GraphQLRequestSerializer.getEntry(login))
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining))
        joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath))
        joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems))
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects))
        joiner.add("viewerCanFollow: " + GraphQLRequestSerializer.getEntry(viewerCanFollow))
        joiner.add("viewerIsFollowing: " + GraphQLRequestSerializer.getEntry(viewerIsFollowing))
        if (websiteUrl != null) {
            joiner.add("websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl))
        }
        return joiner.toString()
    }

    class Builder {

        private var bio: String? = null
        private lateinit var bioHTML: String
        private var company: String? = null
        private lateinit var companyHTML: String
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private lateinit var email: String
        private lateinit var id: String
        private var isBountyHunter: Boolean = false
        private var isCampusExpert: Boolean = false
        private var isDeveloperProgramMember: Boolean = false
        private var isEmployee: Boolean = false
        private var isHireable: Boolean = false
        private var isSiteAdmin: Boolean = false
        private var isViewer: Boolean = false
        private lateinit var itemShowcase: ProfileItemShowcaseTO
        private var location: String? = null
        private lateinit var login: String
        private var name: String? = null
        private var pinnedItemsRemaining: Int = 0
        private lateinit var projectsResourcePath: String
        private lateinit var projectsUrl: String
        private lateinit var resourcePath: String
        private var status: UserStatusTO? = null
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanChangePinnedItems: Boolean = false
        private var viewerCanCreateProjects: Boolean = false
        private var viewerCanFollow: Boolean = false
        private var viewerIsFollowing: Boolean = false
        private var websiteUrl: String? = null

        fun setBio(bio: String?): Builder {
            this.bio = bio
            return this
        }

        fun setBioHTML(bioHTML: String): Builder {
            this.bioHTML = bioHTML
            return this
        }

        fun setCompany(company: String?): Builder {
            this.company = company
            return this
        }

        fun setCompanyHTML(companyHTML: String): Builder {
            this.companyHTML = companyHTML
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setEmail(email: String): Builder {
            this.email = email
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsBountyHunter(isBountyHunter: Boolean): Builder {
            this.isBountyHunter = isBountyHunter
            return this
        }

        fun setIsCampusExpert(isCampusExpert: Boolean): Builder {
            this.isCampusExpert = isCampusExpert
            return this
        }

        fun setIsDeveloperProgramMember(isDeveloperProgramMember: Boolean): Builder {
            this.isDeveloperProgramMember = isDeveloperProgramMember
            return this
        }

        fun setIsEmployee(isEmployee: Boolean): Builder {
            this.isEmployee = isEmployee
            return this
        }

        fun setIsHireable(isHireable: Boolean): Builder {
            this.isHireable = isHireable
            return this
        }

        fun setIsSiteAdmin(isSiteAdmin: Boolean): Builder {
            this.isSiteAdmin = isSiteAdmin
            return this
        }

        fun setIsViewer(isViewer: Boolean): Builder {
            this.isViewer = isViewer
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

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setStatus(status: UserStatusTO?): Builder {
            this.status = status
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
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

        fun setViewerCanFollow(viewerCanFollow: Boolean): Builder {
            this.viewerCanFollow = viewerCanFollow
            return this
        }

        fun setViewerIsFollowing(viewerIsFollowing: Boolean): Builder {
            this.viewerIsFollowing = viewerIsFollowing
            return this
        }

        fun setWebsiteUrl(websiteUrl: String?): Builder {
            this.websiteUrl = websiteUrl
            return this
        }

        fun build(): UserTO {
            return UserTO(bio, bioHTML, company, companyHTML, createdAt, databaseId, email, id, isBountyHunter, isCampusExpert, isDeveloperProgramMember, isEmployee, isHireable, isSiteAdmin, isViewer, itemShowcase, location, login, name, pinnedItemsRemaining, projectsResourcePath, projectsUrl, resourcePath, status, updatedAt, url, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanFollow, viewerIsFollowing, websiteUrl)
        }
    }
}
