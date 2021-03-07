package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class MergeBranchPayloadTO(
    val clientMutationId: String?,
    val mergeCommit: CommitTO?
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
        if (mergeCommit != null) {
            joiner.add("mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var mergeCommit: CommitTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setMergeCommit(mergeCommit: CommitTO?): Builder {
            this.mergeCommit = mergeCommit
            return this
        }

        fun build(): MergeBranchPayloadTO {
            return MergeBranchPayloadTO(clientMutationId, mergeCommit)
        }
    }
}
