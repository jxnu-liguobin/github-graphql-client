package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateTopicsInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    repositoryId: String,
    @javax.validation.constraints.NotNull
    topicNames: Seq[String]
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (topicNames != null) "topicNames: " + GraphQLRequestSerializer.getEntry(topicNames.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateTopicsInputTO {

    def builder(): UpdateTopicsInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var repositoryId: String = _
        private var topicNames: Seq[String] = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def setTopicNames(topicNames: Seq[String]): Builder = {
            this.topicNames = topicNames
            this
        }

        def build(): UpdateTopicsInputTO = new UpdateTopicsInputTO(clientMutationId, repositoryId, topicNames)

    }
}