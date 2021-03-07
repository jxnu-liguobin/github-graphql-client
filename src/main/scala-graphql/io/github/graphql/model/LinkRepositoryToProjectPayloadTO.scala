package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LinkRepositoryToProjectPayloadTO(
    clientMutationId: String,
    project: ProjectTO,
    repository: RepositoryTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LinkRepositoryToProjectPayloadTO {

    def builder(): LinkRepositoryToProjectPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var project: ProjectTO = _
        private var repository: RepositoryTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def build(): LinkRepositoryToProjectPayloadTO = new LinkRepositoryToProjectPayloadTO(clientMutationId, project, repository)

    }
}
