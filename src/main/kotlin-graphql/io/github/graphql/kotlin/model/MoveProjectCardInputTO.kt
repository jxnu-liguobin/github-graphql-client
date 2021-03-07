package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class MoveProjectCardInputTO(
    val afterCardId: String?,
    val cardId: String,
    val clientMutationId: String?,
    val columnId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (afterCardId != null) {
            joiner.add("afterCardId: " + GraphQLRequestSerializer.getEntry(afterCardId))
        }
        joiner.add("cardId: " + GraphQLRequestSerializer.getEntry(cardId))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MoveProjectCardInputTO
        return Objects.equals(afterCardId, that.afterCardId)
                && Objects.equals(cardId, that.cardId)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(columnId, that.columnId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(afterCardId, cardId, clientMutationId, columnId)
    }

    class Builder {

        private var afterCardId: String? = null
        private lateinit var cardId: String
        private var clientMutationId: String? = null
        private lateinit var columnId: String

        fun setAfterCardId(afterCardId: String?): Builder {
            this.afterCardId = afterCardId
            return this
        }

        fun setCardId(cardId: String): Builder {
            this.cardId = cardId
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setColumnId(columnId: String): Builder {
            this.columnId = columnId
            return this
        }

        fun build(): MoveProjectCardInputTO {
            return MoveProjectCardInputTO(afterCardId, cardId, clientMutationId, columnId)
        }
    }
}
