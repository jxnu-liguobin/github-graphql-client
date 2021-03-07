package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ChangeUserStatusPayloadTO(
    val clientMutationId: String?,
    val status: UserStatusTO?
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
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status))
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
        val that = other as ChangeUserStatusPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(status, that.status)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, status)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var status: UserStatusTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setStatus(status: UserStatusTO?): Builder {
            this.status = status
            return this
        }

        fun build(): ChangeUserStatusPayloadTO {
            return ChangeUserStatusPayloadTO(clientMutationId, status)
        }
    }
}
