package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectColumnPayloadTO(
    clientMutationId: String,
    projectColumn: ProjectColumnTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (projectColumn != null) "projectColumn: " + GraphQLRequestSerializer.getEntry(projectColumn) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateProjectColumnPayloadTO {

    def builder(): UpdateProjectColumnPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var projectColumn: ProjectColumnTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProjectColumn(projectColumn: ProjectColumnTO): Builder = {
            this.projectColumn = projectColumn
            this
        }

        def build(): UpdateProjectColumnPayloadTO = new UpdateProjectColumnPayloadTO(clientMutationId, projectColumn)

    }
}
