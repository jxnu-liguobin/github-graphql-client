package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateRepositoryInputTO(
    clientMutationId: String,
    description: String,
    hasIssuesEnabled: Option[Boolean],
    hasProjectsEnabled: Option[Boolean],
    hasWikiEnabled: Option[Boolean],
    homepageUrl: String,
    name: String,
    @javax.validation.constraints.NotNull
    repositoryId: String,
    template: Option[Boolean]
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (hasIssuesEnabled.isDefined) "hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled.get) else "",
            if (hasProjectsEnabled.isDefined) "hasProjectsEnabled: " + GraphQLRequestSerializer.getEntry(hasProjectsEnabled.get) else "",
            if (hasWikiEnabled.isDefined) "hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled.get) else "",
            if (homepageUrl != null) "homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (template.isDefined) "template: " + GraphQLRequestSerializer.getEntry(template.get) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateRepositoryInputTO {

    def builder(): UpdateRepositoryInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var description: String = _
        private var hasIssuesEnabled: Option[Boolean] = _
        private var hasProjectsEnabled: Option[Boolean] = _
        private var hasWikiEnabled: Option[Boolean] = _
        private var homepageUrl: String = _
        private var name: String = _
        private var repositoryId: String = _
        private var template: Option[Boolean] = _

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

        def setHasProjectsEnabled(hasProjectsEnabled: Option[Boolean]): Builder = {
            this.hasProjectsEnabled = hasProjectsEnabled
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

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def setTemplate(template: Option[Boolean]): Builder = {
            this.template = template
            this
        }

        def build(): UpdateRepositoryInputTO = new UpdateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasProjectsEnabled, hasWikiEnabled, homepageUrl, name, repositoryId, template)

    }
}
