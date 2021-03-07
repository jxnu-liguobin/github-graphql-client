package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateSubscriptionInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(state, that.state)
                && Objects.equals(subscribableId, that.subscribableId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, state, subscribableId)
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
