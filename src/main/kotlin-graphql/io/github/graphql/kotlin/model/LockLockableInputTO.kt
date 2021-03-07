package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class LockLockableInputTO(
    val clientMutationId: String?,
    val lockReason: LockReasonTO?,
    val lockableId: String
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
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason))
        }
        joiner.add("lockableId: " + GraphQLRequestSerializer.getEntry(lockableId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as LockLockableInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(lockReason, that.lockReason)
                && Objects.equals(lockableId, that.lockableId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, lockReason, lockableId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var lockReason: LockReasonTO? = null
        private lateinit var lockableId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setLockReason(lockReason: LockReasonTO?): Builder {
            this.lockReason = lockReason
            return this
        }

        fun setLockableId(lockableId: String): Builder {
            this.lockableId = lockableId
            return this
        }

        fun build(): LockLockableInputTO {
            return LockLockableInputTO(clientMutationId, lockReason, lockableId)
        }
    }
}
