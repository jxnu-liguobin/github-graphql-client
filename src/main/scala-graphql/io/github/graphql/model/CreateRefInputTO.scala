package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateRefInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    oid: String,
    @javax.validation.constraints.NotNull
    repositoryId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateRefInputTO {

    def builder(): CreateRefInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var name: String = _
        private var oid: String = _
        private var repositoryId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setOid(oid: String): Builder = {
            this.oid = oid
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def build(): CreateRefInputTO = new CreateRefInputTO(clientMutationId, name, oid, repositoryId)

    }
}
