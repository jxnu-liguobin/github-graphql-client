package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RepositoryVisibilityTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloneTemplateRepositoryInputTO(
    clientMutationId: String,
    description: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    ownerId: String,
    @javax.validation.constraints.NotNull
    repositoryId: String,
    @javax.validation.constraints.NotNull
    visibility: RepositoryVisibilityTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (ownerId != null) "ownerId: " + GraphQLRequestSerializer.getEntry(ownerId) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (visibility != null) "visibility: " + GraphQLRequestSerializer.getEntry(visibility) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CloneTemplateRepositoryInputTO {

    def builder(): CloneTemplateRepositoryInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var description: String = _
        private var name: String = _
        private var ownerId: String = _
        private var repositoryId: String = _
        private var visibility: RepositoryVisibilityTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
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

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def setVisibility(visibility: RepositoryVisibilityTO): Builder = {
            this.visibility = visibility
            this
        }

        def build(): CloneTemplateRepositoryInputTO = new CloneTemplateRepositoryInputTO(clientMutationId, description, name, ownerId, repositoryId, visibility)

    }
}
