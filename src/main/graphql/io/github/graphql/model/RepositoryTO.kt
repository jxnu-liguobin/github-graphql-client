package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
