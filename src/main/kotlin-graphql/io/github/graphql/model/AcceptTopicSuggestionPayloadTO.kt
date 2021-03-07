package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AcceptTopicSuggestionPayloadTO(
    val clientMutationId: String?,
    val topic: TopicTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (topic != null) {
            joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var topic: TopicTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setTopic(topic: TopicTO?): Builder {
            this.topic = topic
            return this
        }

        fun build(): AcceptTopicSuggestionPayloadTO {
            return AcceptTopicSuggestionPayloadTO(clientMutationId, topic)
        }
    }
}
