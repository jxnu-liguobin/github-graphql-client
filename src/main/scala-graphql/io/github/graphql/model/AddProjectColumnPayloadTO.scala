package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class AddProjectColumnPayloadTO(
    clientMutationId: String,
    columnEdge: ProjectColumnEdgeTO,
    project: ProjectTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (columnEdge != null) "columnEdge: " + GraphQLRequestSerializer.getEntry(columnEdge) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddProjectColumnPayloadTO {

    def builder(): AddProjectColumnPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var columnEdge: ProjectColumnEdgeTO = _
        private var project: ProjectTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumnEdge(columnEdge: ProjectColumnEdgeTO): Builder = {
            this.columnEdge = columnEdge
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def build(): AddProjectColumnPayloadTO = new AddProjectColumnPayloadTO(clientMutationId, columnEdge, project)

    }
}
