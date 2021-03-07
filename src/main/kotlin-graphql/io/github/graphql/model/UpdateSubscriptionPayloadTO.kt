package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateSubscriptionPayloadTO(
    val clientMutationId: String?,
    val subscribable: SubscribableTO?
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
        if (subscribable != null) {
            joiner.add("subscribable: " + GraphQLRequestSerializer.getEntry(subscribable))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var subscribable: SubscribableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setSubscribable(subscribable: SubscribableTO?): Builder {
            this.subscribable = subscribable
            return this
        }

        fun build(): UpdateSubscriptionPayloadTO {
            return UpdateSubscriptionPayloadTO(clientMutationId, subscribable)
        }
    }
}
