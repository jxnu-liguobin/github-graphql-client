package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeleteProjectCardPayloadTO(
    val clientMutationId: String?,
    val column: ProjectColumnTO?,
    val deletedCardId: String?
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
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column))
        }
        if (deletedCardId != null) {
            joiner.add("deletedCardId: " + GraphQLRequestSerializer.getEntry(deletedCardId))
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
        val that = other as DeleteProjectCardPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(column, that.column)
                && Objects.equals(deletedCardId, that.deletedCardId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, column, deletedCardId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var column: ProjectColumnTO? = null
        private var deletedCardId: String? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setColumn(column: ProjectColumnTO?): Builder {
            this.column = column
            return this
        }

        fun setDeletedCardId(deletedCardId: String?): Builder {
            this.deletedCardId = deletedCardId
            return this
        }

        fun build(): DeleteProjectCardPayloadTO {
            return DeleteProjectCardPayloadTO(clientMutationId, column, deletedCardId)
        }
    }
}
