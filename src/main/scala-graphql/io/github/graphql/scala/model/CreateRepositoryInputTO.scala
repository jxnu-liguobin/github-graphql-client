package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import RepositoryVisibilityTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CreateRepositoryInputTO(
    clientMutationId: String,
    description: String,
    hasIssuesEnabled: Option[Boolean] = Some(true),
    hasWikiEnabled: Option[Boolean] = Some(false),
    homepageUrl: String,
    @javax.validation.constraints.NotNull
    name: String,
    ownerId: String,
    teamId: String,
    template: Option[Boolean] = Some(false),
    @javax.validation.constraints.NotNull
    visibility: RepositoryVisibilityTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (hasIssuesEnabled.isDefined) "hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled.get) else "",
            if (hasWikiEnabled.isDefined) "hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled.get) else "",
            if (homepageUrl != null) "homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (ownerId != null) "ownerId: " + GraphQLRequestSerializer.getEntry(ownerId) else "",
            if (teamId != null) "teamId: " + GraphQLRequestSerializer.getEntry(teamId) else "",
            if (template.isDefined) "template: " + GraphQLRequestSerializer.getEntry(template.get) else "",
            if (visibility != null) "visibility: " + GraphQLRequestSerializer.getEntry(visibility) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreateRepositoryInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(description, that.description) &&
        Objects.equals(hasIssuesEnabled, that.hasIssuesEnabled) &&
        Objects.equals(hasWikiEnabled, that.hasWikiEnabled) &&
        Objects.equals(homepageUrl, that.homepageUrl) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(teamId, that.teamId) &&
        Objects.equals(template, that.template) &&
        Objects.equals(visibility, that.visibility)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, description, hasIssuesEnabled, hasWikiEnabled, homepageUrl, name, ownerId, teamId, template, visibility)
    }
}

object CreateRepositoryInputTO {

    def builder(): CreateRepositoryInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var description: String = _
        private var hasIssuesEnabled: Option[Boolean] = Some(true)
        private var hasWikiEnabled: Option[Boolean] = Some(false)
        private var homepageUrl: String = _
        private var name: String = _
        private var ownerId: String = _
        private var teamId: String = _
        private var template: Option[Boolean] = Some(false)
        private var visibility: RepositoryVisibilityTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setHasIssuesEnabled(hasIssuesEnabled: Option[Boolean]): Builder = {
            this.hasIssuesEnabled = hasIssuesEnabled
            this
        }

        def setHasWikiEnabled(hasWikiEnabled: Option[Boolean]): Builder = {
            this.hasWikiEnabled = hasWikiEnabled
            this
        }

        def setHomepageUrl(homepageUrl: String): Builder = {
            this.homepageUrl = homepageUrl
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setOwnerId(ownerId: String): Builder = {
            this.ownerId = ownerId
            this
        }

        def setTeamId(teamId: String): Builder = {
            this.teamId = teamId
            this
        }

        def setTemplate(template: Option[Boolean]): Builder = {
            this.template = template
            this
        }

        def setVisibility(visibility: RepositoryVisibilityTO): Builder = {
            this.visibility = visibility
            this
        }

        def build(): CreateRepositoryInputTO = new CreateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasWikiEnabled, homepageUrl, name, ownerId, teamId, template, visibility)

    }
}
