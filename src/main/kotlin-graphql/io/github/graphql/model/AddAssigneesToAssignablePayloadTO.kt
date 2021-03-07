package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddAssigneesToAssignablePayloadTO(
    val assignable: AssignableTO?,
    val clientMutationId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (assignable != null) {
            joiner.add("assignable: " + GraphQLRequestSerializer.getEntry(assignable))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        return joiner.toString()
    }

    class Builder {

        private var assignable: AssignableTO? = null
        private var clientMutationId: String? = null

        fun setAssignable(assignable: AssignableTO?): Builder {
            this.assignable = assignable
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): AddAssigneesToAssignablePayloadTO {
            return AddAssigneesToAssignablePayloadTO(assignable, clientMutationId)
        }
    }
}
