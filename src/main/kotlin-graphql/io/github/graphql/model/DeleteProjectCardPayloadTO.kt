package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
