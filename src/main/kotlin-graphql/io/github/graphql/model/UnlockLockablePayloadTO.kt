package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
