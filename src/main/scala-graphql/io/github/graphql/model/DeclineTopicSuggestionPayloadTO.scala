package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
