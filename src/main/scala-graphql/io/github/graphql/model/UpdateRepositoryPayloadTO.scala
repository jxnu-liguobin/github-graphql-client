package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdateRepositoryPayloadTO(
    clientMutationId: String,
    repository: RepositoryTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateRepositoryPayloadTO {

    def builder(): UpdateRepositoryPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var repository: RepositoryTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def build(): UpdateRepositoryPayloadTO = new UpdateRepositoryPayloadTO(clientMutationId, repository)

    }
}
