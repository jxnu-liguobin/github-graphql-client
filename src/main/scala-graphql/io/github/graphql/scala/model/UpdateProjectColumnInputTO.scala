package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateProjectColumnInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(projectColumnId, that.projectColumnId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, name, projectColumnId)
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
