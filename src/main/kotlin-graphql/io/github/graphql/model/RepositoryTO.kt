package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RepositoryTO(
    val codeOfConduct: CodeOfConductTO?,
    override
    val createdAt: String,
    val databaseId: Int?,
    val defaultBranchRef: RefTO?,
    override
    val description: String?,
    override
    val descriptionHTML: String,
    val diskUsage: Int?,
    override
    val forkCount: Int,
    override
    val hasIssuesEnabled: Boolean,
    override
    val hasWikiEnabled: Boolean,
    override
    val homepageUrl: String?,
    override
    val id: String,
    override
    val isArchived: Boolean,
    val isDisabled: Boolean,
    override
    val isFork: Boolean,
    override
    val isLocked: Boolean,
    override
    val isMirror: Boolean,
    override
    val isPrivate: Boolean,
    override
    val isTemplate: Boolean,
    override
    val licenseInfo: LicenseTO?,
    override
    val lockReason: RepositoryLockReasonTO?,
    val mergeCommitAllowed: Boolean,
    override
    val mirrorUrl: String?,
    override
    val name: String,
    override
    val nameWithOwner: String,
    override
    val openGraphImageUrl: String,
    override
    val owner: RepositoryOwnerTO,
    val parent: RepositoryTO?,
    val primaryLanguage: LanguageTO?,
    override
    val projectsResourcePath: String,
    override
    val projectsUrl: String,
    override
    val pushedAt: String?,
    val rebaseMergeAllowed: Boolean,
    override
    val resourcePath: String,
    val squashMergeAllowed: Boolean,
    val sshUrl: String,
    val templateRepository: RepositoryTO?,
    override
    val updatedAt: String,
    override
    val url: String,
    override
    val usesCustomOpenGraphImage: Boolean,
    val viewerCanAdminister: Boolean,
    override
    val viewerCanCreateProjects: Boolean,
    override
    val viewerCanSubscribe: Boolean,
    val viewerCanUpdateTopics: Boolean,
    override
    val viewerHasStarred: Boolean,
    val viewerPermission: RepositoryPermissionTO?,
    override
    val viewerSubscription: SubscriptionStateTO?
) : SearchResultItemTO, CollectionItemContentTO, PermissionGranterTO, PinnableItemTO, RegistryPackageOwnerTO, StarrableTO, ProjectOwnerTO, SubscribableTO, UniformResourceLocatableTO, RepositoryInfoTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (codeOfConduct != null) {
            joiner.add("codeOfConduct: " + GraphQLRequestSerializer.getEntry(codeOfConduct))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (defaultBranchRef != null) {
            joiner.add("defaultBranchRef: " + GraphQLRequestSerializer.getEntry(defaultBranchRef))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("descriptionHTML: " + GraphQLRequestSerializer.getEntry(descriptionHTML))
        if (diskUsage != null) {
            joiner.add("diskUsage: " + GraphQLRequestSerializer.getEntry(diskUsage))
        }
        joiner.add("forkCount: " + GraphQLRequestSerializer.getEntry(forkCount))
        joiner.add("hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled))
        joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled))
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        joiner.add("isDisabled: " + GraphQLRequestSerializer.getEntry(isDisabled))
        joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork))
        joiner.add("isLocked: " + GraphQLRequestSerializer.getEntry(isLocked))
        joiner.add("isMirror: " + GraphQLRequestSerializer.getEntry(isMirror))
        joiner.add("isPrivate: " + GraphQLRequestSerializer.getEntry(isPrivate))
        joiner.add("isTemplate: " + GraphQLRequestSerializer.getEntry(isTemplate))
        if (licenseInfo != null) {
            joiner.add("licenseInfo: " + GraphQLRequestSerializer.getEntry(licenseInfo))
        }
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason))
        }
        joiner.add("mergeCommitAllowed: " + GraphQLRequestSerializer.getEntry(mergeCommitAllowed))
        if (mirrorUrl != null) {
            joiner.add("mirrorUrl: " + GraphQLRequestSerializer.getEntry(mirrorUrl))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner))
        joiner.add("openGraphImageUrl: " + GraphQLRequestSerializer.getEntry(openGraphImageUrl))
        joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
        if (parent != null) {
            joiner.add("parent: " + GraphQLRequestSerializer.getEntry(parent))
        }
        if (primaryLanguage != null) {
            joiner.add("primaryLanguage: " + GraphQLRequestSerializer.getEntry(primaryLanguage))
        }
        joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath))
        joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl))
        if (pushedAt != null) {
            joiner.add("pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt))
        }
        joiner.add("rebaseMergeAllowed: " + GraphQLRequestSerializer.getEntry(rebaseMergeAllowed))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("squashMergeAllowed: " + GraphQLRequestSerializer.getEntry(squashMergeAllowed))
        joiner.add("sshUrl: " + GraphQLRequestSerializer.getEntry(sshUrl))
        if (templateRepository != null) {
            joiner.add("templateRepository: " + GraphQLRequestSerializer.getEntry(templateRepository))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("usesCustomOpenGraphImage: " + GraphQLRequestSerializer.getEntry(usesCustomOpenGraphImage))
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister))
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects))
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe))
        joiner.add("viewerCanUpdateTopics: " + GraphQLRequestSerializer.getEntry(viewerCanUpdateTopics))
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred))
        if (viewerPermission != null) {
            joiner.add("viewerPermission: " + GraphQLRequestSerializer.getEntry(viewerPermission))
        }
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription))
        }
        return joiner.toString()
    }

    class Builder {

        private var codeOfConduct: CodeOfConductTO? = null
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private var defaultBranchRef: RefTO? = null
        private var description: String? = null
        private lateinit var descriptionHTML: String
        private var diskUsage: Int? = null
        private var forkCount: Int = 0
        private var hasIssuesEnabled: Boolean = false
        private var hasWikiEnabled: Boolean = false
        private var homepageUrl: String? = null
        private lateinit var id: String
        private var isArchived: Boolean = false
        private var isDisabled: Boolean = false
        private var isFork: Boolean = false
        private var isLocked: Boolean = false
        private var isMirror: Boolean = false
        private var isPrivate: Boolean = false
        private var isTemplate: Boolean = false
        private var licenseInfo: LicenseTO? = null
        private var lockReason: RepositoryLockReasonTO? = null
        private var mergeCommitAllowed: Boolean = false
        private var mirrorUrl: String? = null
        private lateinit var name: String
        private lateinit var nameWithOwner: String
        private lateinit var openGraphImageUrl: String
        private lateinit var owner: RepositoryOwnerTO
        private var parent: RepositoryTO? = null
        private var primaryLanguage: LanguageTO? = null
        private lateinit var projectsResourcePath: String
        private lateinit var projectsUrl: String
        private var pushedAt: String? = null
        private var rebaseMergeAllowed: Boolean = false
        private lateinit var resourcePath: String
        private var squashMergeAllowed: Boolean = false
        private lateinit var sshUrl: String
        private var templateRepository: RepositoryTO? = null
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var usesCustomOpenGraphImage: Boolean = false
        private var viewerCanAdminister: Boolean = false
        private var viewerCanCreateProjects: Boolean = false
        private var viewerCanSubscribe: Boolean = false
        private var viewerCanUpdateTopics: Boolean = false
        private var viewerHasStarred: Boolean = false
        private var viewerPermission: RepositoryPermissionTO? = null
        private var viewerSubscription: SubscriptionStateTO? = null

        fun setCodeOfConduct(codeOfConduct: CodeOfConductTO?): Builder {
            this.codeOfConduct = codeOfConduct
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

        fun setDefaultBranchRef(defaultBranchRef: RefTO?): Builder {
            this.defaultBranchRef = defaultBranchRef
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setDescriptionHTML(descriptionHTML: String): Builder {
            this.descriptionHTML = descriptionHTML
            return this
        }

        fun setDiskUsage(diskUsage: Int?): Builder {
            this.diskUsage = diskUsage
            return this
        }

        fun setForkCount(forkCount: Int): Builder {
            this.forkCount = forkCount
            return this
        }

        fun setHasIssuesEnabled(hasIssuesEnabled: Boolean): Builder {
            this.hasIssuesEnabled = hasIssuesEnabled
            return this
        }

        fun setHasWikiEnabled(hasWikiEnabled: Boolean): Builder {
            this.hasWikiEnabled = hasWikiEnabled
            return this
        }

        fun setHomepageUrl(homepageUrl: String?): Builder {
            this.homepageUrl = homepageUrl
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsArchived(isArchived: Boolean): Builder {
            this.isArchived = isArchived
            return this
        }

        fun setIsDisabled(isDisabled: Boolean): Builder {
            this.isDisabled = isDisabled
            return this
        }

        fun setIsFork(isFork: Boolean): Builder {
            this.isFork = isFork
            return this
        }

        fun setIsLocked(isLocked: Boolean): Builder {
            this.isLocked = isLocked
            return this
        }

        fun setIsMirror(isMirror: Boolean): Builder {
            this.isMirror = isMirror
            return this
        }

        fun setIsPrivate(isPrivate: Boolean): Builder {
            this.isPrivate = isPrivate
            return this
        }

        fun setIsTemplate(isTemplate: Boolean): Builder {
            this.isTemplate = isTemplate
            return this
        }

        fun setLicenseInfo(licenseInfo: LicenseTO?): Builder {
            this.licenseInfo = licenseInfo
            return this
        }

        fun setLockReason(lockReason: RepositoryLockReasonTO?): Builder {
            this.lockReason = lockReason
            return this
        }

        fun setMergeCommitAllowed(mergeCommitAllowed: Boolean): Builder {
            this.mergeCommitAllowed = mergeCommitAllowed
            return this
        }

        fun setMirrorUrl(mirrorUrl: String?): Builder {
            this.mirrorUrl = mirrorUrl
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setNameWithOwner(nameWithOwner: String): Builder {
            this.nameWithOwner = nameWithOwner
            return this
        }

        fun setOpenGraphImageUrl(openGraphImageUrl: String): Builder {
            this.openGraphImageUrl = openGraphImageUrl
            return this
        }

        fun setOwner(owner: RepositoryOwnerTO): Builder {
            this.owner = owner
            return this
        }

        fun setParent(parent: RepositoryTO?): Builder {
            this.parent = parent
            return this
        }

        fun setPrimaryLanguage(primaryLanguage: LanguageTO?): Builder {
            this.primaryLanguage = primaryLanguage
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

        fun setPushedAt(pushedAt: String?): Builder {
            this.pushedAt = pushedAt
            return this
        }

        fun setRebaseMergeAllowed(rebaseMergeAllowed: Boolean): Builder {
            this.rebaseMergeAllowed = rebaseMergeAllowed
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSquashMergeAllowed(squashMergeAllowed: Boolean): Builder {
            this.squashMergeAllowed = squashMergeAllowed
            return this
        }

        fun setSshUrl(sshUrl: String): Builder {
            this.sshUrl = sshUrl
            return this
        }

        fun setTemplateRepository(templateRepository: RepositoryTO?): Builder {
            this.templateRepository = templateRepository
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

        fun setUsesCustomOpenGraphImage(usesCustomOpenGraphImage: Boolean): Builder {
            this.usesCustomOpenGraphImage = usesCustomOpenGraphImage
            return this
        }

        fun setViewerCanAdminister(viewerCanAdminister: Boolean): Builder {
            this.viewerCanAdminister = viewerCanAdminister
            return this
        }

        fun setViewerCanCreateProjects(viewerCanCreateProjects: Boolean): Builder {
            this.viewerCanCreateProjects = viewerCanCreateProjects
            return this
        }

        fun setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder {
            this.viewerCanSubscribe = viewerCanSubscribe
            return this
        }

        fun setViewerCanUpdateTopics(viewerCanUpdateTopics: Boolean): Builder {
            this.viewerCanUpdateTopics = viewerCanUpdateTopics
            return this
        }

        fun setViewerHasStarred(viewerHasStarred: Boolean): Builder {
            this.viewerHasStarred = viewerHasStarred
            return this
        }

        fun setViewerPermission(viewerPermission: RepositoryPermissionTO?): Builder {
            this.viewerPermission = viewerPermission
            return this
        }

        fun setViewerSubscription(viewerSubscription: SubscriptionStateTO?): Builder {
            this.viewerSubscription = viewerSubscription
            return this
        }

        fun build(): RepositoryTO {
            return RepositoryTO(codeOfConduct, createdAt, databaseId, defaultBranchRef, description, descriptionHTML, diskUsage, forkCount, hasIssuesEnabled, hasWikiEnabled, homepageUrl, id, isArchived, isDisabled, isFork, isLocked, isMirror, isPrivate, isTemplate, licenseInfo, lockReason, mergeCommitAllowed, mirrorUrl, name, nameWithOwner, openGraphImageUrl, owner, parent, primaryLanguage, projectsResourcePath, projectsUrl, pushedAt, rebaseMergeAllowed, resourcePath, squashMergeAllowed, sshUrl, templateRepository, updatedAt, url, usesCustomOpenGraphImage, viewerCanAdminister, viewerCanCreateProjects, viewerCanSubscribe, viewerCanUpdateTopics, viewerHasStarred, viewerPermission, viewerSubscription)
        }
    }
}
