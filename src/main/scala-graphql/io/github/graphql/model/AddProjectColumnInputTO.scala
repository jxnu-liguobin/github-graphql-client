package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddProjectColumnInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    projectId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (projectId != null) "projectId: " + GraphQLRequestSerializer.getEntry(projectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddProjectColumnInputTO {

    def builder(): AddProjectColumnInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var name: String = _
        private var projectId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setProjectId(projectId: String): Builder = {
            this.projectId = projectId
            this
        }

        def build(): AddProjectColumnInputTO = new AddProjectColumnInputTO(clientMutationId, name, projectId)

    }
}
