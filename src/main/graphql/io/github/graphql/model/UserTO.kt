package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
