package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UpdateProjectPayloadTO(
    clientMutationId: String,
    project: ProjectTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateProjectPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(project, that.project)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, project)
    }
}

object UpdateProjectPayloadTO {

    def builder(): UpdateProjectPayloadTO.Builder = new Builder()

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

        def build(): UpdateProjectPayloadTO = new UpdateProjectPayloadTO(clientMutationId, project)

    }
}
