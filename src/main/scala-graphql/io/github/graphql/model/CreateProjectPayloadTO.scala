package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CreateProjectPayloadTO(
    clientMutationId: String,
    project: ProjectTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateProjectPayloadTO {

    def builder(): CreateProjectPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var project: ProjectTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def build(): CreateProjectPayloadTO = new CreateProjectPayloadTO(clientMutationId, project)

    }
}
