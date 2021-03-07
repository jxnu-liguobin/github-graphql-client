package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
