package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
