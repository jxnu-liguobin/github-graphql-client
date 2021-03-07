package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UnmarkIssueAsDuplicatePayloadTO(
    val clientMutationId: String?,
    val duplicate: IssueOrPullRequestTO?
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
        if (duplicate != null) {
            joiner.add("duplicate: " + GraphQLRequestSerializer.getEntry(duplicate))
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
        val that = other as UnmarkIssueAsDuplicatePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(duplicate, that.duplicate)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, duplicate)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var duplicate: IssueOrPullRequestTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDuplicate(duplicate: IssueOrPullRequestTO?): Builder {
            this.duplicate = duplicate
            return this
        }

        fun build(): UnmarkIssueAsDuplicatePayloadTO {
            return UnmarkIssueAsDuplicatePayloadTO(clientMutationId, duplicate)
        }
    }
}
