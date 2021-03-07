package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RepositoryLockReasonTO._
import RepositoryPermissionTO._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RepositoryTO(
    codeOfConduct: CodeOfConductTO,
    @javax.validation.constraints.NotNull
    override val createdAt: String,
    databaseId: Option[Int],
    defaultBranchRef: RefTO,
    override val description: String,
    @javax.validation.constraints.NotNull
    override val descriptionHTML: String,
    diskUsage: Option[Int],
    override val forkCount: Int,
    override val hasIssuesEnabled: Boolean,
    override val hasWikiEnabled: Boolean,
    override val homepageUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    override val isArchived: Boolean,
    isDisabled: Boolean,
    override val isFork: Boolean,
    override val isLocked: Boolean,
    override val isMirror: Boolean,
    override val isPrivate: Boolean,
    override val isTemplate: Boolean,
    override val licenseInfo: LicenseTO,
    override val lockReason: RepositoryLockReasonTO,
    mergeCommitAllowed: Boolean,
    override val mirrorUrl: String,
    @javax.validation.constraints.NotNull
    override val name: String,
    @javax.validation.constraints.NotNull
    override val nameWithOwner: String,
    @javax.validation.constraints.NotNull
    override val openGraphImageUrl: String,
    @javax.validation.constraints.NotNull
    override val owner: RepositoryOwnerTO,
    parent: RepositoryTO,
    primaryLanguage: LanguageTO,
    @javax.validation.constraints.NotNull
    override val projectsResourcePath: String,
    @javax.validation.constraints.NotNull
    override val projectsUrl: String,
    override val pushedAt: String,
    rebaseMergeAllowed: Boolean,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    squashMergeAllowed: Boolean,
    @javax.validation.constraints.NotNull
    sshUrl: String,
    templateRepository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    override val usesCustomOpenGraphImage: Boolean,
    viewerCanAdminister: Boolean,
    override val viewerCanCreateProjects: Boolean,
    override val viewerCanSubscribe: Boolean,
    viewerCanUpdateTopics: Boolean,
    override val viewerHasStarred: Boolean,
    viewerPermission: RepositoryPermissionTO,
    override val viewerSubscription: SubscriptionStateTO
) extends SearchResultItemTO with CollectionItemContentTO with PermissionGranterTO with PinnableItemTO with RegistryPackageOwnerTO with StarrableTO with ProjectOwnerTO with SubscribableTO with UniformResourceLocatableTO with RepositoryInfoTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (codeOfConduct != null) "codeOfConduct: " + GraphQLRequestSerializer.getEntry(codeOfConduct) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (defaultBranchRef != null) "defaultBranchRef: " + GraphQLRequestSerializer.getEntry(defaultBranchRef) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (descriptionHTML != null) "descriptionHTML: " + GraphQLRequestSerializer.getEntry(descriptionHTML) else "",
            if (diskUsage.isDefined) "diskUsage: " + GraphQLRequestSerializer.getEntry(diskUsage.get) else "",
            "forkCount: " + GraphQLRequestSerializer.getEntry(forkCount),
            "hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled),
            "hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled),
            if (homepageUrl != null) "homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isArchived: " + GraphQLRequestSerializer.getEntry(isArchived),
            "isDisabled: " + GraphQLRequestSerializer.getEntry(isDisabled),
            "isFork: " + GraphQLRequestSerializer.getEntry(isFork),
            "isLocked: " + GraphQLRequestSerializer.getEntry(isLocked),
            "isMirror: " + GraphQLRequestSerializer.getEntry(isMirror),
            "isPrivate: " + GraphQLRequestSerializer.getEntry(isPrivate),
            "isTemplate: " + GraphQLRequestSerializer.getEntry(isTemplate),
            if (licenseInfo != null) "licenseInfo: " + GraphQLRequestSerializer.getEntry(licenseInfo) else "",
            if (lockReason != null) "lockReason: " + GraphQLRequestSerializer.getEntry(lockReason) else "",
            "mergeCommitAllowed: " + GraphQLRequestSerializer.getEntry(mergeCommitAllowed),
            if (mirrorUrl != null) "mirrorUrl: " + GraphQLRequestSerializer.getEntry(mirrorUrl) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (nameWithOwner != null) "nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner) else "",
            if (openGraphImageUrl != null) "openGraphImageUrl: " + GraphQLRequestSerializer.getEntry(openGraphImageUrl) else "",
            if (owner != null) "owner: " + GraphQLRequestSerializer.getEntry(owner) else "",
            if (parent != null) "parent: " + GraphQLRequestSerializer.getEntry(parent) else "",
            if (primaryLanguage != null) "primaryLanguage: " + GraphQLRequestSerializer.getEntry(primaryLanguage) else "",
            if (projectsResourcePath != null) "projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath) else "",
            if (projectsUrl != null) "projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl) else "",
            if (pushedAt != null) "pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt) else "",
            "rebaseMergeAllowed: " + GraphQLRequestSerializer.getEntry(rebaseMergeAllowed),
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            "squashMergeAllowed: " + GraphQLRequestSerializer.getEntry(squashMergeAllowed),
            if (sshUrl != null) "sshUrl: " + GraphQLRequestSerializer.getEntry(sshUrl) else "",
            if (templateRepository != null) "templateRepository: " + GraphQLRequestSerializer.getEntry(templateRepository) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "usesCustomOpenGraphImage: " + GraphQLRequestSerializer.getEntry(usesCustomOpenGraphImage),
            "viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister),
            "viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects),
            "viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe),
            "viewerCanUpdateTopics: " + GraphQLRequestSerializer.getEntry(viewerCanUpdateTopics),
            "viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred),
            if (viewerPermission != null) "viewerPermission: " + GraphQLRequestSerializer.getEntry(viewerPermission) else "",
            if (viewerSubscription != null) "viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RepositoryTO {

    def builder(): RepositoryTO.Builder = new Builder()

    class Builder {

        private var codeOfConduct: CodeOfConductTO = _
        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var defaultBranchRef: RefTO = _
        private var description: String = _
        private var descriptionHTML: String = _
        private var diskUsage: Option[Int] = _
        private var forkCount: Int = _
        private var hasIssuesEnabled: Boolean = _
        private var hasWikiEnabled: Boolean = _
        private var homepageUrl: String = _
        private var id: String = _
        private var isArchived: Boolean = _
        private var isDisabled: Boolean = _
        private var isFork: Boolean = _
        private var isLocked: Boolean = _
        private var isMirror: Boolean = _
        private var isPrivate: Boolean = _
        private var isTemplate: Boolean = _
        private var licenseInfo: LicenseTO = _
        private var lockReason: RepositoryLockReasonTO = _
        private var mergeCommitAllowed: Boolean = _
        private var mirrorUrl: String = _
        private var name: String = _
        private var nameWithOwner: String = _
        private var openGraphImageUrl: String = _
        private var owner: RepositoryOwnerTO = _
        private var parent: RepositoryTO = _
        private var primaryLanguage: LanguageTO = _
        private var projectsResourcePath: String = _
        private var projectsUrl: String = _
        private var pushedAt: String = _
        private var rebaseMergeAllowed: Boolean = _
        private var resourcePath: String = _
        private var squashMergeAllowed: Boolean = _
        private var sshUrl: String = _
        private var templateRepository: RepositoryTO = _
        private var updatedAt: String = _
        private var url: String = _
        private var usesCustomOpenGraphImage: Boolean = _
        private var viewerCanAdminister: Boolean = _
        private var viewerCanCreateProjects: Boolean = _
        private var viewerCanSubscribe: Boolean = _
        private var viewerCanUpdateTopics: Boolean = _
        private var viewerHasStarred: Boolean = _
        private var viewerPermission: RepositoryPermissionTO = _
        private var viewerSubscription: SubscriptionStateTO = _

        def setCodeOfConduct(codeOfConduct: CodeOfConductTO): Builder = {
            this.codeOfConduct = codeOfConduct
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

        def setDefaultBranchRef(defaultBranchRef: RefTO): Builder = {
            this.defaultBranchRef = defaultBranchRef
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setDescriptionHTML(descriptionHTML: String): Builder = {
            this.descriptionHTML = descriptionHTML
            this
        }

        def setDiskUsage(diskUsage: Option[Int]): Builder = {
            this.diskUsage = diskUsage
            this
        }

        def setForkCount(forkCount: Int): Builder = {
            this.forkCount = forkCount
            this
        }

        def setHasIssuesEnabled(hasIssuesEnabled: Boolean): Builder = {
            this.hasIssuesEnabled = hasIssuesEnabled
            this
        }

        def setHasWikiEnabled(hasWikiEnabled: Boolean): Builder = {
            this.hasWikiEnabled = hasWikiEnabled
            this
        }

        def setHomepageUrl(homepageUrl: String): Builder = {
            this.homepageUrl = homepageUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsArchived(isArchived: Boolean): Builder = {
            this.isArchived = isArchived
            this
        }

        def setIsDisabled(isDisabled: Boolean): Builder = {
            this.isDisabled = isDisabled
            this
        }

        def setIsFork(isFork: Boolean): Builder = {
            this.isFork = isFork
            this
        }

        def setIsLocked(isLocked: Boolean): Builder = {
            this.isLocked = isLocked
            this
        }

        def setIsMirror(isMirror: Boolean): Builder = {
            this.isMirror = isMirror
            this
        }

        def setIsPrivate(isPrivate: Boolean): Builder = {
            this.isPrivate = isPrivate
            this
        }

        def setIsTemplate(isTemplate: Boolean): Builder = {
            this.isTemplate = isTemplate
            this
        }

        def setLicenseInfo(licenseInfo: LicenseTO): Builder = {
            this.licenseInfo = licenseInfo
            this
        }

        def setLockReason(lockReason: RepositoryLockReasonTO): Builder = {
            this.lockReason = lockReason
            this
        }

        def setMergeCommitAllowed(mergeCommitAllowed: Boolean): Builder = {
            this.mergeCommitAllowed = mergeCommitAllowed
            this
        }

        def setMirrorUrl(mirrorUrl: String): Builder = {
            this.mirrorUrl = mirrorUrl
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNameWithOwner(nameWithOwner: String): Builder = {
            this.nameWithOwner = nameWithOwner
            this
        }

        def setOpenGraphImageUrl(openGraphImageUrl: String): Builder = {
            this.openGraphImageUrl = openGraphImageUrl
            this
        }

        def setOwner(owner: RepositoryOwnerTO): Builder = {
            this.owner = owner
            this
        }

        def setParent(parent: RepositoryTO): Builder = {
            this.parent = parent
            this
        }

        def setPrimaryLanguage(primaryLanguage: LanguageTO): Builder = {
            this.primaryLanguage = primaryLanguage
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

        def setPushedAt(pushedAt: String): Builder = {
            this.pushedAt = pushedAt
            this
        }

        def setRebaseMergeAllowed(rebaseMergeAllowed: Boolean): Builder = {
            this.rebaseMergeAllowed = rebaseMergeAllowed
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSquashMergeAllowed(squashMergeAllowed: Boolean): Builder = {
            this.squashMergeAllowed = squashMergeAllowed
            this
        }

        def setSshUrl(sshUrl: String): Builder = {
            this.sshUrl = sshUrl
            this
        }

        def setTemplateRepository(templateRepository: RepositoryTO): Builder = {
            this.templateRepository = templateRepository
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

        def setUsesCustomOpenGraphImage(usesCustomOpenGraphImage: Boolean): Builder = {
            this.usesCustomOpenGraphImage = usesCustomOpenGraphImage
            this
        }

        def setViewerCanAdminister(viewerCanAdminister: Boolean): Builder = {
            this.viewerCanAdminister = viewerCanAdminister
            this
        }

        def setViewerCanCreateProjects(viewerCanCreateProjects: Boolean): Builder = {
            this.viewerCanCreateProjects = viewerCanCreateProjects
            this
        }

        def setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder = {
            this.viewerCanSubscribe = viewerCanSubscribe
            this
        }

        def setViewerCanUpdateTopics(viewerCanUpdateTopics: Boolean): Builder = {
            this.viewerCanUpdateTopics = viewerCanUpdateTopics
            this
        }

        def setViewerHasStarred(viewerHasStarred: Boolean): Builder = {
            this.viewerHasStarred = viewerHasStarred
            this
        }

        def setViewerPermission(viewerPermission: RepositoryPermissionTO): Builder = {
            this.viewerPermission = viewerPermission
            this
        }

        def setViewerSubscription(viewerSubscription: SubscriptionStateTO): Builder = {
            this.viewerSubscription = viewerSubscription
            this
        }

        def build(): RepositoryTO = new RepositoryTO(codeOfConduct, createdAt, databaseId, defaultBranchRef, description, descriptionHTML, diskUsage, forkCount, hasIssuesEnabled, hasWikiEnabled, homepageUrl, id, isArchived, isDisabled, isFork, isLocked, isMirror, isPrivate, isTemplate, licenseInfo, lockReason, mergeCommitAllowed, mirrorUrl, name, nameWithOwner, openGraphImageUrl, owner, parent, primaryLanguage, projectsResourcePath, projectsUrl, pushedAt, rebaseMergeAllowed, resourcePath, squashMergeAllowed, sshUrl, templateRepository, updatedAt, url, usesCustomOpenGraphImage, viewerCanAdminister, viewerCanCreateProjects, viewerCanSubscribe, viewerCanUpdateTopics, viewerHasStarred, viewerPermission, viewerSubscription)

    }
}
