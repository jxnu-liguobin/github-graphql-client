package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectColumnInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    projectColumnId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (projectColumnId != null) "projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateProjectColumnInputTO {

    def builder(): UpdateProjectColumnInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var name: String = _
        private var projectColumnId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setProjectColumnId(projectColumnId: String): Builder = {
            this.projectColumnId = projectColumnId
            this
        }

        def build(): UpdateProjectColumnInputTO = new UpdateProjectColumnInputTO(clientMutationId, name, projectColumnId)

    }
}
