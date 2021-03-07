package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LockLockablePayloadTO(
    val clientMutationId: String?,
    val lockedRecord: LockableTO?
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
        if (lockedRecord != null) {
            joiner.add("lockedRecord: " + GraphQLRequestSerializer.getEntry(lockedRecord))
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
        val that = other as LockLockablePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(lockedRecord, that.lockedRecord)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, lockedRecord)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var lockedRecord: LockableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setLockedRecord(lockedRecord: LockableTO?): Builder {
            this.lockedRecord = lockedRecord
            return this
        }

        fun build(): LockLockablePayloadTO {
            return LockLockablePayloadTO(clientMutationId, lockedRecord)
        }
    }
}
