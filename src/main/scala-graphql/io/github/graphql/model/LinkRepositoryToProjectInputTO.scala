package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LinkRepositoryToProjectInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    projectId: String,
    @javax.validation.constraints.NotNull
    repositoryId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (projectId != null) "projectId: " + GraphQLRequestSerializer.getEntry(projectId) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LinkRepositoryToProjectInputTO {

    def builder(): LinkRepositoryToProjectInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var projectId: String = _
        private var repositoryId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProjectId(projectId: String): Builder = {
            this.projectId = projectId
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def build(): LinkRepositoryToProjectInputTO = new LinkRepositoryToProjectInputTO(clientMutationId, projectId, repositoryId)

    }
}
