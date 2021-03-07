package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeclineTopicSuggestionPayloadTO(
    clientMutationId: String,
    topic: TopicTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (topic != null) "topic: " + GraphQLRequestSerializer.getEntry(topic) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeclineTopicSuggestionPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(topic, that.topic)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, topic)
    }
}

object DeclineTopicSuggestionPayloadTO {

    def builder(): DeclineTopicSuggestionPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var topic: TopicTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setTopic(topic: TopicTO): Builder = {
            this.topic = topic
            this
        }

        def build(): DeclineTopicSuggestionPayloadTO = new DeclineTopicSuggestionPayloadTO(clientMutationId, topic)

    }
}
