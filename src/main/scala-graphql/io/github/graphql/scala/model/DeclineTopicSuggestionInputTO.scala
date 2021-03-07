package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import TopicSuggestionDeclineReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeclineTopicSuggestionInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    reason: TopicSuggestionDeclineReasonTO,
    @javax.validation.constraints.NotNull
    repositoryId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (reason != null) "reason: " + GraphQLRequestSerializer.getEntry(reason) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeclineTopicSuggestionInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(repositoryId, that.repositoryId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, name, reason, repositoryId)
    }
}

object DeclineTopicSuggestionInputTO {

    def builder(): DeclineTopicSuggestionInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var name: String = _
        private var reason: TopicSuggestionDeclineReasonTO = _
        private var repositoryId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setReason(reason: TopicSuggestionDeclineReasonTO): Builder = {
            this.reason = reason
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def build(): DeclineTopicSuggestionInputTO = new DeclineTopicSuggestionInputTO(clientMutationId, name, reason, repositoryId)

    }
}
