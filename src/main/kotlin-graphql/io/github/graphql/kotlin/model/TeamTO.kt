package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TeamTO
        return Objects.equals(combinedSlug, that.combinedSlug)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(description, that.description)
                && Objects.equals(editTeamResourcePath, that.editTeamResourcePath)
                && Objects.equals(editTeamUrl, that.editTeamUrl)
                && Objects.equals(id, that.id)
                && Objects.equals(membersResourcePath, that.membersResourcePath)
                && Objects.equals(membersUrl, that.membersUrl)
                && Objects.equals(name, that.name)
                && Objects.equals(newTeamResourcePath, that.newTeamResourcePath)
                && Objects.equals(newTeamUrl, that.newTeamUrl)
                && Objects.equals(organization, that.organization)
                && Objects.equals(parentTeam, that.parentTeam)
                && Objects.equals(privacy, that.privacy)
                && Objects.equals(repositoriesResourcePath, that.repositoriesResourcePath)
                && Objects.equals(repositoriesUrl, that.repositoriesUrl)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(slug, that.slug)
                && Objects.equals(teamsResourcePath, that.teamsResourcePath)
                && Objects.equals(teamsUrl, that.teamsUrl)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)
                && Objects.equals(viewerCanAdminister, that.viewerCanAdminister)
                && Objects.equals(viewerCanSubscribe, that.viewerCanSubscribe)
                && Objects.equals(viewerSubscription, that.viewerSubscription)

    }

    override fun hashCode(): Int = {
        return Objects.hash(combinedSlug, createdAt, description, editTeamResourcePath, editTeamUrl, id, membersResourcePath, membersUrl, name, newTeamResourcePath, newTeamUrl, organization, parentTeam, privacy, repositoriesResourcePath, repositoriesUrl, resourcePath, slug, teamsResourcePath, teamsUrl, updatedAt, url, viewerCanAdminister, viewerCanSubscribe, viewerSubscription)
    }

    class Builder {

        private lateinit var combinedSlug: String
        private lateinit var createdAt: String
        private var description: String? = null
        private lateinit var editTeamResourcePath: String
        private lateinit var editTeamUrl: String
        private lateinit var id: String
        private lateinit var membersResourcePath: String
        private lateinit var membersUrl: String
        private lateinit var name: String
        private lateinit var newTeamResourcePath: String
        private lateinit var newTeamUrl: String
        private lateinit var organization: OrganizationTO
        private var parentTeam: TeamTO? = null
        private lateinit var privacy: TeamPrivacyTO
        private lateinit var repositoriesResourcePath: String
        private lateinit var repositoriesUrl: String
        private lateinit var resourcePath: String
        private lateinit var slug: String
        private lateinit var teamsResourcePath: String
        private lateinit var teamsUrl: String
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanAdminister: Boolean = false
        private var viewerCanSubscribe: Boolean = false
        private var viewerSubscription: SubscriptionStateTO? = null

        fun setCombinedSlug(combinedSlug: String): Builder {
            this.combinedSlug = combinedSlug
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setEditTeamResourcePath(editTeamResourcePath: String): Builder {
            this.editTeamResourcePath = editTeamResourcePath
            return this
        }

        fun setEditTeamUrl(editTeamUrl: String): Builder {
            this.editTeamUrl = editTeamUrl
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMembersResourcePath(membersResourcePath: String): Builder {
            this.membersResourcePath = membersResourcePath
            return this
        }

        fun setMembersUrl(membersUrl: String): Builder {
            this.membersUrl = membersUrl
            return this
        }

        fun setName(name: String): Builder {
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

        fun setOrganization(organization: OrganizationTO): Builder {
            this.organization = organization
            return this
        }

        fun setParentTeam(parentTeam: TeamTO?): Builder {
            this.parentTeam = parentTeam
            return this
        }

        fun setPrivacy(privacy: TeamPrivacyTO): Builder {
            this.privacy = privacy
            return this
        }

        fun setRepositoriesResourcePath(repositoriesResourcePath: String): Builder {
            this.repositoriesResourcePath = repositoriesResourcePath
            return this
        }

        fun setRepositoriesUrl(repositoriesUrl: String): Builder {
            this.repositoriesUrl = repositoriesUrl
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
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

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
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

        fun setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder {
            this.viewerCanSubscribe = viewerCanSubscribe
            return this
        }

        fun setViewerSubscription(viewerSubscription: SubscriptionStateTO?): Builder {
            this.viewerSubscription = viewerSubscription
            return this
        }

        fun build(): TeamTO {
            return TeamTO(combinedSlug, createdAt, description, editTeamResourcePath, editTeamUrl, id, membersResourcePath, membersUrl, name, newTeamResourcePath, newTeamUrl, organization, parentTeam, privacy, repositoriesResourcePath, repositoriesUrl, resourcePath, slug, teamsResourcePath, teamsUrl, updatedAt, url, viewerCanAdminister, viewerCanSubscribe, viewerSubscription)
        }
    }
}
