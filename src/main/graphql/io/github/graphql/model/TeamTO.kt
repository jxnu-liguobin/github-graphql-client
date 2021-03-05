package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamTO(
    val combinedSlug: String,
    val createdAt: String,
    val description: String?,
    val editTeamResourcePath: String,
    val editTeamUrl: String,
    override
    val id: String,
    val membersResourcePath: String,
    val membersUrl: String,
    val name: String,
    val newTeamResourcePath: String,
    val newTeamUrl: String,
    val organization: OrganizationTO,
    val parentTeam: TeamTO?,
    val privacy: TeamPrivacyTO,
    val repositoriesResourcePath: String,
    val repositoriesUrl: String,
    val resourcePath: String,
    val slug: String,
    val teamsResourcePath: String,
    val teamsUrl: String,
    val updatedAt: String,
    val url: String,
    val viewerCanAdminister: Boolean,
    override
    val viewerCanSubscribe: Boolean,
    override
    val viewerSubscription: SubscriptionStateTO?
) : ReviewDismissalAllowanceActorTO, RequestedReviewerTO, PushAllowanceActorTO, PermissionGranterTO, SubscribableTO, NodeTO, MemberStatusableTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("combinedSlug: " + GraphQLRequestSerializer.getEntry(combinedSlug))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("editTeamResourcePath: " + GraphQLRequestSerializer.getEntry(editTeamResourcePath))
        joiner.add("editTeamUrl: " + GraphQLRequestSerializer.getEntry(editTeamUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("membersResourcePath: " + GraphQLRequestSerializer.getEntry(membersResourcePath))
        joiner.add("membersUrl: " + GraphQLRequestSerializer.getEntry(membersUrl))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("newTeamResourcePath: " + GraphQLRequestSerializer.getEntry(newTeamResourcePath))
        joiner.add("newTeamUrl: " + GraphQLRequestSerializer.getEntry(newTeamUrl))
        joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        if (parentTeam != null) {
            joiner.add("parentTeam: " + GraphQLRequestSerializer.getEntry(parentTeam))
        }
        joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy))
        joiner.add("repositoriesResourcePath: " + GraphQLRequestSerializer.getEntry(repositoriesResourcePath))
        joiner.add("repositoriesUrl: " + GraphQLRequestSerializer.getEntry(repositoriesUrl))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        joiner.add("teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath))
        joiner.add("teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister))
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe))
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription))
        }
        return joiner.toString()
    }
}
