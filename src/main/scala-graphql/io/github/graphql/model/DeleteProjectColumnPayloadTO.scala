package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteProjectColumnPayloadTO(
    clientMutationId: String,
    deletedColumnId: String,
    project: ProjectTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (deletedColumnId != null) "deletedColumnId: " + GraphQLRequestSerializer.getEntry(deletedColumnId) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteProjectColumnPayloadTO {

    def builder(): DeleteProjectColumnPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var deletedColumnId: String = _
        private var project: ProjectTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDeletedColumnId(deletedColumnId: String): Builder = {
            this.deletedColumnId = deletedColumnId
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def build(): DeleteProjectColumnPayloadTO = new DeleteProjectColumnPayloadTO(clientMutationId, deletedColumnId, project)

    }
}
