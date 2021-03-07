package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class AddAssigneesToAssignableInputTO(
    val assignableId: String,
    val assigneeIds: List<String>,
    val clientMutationId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("assignableId: " + GraphQLRequestSerializer.getEntry(assignableId))
        joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds))
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
        val that = other as AddAssigneesToAssignableInputTO
        return Objects.equals(assignableId, that.assignableId)
                && Objects.equals(assigneeIds, that.assigneeIds)
                && Objects.equals(clientMutationId, that.clientMutationId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(assignableId, assigneeIds, clientMutationId)
    }

    class Builder {

        private lateinit var assignableId: String
        private lateinit var assigneeIds: List<String>
        private var clientMutationId: String? = null

        fun setAssignableId(assignableId: String): Builder {
            this.assignableId = assignableId
            return this
        }

        fun setAssigneeIds(assigneeIds: List<String>): Builder {
            this.assigneeIds = assigneeIds
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): AddAssigneesToAssignableInputTO {
            return AddAssigneesToAssignableInputTO(assignableId, assigneeIds, clientMutationId)
        }
    }
}
