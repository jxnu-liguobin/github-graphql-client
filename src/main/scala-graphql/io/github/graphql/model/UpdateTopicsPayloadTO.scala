package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateTopicsPayloadTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    invalidTopicNames: Seq[String],
    repository: RepositoryTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (invalidTopicNames != null) "invalidTopicNames: " + GraphQLRequestSerializer.getEntry(invalidTopicNames.asJava) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateTopicsPayloadTO {

    def builder(): UpdateTopicsPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var invalidTopicNames: Seq[String] = _
        private var repository: RepositoryTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setInvalidTopicNames(invalidTopicNames: Seq[String]): Builder = {
            this.invalidTopicNames = invalidTopicNames
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def build(): UpdateTopicsPayloadTO = new UpdateTopicsPayloadTO(clientMutationId, invalidTopicNames, repository)

    }
}
