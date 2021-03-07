package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import TeamPrivacyTO._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TeamTO(
    @javax.validation.constraints.NotNull
    combinedSlug: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    description: String,
    @javax.validation.constraints.NotNull
    editTeamResourcePath: String,
    @javax.validation.constraints.NotNull
    editTeamUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    membersResourcePath: String,
    @javax.validation.constraints.NotNull
    membersUrl: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    newTeamResourcePath: String,
    @javax.validation.constraints.NotNull
    newTeamUrl: String,
    @javax.validation.constraints.NotNull
    organization: OrganizationTO,
    parentTeam: TeamTO,
    @javax.validation.constraints.NotNull
    privacy: TeamPrivacyTO,
    @javax.validation.constraints.NotNull
    repositoriesResourcePath: String,
    @javax.validation.constraints.NotNull
    repositoriesUrl: String,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    slug: String,
    @javax.validation.constraints.NotNull
    teamsResourcePath: String,
    @javax.validation.constraints.NotNull
    teamsUrl: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String,
    viewerCanAdminister: Boolean,
    override val viewerCanSubscribe: Boolean,
    override val viewerSubscription: SubscriptionStateTO
) extends ReviewDismissalAllowanceActorTO with RequestedReviewerTO with PushAllowanceActorTO with PermissionGranterTO with SubscribableTO with NodeTO with MemberStatusableTO {

    override def toString(): String = {
        Seq(
            if (combinedSlug != null) "combinedSlug: " + GraphQLRequestSerializer.getEntry(combinedSlug) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (editTeamResourcePath != null) "editTeamResourcePath: " + GraphQLRequestSerializer.getEntry(editTeamResourcePath) else "",
            if (editTeamUrl != null) "editTeamUrl: " + GraphQLRequestSerializer.getEntry(editTeamUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (membersResourcePath != null) "membersResourcePath: " + GraphQLRequestSerializer.getEntry(membersResourcePath) else "",
            if (membersUrl != null) "membersUrl: " + GraphQLRequestSerializer.getEntry(membersUrl) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (newTeamResourcePath != null) "newTeamResourcePath: " + GraphQLRequestSerializer.getEntry(newTeamResourcePath) else "",
            if (newTeamUrl != null) "newTeamUrl: " + GraphQLRequestSerializer.getEntry(newTeamUrl) else "",
            if (organization != null) "organization: " + GraphQLRequestSerializer.getEntry(organization) else "",
            if (parentTeam != null) "parentTeam: " + GraphQLRequestSerializer.getEntry(parentTeam) else "",
            if (privacy != null) "privacy: " + GraphQLRequestSerializer.getEntry(privacy) else "",
            if (repositoriesResourcePath != null) "repositoriesResourcePath: " + GraphQLRequestSerializer.getEntry(repositoriesResourcePath) else "",
            if (repositoriesUrl != null) "repositoriesUrl: " + GraphQLRequestSerializer.getEntry(repositoriesUrl) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else "",
            if (teamsResourcePath != null) "teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath) else "",
            if (teamsUrl != null) "teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister),
            "viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe),
            if (viewerSubscription != null) "viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TeamTO]
        Objects.equals(combinedSlug, that.combinedSlug) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(editTeamResourcePath, that.editTeamResourcePath) &&
        Objects.equals(editTeamUrl, that.editTeamUrl) &&
        Objects.equals(id, that.id) &&
        Objects.equals(membersResourcePath, that.membersResourcePath) &&
        Objects.equals(membersUrl, that.membersUrl) &&
        Objects.equals(name, that.name) &&
        Objects.equals(newTeamResourcePath, that.newTeamResourcePath) &&
        Objects.equals(newTeamUrl, that.newTeamUrl) &&
        Objects.equals(organization, that.organization) &&
        Objects.equals(parentTeam, that.parentTeam) &&
        Objects.equals(privacy, that.privacy) &&
        Objects.equals(repositoriesResourcePath, that.repositoriesResourcePath) &&
        Objects.equals(repositoriesUrl, that.repositoriesUrl) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(slug, that.slug) &&
        Objects.equals(teamsResourcePath, that.teamsResourcePath) &&
        Objects.equals(teamsUrl, that.teamsUrl) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerCanAdminister, that.viewerCanAdminister) &&
        Objects.equals(viewerCanSubscribe, that.viewerCanSubscribe) &&
        Objects.equals(viewerSubscription, that.viewerSubscription)
    }

    override def hashCode(): Int = {
        Objects.hash(combinedSlug, createdAt, description, editTeamResourcePath, editTeamUrl, id, membersResourcePath, membersUrl, name, newTeamResourcePath, newTeamUrl, organization, parentTeam, privacy, repositoriesResourcePath, repositoriesUrl, resourcePath, slug, teamsResourcePath, teamsUrl, updatedAt, url, viewerCanAdminister, viewerCanSubscribe, viewerSubscription)
    }
}

object TeamTO {

    def builder(): TeamTO.Builder = new Builder()

    class Builder {

        private var combinedSlug: String = _
        private var createdAt: String = _
        private var description: String = _
        private var editTeamResourcePath: String = _
        private var editTeamUrl: String = _
        private var id: String = _
        private var membersResourcePath: String = _
        private var membersUrl: String = _
        private var name: String = _
        private var newTeamResourcePath: String = _
        private var newTeamUrl: String = _
        private var organization: OrganizationTO = _
        private var parentTeam: TeamTO = _
        private var privacy: TeamPrivacyTO = _
        private var repositoriesResourcePath: String = _
        private var repositoriesUrl: String = _
        private var resourcePath: String = _
        private var slug: String = _
        private var teamsResourcePath: String = _
        private var teamsUrl: String = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanAdminister: Boolean = _
        private var viewerCanSubscribe: Boolean = _
        private var viewerSubscription: SubscriptionStateTO = _

        def setCombinedSlug(combinedSlug: String): Builder = {
            this.combinedSlug = combinedSlug
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setEditTeamResourcePath(editTeamResourcePath: String): Builder = {
            this.editTeamResourcePath = editTeamResourcePath
            this
        }

        def setEditTeamUrl(editTeamUrl: String): Builder = {
            this.editTeamUrl = editTeamUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMembersResourcePath(membersResourcePath: String): Builder = {
            this.membersResourcePath = membersResourcePath
            this
        }

        def setMembersUrl(membersUrl: String): Builder = {
            this.membersUrl = membersUrl
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

        def setOrganization(organization: OrganizationTO): Builder = {
            this.organization = organization
            this
        }

        def setParentTeam(parentTeam: TeamTO): Builder = {
            this.parentTeam = parentTeam
            this
        }

        def setPrivacy(privacy: TeamPrivacyTO): Builder = {
            this.privacy = privacy
            this
        }

        def setRepositoriesResourcePath(repositoriesResourcePath: String): Builder = {
            this.repositoriesResourcePath = repositoriesResourcePath
            this
        }

        def setRepositoriesUrl(repositoriesUrl: String): Builder = {
            this.repositoriesUrl = repositoriesUrl
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
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

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
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

        def setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder = {
            this.viewerCanSubscribe = viewerCanSubscribe
            this
        }

        def setViewerSubscription(viewerSubscription: SubscriptionStateTO): Builder = {
            this.viewerSubscription = viewerSubscription
            this
        }

        def build(): TeamTO = new TeamTO(combinedSlug, createdAt, description, editTeamResourcePath, editTeamUrl, id, membersResourcePath, membersUrl, name, newTeamResourcePath, newTeamUrl, organization, parentTeam, privacy, repositoriesResourcePath, repositoriesUrl, resourcePath, slug, teamsResourcePath, teamsUrl, updatedAt, url, viewerCanAdminister, viewerCanSubscribe, viewerSubscription)

    }
}
