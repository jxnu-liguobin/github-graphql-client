package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MergeBranchPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(mergeCommit, that.mergeCommit)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, mergeCommit)
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
