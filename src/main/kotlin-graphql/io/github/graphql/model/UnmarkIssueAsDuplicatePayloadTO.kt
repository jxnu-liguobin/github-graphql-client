package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
