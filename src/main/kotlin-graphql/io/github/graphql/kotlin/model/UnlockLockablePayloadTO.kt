package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UnlockLockablePayloadTO(
    val clientMutationId: String?,
    val unlockedRecord: LockableTO?
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
        if (unlockedRecord != null) {
            joiner.add("unlockedRecord: " + GraphQLRequestSerializer.getEntry(unlockedRecord))
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
        val that = other as UnlockLockablePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(unlockedRecord, that.unlockedRecord)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, unlockedRecord)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var unlockedRecord: LockableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setUnlockedRecord(unlockedRecord: LockableTO?): Builder {
            this.unlockedRecord = unlockedRecord
            return this
        }

        fun build(): UnlockLockablePayloadTO {
            return UnlockLockablePayloadTO(clientMutationId, unlockedRecord)
        }
    }
}
