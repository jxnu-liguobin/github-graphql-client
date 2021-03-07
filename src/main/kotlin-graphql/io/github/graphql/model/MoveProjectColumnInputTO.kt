package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MoveProjectColumnInputTO(
    val afterColumnId: String?,
    val clientMutationId: String?,
    val columnId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (afterColumnId != null) {
            joiner.add("afterColumnId: " + GraphQLRequestSerializer.getEntry(afterColumnId))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId))
        return joiner.toString()
    }

    class Builder {

        private var afterColumnId: String? = null
        private var clientMutationId: String? = null
        private lateinit var columnId: String

        fun setAfterColumnId(afterColumnId: String?): Builder {
            this.afterColumnId = afterColumnId
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

        fun build(): MoveProjectColumnInputTO {
            return MoveProjectColumnInputTO(afterColumnId, clientMutationId, columnId)
        }
    }
}
