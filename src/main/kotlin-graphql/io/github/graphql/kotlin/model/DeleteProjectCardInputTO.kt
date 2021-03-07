package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class DeleteProjectCardInputTO(
    val cardId: String,
    val clientMutationId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cardId: " + GraphQLRequestSerializer.getEntry(cardId))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteProjectCardInputTO
        return Objects.equals(cardId, that.cardId)
                && Objects.equals(clientMutationId, that.clientMutationId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cardId, clientMutationId)
    }

    class Builder {

        private lateinit var cardId: String
        private var clientMutationId: String? = null

        fun setCardId(cardId: String): Builder {
            this.cardId = cardId
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): DeleteProjectCardInputTO {
            return DeleteProjectCardInputTO(cardId, clientMutationId)
        }
    }
}
