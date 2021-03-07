package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CreateIssuePayloadTO(
    val clientMutationId: String?,
    val issue: IssueTO?
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
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var issue: IssueTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIssue(issue: IssueTO?): Builder {
            this.issue = issue
            return this
        }

        fun build(): CreateIssuePayloadTO {
            return CreateIssuePayloadTO(clientMutationId, issue)
        }
    }
}
