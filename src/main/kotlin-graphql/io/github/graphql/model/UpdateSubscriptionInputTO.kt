package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateSubscriptionInputTO(
    val clientMutationId: String?,
    val state: SubscriptionStateTO,
    val subscribableId: String
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
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("subscribableId: " + GraphQLRequestSerializer.getEntry(subscribableId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var state: SubscriptionStateTO
        private lateinit var subscribableId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setState(state: SubscriptionStateTO): Builder {
            this.state = state
            return this
        }

        fun setSubscribableId(subscribableId: String): Builder {
            this.subscribableId = subscribableId
            return this
        }

        fun build(): UpdateSubscriptionInputTO {
            return UpdateSubscriptionInputTO(clientMutationId, state, subscribableId)
        }
    }
}
