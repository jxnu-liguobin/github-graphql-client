package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateProjectColumnPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(projectColumn, that.projectColumn)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, projectColumn)
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
