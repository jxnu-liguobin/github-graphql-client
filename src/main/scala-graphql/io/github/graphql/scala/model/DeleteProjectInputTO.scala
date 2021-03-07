package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeleteProjectInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    projectId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (projectId != null) "projectId: " + GraphQLRequestSerializer.getEntry(projectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeleteProjectInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(projectId, that.projectId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, projectId)
    }
}

object DeleteProjectInputTO {

    def builder(): DeleteProjectInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var projectId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProjectId(projectId: String): Builder = {
            this.projectId = projectId
            this
        }

        def build(): DeleteProjectInputTO = new DeleteProjectInputTO(clientMutationId, projectId)

    }
}
