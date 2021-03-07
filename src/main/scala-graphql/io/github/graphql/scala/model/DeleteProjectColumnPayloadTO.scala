package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeleteProjectColumnPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(deletedColumnId, that.deletedColumnId) &&
        Objects.equals(project, that.project)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, deletedColumnId, project)
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
